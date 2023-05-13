package com.wjx.reggie.mapper;

import com.wjx.reggie.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author WangJinxiang
* @description 针对表【category(菜品及套餐分类)】的数据库操作Mapper
* @createDate 2023-05-03 15:57:47
* @Entity com.wjx.reggie.entity.Category
*/
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}




