package com.hxr.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

/**
 * @ClassName: AuthorizationServerConfiguration
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-06 11:10
 * @Version: 1.0
 **/

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSouce() {

        return DataSourceBuilder.create().build();
    }

    @Bean
    public TokenStore tokenStore() {
        return new JdbcTokenStore(dataSouce());
    }

    @Bean
    public ClientDetailsService jdbcClientDeatails() {
        return new JdbcClientDetailsService(dataSouce());
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(tokenStore());
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        //TODO 简略版：client信息写死在代码中
//        clients
//                .inMemory()
//                .withClient("client1")   //设置客户端的id
//                .secret(passwordEncoder.encode("secret1"))   //设置客户端的安全码
//                .authorizedGrantTypes("authorization_code") //设置授权码模式（有四种：授权码模式，简单模式，密码模式，客户端模式）
//                .scopes("app")  //设置授权范围
//                .redirectUris("http://www.baidu.com"); //设置回调地址
//
        //TODO 标准版：从数据库中获取客户端id和secret进行验证，如果验证成功，重定向到WebSecurity登录界面
        clients.withClientDetails(jdbcClientDeatails());


    }
}
