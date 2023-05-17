package io.github.nnkwrik.goodsservice.dao;

import io.github.nnkwrik.goodsservice.model.po.Category;
import io.github.nnkwrik.goodsservice.model.po.Region;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 */
@Mapper
public interface PostMapper {
    @Select("select id,name from region where parent_id=#{parent_id}")
    List<Region> getRegionByParentId(@Param("parent_id") int parentId);

    @Select("select id,name from category where parent_id=#{parent_id}")
    List<Category> getCateByParentId(@Param("parent_id") int parentId);
}
