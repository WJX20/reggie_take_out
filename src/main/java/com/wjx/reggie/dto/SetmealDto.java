package com.wjx.reggie.dto;


import com.wjx.reggie.entity.Setmeal;
import com.wjx.reggie.entity.SetmealDish;
import lombok.Data;

import java.util.List;


@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
