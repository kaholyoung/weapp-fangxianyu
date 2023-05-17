package io.github.nnkwrik.authservice.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import io.github.nnkwrik.authservice.token.TokenCreator;
import io.github.nnkwrik.common.dto.JWTUser;
import io.github.nnkwrik.common.token.TokenSolver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestToken {

    @Value("${jwt.pub-key-file-name}")
    private String pubFile;

    @Value("${jwt.pvt-key-file-name}")
    private String pvtFile;

    @Autowired
    private TokenCreator creator;

    @Autowired
    private TokenSolver solver;


    @Test
    public void testToken() throws Exception {
        //测试注入密钥文件名
        System.out.println(pubFile);
        System.out.println(pvtFile);

        JWTUser jwtUser = new JWTUser();
        jwtUser.setOpenId("1");
        jwtUser.setNickName("测试用户1");
        jwtUser.setAvatarUrl("https://i.imgtg.com/2023/05/14/OM5qag.jpg");

        JWTCreator.Builder builder = JWT.create();

        for (Field field : jwtUser.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            String value = (String) field.get(jwtUser);
            String name = field.getName();
            builder.withClaim(name, value);
        }

        Algorithm algorithm = Algorithm.HMAC256("secret");

        Date expire = Date.from(Instant.now().plus(Duration.ofDays(1)));

        String token = builder.withExpiresAt(expire).sign(algorithm);

        System.out.println("Bearer :"+token);

        String token2 = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdmF0YXJVcmwiOiJodHRwczovL3RoaXJkd3gucWxvZ28uY24vbW1vcGVuL3ZpXzMyL1BPZ0V3aDRtSUhPNG5pYkgwS2xNRUNOampHeFFVcTI0WkVhR1Q0cG9DNmljUmljY1ZHS1N5WHdpYmNQcTRCV21pYUlHdUcxaWN3eGFRWDZnckM5VmVtWm9KOHJnLzEzMiIsIm9wZW5JZCI6Im9BcWFGNU1rZmFYWDJnNGtobnlBUlQ1YTZnT3MiLCJuaWNrTmFtZSI6IuW-ruS_oeeUqOaItyIsImV4cCI6MTY4Mzk4MTE5NX0.fHskxlp6OIuxaLrymjiFh2w0TF9yfjXSi0Ma0WiWZME";

        String token1 = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdmF0YXJVcmwiOiJodHRwczovL3RoaXJkd3gucWxvZ28uY24vbW1vcGVuL3ZpXzMyL1BPZ0V3aDRtSUhPNG5pYkgwS2xNRUNOampHeFFVcTI0WkVhR1Q0cG9DNmljUmljY1ZHS1N5WHdpYmNQcTRCV21pYUlHdUcxaWN3eGFRWDZnckM5VmVtWm9KOHJnLzEzMiIsIm9wZW5JZCI6Im9BcWFGNU1rZmFYWDJnNGtobnlBUlQ1YTZnT3MiLCJuaWNrTmFtZSI6IuW-ruS_oeeUqOaItyIsImV4cCI6MTY4Mzk4MTc1OX0.TCg9lY-WrzT8LhPZHWjit76gQs-rbpjXsURsmZLC5D0";

        token2.equals(token1);

        //找到resource目录下的私钥文件后生成Token
//        String token = creator.create(jwtUser);

//        System.out.println(token1.equals(token2));

//        token = token.replace("Bearer ", "");

        //找到resource目录下的公钥文件后还原用户信息
//        JWTUser user = solver.solve(token1);


        //会自动验证过期时间
        DecodedJWT jwt1 = JWT.require(algorithm).build().verify(token1);



        JWTUser jwtUser1 = new JWTUser();

        Map<String, Claim> claims = jwt1.getClaims();

        jwtUser1.setOpenId(claims.get("openId").asString());
        jwtUser1.setAvatarUrl(claims.get("avatarUrl").asString());
        jwtUser1.setNickName(claims.get("nickName").asString());



        System.out.println(jwtUser1);

    }

}
