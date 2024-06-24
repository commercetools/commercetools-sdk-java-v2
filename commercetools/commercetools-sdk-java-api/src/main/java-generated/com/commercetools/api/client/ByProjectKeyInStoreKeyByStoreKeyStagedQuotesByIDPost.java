
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.staged_quote.StagedQuote>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .stagedQuotes()
 *            .withId("{ID}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost extends
        TypeBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost, com.commercetools.api.models.staged_quote.StagedQuote, com.commercetools.api.models.staged_quote.StagedQuoteUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost> {

    @Override
    public TypeReference<com.commercetools.api.models.staged_quote.StagedQuote> resultType() {
        return new TypeReference<com.commercetools.api.models.staged_quote.StagedQuote>() {
        };
    }

    private String projectKey;
    private String storeKey;
    private String ID;

    private com.commercetools.api.models.staged_quote.StagedQuoteUpdate stagedQuoteUpdate;

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, String ID, com.commercetools.api.models.staged_quote.StagedQuoteUpdate stagedQuoteUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
        this.stagedQuoteUpdate = stagedQuoteUpdate;
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost(
            ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.ID = t.ID;
        this.stagedQuoteUpdate = t.stagedQuoteUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/staged-quotes/%s", this.projectKey, this.storeKey,
            this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(stagedQuoteUpdate)));

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
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.staged_quote.StagedQuoteUpdate getBody() {
        return stagedQuoteUpdate;
    }

    public ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost withBody(
            com.commercetools.api.models.staged_quote.StagedQuoteUpdate stagedQuoteUpdate) {
        ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost t = copy();
        t.stagedQuoteUpdate = stagedQuoteUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost that = (ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(ID, that.ID)
                .append(stagedQuoteUpdate, that.stagedQuoteUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(storeKey)
                .append(ID)
                .append(stagedQuoteUpdate)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyStagedQuotesByIDPost(this);
    }
}
