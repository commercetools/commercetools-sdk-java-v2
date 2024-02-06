
package example;

import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.monitoring.datadog.DatadogMiddleware;
import com.commercetools.monitoring.datadog.DatadogResponseSerializer;
import com.datadog.api.client.ApiClient;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ResponseSerializer;

public class DatadogApiRootBuilderTest {

    public void addOpenTelemetry() {
        ApiHttpClient client = ApiRootBuilder.of()
                .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withTelemetryMiddleware(new DatadogMiddleware(ApiClient.getDefaultApiClient()))
                .buildClient();
    }

    public void addSerializer() {
        ApiHttpClient client = ApiRootBuilder.of()
                .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withSerializer(new DatadogResponseSerializer(ResponseSerializer.of(), ApiClient.getDefaultApiClient()))
                .buildClient();
    }
}
