
package example;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.monitoring.datadog.DatadogResponseSerializer;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.fasterxml.jackson.core.JsonProcessingException;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ResponseSerializer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

public class ResponseSerializerTest {

    @Test
    public void testSerialize() throws ApiException, JsonProcessingException {
        MetricsApi metricsApi = Mockito.mock(MetricsApi.class);
        Mockito.when(metricsApi.submitMetrics(Mockito.any())).thenReturn(null);
        DatadogResponseSerializer serializer = new DatadogResponseSerializer(ResponseSerializer.of(), metricsApi);

        Reference reference = ProductReference.builder().id("abc").build();

        serializer.toJsonByteArray(reference);

        Mockito.verify(metricsApi).submitMetrics(Mockito.argThat(metricPayload -> {
            Assertions.assertThat(metricPayload).isNotNull();
            Assertions.assertThat(metricPayload.getSeries().get(0).getMetric())
                    .isEqualTo("commercetools.json.serialization");
            return true;
        }));
    }

    @Test
    public void testSerializeWithAttributes() throws ApiException, JsonProcessingException {
        MetricsApi metricsApi = Mockito.mock(MetricsApi.class);
        Mockito.when(metricsApi.submitMetrics(Mockito.any())).thenReturn(null);
        Map<String, String> tags = new HashMap<>();
        tags.put("foo", "bar");

        DatadogResponseSerializer serializer = new DatadogResponseSerializer(ResponseSerializer.of(), metricsApi, tags);

        Reference reference = ProductReference.builder().id("abc").build();

        serializer.toJsonByteArray(reference);

        Mockito.verify(metricsApi).submitMetrics(Mockito.argThat(metricPayload -> {
            Assertions.assertThat(metricPayload).isNotNull();
            Assertions.assertThat(metricPayload.getSeries().get(0).getMetric())
                    .isEqualTo("commercetools.json.serialization");
            Assertions.assertThat(metricPayload.getSeries().get(0).getTags().size()).isEqualTo(2);
            Assertions.assertThat(metricPayload.getSeries().get(0).getTags().get(0)).isEqualTo("foo:bar");
            Assertions.assertThat(metricPayload.getSeries().get(0).getTags().get(1)).isEqualTo("response.body.type:com.commercetools.api.models.product.ProductReferenceImpl");

            return true;
        }));
    }

    @Test
    public void testDeserialize() throws ApiException, JsonProcessingException {
        MetricsApi metricsApi = Mockito.mock(MetricsApi.class);
        Mockito.when(metricsApi.submitMetrics(Mockito.any())).thenReturn(null);
        DatadogResponseSerializer serializer = new DatadogResponseSerializer(ResponseSerializer.of(), metricsApi);

        String responseBody = "{ \"typeId\": \"product\", \"id\": \"abc\" }";
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(200, new ApiHttpHeaders(), responseBody.getBytes());

        ApiHttpResponse<Reference> reference = serializer.convertResponse(response, Reference.class);

        Assertions.assertThat(reference.getBody()).isInstanceOf(ProductReference.class);
        Mockito.verify(metricsApi).submitMetrics(Mockito.argThat(metricPayload -> {
            Assertions.assertThat(metricPayload).isNotNull();
            Assertions.assertThat(metricPayload.getSeries().get(0).getMetric())
                    .isEqualTo("commercetools.json.deserialization");
            return true;
        }));
    }

    @Test
    public void testDeserializeWithAttributes() throws ApiException, JsonProcessingException {
        MetricsApi metricsApi = Mockito.mock(MetricsApi.class);
        Mockito.when(metricsApi.submitMetrics(Mockito.any())).thenReturn(null);
        Map<String, String> tags = new HashMap<>();
        tags.put("foo", "bar");

        DatadogResponseSerializer serializer = new DatadogResponseSerializer(ResponseSerializer.of(), metricsApi, tags);

        String responseBody = "{ \"typeId\": \"product\", \"id\": \"abc\" }";
        ApiHttpResponse<byte[]> response = new ApiHttpResponse<>(200, new ApiHttpHeaders(), responseBody.getBytes());

        ApiHttpResponse<Reference> reference = serializer.convertResponse(response, Reference.class);

        Assertions.assertThat(reference.getBody()).isInstanceOf(ProductReference.class);
        Mockito.verify(metricsApi).submitMetrics(Mockito.argThat(metricPayload -> {
            Assertions.assertThat(metricPayload).isNotNull();
            Assertions.assertThat(metricPayload.getSeries().get(0).getMetric())
                    .isEqualTo("commercetools.json.deserialization");
            Assertions.assertThat(metricPayload.getSeries().get(0).getTags().size()).isEqualTo(2);
            Assertions.assertThat(metricPayload.getSeries().get(0).getTags().get(0)).isEqualTo("foo:bar");
            Assertions.assertThat(metricPayload.getSeries().get(0).getTags().get(1)).isEqualTo("request.body.type:com.commercetools.api.models.common.Reference");
            return true;
        }));
    }
}
