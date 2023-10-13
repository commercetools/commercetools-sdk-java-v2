
package example;

import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.monitoring.opentelemetry.OpenTelemetryMiddleware;
import com.commercetools.monitoring.opentelemetry.OpenTelemetryResponseSerializer;

import io.opentelemetry.api.GlobalOpenTelemetry;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ResponseSerializer;

public class OpenTelemetryApiRootBuilderTest {

    String projectKey;

    ApiHttpClient apiHttpClient;

    public void addOpenTelemetry() {
        ApiHttpClient client = ApiRootBuilder.of()
                .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withTelemetryMiddleware(new OpenTelemetryMiddleware(GlobalOpenTelemetry.get()))
                .buildClient();
    }

    public void addSerializer() {
        ApiHttpClient client = ApiRootBuilder.of()
                .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withSerializer(new OpenTelemetryResponseSerializer(ResponseSerializer.of(), GlobalOpenTelemetry.get()))
                .buildClient();
    }
}
