package io.github.nnkwrik.goodsservice.service;

import io.github.nnkwrik.goodsservice.model.po.Category;
import io.github.nnkwrik.goodsservice.model.po.PostExample;
import io.github.nnkwrik.goodsservice.model.po.Region;

import java.util.List;

/**

 */
public interface PostService {

    void postGoods(PostExample post);

    void deleteGoods(int goodsId, String userId) throws Exception;

    List<Region> getRegionList(int regionId);

    List<Category> getCateList(int cateId);
}
