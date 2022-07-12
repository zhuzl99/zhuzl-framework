package com.zhuzl.framework.xxl;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import org.springframework.context.annotation.Bean;

/**
 * @author : zhuzl
 * @date : 2022/7/1
 * @description :
 */
public class XxlJobConfiguration {

    @Bean
    public XxlJobSpringExecutor xxlJobSpringExecutor(XxlConfig xxlConfig) {
        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
        xxlJobSpringExecutor.setAdminAddresses(xxlConfig.getAdminAddresses());
        xxlJobSpringExecutor.setAccessToken(xxlConfig.getAccessToken());
        xxlJobSpringExecutor.setAppname(xxlConfig.getAppName());
        xxlJobSpringExecutor.setAddress(xxlConfig.getAddress());
        xxlJobSpringExecutor.setIp(xxlConfig.getIp());
        xxlJobSpringExecutor.setPort(xxlConfig.getPort());
        xxlJobSpringExecutor.setLogPath(xxlConfig.getLogPath());
        xxlJobSpringExecutor.setLogRetentionDays(xxlConfig.getLogRetentionDays());

        return xxlJobSpringExecutor;
    }

}
