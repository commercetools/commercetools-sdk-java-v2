
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
 *  <p>Updates a StagedQuote in the Project using one or more <span>update actions</span>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.staged_quote.StagedQuote>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .stagedQuotes()
 *            .withKey("{key}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStagedQuotesKeyByKeyPostString extends
        StringBodyApiMethod<ByProjectKeyStagedQuotesKeyByKeyPostString, com.commercetools.api.models.staged_quote.StagedQuote>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyStagedQuotesKeyByKeyPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyStagedQuotesKeyByKeyPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyStagedQuotesKeyByKeyPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyStagedQuotesKeyByKeyPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.staged_quote.StagedQuote> resultType() {
        return new TypeReference<com.commercetools.api.models.staged_quote.StagedQuote>() {
        };
    }

    private String projectKey;
    private String key;

    private String stagedQuoteUpdate;

    public ByProjectKeyStagedQuotesKeyByKeyPostString(final ApiHttpClient apiHttpClient, String projectKey, String key,
            String stagedQuoteUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.stagedQuoteUpdate = stagedQuoteUpdate;
    }

    public ByProjectKeyStagedQuotesKeyByKeyPostString(ByProjectKeyStagedQuotesKeyByKeyPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.stagedQuoteUpdate = t.stagedQuoteUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/staged-quotes/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            stagedQuoteUpdate.getBytes(StandardCharsets.UTF_8));

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

    public String getKey() {
        return this.key;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyStagedQuotesKeyByKeyPostString
     */
    public <TValue> ByProjectKeyStagedQuotesKeyByKeyPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyStagedQuotesKeyByKeyPostString
     */
    public <TValue> ByProjectKeyStagedQuotesKeyByKeyPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyStagedQuotesKeyByKeyPostString
     */
    public ByProjectKeyStagedQuotesKeyByKeyPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyStagedQuotesKeyByKeyPostString
     */
    public ByProjectKeyStagedQuotesKeyByKeyPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyStagedQuotesKeyByKeyPostString
     */
    public ByProjectKeyStagedQuotesKeyByKeyPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyStagedQuotesKeyByKeyPostString
     */
    public ByProjectKeyStagedQuotesKeyByKeyPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyStagedQuotesKeyByKeyPostString
     */
    public <TValue> ByProjectKeyStagedQuotesKeyByKeyPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyStagedQuotesKeyByKeyPostString
     */
    public <TValue> ByProjectKeyStagedQuotesKeyByKeyPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return stagedQuoteUpdate;
    }

    public ByProjectKeyStagedQuotesKeyByKeyPostString withBody(String stagedQuoteUpdate) {
        ByProjectKeyStagedQuotesKeyByKeyPostString t = copy();
        t.stagedQuoteUpdate = stagedQuoteUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyStagedQuotesKeyByKeyPostString that = (ByProjectKeyStagedQuotesKeyByKeyPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(stagedQuoteUpdate, that.stagedQuoteUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(stagedQuoteUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyStagedQuotesKeyByKeyPostString copy() {
        return new ByProjectKeyStagedQuotesKeyByKeyPostString(this);
    }
}
