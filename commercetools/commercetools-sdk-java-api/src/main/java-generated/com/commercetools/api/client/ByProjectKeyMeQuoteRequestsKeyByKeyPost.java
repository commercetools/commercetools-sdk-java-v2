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
 *            .me()
 *            .quoteRequests()
 *            .withKey("{key}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyMeQuoteRequestsKeyByKeyPost extends BodyApiMethod<ByProjectKeyMeQuoteRequestsKeyByKeyPost, com.commercetools.api.models.quote_request.QuoteRequest, com.commercetools.api.models.me.MyQuoteRequestUpdate> implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeQuoteRequestsKeyByKeyPost>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeQuoteRequestsKeyByKeyPost>, com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyMeQuoteRequestsKeyByKeyPost>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeQuoteRequestsKeyByKeyPost> {

    
    private String projectKey;
    private String key;
    
    private com.commercetools.api.models.me.MyQuoteRequestUpdate myQuoteRequestUpdate;

    public ByProjectKeyMeQuoteRequestsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key, com.commercetools.api.models.me.MyQuoteRequestUpdate myQuoteRequestUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.myQuoteRequestUpdate = myQuoteRequestUpdate;
    }

    public ByProjectKeyMeQuoteRequestsKeyByKeyPost(ByProjectKeyMeQuoteRequestsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.myQuoteRequestUpdate = t.myQuoteRequestUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/me/quote-requests/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), io.vrap.rmf.base.client.utils.json.JsonUtils.executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myQuoteRequestUpdate)));
    
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
    public String getKey() {return this.key;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setKey(final String key) { this.key = key; }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyMeQuoteRequestsKeyByKeyPost
     */
    public <TValue> ByProjectKeyMeQuoteRequestsKeyByKeyPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }
    
    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyMeQuoteRequestsKeyByKeyPost
     */
    public <TValue> ByProjectKeyMeQuoteRequestsKeyByKeyPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }
    
    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyMeQuoteRequestsKeyByKeyPost
     */
    public ByProjectKeyMeQuoteRequestsKeyByKeyPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }
    
    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyMeQuoteRequestsKeyByKeyPost
     */
    public ByProjectKeyMeQuoteRequestsKeyByKeyPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }
    
    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyMeQuoteRequestsKeyByKeyPost
     */
    public ByProjectKeyMeQuoteRequestsKeyByKeyPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyMeQuoteRequestsKeyByKeyPost
     */
    public ByProjectKeyMeQuoteRequestsKeyByKeyPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }
    
    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyMeQuoteRequestsKeyByKeyPost
     */
    public <TValue> ByProjectKeyMeQuoteRequestsKeyByKeyPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand").addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }
    
    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyMeQuoteRequestsKeyByKeyPost
     */
    public <TValue> ByProjectKeyMeQuoteRequestsKeyByKeyPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList())); 
    }

    
    public com.commercetools.api.models.me.MyQuoteRequestUpdate getBody() {
        return myQuoteRequestUpdate;
    }
    
    public ByProjectKeyMeQuoteRequestsKeyByKeyPost withBody(com.commercetools.api.models.me.MyQuoteRequestUpdate myQuoteRequestUpdate) {
        ByProjectKeyMeQuoteRequestsKeyByKeyPost t = copy();
        t.myQuoteRequestUpdate = myQuoteRequestUpdate;
        return t;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ByProjectKeyMeQuoteRequestsKeyByKeyPost that = (ByProjectKeyMeQuoteRequestsKeyByKeyPost) o;
    
        return new EqualsBuilder()
                .append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(myQuoteRequestUpdate, that.myQuoteRequestUpdate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(projectKey)
            .append(key)
            .append(myQuoteRequestUpdate)
            .toHashCode();
    }

    @Override
    protected ByProjectKeyMeQuoteRequestsKeyByKeyPost copy() {
        return new ByProjectKeyMeQuoteRequestsKeyByKeyPost(this);
    }
}
