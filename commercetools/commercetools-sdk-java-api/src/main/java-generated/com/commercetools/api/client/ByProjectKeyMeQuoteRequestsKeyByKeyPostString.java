
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
 *            .withKey("{key}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeQuoteRequestsKeyByKeyPostString extends
        StringBodyApiMethod<ByProjectKeyMeQuoteRequestsKeyByKeyPostString, com.commercetools.api.models.quote_request.QuoteRequest>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeQuoteRequestsKeyByKeyPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeQuoteRequestsKeyByKeyPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyMeQuoteRequestsKeyByKeyPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeQuoteRequestsKeyByKeyPostString> {

    private String projectKey;
    private String key;

    private String myQuoteRequestUpdate;

    public ByProjectKeyMeQuoteRequestsKeyByKeyPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String key, String myQuoteRequestUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.myQuoteRequestUpdate = myQuoteRequestUpdate;
    }

    public ByProjectKeyMeQuoteRequestsKeyByKeyPostString(ByProjectKeyMeQuoteRequestsKeyByKeyPostString t) {
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
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            myQuoteRequestUpdate.getBytes(StandardCharsets.UTF_8));

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
     * @return ByProjectKeyMeQuoteRequestsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyMeQuoteRequestsKeyByKeyPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyMeQuoteRequestsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyMeQuoteRequestsKeyByKeyPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyMeQuoteRequestsKeyByKeyPostString
     */
    public ByProjectKeyMeQuoteRequestsKeyByKeyPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyMeQuoteRequestsKeyByKeyPostString
     */
    public ByProjectKeyMeQuoteRequestsKeyByKeyPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyMeQuoteRequestsKeyByKeyPostString
     */
    public ByProjectKeyMeQuoteRequestsKeyByKeyPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyMeQuoteRequestsKeyByKeyPostString
     */
    public ByProjectKeyMeQuoteRequestsKeyByKeyPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyMeQuoteRequestsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyMeQuoteRequestsKeyByKeyPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyMeQuoteRequestsKeyByKeyPostString
     */
    public <TValue> ByProjectKeyMeQuoteRequestsKeyByKeyPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return myQuoteRequestUpdate;
    }

    public ByProjectKeyMeQuoteRequestsKeyByKeyPostString withBody(String myQuoteRequestUpdate) {
        ByProjectKeyMeQuoteRequestsKeyByKeyPostString t = copy();
        t.myQuoteRequestUpdate = myQuoteRequestUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMeQuoteRequestsKeyByKeyPostString that = (ByProjectKeyMeQuoteRequestsKeyByKeyPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(myQuoteRequestUpdate, that.myQuoteRequestUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(myQuoteRequestUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyMeQuoteRequestsKeyByKeyPostString copy() {
        return new ByProjectKeyMeQuoteRequestsKeyByKeyPostString(this);
    }
}
