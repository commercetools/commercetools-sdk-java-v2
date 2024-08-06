
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.quote.Quote>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .quotes()
 *            .withKey("{key}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost extends
        TypeBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost, com.commercetools.api.models.quote.Quote, com.commercetools.api.models.quote.QuoteUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost> {

    @Override
    public TypeReference<com.commercetools.api.models.quote.Quote> resultType() {
        return new TypeReference<com.commercetools.api.models.quote.Quote>() {
        };
    }

    private String projectKey;
    private String storeKey;
    private String key;

    private com.commercetools.api.models.quote.QuoteUpdate quoteUpdate;

    public ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, String key, com.commercetools.api.models.quote.QuoteUpdate quoteUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
        this.quoteUpdate = quoteUpdate;
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost(ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.key = t.key;
        this.quoteUpdate = t.quoteUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/quotes/key=%s", encodePathParam(this.projectKey),
            encodePathParam(this.storeKey), encodePathParam(this.key));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(quoteUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.quote.Quote> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.quote.Quote.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.quote.Quote>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.quote.Quote.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.quote.QuoteUpdate getBody() {
        return quoteUpdate;
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost withBody(
            com.commercetools.api.models.quote.QuoteUpdate quoteUpdate) {
        ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost t = copy();
        t.quoteUpdate = quoteUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost that = (ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(key, that.key)
                .append(quoteUpdate, that.quoteUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(storeKey)
                .append(key)
                .append(quoteUpdate)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuotesKeyByKeyPost(this);
    }
}
