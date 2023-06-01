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
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyOrdersSearchPost extends BodyApiMethod<ByProjectKeyOrdersSearchPost, com.commercetools.api.models.order.OrderPagedSearchResponse, com.commercetools.api.models.order.OrderSearchRequest> implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersSearchPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.order.OrderSearchRequest orderSearchRequest;

    public ByProjectKeyOrdersSearchPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.order.OrderSearchRequest orderSearchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.orderSearchRequest = orderSearchRequest;
    }

    public ByProjectKeyOrdersSearchPost(ByProjectKeyOrdersSearchPost t) {
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
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), io.vrap.rmf.base.client.utils.json.JsonUtils.executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(orderSearchRequest)));
    
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


    
    public com.commercetools.api.models.order.OrderSearchRequest getBody() {
        return orderSearchRequest;
    }
    
    public ByProjectKeyOrdersSearchPost withBody(com.commercetools.api.models.order.OrderSearchRequest orderSearchRequest) {
        ByProjectKeyOrdersSearchPost t = copy();
        t.orderSearchRequest = orderSearchRequest;
        return t;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyOrdersSearchPost that = (ByProjectKeyOrdersSearchPost) o;
    
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
    protected ByProjectKeyOrdersSearchPost copy() {
        return new ByProjectKeyOrdersSearchPost(this);
    }
}
