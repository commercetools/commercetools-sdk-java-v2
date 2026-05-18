
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
 *  <p>Creating a Standalone Price produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceCreatedMessage" rel="nofollow">StandalonePriceCreated</a> Message.</p>
 *  <ul>
 *   <li>If the Standalone Price has the same price scope as an existing Standalone Price, a <a href="https://docs.commercetools.com/apis/ctp:api:type:DuplicateStandalonePriceScopeError" rel="nofollow">DuplicateStandalonePriceScope</a> error is returned.</li>
 *   <li>If the Standalone Price has overlapping validity periods within the same price scope, a <a href="https://docs.commercetools.com/apis/ctp:api:type:OverlappingStandalonePriceValidityError" rel="nofollow">OverlappingStandalonePriceValidity</a> error is returned. A Price without validity period does not conflict with a Price defined for a time period.</li>
 *   <li>If a modification is already in progress for the exact combination of SKU and price scope fields, an <a href="https://docs.commercetools.com/apis/ctp:api:type:ExactLockConflictError" rel="nofollow">ExactLockConflict</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:ValidityLockConflictError" rel="nofollow">ValidityLockConflict</a> error is returned.</li>
 *  </ul>
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
        TypeBodyApiMethod<ByProjectKeyStandalonePricesPost, com.commercetools.api.models.standalone_price.StandalonePrice, com.commercetools.api.models.standalone_price.StandalonePriceDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyStandalonePricesPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyStandalonePricesPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyStandalonePricesPost> {

    @Override
    public TypeReference<com.commercetools.api.models.standalone_price.StandalonePrice> resultType() {
        return new TypeReference<com.commercetools.api.models.standalone_price.StandalonePrice>() {
        };
    }

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
        String httpRequestPath = String.format("%s/standalone-prices", encodePathParam(this.projectKey));
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
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyStandalonePricesPost
     */
    public <TValue> ByProjectKeyStandalonePricesPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyStandalonePricesPost
     */
    public <TValue> ByProjectKeyStandalonePricesPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyStandalonePricesPost
     */
    public ByProjectKeyStandalonePricesPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyStandalonePricesPost
     */
    public ByProjectKeyStandalonePricesPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyStandalonePricesPost
     */
    public ByProjectKeyStandalonePricesPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyStandalonePricesPost
     */
    public ByProjectKeyStandalonePricesPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyStandalonePricesPost
     */
    public <TValue> ByProjectKeyStandalonePricesPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyStandalonePricesPost
     */
    public <TValue> ByProjectKeyStandalonePricesPost addExpand(final Collection<TValue> expand) {
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
