package com.htdc.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Description: 权限过滤器
 * Author:Eric
 * Date:2017/10/18
 */
@Component
public class AuthFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(AuthFilter.class);

    /**
     * 定义验证位置
     * @return
     */
    @Override
    public String filterType() {
        /**
         * pre：路由之前
         * routing：路由之时
         * post： 路由之后
         * error：发送错误调用
         */
        return "pre";
    }

    /**
     * 过滤器排序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否启用过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤规则
     * @return
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info(String.format("%s >> %s", request.getMethod(), request.getRequestURL()));
        String token = request.getParameter("token");
        if (StringUtils.isBlank(token)) {
            logger.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        logger.info("ok");
        return null;
    }
}
