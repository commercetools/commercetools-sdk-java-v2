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
 *  <p>Check if Products exist. Responds with a <code>200 OK</code> status if any Products match the Query Predicate, or <code>404 Not Found</code> otherwise.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .products()
 *            .head()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyProductsHead extends ApiMethod<ByProjectKeyProductsHead, com.fasterxml.jackson.databind.JsonNode> implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductsHead>, com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductsHead> {

    
    private String projectKey;
    

    public ByProjectKeyProductsHead(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductsHead(ByProjectKeyProductsHead t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/products", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.HEAD, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.fasterxml.jackson.databind.JsonNode.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode>> execute(final ApiHttpClient client) {
        return execute(client, com.fasterxml.jackson.databind.JsonNode.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getWhere() {
        return this.getQueryParam("where");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    /**
     * set where with the specified value
     * @param where value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductsHead
     */
    public <TValue> ByProjectKeyProductsHead withWhere(final TValue where) {
        return copy().withQueryParam("where", where);
    }
    
    /**
     * add additional where query parameter
     * @param where value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductsHead
     */
    public <TValue> ByProjectKeyProductsHead addWhere(final TValue where) {
        return copy().addQueryParam("where", where);
    }
    
    /**
     * set where with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductsHead
     */
    public ByProjectKeyProductsHead withWhere(final Supplier<String> supplier) {
        return copy().withQueryParam("where", supplier.get());
    }
    
    /**
     * add additional where query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductsHead
     */
    public ByProjectKeyProductsHead addWhere(final Supplier<String> supplier) {
        return copy().addQueryParam("where", supplier.get());
    }
    
    /**
     * set where with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductsHead
     */
    public ByProjectKeyProductsHead withWhere(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("where", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional where query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductsHead
     */
    public ByProjectKeyProductsHead addWhere(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("where", op.apply(new StringBuilder()));
    }
    
    /**
     * set where with the specified values
     * @param where values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductsHead
     */
    public <TValue> ByProjectKeyProductsHead withWhere(final Collection<TValue> where) {
        return copy().withoutQueryParam("where").addQueryParams(where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional where query parameters
     * @param where values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductsHead
     */
    public <TValue> ByProjectKeyProductsHead addWhere(final Collection<TValue> where) {
        return copy().addQueryParams(where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList())); 
    }

    

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyProductsHead that = (ByProjectKeyProductsHead) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyProductsHead copy() {
        return new ByProjectKeyProductsHead(this);
    }
}
