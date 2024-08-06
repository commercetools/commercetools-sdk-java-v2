
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.quote_request.QuoteRequest>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .quoteRequests()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost extends
        TypeBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost, com.commercetools.api.models.quote_request.QuoteRequest, com.commercetools.api.models.quote_request.QuoteRequestDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost> {

    @Override
    public TypeReference<com.commercetools.api.models.quote_request.QuoteRequest> resultType() {
        return new TypeReference<com.commercetools.api.models.quote_request.QuoteRequest>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.quote_request.QuoteRequestDraft quoteRequestDraft;

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, com.commercetools.api.models.quote_request.QuoteRequestDraft quoteRequestDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.quoteRequestDraft = quoteRequestDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost(ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.quoteRequestDraft = t.quoteRequestDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/quote-requests", encodePathParam(this.projectKey),
            encodePathParam(this.storeKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(quoteRequestDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.quote_request.QuoteRequest> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.quote_request.QuoteRequest.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.quote_request.QuoteRequest>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.quote_request.QuoteRequest.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
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

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.quote_request.QuoteRequestDraft getBody() {
        return quoteRequestDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost withBody(
            com.commercetools.api.models.quote_request.QuoteRequestDraft quoteRequestDraft) {
        ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost t = copy();
        t.quoteRequestDraft = quoteRequestDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost that = (ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(quoteRequestDraft, that.quoteRequestDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(quoteRequestDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsPost(this);
    }
}
