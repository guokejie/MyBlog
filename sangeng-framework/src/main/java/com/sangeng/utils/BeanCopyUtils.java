package com.sangeng.utils;

import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class BeanCopyUtils {
    // TODO:工具类没有创建对象的需求，建议将工具类的构造器进行私有
    private BeanCopyUtils() {
    }

    // TODO:单个实体类的拷贝，反复看
    /**
     *
     * @param source 要拷贝的对象
     * @param clazz 要拷贝的对象自己创建vo对象
     * @return
     * @param <V>
     */
    // 第一个V代表，该方法接收任意类型的对象作为返回值
    public static <V> V copyBean(Object source, Class<V> clazz) {
        // 创建目标对象
        V result = null;
        try {
            result = clazz.newInstance();
            // 实现属性copy
            BeanUtils.copyProperties(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
        // 返回结果
        return result;
    }


    public static <O, V> List<V> copyBeanList(List<O> list, Class<V> clazz) {
        return list.stream()
                .map(o -> copyBean(o, clazz))
                .collect(Collectors.toList());
    }

}
