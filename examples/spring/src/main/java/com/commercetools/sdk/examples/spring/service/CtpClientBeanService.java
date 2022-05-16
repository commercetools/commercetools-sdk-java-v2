
package com.commercetools.sdk.examples.spring.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.newrelic.api.agent.*;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
        return ClientCredentials.of().withClientId(clientId).withClientSecret(clientSecret).build();
    }

    @Bean
    public ApiHttpClient client() {
        return ApiRootBuilder.of(new NewRelicClient(HttpClientSupplier.of().get()))
                .defaultClient(credentials())
                .buildClient();
    }

    public static class NewRelicClient implements VrapHttpClient {
        private final VrapHttpClient client;

        public NewRelicClient(VrapHttpClient client) {
            this.client = client;
        }

        @Trace(dispatcher = true)
        @Override
        public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
            Segment segment = NewRelic.getAgent().getTransaction().startSegment("commercetools");
            return client.execute(request).whenComplete((response, throwable) -> {
                if (response != null) {
                    processResponse(segment, request, response);
                }
                segment.end();
            });
        }
    }

    public static void processResponse(Segment segment, ApiHttpRequest request, ApiHttpResponse<?> response) {
        final HttpParameters build = HttpParameters.library("ApiHttpClient")
                .uri(request.getUri())
                .procedure("execute")
                .inboundHeaders(new InboundWrapper(response))
                .status(response.getStatusCode(), response.getMessage())
                .build();
        segment.reportAsExternal(build);
    }

    public static class InboundWrapper extends ExtendedInboundHeaders {

        private final ApiHttpResponse<?> response;

        public InboundWrapper(ApiHttpResponse<?> response) {
            this.response = response;
        }

        @Override
        public HeaderType getHeaderType() {
            return HeaderType.HTTP;
        }

        @Override
        public String getHeader(String name) {
            return response.getHeaders().getFirst(name);
        }

        @Override
        public List<String> getHeaders(String name) {
            return response.getHeaders().getHeaderValue(name);
        }
    }

    @Bean
    @Autowired
    public ProjectApiRoot apiRoot(ApiHttpClient client) {

        final ProjectApiRoot build = ProjectApiRoot.fromClient(projectKey, client);

        return build;
    }
}
