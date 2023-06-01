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
 *  <p>Create an Order from a Quote</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .orders()
 *            .orderQuote()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyOrdersQuotesPost extends BodyApiMethod<ByProjectKeyOrdersQuotesPost, com.commercetools.api.models.order.Order, com.commercetools.api.models.order.OrderFromQuoteDraft> implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersQuotesPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.order.OrderFromQuoteDraft orderFromQuoteDraft;

    public ByProjectKeyOrdersQuotesPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.order.OrderFromQuoteDraft orderFromQuoteDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.orderFromQuoteDraft = orderFromQuoteDraft;
    }

    public ByProjectKeyOrdersQuotesPost(ByProjectKeyOrdersQuotesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.orderFromQuoteDraft = t.orderFromQuoteDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/orders/quotes", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), io.vrap.rmf.base.client.utils.json.JsonUtils.executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(orderFromQuoteDraft)));
    
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order.Order> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.order.Order.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.order.Order.class);
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }


    
    public com.commercetools.api.models.order.OrderFromQuoteDraft getBody() {
        return orderFromQuoteDraft;
    }
    
    public ByProjectKeyOrdersQuotesPost withBody(com.commercetools.api.models.order.OrderFromQuoteDraft orderFromQuoteDraft) {
        ByProjectKeyOrdersQuotesPost t = copy();
        t.orderFromQuoteDraft = orderFromQuoteDraft;
        return t;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyOrdersQuotesPost that = (ByProjectKeyOrdersQuotesPost) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(orderFromQuoteDraft, that.orderFromQuoteDraft)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(orderFromQuoteDraft)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyOrdersQuotesPost copy() {
        return new ByProjectKeyOrdersQuotesPost(this);
    }
}
