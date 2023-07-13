
package commercetools;

import java.net.URI;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.PagedQueryResourceRequest;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.category.CategoryPagedQueryResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecoratorTest {
    @Test
    public void decoratedClient() {
        ProjectApiRoot apiRoot = CommercetoolsTestUtils.getProjectApiRoot();

        DecoratedApiHttpClient client = new DecoratedApiHttpClient(apiRoot.getApiHttpClient());
        ProjectApiRoot decoratedRoot = ProjectApiRoot.fromClient(apiRoot.getProjectKey(), client);

        final ApiHttpResponse<CategoryPagedQueryResponse> response = decoratedRoot.categories().get().executeBlocking();

        Assertions.assertThat(client.lastRequest.getUri().toString()).contains("sort=id+asc");
    }

    public static class DecoratedApiHttpClient implements ApiHttpClient {
        private final ApiHttpClient apiHttpClient;

        private ApiHttpRequest lastRequest;

        public DecoratedApiHttpClient(ApiHttpClient apiHttpClient) {
            this.apiHttpClient = apiHttpClient;
        }

        @Override
        public ResponseSerializer getSerializerService() {
            return apiHttpClient.getSerializerService();
        }

        @Override
        public URI getBaseUri() {
            return apiHttpClient.getBaseUri();
        }

        @Override
        public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
            lastRequest = request;
            return apiHttpClient.execute(request);
        }

        @Override
        public <T, O> CompletableFuture<ApiHttpResponse<O>> execute(ClientRequestCommand<T> method,
                Class<O> outputType) {
            return ApiHttpClient.super.execute(addIdSort(method), outputType);
        }

        @Override
        public <T, O> CompletableFuture<ApiHttpResponse<O>> execute(ClientRequestCommand<T> method,
                JavaType outputType) {
            return ApiHttpClient.super.execute(addIdSort(method), outputType);
        }

        @Override
        public <T, O> CompletableFuture<ApiHttpResponse<O>> execute(ClientRequestCommand<T> method,
                TypeReference<O> outputType) {
            return ApiHttpClient.super.execute(addIdSort(method), outputType);
        }

        @Override
        public <T, O> ApiHttpResponse<O> executeBlocking(ClientRequestCommand<T> method, Class<O> outputType,
                Duration timeout) {
            return ApiHttpClient.super.executeBlocking(addIdSort(method), outputType, timeout);
        }

        @Override
        public <T, O> ApiHttpResponse<O> executeBlocking(ClientRequestCommand<T> method, JavaType outputType,
                Duration timeout) {
            return ApiHttpClient.super.executeBlocking(addIdSort(method), outputType, timeout);
        }

        @Override
        public <T, O> ApiHttpResponse<O> executeBlocking(ClientRequestCommand<T> method, TypeReference<O> outputType,
                Duration timeout) {
            return ApiHttpClient.super.executeBlocking(addIdSort(method), outputType, timeout);
        }

        @Override
        public void close() throws Exception {
            apiHttpClient.close();
        }

        @SuppressWarnings("unchecked")
        public static <T> ClientRequestCommand<T> addIdSort(ClientRequestCommand<T> method) {
            if (method instanceof PagedQueryResourceRequest) {
                return ((PagedQueryResourceRequest<?, T, ?>) method).addSort("id asc");
            }
            return method;
        }
    }
}
