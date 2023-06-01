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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.quote_request.QuoteRequest>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .quoteRequests()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyQuoteRequestsPost extends BodyApiMethod<ByProjectKeyQuoteRequestsPost, com.commercetools.api.models.quote_request.QuoteRequest, com.commercetools.api.models.quote_request.QuoteRequestDraft> implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyQuoteRequestsPost>, com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyQuoteRequestsPost>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyQuoteRequestsPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.quote_request.QuoteRequestDraft quoteRequestDraft;

    public ByProjectKeyQuoteRequestsPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.quote_request.QuoteRequestDraft quoteRequestDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.quoteRequestDraft = quoteRequestDraft;
    }

    public ByProjectKeyQuoteRequestsPost(ByProjectKeyQuoteRequestsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.quoteRequestDraft = t.quoteRequestDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/quote-requests", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), io.vrap.rmf.base.client.utils.json.JsonUtils.executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(quoteRequestDraft)));
    
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.quote_request.QuoteRequest> executeBlocking(final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.quote_request.QuoteRequest.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.quote_request.QuoteRequest>> execute(final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.quote_request.QuoteRequest.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyQuoteRequestsPost
     */
    public <TValue> ByProjectKeyQuoteRequestsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }
    
    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyQuoteRequestsPost
     */
    public <TValue> ByProjectKeyQuoteRequestsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }
    
    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyQuoteRequestsPost
     */
    public ByProjectKeyQuoteRequestsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }
    
    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyQuoteRequestsPost
     */
    public ByProjectKeyQuoteRequestsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }
    
    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyQuoteRequestsPost
     */
    public ByProjectKeyQuoteRequestsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyQuoteRequestsPost
     */
    public ByProjectKeyQuoteRequestsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyQuoteRequestsPost
     */
    public <TValue> ByProjectKeyQuoteRequestsPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand").addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyQuoteRequestsPost
     */
    public <TValue> ByProjectKeyQuoteRequestsPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }

    
    public com.commercetools.api.models.quote_request.QuoteRequestDraft getBody() {
        return quoteRequestDraft;
    }
    
    public ByProjectKeyQuoteRequestsPost withBody(com.commercetools.api.models.quote_request.QuoteRequestDraft quoteRequestDraft) {
        ByProjectKeyQuoteRequestsPost t = copy();
        t.quoteRequestDraft = quoteRequestDraft;
        return t;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyQuoteRequestsPost that = (ByProjectKeyQuoteRequestsPost) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(quoteRequestDraft, that.quoteRequestDraft)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(quoteRequestDraft)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyQuoteRequestsPost copy() {
        return new ByProjectKeyQuoteRequestsPost(this);
    }
}
