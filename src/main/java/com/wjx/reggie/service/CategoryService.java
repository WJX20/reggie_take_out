package com.wjx.reggie.service;

import com.wjx.reggie.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author WangJinxiang
* @description 针对表【category(菜品及套餐分类)】的数据库操作Service
* @createDate 2023-05-03 15:57:47
*/
public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
