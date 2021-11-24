package com.commercetools.sdk.examples.spring.service;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.InMemoryTokenStorage;
import io.vrap.rmf.base.client.oauth2.TokenStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.annotation.Order;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.server.WebSession;

import javax.servlet.http.HttpSession;
import java.beans.BeanProperty;

@Configuration
@EnableAutoConfiguration
public class CtpClientBeanService {

    @Value(value = "${ctp.client.id}")
    private String clientId;

    @Value(value = "${ctp.client.secret}")
    private String clientSecret;

    @Value(value = "${ctp.project.key}")
    private String projectKey;

    private ClientCredentials credentials() {
        return ClientCredentials.of()
                .withClientId(clientId)
                .withClientSecret(clientSecret)
                .build();
    }

    @Bean
    public ApiHttpClient client() {
        return ApiRootBuilder.of()
                .defaultClient(credentials())
                .buildClient();
    }

    @Bean
    @Autowired
    public ProjectApiRoot apiRoot(ApiHttpClient client) {

        final ProjectApiRoot build = ProjectApiRoot.fromClient(projectKey, client);

        return build;
    }
}
