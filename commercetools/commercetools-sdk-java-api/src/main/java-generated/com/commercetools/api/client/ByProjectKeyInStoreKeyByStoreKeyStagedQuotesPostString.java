
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
 *  <p>Creates a StagedQuote in a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.staged_quote.StagedQuote>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .stagedQuotes()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString extends
        StringBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString, com.commercetools.api.models.staged_quote.StagedQuote>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.staged_quote.StagedQuote> resultType() {
        return new TypeReference<com.commercetools.api.models.staged_quote.StagedQuote>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private String stagedQuoteDraft;

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, String stagedQuoteDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.stagedQuoteDraft = stagedQuoteDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString(
            ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.stagedQuoteDraft = t.stagedQuoteDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/staged-quotes", this.projectKey, this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            stagedQuoteDraft.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.staged_quote.StagedQuote> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.staged_quote.StagedQuote.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.staged_quote.StagedQuote>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.staged_quote.StagedQuote.class);
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
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return stagedQuoteDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString withBody(String stagedQuoteDraft) {
        ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString t = copy();
        t.stagedQuoteDraft = stagedQuoteDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString that = (ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(stagedQuoteDraft, that.stagedQuoteDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(stagedQuoteDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesPostString(this);
    }
}
