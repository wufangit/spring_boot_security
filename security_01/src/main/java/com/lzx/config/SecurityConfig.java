package com.lzx.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    /**
     * 上述过滤器链中绿色的过滤器可以通过配置选择，像上面的配置类中我们执行http.httpBasic()时则执行Basic Authentication Filter,如果是执行http.formLogin()则执行Username Password Authentication Filter。而蓝色和橘色的过滤器则是不能更改顺序和去掉的。

     作者：云师兄
     链接：https://www.jianshu.com/p/c641f7af945e
     來源：简书
     著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.httpBasic()//HTTP BASIC登陆页面
        http.formLogin()//HTTP BASIC登陆页面
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated();
    }
}
