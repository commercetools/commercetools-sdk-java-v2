
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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
 *            .stagedQuotes()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStagedQuotesPost extends
        BodyApiMethod<ByProjectKeyStagedQuotesPost, com.commercetools.api.models.staged_quote.StagedQuote, com.commercetools.api.models.staged_quote.StagedQuoteDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyStagedQuotesPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyStagedQuotesPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyStagedQuotesPost> {

    private String projectKey;

    private com.commercetools.api.models.staged_quote.StagedQuoteDraft stagedQuoteDraft;

    public ByProjectKeyStagedQuotesPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.staged_quote.StagedQuoteDraft stagedQuoteDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.stagedQuoteDraft = stagedQuoteDraft;
    }

    public ByProjectKeyStagedQuotesPost(ByProjectKeyStagedQuotesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.stagedQuoteDraft = t.stagedQuoteDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/staged-quotes", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(stagedQuoteDraft)));

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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyStagedQuotesPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyStagedQuotesPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyStagedQuotesPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyStagedQuotesPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyStagedQuotesPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyStagedQuotesPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyStagedQuotesPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyStagedQuotesPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.staged_quote.StagedQuoteDraft getBody() {
        return stagedQuoteDraft;
    }

    public ByProjectKeyStagedQuotesPost withBody(
            com.commercetools.api.models.staged_quote.StagedQuoteDraft stagedQuoteDraft) {
        ByProjectKeyStagedQuotesPost t = copy();
        t.stagedQuoteDraft = stagedQuoteDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyStagedQuotesPost that = (ByProjectKeyStagedQuotesPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(stagedQuoteDraft, that.stagedQuoteDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(stagedQuoteDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyStagedQuotesPost copy() {
        return new ByProjectKeyStagedQuotesPost(this);
    }
}
