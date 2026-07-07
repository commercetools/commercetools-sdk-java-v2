
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

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import tools.jackson.core.type.TypeReference;

/**
 *  <p>Returns a lightweight representation of all Variants for a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>, including only the requested variant-level <a href="https://docs.commercetools.com/apis/ctp:api:type:Attribute" rel="nofollow">Attributes</a> and minimal availability data.</p>
 *  <p>Designed for building attribute selectors on product detail pages (PDPs) with large numbers of variants. Only available for Projects with <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogModel" rel="nofollow">productCatalogModel</a> set to <code>Modular</code>.</p>
 *  <p>Product-level Attributes are omitted from the response.</p>
 *  <p>Required access scopes:</p>
 *  <ul>
 *   <li>To retrieve the current representation of published Products (published data), the <code>view_published_products:{projectKey}</code> or <code>view_products:{projectKey}</code> scope is required.</li>
 *   <li>To retrieve the staged representation of Products (draft data), the API Client must have the <code>view_products:{projectKey}</code> scope.</li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.variant_attributes.VariantAttributes>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .productProjections()
 *            .withId("{ID}")
 *            .variantAttributes()
 *            .get()
 *            .withFilterAttributes(filterAttributes)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductProjectionsByIDVariantAttributesGet extends
        TypeApiMethod<ByProjectKeyProductProjectionsByIDVariantAttributesGet, com.commercetools.api.models.variant_attributes.VariantAttributes>
        implements
        com.commercetools.api.client.ProjectionselectingTrait<ByProjectKeyProductProjectionsByIDVariantAttributesGet>,
        com.commercetools.api.client.LocaleprojectingTrait<ByProjectKeyProductProjectionsByIDVariantAttributesGet>,
        com.commercetools.api.client.VariantattributefilteringTrait<ByProjectKeyProductProjectionsByIDVariantAttributesGet>,
        com.commercetools.api.client.SupplychannelfilteringTrait<ByProjectKeyProductProjectionsByIDVariantAttributesGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductProjectionsByIDVariantAttributesGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductProjectionsByIDVariantAttributesGet> {

    @Override
    public TypeReference<com.commercetools.api.models.variant_attributes.VariantAttributes> resultType() {
        return new TypeReference<com.commercetools.api.models.variant_attributes.VariantAttributes>() {
        };
    }

    private String projectKey;
    private String ID;

    public ByProjectKeyProductProjectionsByIDVariantAttributesGet(final ApiHttpClient apiHttpClient, String projectKey,
            String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyProductProjectionsByIDVariantAttributesGet(
            ByProjectKeyProductProjectionsByIDVariantAttributesGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/product-projections/%s/variant-attributes",
            encodePathParam(this.projectKey), encodePathParam(this.ID));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.variant_attributes.VariantAttributes> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.api.models.variant_attributes.VariantAttributes.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.variant_attributes.VariantAttributes>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.variant_attributes.VariantAttributes.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getStaged() {
        return this.getQueryParam("staged");
    }

    public List<String> getLocaleProjection() {
        return this.getQueryParam("localeProjection");
    }

    public List<String> getFilterAttributes() {
        return this.getQueryParam("filter[attributes]");
    }

    public List<String> getFilterSupplyChannels() {
        return this.getQueryParam("filter[supplyChannels]");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set staged with the specified value
     * @param staged value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public <TValue> ByProjectKeyProductProjectionsByIDVariantAttributesGet withStaged(final TValue staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     * @param staged value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public <TValue> ByProjectKeyProductProjectionsByIDVariantAttributesGet addStaged(final TValue staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set staged with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public ByProjectKeyProductProjectionsByIDVariantAttributesGet withStaged(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("staged", supplier.get());
    }

    /**
     * add additional staged query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public ByProjectKeyProductProjectionsByIDVariantAttributesGet addStaged(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("staged", supplier.get());
    }

    /**
     * set staged with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public ByProjectKeyProductProjectionsByIDVariantAttributesGet withStaged(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * add additional staged query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public ByProjectKeyProductProjectionsByIDVariantAttributesGet addStaged(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * set staged with the specified values
     * @param staged values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public <TValue> ByProjectKeyProductProjectionsByIDVariantAttributesGet withStaged(final Collection<TValue> staged) {
        return copy().withoutQueryParam("staged")
                .addQueryParams(
                    staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional staged query parameters
     * @param staged values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public <TValue> ByProjectKeyProductProjectionsByIDVariantAttributesGet addStaged(final Collection<TValue> staged) {
        return copy().addQueryParams(
            staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set localeProjection with the specified value
     * @param localeProjection value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public <TValue> ByProjectKeyProductProjectionsByIDVariantAttributesGet withLocaleProjection(
            final TValue localeProjection) {
        return copy().withQueryParam("localeProjection", localeProjection);
    }

    /**
     * add additional localeProjection query parameter
     * @param localeProjection value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public <TValue> ByProjectKeyProductProjectionsByIDVariantAttributesGet addLocaleProjection(
            final TValue localeProjection) {
        return copy().addQueryParam("localeProjection", localeProjection);
    }

    /**
     * set localeProjection with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public ByProjectKeyProductProjectionsByIDVariantAttributesGet withLocaleProjection(
            final Supplier<String> supplier) {
        return copy().withQueryParam("localeProjection", supplier.get());
    }

    /**
     * add additional localeProjection query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public ByProjectKeyProductProjectionsByIDVariantAttributesGet addLocaleProjection(final Supplier<String> supplier) {
        return copy().addQueryParam("localeProjection", supplier.get());
    }

    /**
     * set localeProjection with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public ByProjectKeyProductProjectionsByIDVariantAttributesGet withLocaleProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * add additional localeProjection query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public ByProjectKeyProductProjectionsByIDVariantAttributesGet addLocaleProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * set localeProjection with the specified values
     * @param localeProjection values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public <TValue> ByProjectKeyProductProjectionsByIDVariantAttributesGet withLocaleProjection(
            final Collection<TValue> localeProjection) {
        return copy().withoutQueryParam("localeProjection")
                .addQueryParams(localeProjection.stream()
                        .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional localeProjection query parameters
     * @param localeProjection values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public <TValue> ByProjectKeyProductProjectionsByIDVariantAttributesGet addLocaleProjection(
            final Collection<TValue> localeProjection) {
        return copy().addQueryParams(localeProjection.stream()
                .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set filterAttributes with the specified value
     * @param filterAttributes value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public <TValue> ByProjectKeyProductProjectionsByIDVariantAttributesGet withFilterAttributes(
            final TValue filterAttributes) {
        return copy().withQueryParam("filter[attributes]", filterAttributes);
    }

    /**
     * add additional filterAttributes query parameter
     * @param filterAttributes value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public <TValue> ByProjectKeyProductProjectionsByIDVariantAttributesGet addFilterAttributes(
            final TValue filterAttributes) {
        return copy().addQueryParam("filter[attributes]", filterAttributes);
    }

    /**
     * set filterAttributes with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public ByProjectKeyProductProjectionsByIDVariantAttributesGet withFilterAttributes(
            final Supplier<String> supplier) {
        return copy().withQueryParam("filter[attributes]", supplier.get());
    }

    /**
     * add additional filterAttributes query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public ByProjectKeyProductProjectionsByIDVariantAttributesGet addFilterAttributes(final Supplier<String> supplier) {
        return copy().addQueryParam("filter[attributes]", supplier.get());
    }

    /**
     * set filterAttributes with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public ByProjectKeyProductProjectionsByIDVariantAttributesGet withFilterAttributes(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("filter[attributes]", op.apply(new StringBuilder()));
    }

    /**
     * add additional filterAttributes query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public ByProjectKeyProductProjectionsByIDVariantAttributesGet addFilterAttributes(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("filter[attributes]", op.apply(new StringBuilder()));
    }

    /**
     * set filterAttributes with the specified values
     * @param filterAttributes values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public <TValue> ByProjectKeyProductProjectionsByIDVariantAttributesGet withFilterAttributes(
            final Collection<TValue> filterAttributes) {
        return copy().withoutQueryParam("filter[attributes]")
                .addQueryParams(filterAttributes.stream()
                        .map(s -> new ParamEntry<>("filter[attributes]", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional filterAttributes query parameters
     * @param filterAttributes values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public <TValue> ByProjectKeyProductProjectionsByIDVariantAttributesGet addFilterAttributes(
            final Collection<TValue> filterAttributes) {
        return copy().addQueryParams(filterAttributes.stream()
                .map(s -> new ParamEntry<>("filter[attributes]", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set filterSupplyChannels with the specified value
     * @param filterSupplyChannels value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public <TValue> ByProjectKeyProductProjectionsByIDVariantAttributesGet withFilterSupplyChannels(
            final TValue filterSupplyChannels) {
        return copy().withQueryParam("filter[supplyChannels]", filterSupplyChannels);
    }

    /**
     * add additional filterSupplyChannels query parameter
     * @param filterSupplyChannels value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public <TValue> ByProjectKeyProductProjectionsByIDVariantAttributesGet addFilterSupplyChannels(
            final TValue filterSupplyChannels) {
        return copy().addQueryParam("filter[supplyChannels]", filterSupplyChannels);
    }

    /**
     * set filterSupplyChannels with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public ByProjectKeyProductProjectionsByIDVariantAttributesGet withFilterSupplyChannels(
            final Supplier<String> supplier) {
        return copy().withQueryParam("filter[supplyChannels]", supplier.get());
    }

    /**
     * add additional filterSupplyChannels query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public ByProjectKeyProductProjectionsByIDVariantAttributesGet addFilterSupplyChannels(
            final Supplier<String> supplier) {
        return copy().addQueryParam("filter[supplyChannels]", supplier.get());
    }

    /**
     * set filterSupplyChannels with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public ByProjectKeyProductProjectionsByIDVariantAttributesGet withFilterSupplyChannels(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("filter[supplyChannels]", op.apply(new StringBuilder()));
    }

    /**
     * add additional filterSupplyChannels query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public ByProjectKeyProductProjectionsByIDVariantAttributesGet addFilterSupplyChannels(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("filter[supplyChannels]", op.apply(new StringBuilder()));
    }

    /**
     * set filterSupplyChannels with the specified values
     * @param filterSupplyChannels values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public <TValue> ByProjectKeyProductProjectionsByIDVariantAttributesGet withFilterSupplyChannels(
            final Collection<TValue> filterSupplyChannels) {
        return copy().withoutQueryParam("filter[supplyChannels]")
                .addQueryParams(filterSupplyChannels.stream()
                        .map(s -> new ParamEntry<>("filter[supplyChannels]", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional filterSupplyChannels query parameters
     * @param filterSupplyChannels values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsByIDVariantAttributesGet
     */
    public <TValue> ByProjectKeyProductProjectionsByIDVariantAttributesGet addFilterSupplyChannels(
            final Collection<TValue> filterSupplyChannels) {
        return copy().addQueryParams(filterSupplyChannels.stream()
                .map(s -> new ParamEntry<>("filter[supplyChannels]", s.toString()))
                .collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductProjectionsByIDVariantAttributesGet that = (ByProjectKeyProductProjectionsByIDVariantAttributesGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(ID, that.ID).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).toHashCode();
    }

    @Override
    protected ByProjectKeyProductProjectionsByIDVariantAttributesGet copy() {
        return new ByProjectKeyProductProjectionsByIDVariantAttributesGet(this);
    }
}
