
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
 *  <p>Queries Variant Projections in the specified <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
 *  <p>Only Variants belonging to Products distributed through the Store's configured channels are returned. By default, this endpoint returns the <code>current</code> representation of Variants where the <code>published</code> flag is <code>true</code>.</p>
 *  <p>Required access scopes:</p>
 *  <ul>
 *   <li><p>To retrieve the current representation of published Variants, the <code>view_published_products:{projectKey}</code> scope is required.</p></li>
 *   <li><p>To retrieve the staged representation, the API Client must have the <code>view_products:{projectKey}</code> scope.</p></li>
 *   <li><p>To access Variant Projections in the context of a Store, the <code>view_products:{projectKey}:{storeKey}</code> scope is required.</p></li>
 *  </ul>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.variant.VariantProjectionPagedQueryResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .variantProjections()
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet extends
        TypeApiMethod<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet, com.commercetools.api.models.variant.VariantProjectionPagedQueryResponse>
        implements
        com.commercetools.api.client.ProjectionselectingvariantTrait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet>,
        com.commercetools.api.client.PriceselectingTrait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet>,
        com.commercetools.api.client.LocaleprojectingTrait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet>,
        com.commercetools.api.client.AttributefilteringTrait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet> {

    @Override
    public TypeReference<com.commercetools.api.models.variant.VariantProjectionPagedQueryResponse> resultType() {
        return new TypeReference<com.commercetools.api.models.variant.VariantProjectionPagedQueryResponse>() {
        };
    }

    private String projectKey;
    private String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet(
            ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/variant-projections",
            encodePathParam(this.projectKey), encodePathParam(this.storeKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.variant.VariantProjectionPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.api.models.variant.VariantProjectionPagedQueryResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.variant.VariantProjectionPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.variant.VariantProjectionPagedQueryResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public List<String> getStaged() {
        return this.getQueryParam("staged");
    }

    public List<String> getPriceCurrency() {
        return this.getQueryParam("priceCurrency");
    }

    public List<String> getPriceCountry() {
        return this.getQueryParam("priceCountry");
    }

    public List<String> getPriceCustomerGroup() {
        return this.getQueryParam("priceCustomerGroup");
    }

    public List<String> getPriceCustomerGroupAssignments() {
        return this.getQueryParam("priceCustomerGroupAssignments");
    }

    public List<String> getPriceChannel() {
        return this.getQueryParam("priceChannel");
    }

    public List<String> getPriceRecurrencePolicy() {
        return this.getQueryParam("priceRecurrencePolicy");
    }

    public List<String> getLocaleProjection() {
        return this.getQueryParam("localeProjection");
    }

    public List<String> getFilterAttributes() {
        return this.getQueryParam("filter[attributes]");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public List<String> getSort() {
        return this.getQueryParam("sort");
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public List<String> getWithTotal() {
        return this.getQueryParam("withTotal");
    }

    public List<String> getWhere() {
        return this.getQueryParam("where");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    /**
     * set staged with the specified value
     * @param staged value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withStaged(final TValue staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     * @param staged value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addStaged(final TValue staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set staged with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withStaged(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("staged", supplier.get());
    }

    /**
     * add additional staged query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addStaged(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("staged", supplier.get());
    }

    /**
     * set staged with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withStaged(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * add additional staged query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addStaged(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * set staged with the specified values
     * @param staged values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withStaged(final Collection<TValue> staged) {
        return copy().withoutQueryParam("staged")
                .addQueryParams(
                    staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional staged query parameters
     * @param staged values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addStaged(final Collection<TValue> staged) {
        return copy().addQueryParams(
            staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set priceCurrency with the specified value
     * @param priceCurrency value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceCurrency(
            final TValue priceCurrency) {
        return copy().withQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * add additional priceCurrency query parameter
     * @param priceCurrency value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceCurrency(final TValue priceCurrency) {
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * set priceCurrency with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceCurrency(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCurrency", supplier.get());
    }

    /**
     * add additional priceCurrency query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceCurrency(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCurrency", supplier.get());
    }

    /**
     * set priceCurrency with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceCurrency(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCurrency query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceCurrency(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * set priceCurrency with the specified values
     * @param priceCurrency values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceCurrency(
            final Collection<TValue> priceCurrency) {
        return copy().withoutQueryParam("priceCurrency")
                .addQueryParams(priceCurrency.stream()
                        .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCurrency query parameters
     * @param priceCurrency values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceCurrency(
            final Collection<TValue> priceCurrency) {
        return copy().addQueryParams(priceCurrency.stream()
                .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCountry with the specified value
     * @param priceCountry value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceCountry(final TValue priceCountry) {
        return copy().withQueryParam("priceCountry", priceCountry);
    }

    /**
     * add additional priceCountry query parameter
     * @param priceCountry value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceCountry(final TValue priceCountry) {
        return copy().addQueryParam("priceCountry", priceCountry);
    }

    /**
     * set priceCountry with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceCountry(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCountry", supplier.get());
    }

    /**
     * add additional priceCountry query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceCountry(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCountry", supplier.get());
    }

    /**
     * set priceCountry with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceCountry(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCountry query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceCountry(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * set priceCountry with the specified values
     * @param priceCountry values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceCountry(
            final Collection<TValue> priceCountry) {
        return copy().withoutQueryParam("priceCountry")
                .addQueryParams(priceCountry.stream()
                        .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCountry query parameters
     * @param priceCountry values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceCountry(
            final Collection<TValue> priceCountry) {
        return copy().addQueryParams(priceCountry.stream()
                .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param priceCustomerGroup value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceCustomerGroup(
            final TValue priceCustomerGroup) {
        return copy().withQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param priceCustomerGroup value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceCustomerGroup(
            final TValue priceCustomerGroup) {
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceCustomerGroup(
            final Supplier<String> supplier) {
        return copy().withQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceCustomerGroup(
            final Supplier<String> supplier) {
        return copy().addQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceCustomerGroup(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceCustomerGroup(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * set priceCustomerGroup with the specified values
     * @param priceCustomerGroup values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceCustomerGroup(
            final Collection<TValue> priceCustomerGroup) {
        return copy().withoutQueryParam("priceCustomerGroup")
                .addQueryParams(priceCustomerGroup.stream()
                        .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCustomerGroup query parameters
     * @param priceCustomerGroup values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceCustomerGroup(
            final Collection<TValue> priceCustomerGroup) {
        return copy().addQueryParams(priceCustomerGroup.stream()
                .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCustomerGroupAssignments with the specified value
     * @param priceCustomerGroupAssignments value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceCustomerGroupAssignments(
            final TValue priceCustomerGroupAssignments) {
        return copy().withQueryParam("priceCustomerGroupAssignments", priceCustomerGroupAssignments);
    }

    /**
     * add additional priceCustomerGroupAssignments query parameter
     * @param priceCustomerGroupAssignments value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceCustomerGroupAssignments(
            final TValue priceCustomerGroupAssignments) {
        return copy().addQueryParam("priceCustomerGroupAssignments", priceCustomerGroupAssignments);
    }

    /**
     * set priceCustomerGroupAssignments with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceCustomerGroupAssignments(
            final Supplier<String> supplier) {
        return copy().withQueryParam("priceCustomerGroupAssignments", supplier.get());
    }

    /**
     * add additional priceCustomerGroupAssignments query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceCustomerGroupAssignments(
            final Supplier<String> supplier) {
        return copy().addQueryParam("priceCustomerGroupAssignments", supplier.get());
    }

    /**
     * set priceCustomerGroupAssignments with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceCustomerGroupAssignments(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCustomerGroupAssignments", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCustomerGroupAssignments query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceCustomerGroupAssignments(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCustomerGroupAssignments", op.apply(new StringBuilder()));
    }

    /**
     * set priceCustomerGroupAssignments with the specified values
     * @param priceCustomerGroupAssignments values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceCustomerGroupAssignments(
            final Collection<TValue> priceCustomerGroupAssignments) {
        return copy().withoutQueryParam("priceCustomerGroupAssignments")
                .addQueryParams(priceCustomerGroupAssignments.stream()
                        .map(s -> new ParamEntry<>("priceCustomerGroupAssignments", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCustomerGroupAssignments query parameters
     * @param priceCustomerGroupAssignments values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceCustomerGroupAssignments(
            final Collection<TValue> priceCustomerGroupAssignments) {
        return copy().addQueryParams(priceCustomerGroupAssignments.stream()
                .map(s -> new ParamEntry<>("priceCustomerGroupAssignments", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceChannel with the specified value
     * @param priceChannel value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceChannel(final TValue priceChannel) {
        return copy().withQueryParam("priceChannel", priceChannel);
    }

    /**
     * add additional priceChannel query parameter
     * @param priceChannel value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceChannel(final TValue priceChannel) {
        return copy().addQueryParam("priceChannel", priceChannel);
    }

    /**
     * set priceChannel with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceChannel(final Supplier<String> supplier) {
        return copy().withQueryParam("priceChannel", supplier.get());
    }

    /**
     * add additional priceChannel query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceChannel(final Supplier<String> supplier) {
        return copy().addQueryParam("priceChannel", supplier.get());
    }

    /**
     * set priceChannel with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceChannel(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceChannel query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceChannel(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * set priceChannel with the specified values
     * @param priceChannel values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceChannel(
            final Collection<TValue> priceChannel) {
        return copy().withoutQueryParam("priceChannel")
                .addQueryParams(priceChannel.stream()
                        .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceChannel query parameters
     * @param priceChannel values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceChannel(
            final Collection<TValue> priceChannel) {
        return copy().addQueryParams(priceChannel.stream()
                .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceRecurrencePolicy with the specified value
     * @param priceRecurrencePolicy value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceRecurrencePolicy(
            final TValue priceRecurrencePolicy) {
        return copy().withQueryParam("priceRecurrencePolicy", priceRecurrencePolicy);
    }

    /**
     * add additional priceRecurrencePolicy query parameter
     * @param priceRecurrencePolicy value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceRecurrencePolicy(
            final TValue priceRecurrencePolicy) {
        return copy().addQueryParam("priceRecurrencePolicy", priceRecurrencePolicy);
    }

    /**
     * set priceRecurrencePolicy with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceRecurrencePolicy(
            final Supplier<String> supplier) {
        return copy().withQueryParam("priceRecurrencePolicy", supplier.get());
    }

    /**
     * add additional priceRecurrencePolicy query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceRecurrencePolicy(
            final Supplier<String> supplier) {
        return copy().addQueryParam("priceRecurrencePolicy", supplier.get());
    }

    /**
     * set priceRecurrencePolicy with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceRecurrencePolicy(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceRecurrencePolicy", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceRecurrencePolicy query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceRecurrencePolicy(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceRecurrencePolicy", op.apply(new StringBuilder()));
    }

    /**
     * set priceRecurrencePolicy with the specified values
     * @param priceRecurrencePolicy values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPriceRecurrencePolicy(
            final Collection<TValue> priceRecurrencePolicy) {
        return copy().withoutQueryParam("priceRecurrencePolicy")
                .addQueryParams(priceRecurrencePolicy.stream()
                        .map(s -> new ParamEntry<>("priceRecurrencePolicy", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceRecurrencePolicy query parameters
     * @param priceRecurrencePolicy values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPriceRecurrencePolicy(
            final Collection<TValue> priceRecurrencePolicy) {
        return copy().addQueryParams(priceRecurrencePolicy.stream()
                .map(s -> new ParamEntry<>("priceRecurrencePolicy", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set localeProjection with the specified value
     * @param localeProjection value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withLocaleProjection(
            final TValue localeProjection) {
        return copy().withQueryParam("localeProjection", localeProjection);
    }

    /**
     * add additional localeProjection query parameter
     * @param localeProjection value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addLocaleProjection(
            final TValue localeProjection) {
        return copy().addQueryParam("localeProjection", localeProjection);
    }

    /**
     * set localeProjection with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withLocaleProjection(final Supplier<String> supplier) {
        return copy().withQueryParam("localeProjection", supplier.get());
    }

    /**
     * add additional localeProjection query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addLocaleProjection(final Supplier<String> supplier) {
        return copy().addQueryParam("localeProjection", supplier.get());
    }

    /**
     * set localeProjection with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withLocaleProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * add additional localeProjection query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addLocaleProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * set localeProjection with the specified values
     * @param localeProjection values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withLocaleProjection(
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
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addLocaleProjection(
            final Collection<TValue> localeProjection) {
        return copy().addQueryParams(localeProjection.stream()
                .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set filterAttributes with the specified value
     * @param filterAttributes value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withFilterAttributes(
            final TValue filterAttributes) {
        return copy().withQueryParam("filter[attributes]", filterAttributes);
    }

    /**
     * add additional filterAttributes query parameter
     * @param filterAttributes value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addFilterAttributes(
            final TValue filterAttributes) {
        return copy().addQueryParam("filter[attributes]", filterAttributes);
    }

    /**
     * set filterAttributes with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withFilterAttributes(final Supplier<String> supplier) {
        return copy().withQueryParam("filter[attributes]", supplier.get());
    }

    /**
     * add additional filterAttributes query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addFilterAttributes(final Supplier<String> supplier) {
        return copy().addQueryParam("filter[attributes]", supplier.get());
    }

    /**
     * set filterAttributes with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withFilterAttributes(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("filter[attributes]", op.apply(new StringBuilder()));
    }

    /**
     * add additional filterAttributes query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addFilterAttributes(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("filter[attributes]", op.apply(new StringBuilder()));
    }

    /**
     * set filterAttributes with the specified values
     * @param filterAttributes values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withFilterAttributes(
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
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addFilterAttributes(
            final Collection<TValue> filterAttributes) {
        return copy().addQueryParams(filterAttributes.stream()
                .map(s -> new ParamEntry<>("filter[attributes]", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specified value
     * @param sort value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withSort(final TValue sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     * @param sort value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addSort(final TValue sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withSort(final Supplier<String> supplier) {
        return copy().withQueryParam("sort", supplier.get());
    }

    /**
     * add additional sort query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addSort(final Supplier<String> supplier) {
        return copy().addQueryParam("sort", supplier.get());
    }

    /**
     * set sort with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withSort(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * add additional sort query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addSort(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * set sort with the specified values
     * @param sort values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withSort(final Collection<TValue> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     * @param sort values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addSort(final Collection<TValue> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specified value
     * @param limit value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     * @param limit value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withLimit(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addLimit(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     * @param limit values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withLimit(final Collection<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     * @param limit values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addLimit(final Collection<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     * @param offset value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     * @param offset value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withOffset(final Supplier<Integer> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addOffset(final Supplier<Integer> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withOffset(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addOffset(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     * @param offset values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withOffset(final Collection<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     * @param offset values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addOffset(final Collection<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set withTotal with the specified value
     * @param withTotal value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withWithTotal(final TValue withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     * @param withTotal value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addWithTotal(final TValue withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set withTotal with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withWithTotal(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("withTotal", supplier.get());
    }

    /**
     * add additional withTotal query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addWithTotal(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("withTotal", supplier.get());
    }

    /**
     * set withTotal with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withWithTotal(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * add additional withTotal query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addWithTotal(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * set withTotal with the specified values
     * @param withTotal values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withWithTotal(
            final Collection<TValue> withTotal) {
        return copy().withoutQueryParam("withTotal")
                .addQueryParams(withTotal.stream()
                        .map(s -> new ParamEntry<>("withTotal", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional withTotal query parameters
     * @param withTotal values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addWithTotal(
            final Collection<TValue> withTotal) {
        return copy().addQueryParams(
            withTotal.stream().map(s -> new ParamEntry<>("withTotal", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set where with the specified value
     * @param where value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withWhere(final TValue where) {
        return copy().withQueryParam("where", where);
    }

    /**
     * add additional where query parameter
     * @param where value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addWhere(final TValue where) {
        return copy().addQueryParam("where", where);
    }

    /**
     * set where with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withWhere(final Supplier<String> supplier) {
        return copy().withQueryParam("where", supplier.get());
    }

    /**
     * add additional where query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addWhere(final Supplier<String> supplier) {
        return copy().addQueryParam("where", supplier.get());
    }

    /**
     * set where with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withWhere(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("where", op.apply(new StringBuilder()));
    }

    /**
     * add additional where query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addWhere(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("where", op.apply(new StringBuilder()));
    }

    /**
     * set where with the specified values
     * @param where values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withWhere(final Collection<TValue> where) {
        return copy().withoutQueryParam("where")
                .addQueryParams(
                    where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional where query parameters
     * @param where values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addWhere(final Collection<TValue> where) {
        return copy().addQueryParams(
            where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set predicateVar with the specificied value
     * @param <TValue> value type
     * @param varName parameter name
     * @param predicateVar parameter value
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPredicateVar(final String varName,
            final TValue predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * add additional predicateVar query parameter
     * @param <TValue> value type
     * @param varName parameter name
     * @param predicateVar parameter value
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPredicateVar(final String varName,
            final TValue predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * set predicateVar with the specificied values
     * @param <TValue> value type
     * @param varName parameter name
     * @param predicateVar parameter values
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet withPredicateVar(final String varName,
            final Collection<TValue> predicateVar) {
        final String placeholderName = String.format("var.%s", varName);
        return copy().withoutQueryParam(placeholderName)
                .addQueryParams(predicateVar.stream()
                        .map(s -> new ParamEntry<>(placeholderName, s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional predicateVar query parameters
     * @param <TValue> value type
     * @param varName parameter name
     * @param predicateVar parameter values
     * @return ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet addPredicateVar(final String varName,
            final Collection<TValue> predicateVar) {
        final String placeholderName = String.format("var.%s", varName);
        return copy().addQueryParams(predicateVar.stream()
                .map(s -> new ParamEntry<>(placeholderName, s.toString()))
                .collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet that = (ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(storeKey, that.storeKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyVariantProjectionsGet(this);
    }
}
