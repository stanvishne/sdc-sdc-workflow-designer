/*
 * Copyright © 2018 European Support Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onap.sdc.workflow.server.config;

import org.openecomp.sdc.logging.servlet.HttpHeader;
import org.openecomp.sdc.logging.servlet.spring.LoggingInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggingInterceptorConfig {

    @Value("${onap.logging.requestIdHeader}")
    private String[] loggingRequestIdHeaders;

    @Value("${onap.logging.partnerNameHeader}")
    private String[] loggingPartnerNameHeader;

    @Bean
    public LoggingInterceptor createLoggingInterceptor() {
        return new LoggingInterceptor(new HttpHeader(loggingRequestIdHeaders),
                new HttpHeader(loggingPartnerNameHeader));
    }
}
