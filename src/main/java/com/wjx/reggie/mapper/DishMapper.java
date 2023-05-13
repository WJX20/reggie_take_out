package com.wjx.reggie.mapper;

import com.wjx.reggie.entity.Dish;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author WangJinxiang
* @description 针对表【dish(菜品管理)】的数据库操作Mapper
* @createDate 2023-05-03 16:13:57
* @Entity com.wjx.reggie.entity.Dish
*/
@Mapper
public interface DishMapper extends BaseMapper<Dish> {

}




