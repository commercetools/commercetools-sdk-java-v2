
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
 *  <p>If a modification is already in progress for the exact combination of SKU and price scope fields, an <a href="https://docs.commercetools.com/apis/ctp:api:type:ExactLockConflictError" rel="nofollow">ExactLockConflict</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:ValidityLockConflictError" rel="nofollow">ValidityLockConflict</a> error is returned.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.standalone_price.StandalonePrice>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .standalonePrices()
 *            .withKey("{key}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStandalonePricesKeyByKeyPostString extends
        StringBodyApiMethod<ByProjectKeyStandalonePricesKeyByKeyPostString, com.commercetools.api.models.standalone_price.StandalonePrice>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyStandalonePricesKeyByKeyPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyStandalonePricesKeyByKeyPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyStandalonePricesKeyByKeyPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyStandalonePricesKeyByKeyPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.standalone_price.StandalonePrice> resultType() {
        return new TypeReference<com.commercetools.api.models.standalone_price.StandalonePrice>() {
        };
    }

    private String projectKey;
    private String key;

    private String standalonePriceUpdate;

    public ByProjectKeyStandalonePricesKeyByKeyPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String key, String standalonePriceUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.standalonePriceUpdate = standalonePriceUpdate;
    }

    public ByProjectKeyStandalonePricesKeyByKeyPostString(ByProjectKeyStandalonePricesKeyByKeyPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.standalonePriceUpdate = t.standalonePriceUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/standalone-prices/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            standalonePriceUpdate.getBytes(StandardCharsets.UTF_8));

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
     * @return ByProjectKeyStandalonePricesKeyByKeyPostString
     */
    public <TValue> ByProjectKeyStandalonePricesKeyByKeyPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyStandalonePricesKeyByKeyPostString
     */
    public <TValue> ByProjectKeyStandalonePricesKeyByKeyPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyStandalonePricesKeyByKeyPostString
     */
    public ByProjectKeyStandalonePricesKeyByKeyPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyStandalonePricesKeyByKeyPostString
     */
    public ByProjectKeyStandalonePricesKeyByKeyPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyStandalonePricesKeyByKeyPostString
     */
    public ByProjectKeyStandalonePricesKeyByKeyPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyStandalonePricesKeyByKeyPostString
     */
    public ByProjectKeyStandalonePricesKeyByKeyPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyStandalonePricesKeyByKeyPostString
     */
    public <TValue> ByProjectKeyStandalonePricesKeyByKeyPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyStandalonePricesKeyByKeyPostString
     */
    public <TValue> ByProjectKeyStandalonePricesKeyByKeyPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return standalonePriceUpdate;
    }

    public ByProjectKeyStandalonePricesKeyByKeyPostString withBody(String standalonePriceUpdate) {
        ByProjectKeyStandalonePricesKeyByKeyPostString t = copy();
        t.standalonePriceUpdate = standalonePriceUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyStandalonePricesKeyByKeyPostString that = (ByProjectKeyStandalonePricesKeyByKeyPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(standalonePriceUpdate, that.standalonePriceUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(standalonePriceUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyStandalonePricesKeyByKeyPostString copy() {
        return new ByProjectKeyStandalonePricesKeyByKeyPostString(this);
    }
}
