package com.wjx.reggie.service;

import com.wjx.reggie.dto.DishDto;
import com.wjx.reggie.dto.SetmealDto;
import com.wjx.reggie.entity.Setmeal;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author WangJinxiang
* @description 针对表【setmeal(套餐)】的数据库操作Service
* @createDate 2023-05-03 17:16:36
*/
public interface SetmealService extends IService<Setmeal> {

    //新增套餐
    public void saveWithDish(SetmealDto setmealDto);

    //删除套餐
    public void removeWithDish(List<Long> ids);
}
