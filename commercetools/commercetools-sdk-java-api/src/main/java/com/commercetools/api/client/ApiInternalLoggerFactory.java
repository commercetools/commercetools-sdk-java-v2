
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpMethod;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ClientBuilder;
import io.vrap.rmf.base.client.http.InternalLogger;

public class ApiInternalLoggerFactory {

    public static InternalLogger get(final ApiHttpRequest httpRequest, final String topic) {
        return InternalLogger.getLogger(ClientBuilder.COMMERCETOOLS + "." + getPathElement(httpRequest) + "." + topic
                + (topic.equals("request") ? "." + requestOrCommandScopeSegment(httpRequest) : ""));
    }

    private static String getPathElement(final ApiHttpRequest httpRequest) {
        final String path = httpRequest.getUri().getPath();
        final String[] pathElements = path.split("[\\/\\?]");
        return pathElements.length >= 3 ? pathElements[2] : "project";
    }

    private static String requestOrCommandScopeSegment(final ApiHttpRequest httpRequest) {
        return (httpRequest.getMethod() == ApiHttpMethod.GET || isPostSearch(httpRequest)) ? "queries" : "commands";
    }

    private static boolean isPostSearch(final ApiHttpRequest httpRequest) {
        return httpRequest.getMethod() == ApiHttpMethod.POST
                && httpRequest.getUrl().getPath().contains("/product-projections/search");
    }

}
