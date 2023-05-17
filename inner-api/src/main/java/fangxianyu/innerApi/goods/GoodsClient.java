package fangxianyu.innerApi.goods;

import io.github.nnkwrik.common.dto.Response;
import io.github.nnkwrik.common.dto.SimpleGoods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * goods-service的内部api

 */
@FeignClient(name = "goods-service")
@RequestMapping("/goods-service")
public interface GoodsClient {


    @GetMapping("/simpleGoods/{goodsId}")
    Response<SimpleGoods> getSimpleGoods(@PathVariable("goodsId") Integer goodsId);


    @GetMapping("/simpleGoodsList")
    Response<Map<Integer, SimpleGoods>> getSimpleGoodsList(@RequestParam List<Integer> goodsIdList);
}
