package top.yueshushu.learn.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import top.yueshushu.learn.mode.ro.TradeUserRo;
import top.yueshushu.learn.mode.ro.UserRo;
import top.yueshushu.learn.response.OutputResult;
import top.yueshushu.learn.service.TradeUserService;
import top.yueshushu.learn.service.UserService;

/**
 * <p>
 * 交易用户信息 我是自定义的
 * </p>
 *
 * @author 岳建立
 * @date 2022-01-02
 */
@RestController
@RequestMapping("/tradeUser")
@Api("交易用户的信息")
public class TradeUserController extends BaseController{
    @Autowired
    private TradeUserService tradeUserService;
    @PostMapping("/login")
    @ApiOperation("交易用户的登录")
    public OutputResult login(@RequestBody TradeUserRo tradeUserRo){
        tradeUserRo.setId(getUserId());
        return tradeUserService.login(tradeUserRo);
    }
}
