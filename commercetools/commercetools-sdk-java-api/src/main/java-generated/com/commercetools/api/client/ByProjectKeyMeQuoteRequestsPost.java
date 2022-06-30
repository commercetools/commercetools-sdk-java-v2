
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.quote_request.QuoteRequest>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .me()
 *            .quoteRequests()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeQuoteRequestsPost extends
        BodyApiMethod<ByProjectKeyMeQuoteRequestsPost, com.commercetools.api.models.quote_request.QuoteRequest, com.commercetools.api.models.me.MyQuoteRequestDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeQuoteRequestsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyMeQuoteRequestsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeQuoteRequestsPost> {

    private String projectKey;

    private com.commercetools.api.models.me.MyQuoteRequestDraft myQuoteRequestDraft;

    public ByProjectKeyMeQuoteRequestsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.me.MyQuoteRequestDraft myQuoteRequestDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myQuoteRequestDraft = myQuoteRequestDraft;
    }

    public ByProjectKeyMeQuoteRequestsPost(ByProjectKeyMeQuoteRequestsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myQuoteRequestDraft = t.myQuoteRequestDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/quote-requests", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myQuoteRequestDraft)));

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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyMeQuoteRequestsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyMeQuoteRequestsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyMeQuoteRequestsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyMeQuoteRequestsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyMeQuoteRequestsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyMeQuoteRequestsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyMeQuoteRequestsPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyMeQuoteRequestsPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.me.MyQuoteRequestDraft getBody() {
        return myQuoteRequestDraft;
    }

    public ByProjectKeyMeQuoteRequestsPost withBody(
            com.commercetools.api.models.me.MyQuoteRequestDraft myQuoteRequestDraft) {
        ByProjectKeyMeQuoteRequestsPost t = copy();
        t.myQuoteRequestDraft = myQuoteRequestDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeQuoteRequestsPost that = (ByProjectKeyMeQuoteRequestsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(myQuoteRequestDraft, that.myQuoteRequestDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(myQuoteRequestDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyMeQuoteRequestsPost copy() {
        return new ByProjectKeyMeQuoteRequestsPost(this);
    }
}
