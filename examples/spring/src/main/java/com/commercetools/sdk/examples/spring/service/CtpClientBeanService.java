
package com.commercetools.sdk.examples.spring.service;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;

import com.commercetools.api.defaultconfig.ServiceRegion;
import com.newrelic.api.agent.*;
import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

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

        return ApiRootBuilder.of(new NewRelicClient(ApiRootBuilder.of().defaultClient(credentials())
                .buildClient())).withApiBaseUrl(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl()).buildClient();
    }

    public static class NewRelicClient implements VrapHttpClient {
        private final ApiHttpClient client;

        public NewRelicClient(ApiHttpClient client) {
            this.client = client;
        }


        @Trace(dispatcher = true)
        @Override
        public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
            Segment segment = NewRelic.getAgent().getTransaction().startSegment("commercetools");
            return client.execute(request).thenApply(apiHttpResponse -> {processResponse(segment, request, apiHttpResponse); segment.end(); return apiHttpResponse;});
        }
    }

    public static void processResponse(Segment segment, ApiHttpRequest request, ApiHttpResponse<?> response) {
        segment.reportAsExternal(HttpParameters
                .library("ApiHttpClient")
                .uri(request.getUri())
                .procedure("execute")
                .inboundHeaders(new InboundWrapper(response))
                .build());
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
