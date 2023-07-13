
package commercetools;

import java.net.URI;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.commercetools.api.client.PagedQueryResourceRequest;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.category.CategoryPagedQueryResponse;
import com.commercetools.api.models.project.Project;
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

        final ApiHttpResponse<Project> projectResponse = decoratedRoot.get().executeBlocking();
        Assertions.assertThat(client.lastRequest.getUri().toString()).doesNotContain("sort=id+asc");
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
        public <O> CompletableFuture<ApiHttpResponse<O>> execute(CreateHttpRequestCommand request,
                Function<ApiHttpResponse<byte[]>, ApiHttpResponse<O>> mapper) {
            return ApiHttpClient.super.execute(addIdSort(request), mapper);
        }

        @Override
        public <O> ApiHttpResponse<O> executeBlocking(CreateHttpRequestCommand method,
                Function<ApiHttpResponse<byte[]>, ApiHttpResponse<O>> mapper, Duration timeout) {
            return ApiHttpClient.super.executeBlocking(addIdSort(method), mapper, timeout);
        }

        @Override
        public CompletableFuture<ApiHttpResponse<byte[]>> send(CreateHttpRequestCommand method) {
            return ApiHttpClient.super.send(addIdSort(method));
        }

        @Override
        public <T> ApiHttpResponse<byte[]> sendBlocking(CreateHttpRequestCommand method, Duration timeout) {
            return ApiHttpClient.super.sendBlocking(addIdSort(method), timeout);
        }

        @Override
        public void close() throws Exception {
            apiHttpClient.close();
        }

        public static CreateHttpRequestCommand addIdSort(CreateHttpRequestCommand method) {
            if (method instanceof PagedQueryResourceRequest) {
                return (CreateHttpRequestCommand) ((PagedQueryResourceRequest<?, ?, ?>) method).addSort("id asc");
            }
            return method;
        }
    }
}
