package com.wjx.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjx.reggie.entity.DishFlavor;
import com.wjx.reggie.service.DishFlavorService;
import com.wjx.reggie.mapper.DishFlavorMapper;
import org.springframework.stereotype.Service;

/**
* @author WangJinxiang
* @description 针对表【dish_flavor(菜品口味关系表)】的数据库操作Service实现
* @createDate 2023-05-03 21:00:23
*/
@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor>
    implements DishFlavorService{

}




