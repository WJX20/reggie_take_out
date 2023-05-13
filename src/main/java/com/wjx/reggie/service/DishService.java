package com.wjx.reggie.service;

import com.wjx.reggie.dto.DishDto;
import com.wjx.reggie.entity.Dish;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author WangJinxiang
* @description 针对表【dish(菜品管理)】的数据库操作Service
* @createDate 2023-05-03 16:13:57
*/
public interface DishService extends IService<Dish> {

    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表：dish、dish_flavor
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息和对应的口味信息
    public DishDto getByIdWithFlavor(Long id);

    //更新菜品信息和对应的口味信息
    public void updateWithFlavor(DishDto dishDto);
}
