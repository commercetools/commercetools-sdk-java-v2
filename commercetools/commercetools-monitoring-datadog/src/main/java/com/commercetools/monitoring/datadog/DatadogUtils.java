
package com.commercetools.monitoring.datadog;

import static com.commercetools.monitoring.datadog.DatadogInfo.*;
import static java.lang.String.format;

import java.time.OffsetDateTime;
import java.util.*;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.MetricIntakeType;
import com.datadog.api.client.v2.model.MetricPayload;
import com.datadog.api.client.v2.model.MetricPoint;
import com.datadog.api.client.v2.model.MetricSeries;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatadogUtils {

    private static final Logger logger = LoggerFactory.getLogger(DatadogMiddleware.class);

    protected static void submitClientDurationMetric(final ApiHttpRequest request, final MetricsApi apiInstance,
            final double durationInMillis, final ApiHttpResponse<byte[]> response, final Collection<String> tags) throws ApiException {
        submitClientDurationMetric(request, apiInstance, durationInMillis, response.getStatusCode(), tags);
    }

    protected static void submitClientDurationMetric(final ApiHttpRequest request, final MetricsApi apiInstance,
            final double durationInMillis, final int statusCode, final Collection<String> tags) throws ApiException {
        final String name = PREFIX + "." + CLIENT_DURATION;
        final MetricIntakeType type = MetricIntakeType.UNSPECIFIED;
        submitMetricWithHttpTags(name, durationInMillis, type, "ms", request, apiInstance, statusCode, tags);
    }

    protected static void submitErrorRequestsMetric(final ApiHttpRequest request, final MetricsApi apiInstance,
            final ApiHttpResponse<byte[]> response, final Collection<String> tags) throws ApiException {
        submitErrorRequestsMetric(request, apiInstance, response.getStatusCode(), tags);
    }

    protected static void submitErrorRequestsMetric(final ApiHttpRequest request, final MetricsApi apiInstance,
            final int statusCode, final Collection<String> tags) throws ApiException {
        final String name = PREFIX + "." + CLIENT_REQUEST_ERROR;
        final MetricIntakeType count = MetricIntakeType.COUNT;
        submitMetricWithHttpTags(name, 1.0, count, "count", request, apiInstance, statusCode, tags);
    }

    protected static void submitTotalRequestsMetric(final ApiHttpRequest request, final MetricsApi apiInstance,
            final ApiHttpResponse<byte[]> response, final Collection<String> tags) throws ApiException {
        submitTotalRequestsMetric(request, apiInstance, response.getStatusCode(), tags);
    }

    protected static void submitTotalRequestsMetric(final ApiHttpRequest request, final MetricsApi apiInstance,
            final int statusCode, final Collection<String> tags) throws ApiException {
        final String name = PREFIX + "." + CLIENT_REQUEST_TOTAL;
        final MetricIntakeType count = MetricIntakeType.COUNT;
        submitMetricWithHttpTags(name, 1.0, count, "count", request, apiInstance, statusCode, tags);
    }

    private static void submitMetricWithHttpTags(final String name, final double value, final MetricIntakeType type,
            final String unit, final ApiHttpRequest request, final MetricsApi apiInstance,
            final ApiHttpResponse<byte[]> response, final Collection<String> tags) throws ApiException {
        submitMetricWithHttpTags(name, value, type, unit, request, apiInstance, response.getStatusCode(), tags);
    }

    private static void submitMetricWithHttpTags(final String name, final double value, final MetricIntakeType type,
            final String unit, final ApiHttpRequest request, final MetricsApi apiInstance, final int statusCode, final Collection<String> tags)
            throws ApiException {
        final List<String> currentTags = new ArrayList<>(tags);
        currentTags.add(format("%s:%s", HTTP_RESPONSE_STATUS_CODE, statusCode));
        currentTags.add(format("%s:%s", HTTP_REQUEST_METHOD, request.getMethod().name()));
        currentTags.add(format("%s:%s", SERVER_ADDRESS, request.getUri().getHost()));
        if (request.getUri().getPort() > 0) {
            currentTags.add(format("%s:%s", SERVER_PORT, request.getUri().getPort()));
        }
        submitMetric(apiInstance, name, value, type, unit, currentTags);
    }

    protected static void submitJsonSerializationMetric(final MetricsApi apiInstance, final double durationInMillis,
            final String responseBodyType, final Collection<String> tags) {
        try {
            final List<String> currentTags = new ArrayList<>(tags);
            currentTags.add(format("%s:%s", RESPONSE_BODY_TYPE, responseBodyType));
            submitMetric(apiInstance, PREFIX + "." + JSON_SERIALIZATION, durationInMillis, MetricIntakeType.UNSPECIFIED,
                "ms", currentTags);
        }
        catch (ApiException exception) {
            logger.warn("Failed to submit commercetools json serialization metric", exception);
        }
    }

    protected static void submitJsonDeserializationMetric(final MetricsApi apiInstance, final double durationInMillis,
            final String requestBodyType, final Collection<String> tags) {
        try {
            final List<String> currentTags = new ArrayList<>(tags);
            currentTags.add(format("%s:%s", REQUEST_BODY_TYPE, requestBodyType));

            submitMetric(apiInstance, PREFIX + "." + JSON_DESERIALIZATION, durationInMillis,
                MetricIntakeType.UNSPECIFIED, "ms", currentTags);
        }
        catch (ApiException exception) {
            logger.warn("Failed to submit commercetools json deserialization metric", exception);
        }
    }

    private static void submitMetric(final MetricsApi apiInstance, final String name, final double value,
            final MetricIntakeType type, final String unit, final List<String> tags) throws ApiException {
        MetricPayload totalMetric = new MetricPayload().series(Collections.singletonList(new MetricSeries().metric(name)
                .type(type)
                .unit(unit)
                .points(Collections.singletonList(
                    new MetricPoint().timestamp(OffsetDateTime.now().toInstant().getEpochSecond()).value(value)))
                .tags(tags)));
        apiInstance.submitMetrics(totalMetric);
    }
}
