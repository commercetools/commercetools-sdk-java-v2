
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
 *  <p>Produces the StandalonePriceCreated Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.standalone_price.StandalonePrice>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .standalonePrices()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStandalonePricesPostString extends
        StringBodyApiMethod<ByProjectKeyStandalonePricesPostString, com.commercetools.api.models.standalone_price.StandalonePrice>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyStandalonePricesPostString>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyStandalonePricesPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyStandalonePricesPostString> {

    public TypeReference<com.commercetools.api.models.standalone_price.StandalonePrice> resultType() {
        return new TypeReference<com.commercetools.api.models.standalone_price.StandalonePrice>() {
        };
    }

    private String projectKey;

    private String standalonePriceDraft;

    public ByProjectKeyStandalonePricesPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String standalonePriceDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.standalonePriceDraft = standalonePriceDraft;
    }

    public ByProjectKeyStandalonePricesPostString(ByProjectKeyStandalonePricesPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.standalonePriceDraft = t.standalonePriceDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/standalone-prices", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            standalonePriceDraft.getBytes(StandardCharsets.UTF_8));

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
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyStandalonePricesPostString
     */
    public <TValue> ByProjectKeyStandalonePricesPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyStandalonePricesPostString
     */
    public <TValue> ByProjectKeyStandalonePricesPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyStandalonePricesPostString
     */
    public ByProjectKeyStandalonePricesPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyStandalonePricesPostString
     */
    public ByProjectKeyStandalonePricesPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyStandalonePricesPostString
     */
    public ByProjectKeyStandalonePricesPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyStandalonePricesPostString
     */
    public ByProjectKeyStandalonePricesPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyStandalonePricesPostString
     */
    public <TValue> ByProjectKeyStandalonePricesPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyStandalonePricesPostString
     */
    public <TValue> ByProjectKeyStandalonePricesPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return standalonePriceDraft;
    }

    public ByProjectKeyStandalonePricesPostString withBody(String standalonePriceDraft) {
        ByProjectKeyStandalonePricesPostString t = copy();
        t.standalonePriceDraft = standalonePriceDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyStandalonePricesPostString that = (ByProjectKeyStandalonePricesPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(standalonePriceDraft, that.standalonePriceDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(standalonePriceDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyStandalonePricesPostString copy() {
        return new ByProjectKeyStandalonePricesPostString(this);
    }
}
