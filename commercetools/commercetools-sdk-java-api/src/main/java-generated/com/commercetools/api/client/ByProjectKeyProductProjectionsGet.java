
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
 *  <p>Use the Product Projections query endpoint to get the current or staged representations of Products. When used with an API Client that has the <code>view_published_products:{projectKey}</code> scope, this endpoint only returns published (current) Product Projections.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedQueryResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .productProjections()
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductProjectionsGet extends
        TypeApiMethod<ByProjectKeyProductProjectionsGet, com.commercetools.api.models.product.ProductProjectionPagedQueryResponse>
        implements ByProjectKeyProductProjectionsGetMixin,
        com.commercetools.api.client.ProjectionselectingTrait<ByProjectKeyProductProjectionsGet>,
        com.commercetools.api.client.PriceselectingTrait<ByProjectKeyProductProjectionsGet>,
        com.commercetools.api.client.LocaleprojectingTrait<ByProjectKeyProductProjectionsGet>,
        com.commercetools.api.client.StoreprojectingTrait<ByProjectKeyProductProjectionsGet>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductProjectionsGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyProductProjectionsGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyProductProjectionsGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyProductProjectionsGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductProjectionsGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductProjectionsGet> {

    @Override
    public TypeReference<com.commercetools.api.models.product.ProductProjectionPagedQueryResponse> resultType() {
        return new TypeReference<com.commercetools.api.models.product.ProductProjectionPagedQueryResponse>() {
        };
    }

    private String projectKey;

    public ByProjectKeyProductProjectionsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductProjectionsGet(ByProjectKeyProductProjectionsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/product-projections", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.api.models.product.ProductProjectionPagedQueryResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product.ProductProjectionPagedQueryResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
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

    public List<String> getPriceChannel() {
        return this.getQueryParam("priceChannel");
    }

    public List<String> getLocaleProjection() {
        return this.getQueryParam("localeProjection");
    }

    public List<String> getStoreProjection() {
        return this.getQueryParam("storeProjection");
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

    /**
     * set staged with the specified value
     * @param staged value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withStaged(final TValue staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     * @param staged value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addStaged(final TValue staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set staged with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withStaged(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("staged", supplier.get());
    }

    /**
     * add additional staged query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addStaged(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("staged", supplier.get());
    }

    /**
     * set staged with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withStaged(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * add additional staged query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addStaged(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * set staged with the specified values
     * @param staged values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withStaged(final Collection<TValue> staged) {
        return copy().withoutQueryParam("staged")
                .addQueryParams(
                    staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional staged query parameters
     * @param staged values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addStaged(final Collection<TValue> staged) {
        return copy().addQueryParams(
            staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set priceCurrency with the specified value
     * @param priceCurrency value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withPriceCurrency(final TValue priceCurrency) {
        return copy().withQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * add additional priceCurrency query parameter
     * @param priceCurrency value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addPriceCurrency(final TValue priceCurrency) {
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * set priceCurrency with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withPriceCurrency(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCurrency", supplier.get());
    }

    /**
     * add additional priceCurrency query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addPriceCurrency(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCurrency", supplier.get());
    }

    /**
     * set priceCurrency with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withPriceCurrency(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCurrency query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addPriceCurrency(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * set priceCurrency with the specified values
     * @param priceCurrency values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withPriceCurrency(final Collection<TValue> priceCurrency) {
        return copy().withoutQueryParam("priceCurrency")
                .addQueryParams(priceCurrency.stream()
                        .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCurrency query parameters
     * @param priceCurrency values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addPriceCurrency(final Collection<TValue> priceCurrency) {
        return copy().addQueryParams(priceCurrency.stream()
                .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCountry with the specified value
     * @param priceCountry value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withPriceCountry(final TValue priceCountry) {
        return copy().withQueryParam("priceCountry", priceCountry);
    }

    /**
     * add additional priceCountry query parameter
     * @param priceCountry value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addPriceCountry(final TValue priceCountry) {
        return copy().addQueryParam("priceCountry", priceCountry);
    }

    /**
     * set priceCountry with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withPriceCountry(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCountry", supplier.get());
    }

    /**
     * add additional priceCountry query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addPriceCountry(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCountry", supplier.get());
    }

    /**
     * set priceCountry with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withPriceCountry(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCountry query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addPriceCountry(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * set priceCountry with the specified values
     * @param priceCountry values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withPriceCountry(final Collection<TValue> priceCountry) {
        return copy().withoutQueryParam("priceCountry")
                .addQueryParams(priceCountry.stream()
                        .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCountry query parameters
     * @param priceCountry values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addPriceCountry(final Collection<TValue> priceCountry) {
        return copy().addQueryParams(priceCountry.stream()
                .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param priceCustomerGroup value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withPriceCustomerGroup(final TValue priceCustomerGroup) {
        return copy().withQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param priceCustomerGroup value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addPriceCustomerGroup(final TValue priceCustomerGroup) {
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withPriceCustomerGroup(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addPriceCustomerGroup(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withPriceCustomerGroup(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addPriceCustomerGroup(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * set priceCustomerGroup with the specified values
     * @param priceCustomerGroup values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withPriceCustomerGroup(
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
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addPriceCustomerGroup(
            final Collection<TValue> priceCustomerGroup) {
        return copy().addQueryParams(priceCustomerGroup.stream()
                .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceChannel with the specified value
     * @param priceChannel value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withPriceChannel(final TValue priceChannel) {
        return copy().withQueryParam("priceChannel", priceChannel);
    }

    /**
     * add additional priceChannel query parameter
     * @param priceChannel value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addPriceChannel(final TValue priceChannel) {
        return copy().addQueryParam("priceChannel", priceChannel);
    }

    /**
     * set priceChannel with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withPriceChannel(final Supplier<String> supplier) {
        return copy().withQueryParam("priceChannel", supplier.get());
    }

    /**
     * add additional priceChannel query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addPriceChannel(final Supplier<String> supplier) {
        return copy().addQueryParam("priceChannel", supplier.get());
    }

    /**
     * set priceChannel with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withPriceChannel(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceChannel query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addPriceChannel(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * set priceChannel with the specified values
     * @param priceChannel values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withPriceChannel(final Collection<TValue> priceChannel) {
        return copy().withoutQueryParam("priceChannel")
                .addQueryParams(priceChannel.stream()
                        .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceChannel query parameters
     * @param priceChannel values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addPriceChannel(final Collection<TValue> priceChannel) {
        return copy().addQueryParams(priceChannel.stream()
                .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set localeProjection with the specified value
     * @param localeProjection value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withLocaleProjection(final TValue localeProjection) {
        return copy().withQueryParam("localeProjection", localeProjection);
    }

    /**
     * add additional localeProjection query parameter
     * @param localeProjection value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addLocaleProjection(final TValue localeProjection) {
        return copy().addQueryParam("localeProjection", localeProjection);
    }

    /**
     * set localeProjection with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withLocaleProjection(final Supplier<String> supplier) {
        return copy().withQueryParam("localeProjection", supplier.get());
    }

    /**
     * add additional localeProjection query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addLocaleProjection(final Supplier<String> supplier) {
        return copy().addQueryParam("localeProjection", supplier.get());
    }

    /**
     * set localeProjection with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withLocaleProjection(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * add additional localeProjection query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addLocaleProjection(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * set localeProjection with the specified values
     * @param localeProjection values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withLocaleProjection(final Collection<TValue> localeProjection) {
        return copy().withoutQueryParam("localeProjection")
                .addQueryParams(localeProjection.stream()
                        .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional localeProjection query parameters
     * @param localeProjection values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addLocaleProjection(final Collection<TValue> localeProjection) {
        return copy().addQueryParams(localeProjection.stream()
                .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set storeProjection with the specified value
     * @param storeProjection value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withStoreProjection(final TValue storeProjection) {
        return copy().withQueryParam("storeProjection", storeProjection);
    }

    /**
     * add additional storeProjection query parameter
     * @param storeProjection value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addStoreProjection(final TValue storeProjection) {
        return copy().addQueryParam("storeProjection", storeProjection);
    }

    /**
     * set storeProjection with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withStoreProjection(final Supplier<String> supplier) {
        return copy().withQueryParam("storeProjection", supplier.get());
    }

    /**
     * add additional storeProjection query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addStoreProjection(final Supplier<String> supplier) {
        return copy().addQueryParam("storeProjection", supplier.get());
    }

    /**
     * set storeProjection with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withStoreProjection(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("storeProjection", op.apply(new StringBuilder()));
    }

    /**
     * add additional storeProjection query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addStoreProjection(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("storeProjection", op.apply(new StringBuilder()));
    }

    /**
     * set storeProjection with the specified values
     * @param storeProjection values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withStoreProjection(final Collection<TValue> storeProjection) {
        return copy().withoutQueryParam("storeProjection")
                .addQueryParams(storeProjection.stream()
                        .map(s -> new ParamEntry<>("storeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional storeProjection query parameters
     * @param storeProjection values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addStoreProjection(final Collection<TValue> storeProjection) {
        return copy().addQueryParams(storeProjection.stream()
                .map(s -> new ParamEntry<>("storeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specified value
     * @param sort value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withSort(final TValue sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     * @param sort value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addSort(final TValue sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withSort(final Supplier<String> supplier) {
        return copy().withQueryParam("sort", supplier.get());
    }

    /**
     * add additional sort query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addSort(final Supplier<String> supplier) {
        return copy().addQueryParam("sort", supplier.get());
    }

    /**
     * set sort with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * add additional sort query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * set sort with the specified values
     * @param sort values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withSort(final Collection<TValue> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     * @param sort values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addSort(final Collection<TValue> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specified value
     * @param limit value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     * @param limit value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     * @param limit values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withLimit(final Collection<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     * @param limit values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addLimit(final Collection<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     * @param offset value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     * @param offset value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withOffset(final Supplier<Integer> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addOffset(final Supplier<Integer> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     * @param offset values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withOffset(final Collection<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     * @param offset values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addOffset(final Collection<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set withTotal with the specified value
     * @param withTotal value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withWithTotal(final TValue withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     * @param withTotal value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addWithTotal(final TValue withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set withTotal with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withWithTotal(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("withTotal", supplier.get());
    }

    /**
     * add additional withTotal query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addWithTotal(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("withTotal", supplier.get());
    }

    /**
     * set withTotal with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withWithTotal(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * add additional withTotal query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addWithTotal(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * set withTotal with the specified values
     * @param withTotal values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withWithTotal(final Collection<TValue> withTotal) {
        return copy().withoutQueryParam("withTotal")
                .addQueryParams(withTotal.stream()
                        .map(s -> new ParamEntry<>("withTotal", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional withTotal query parameters
     * @param withTotal values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addWithTotal(final Collection<TValue> withTotal) {
        return copy().addQueryParams(
            withTotal.stream().map(s -> new ParamEntry<>("withTotal", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set where with the specified value
     * @param where value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withWhere(final TValue where) {
        return copy().withQueryParam("where", where);
    }

    /**
     * add additional where query parameter
     * @param where value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addWhere(final TValue where) {
        return copy().addQueryParam("where", where);
    }

    /**
     * set where with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withWhere(final Supplier<String> supplier) {
        return copy().withQueryParam("where", supplier.get());
    }

    /**
     * add additional where query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addWhere(final Supplier<String> supplier) {
        return copy().addQueryParam("where", supplier.get());
    }

    /**
     * set where with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet withWhere(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("where", op.apply(new StringBuilder()));
    }

    /**
     * add additional where query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsGet
     */
    public ByProjectKeyProductProjectionsGet addWhere(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("where", op.apply(new StringBuilder()));
    }

    /**
     * set where with the specified values
     * @param where values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withWhere(final Collection<TValue> where) {
        return copy().withoutQueryParam("where")
                .addQueryParams(
                    where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional where query parameters
     * @param where values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addWhere(final Collection<TValue> where) {
        return copy().addQueryParams(
            where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set predicateVar with the specificied value
     * @param <TValue> value type
     * @param varName parameter name
     * @param predicateVar parameter value
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withPredicateVar(final String varName,
            final TValue predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * add additional predicateVar query parameter
     * @param <TValue> value type
     * @param varName parameter name
     * @param predicateVar parameter value
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addPredicateVar(final String varName, final TValue predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * set predicateVar with the specificied values
     * @param <TValue> value type
     * @param varName parameter name
     * @param predicateVar parameter values
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet withPredicateVar(final String varName,
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
     * @return ByProjectKeyProductProjectionsGet
     */
    public <TValue> ByProjectKeyProductProjectionsGet addPredicateVar(final String varName,
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

        ByProjectKeyProductProjectionsGet that = (ByProjectKeyProductProjectionsGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyProductProjectionsGet copy() {
        return new ByProjectKeyProductProjectionsGet(this);
    }
}
