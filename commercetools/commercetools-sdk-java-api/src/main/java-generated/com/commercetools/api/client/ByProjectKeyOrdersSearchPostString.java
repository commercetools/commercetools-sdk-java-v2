package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import javax.annotation.Nullable;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.OrderPagedSearchResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .orders()
 *            .search()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyOrdersSearchPostString extends StringBodyApiMethod<ByProjectKeyOrdersSearchPostString, com.commercetools.api.models.order.OrderPagedSearchResponse> implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersSearchPostString> {

    
    private String projectKey;
    
    private String orderSearchRequest;

    public ByProjectKeyOrdersSearchPostString(final ApiHttpClient apiHttpClient, String projectKey, String orderSearchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.orderSearchRequest = orderSearchRequest;
    }

    public ByProjectKeyOrdersSearchPostString(ByProjectKeyOrdersSearchPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.orderSearchRequest = t.orderSearchRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/orders/search", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), orderSearchRequest.getBytes(StandardCharsets.UTF_8));
    
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order.OrderPagedSearchResponse> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.order.OrderPagedSearchResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.OrderPagedSearchResponse>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.order.OrderPagedSearchResponse.class);
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }


    
    public String getBody() {
        return orderSearchRequest;
    }
    
    public ByProjectKeyOrdersSearchPostString withBody(String orderSearchRequest) {
        ByProjectKeyOrdersSearchPostString t = copy();
        t.orderSearchRequest = orderSearchRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyOrdersSearchPostString that = (ByProjectKeyOrdersSearchPostString) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(orderSearchRequest, that.orderSearchRequest)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(orderSearchRequest)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyOrdersSearchPostString copy() {
        return new ByProjectKeyOrdersSearchPostString(this);
    }
}
