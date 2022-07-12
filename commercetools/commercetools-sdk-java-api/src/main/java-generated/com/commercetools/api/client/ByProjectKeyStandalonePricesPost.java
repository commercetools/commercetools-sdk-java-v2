
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
 *  <p>Produces the StandalonePriceCreatedMessage.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.standalone_price.StandalonePrice>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .standalonePrices()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStandalonePricesPost extends
        BodyApiMethod<ByProjectKeyStandalonePricesPost, com.commercetools.api.models.standalone_price.StandalonePrice, com.commercetools.api.models.standalone_price.StandalonePriceDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyStandalonePricesPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyStandalonePricesPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyStandalonePricesPost> {

    private String projectKey;

    private com.commercetools.api.models.standalone_price.StandalonePriceDraft standalonePriceDraft;

    public ByProjectKeyStandalonePricesPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.standalone_price.StandalonePriceDraft standalonePriceDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.standalonePriceDraft = standalonePriceDraft;
    }

    public ByProjectKeyStandalonePricesPost(ByProjectKeyStandalonePricesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.standalonePriceDraft = t.standalonePriceDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/standalone-prices", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(standalonePriceDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.standalone_price.StandalonePrice> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.standalone_price.StandalonePrice.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.standalone_price.StandalonePrice>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.standalone_price.StandalonePrice.class);
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
    public <TValue> ByProjectKeyStandalonePricesPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyStandalonePricesPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyStandalonePricesPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyStandalonePricesPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyStandalonePricesPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyStandalonePricesPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyStandalonePricesPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyStandalonePricesPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.standalone_price.StandalonePriceDraft getBody() {
        return standalonePriceDraft;
    }

    public ByProjectKeyStandalonePricesPost withBody(
            com.commercetools.api.models.standalone_price.StandalonePriceDraft standalonePriceDraft) {
        ByProjectKeyStandalonePricesPost t = copy();
        t.standalonePriceDraft = standalonePriceDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyStandalonePricesPost that = (ByProjectKeyStandalonePricesPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(standalonePriceDraft, that.standalonePriceDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(standalonePriceDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyStandalonePricesPost copy() {
        return new ByProjectKeyStandalonePricesPost(this);
    }
}
