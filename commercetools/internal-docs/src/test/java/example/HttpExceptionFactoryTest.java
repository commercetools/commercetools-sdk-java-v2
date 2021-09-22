package example;

import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ServiceRegion;
import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.HttpExceptionFactory;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HttpExceptionFactoryTest {

    @Test
    public void customFactory() {
        class CustomExceptionFactory implements HttpExceptionFactory {
            @Override
            public ApiHttpException create(ApiHttpRequest request, ApiHttpResponse<byte[]> response) {
                return new ApiHttpException(response.getStatusCode(), "something bad happened", response.getHeaders(), response);
            }

            @Override
            public ResponseSerializer getResponseSerializer() {
                return ResponseSerializer.of();
            }
        }

        ProjectApiRoot client = ApiRootBuilder.of()
                .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withHttpExceptionFactory(CustomExceptionFactory::new)
                .buildProjectRoot("my-project-key");

        Assertions.assertThatExceptionOfType(ApiHttpException.class)
                .isThrownBy(() -> client.get().executeBlocking())
                .withMessage("something bad happened");
    }
}
