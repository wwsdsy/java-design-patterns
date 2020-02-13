package com.jpeony.design.patterns.state.demo1;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: Rain
 * @Package: com.lanhuigu.design.state.demo1
 * @date 2018/3/24 16:56
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class Rain implements Weather {
    @Override
    public String getWeather() {
        return "阴雨洒遍天地灰";
    }
}