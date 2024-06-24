
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
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
 *            .withId("{ID}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString extends
        StringBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString, com.commercetools.api.models.quote_request.QuoteRequest>
        implements
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.quote_request.QuoteRequest> resultType() {
        return new TypeReference<com.commercetools.api.models.quote_request.QuoteRequest>() {
        };
    }

    private String projectKey;
    private String storeKey;
    private String ID;

    private String quoteRequestUpdate;

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String ID, String quoteRequestUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
        this.quoteRequestUpdate = quoteRequestUpdate;
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString(
            ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.ID = t.ID;
        this.quoteRequestUpdate = t.quoteRequestUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/quote-requests/%s", this.projectKey, this.storeKey,
            this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            quoteRequestUpdate.getBytes(StandardCharsets.UTF_8));

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

    public String getID() {
        return this.ID;
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

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString withExpand(
            final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString addExpand(
            final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return quoteRequestUpdate;
    }

    public ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString withBody(String quoteRequestUpdate) {
        ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString t = copy();
        t.quoteRequestUpdate = quoteRequestUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString that = (ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(ID, that.ID)
                .append(quoteRequestUpdate, that.quoteRequestUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(storeKey)
                .append(ID)
                .append(quoteRequestUpdate)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyQuoteRequestsByIDPostString(this);
    }
}
