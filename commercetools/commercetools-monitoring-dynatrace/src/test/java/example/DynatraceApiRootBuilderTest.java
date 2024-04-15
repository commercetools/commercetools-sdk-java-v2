
package example;

import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.monitoring.dynatrace.DynatraceResponseSerializer;
import com.commercetools.monitoring.dynatrace.DynatraceTelemetryMiddleware;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ResponseSerializer;

public class DynatraceApiRootBuilderTest {

    public void addDynatraceTelemetry() {
        ApiHttpClient client = ApiRootBuilder.of()
                .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withTelemetryMiddleware(new DynatraceTelemetryMiddleware(
                    "https://your-dynatrace-url.live.dynatrace.com", "dt0c01.your.api.token"))
                .buildClient();
    }

    public void addDynatraceSerializer() {
        ApiHttpClient client = ApiRootBuilder.of()
                .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withSerializer(new DynatraceResponseSerializer(ResponseSerializer.of(),
                    "https://your-dynatrace-url.live.dynatrace.com", "dt0c01.your.api.token"))
                .buildClient();
    }
}
