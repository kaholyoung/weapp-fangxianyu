package io.github.nnkwrik.goodsservice.service;

import io.github.nnkwrik.goodsservice.model.po.Category;
import io.github.nnkwrik.goodsservice.model.po.Goods;
import io.github.nnkwrik.goodsservice.model.vo.CatalogPageVo;
import io.github.nnkwrik.goodsservice.model.vo.IndexPageVo;

import java.util.List;

/**

 */
public interface IndexService {

    IndexPageVo getIndex(int page, int size);

    List<Goods> getIndexMore(int page, int size);

    CatalogPageVo getCatalogIndex();

    List<Category> getSubCatalogById(int id);

}
