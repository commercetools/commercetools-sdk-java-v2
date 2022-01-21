
package example;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.HttpExceptionFactory;

import org.junit.jupiter.api.Test;

public class HttpExceptionFactoryTest {

    static class CustomExceptionFactory implements HttpExceptionFactory {
        @Override
        public ApiHttpException create(ApiHttpRequest request, ApiHttpResponse<byte[]> response) {
            return new ApiHttpException(response.getStatusCode(), request.getSecuredBody(), response.getHeaders(),
                "something bad happened", response, request);
        }

        @Override
        public ResponseSerializer getResponseSerializer() {
            return ResponseSerializer.of();
        }
    }

    @Test
    public void customFactory() {

        ProjectApiRoot client = ApiRootBuilder.of()
                .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withHttpExceptionFactory(CustomExceptionFactory::new)
                .build("my-project-key");

        assertThatExceptionOfType(ApiHttpException.class).isThrownBy(() -> client.get().executeBlocking())
                .withMessageStartingWith("detailMessage: something bad happened");

    }
}
