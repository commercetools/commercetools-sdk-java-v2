
package com.commercetools.monitoring.datadog;

import static com.commercetools.monitoring.datadog.DatadogInfo.*;
import static java.lang.String.format;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.MetricIntakeType;
import com.datadog.api.client.v2.model.MetricPayload;
import com.datadog.api.client.v2.model.MetricPoint;
import com.datadog.api.client.v2.model.MetricSeries;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

public class DatadogUtils {

    protected static void submitClientDurationMetric(final ApiHttpRequest request, final MetricsApi apiInstance,
            final double durationInMillis, final ApiHttpResponse<byte[]> response) throws ApiException {
        final String name = PREFIX + "." + CLIENT_DURATION;
        final MetricIntakeType type = MetricIntakeType.UNSPECIFIED;
        submitMetricWithHttpTags(name, durationInMillis, type, request, apiInstance, response);
    }

    protected static void submitErrorRequestsMetric(final ApiHttpRequest request, final MetricsApi apiInstance,
            final ApiHttpResponse<byte[]> response) throws ApiException {
        final String name = PREFIX + "." + CLIENT_REQUEST_ERROR;
        final MetricIntakeType count = MetricIntakeType.COUNT;
        submitMetricWithHttpTags(name, 1.0, count, request, apiInstance, response);
    }

    protected static void submitTotalRequestsMetric(final ApiHttpRequest request, final MetricsApi apiInstance,
            final ApiHttpResponse<byte[]> response) throws ApiException {
        final String name = PREFIX + "." + CLIENT_REQUEST_TOTAL;
        final MetricIntakeType count = MetricIntakeType.COUNT;
        submitMetricWithHttpTags(name, 1.0, count, request, apiInstance, response);
    }

    private static void submitMetricWithHttpTags(final String name, final double value, final MetricIntakeType type,
            final ApiHttpRequest request, final MetricsApi apiInstance, final ApiHttpResponse<byte[]> response)
            throws ApiException {
        final List<String> tags = Arrays.asList(format("%s:%s", HTTP_RESPONSE_STATUS_CODE, response.getStatusCode()),
            format("%s:%s", HTTP_REQUEST_METHOD, request.getMethod().name()),
            format("%s:%s", SERVER_ADDRESS, request.getUri().getHost()),
            format("%s:%s", SERVER_PORT, request.getUri().getPort()));
        if (request.getUri().getPort() > 0) {
            tags.add(format("%s:%s", SERVER_PORT, request.getUri().getPort()));
        }
        submitMetric(apiInstance, name, value, type, tags);
    }

    protected static void submitJsonSerializationMetric(final MetricsApi apiInstance, final double durationInMillis,
            final String responseBodyType) {
        try {
            submitMetric(apiInstance, PREFIX + "." + JSON_SERIALIZATION, durationInMillis, MetricIntakeType.UNSPECIFIED,
                Arrays.asList(format("%s:%s", RESPONSE_BODY_TYPE, responseBodyType)));
        }
        catch (ApiException ignored) {
            // ignore
        }
    }

    protected static void submitJsonDeserializationMetric(final MetricsApi apiInstance, final double durationInMillis,
            final String requestBodyType) {
        try {
            submitMetric(apiInstance, PREFIX + "." + JSON_DESERIALIZATION, durationInMillis,
                MetricIntakeType.UNSPECIFIED, Arrays.asList(format("%s:%s", REQUEST_BODY_TYPE, requestBodyType)));
        }
        catch (ApiException ignored) {
            // ignore
        }
    }

    private static void submitMetric(final MetricsApi apiInstance, final String name, final double value,
            final MetricIntakeType type, final List<String> tags) throws ApiException {
        MetricPayload totalMetric = new MetricPayload().series(Collections.singletonList(new MetricSeries().metric(name)
                .type(type)
                .points(Collections.singletonList(
                    new MetricPoint().timestamp(OffsetDateTime.now().toInstant().getEpochSecond()).value(value)))
                .tags(tags)));
        apiInstance.submitMetrics(totalMetric);
    }
}
