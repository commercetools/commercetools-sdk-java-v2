
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>You can use the query endpoint to get the full representations of products.
*  REMARK: We suggest to use the performance optimized search endpoint which has a bunch functionalities,
*  the query API lacks like sorting on custom attributes, etc.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductsGet extends
        ApiMethod<ByProjectKeyProductsGet, com.commercetools.api.models.product.ProductPagedQueryResponse> implements
        com.commercetools.api.models.PagedQueryResourceRequest<ByProjectKeyProductsGet, com.commercetools.api.models.product.ProductPagedQueryResponse>,
        com.commercetools.api.client.PriceselectingTrait<ByProjectKeyProductsGet>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductsGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyProductsGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyProductsGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyProductsGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductsGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductsGet> {

    private String projectKey;

    public ByProjectKeyProductsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductsGet(ByProjectKeyProductsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.ProductPagedQueryResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.product.ProductPagedQueryResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductPagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product.ProductPagedQueryResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
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
     * set priceCurrency with the specificied value
     */
    public ByProjectKeyProductsGet withPriceCurrency(final String priceCurrency) {
        return copy().withQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * add additional priceCurrency query parameter
     */
    public ByProjectKeyProductsGet addPriceCurrency(final String priceCurrency) {
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * set priceCurrency with the specificied values
     */
    public ByProjectKeyProductsGet withPriceCurrency(final List<String> priceCurrency) {
        return copy().withoutQueryParam("priceCurrency")
                .addQueryParams(priceCurrency.stream()
                        .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCurrency query parameters
     */
    public ByProjectKeyProductsGet addPriceCurrency(final List<String> priceCurrency) {
        return copy().addQueryParams(priceCurrency.stream()
                .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCountry with the specificied value
     */
    public ByProjectKeyProductsGet withPriceCountry(final String priceCountry) {
        return copy().withQueryParam("priceCountry", priceCountry);
    }

    /**
     * add additional priceCountry query parameter
     */
    public ByProjectKeyProductsGet addPriceCountry(final String priceCountry) {
        return copy().addQueryParam("priceCountry", priceCountry);
    }

    /**
     * set priceCountry with the specificied values
     */
    public ByProjectKeyProductsGet withPriceCountry(final List<String> priceCountry) {
        return copy().withoutQueryParam("priceCountry")
                .addQueryParams(priceCountry.stream()
                        .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCountry query parameters
     */
    public ByProjectKeyProductsGet addPriceCountry(final List<String> priceCountry) {
        return copy().addQueryParams(priceCountry.stream()
                .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCustomerGroup with the specificied value
     */
    public ByProjectKeyProductsGet withPriceCustomerGroup(final String priceCustomerGroup) {
        return copy().withQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * add additional priceCustomerGroup query parameter
     */
    public ByProjectKeyProductsGet addPriceCustomerGroup(final String priceCustomerGroup) {
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * set priceCustomerGroup with the specificied values
     */
    public ByProjectKeyProductsGet withPriceCustomerGroup(final List<String> priceCustomerGroup) {
        return copy().withoutQueryParam("priceCustomerGroup")
                .addQueryParams(priceCustomerGroup.stream()
                        .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCustomerGroup query parameters
     */
    public ByProjectKeyProductsGet addPriceCustomerGroup(final List<String> priceCustomerGroup) {
        return copy().addQueryParams(priceCustomerGroup.stream()
                .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceChannel with the specificied value
     */
    public ByProjectKeyProductsGet withPriceChannel(final String priceChannel) {
        return copy().withQueryParam("priceChannel", priceChannel);
    }

    /**
     * add additional priceChannel query parameter
     */
    public ByProjectKeyProductsGet addPriceChannel(final String priceChannel) {
        return copy().addQueryParam("priceChannel", priceChannel);
    }

    /**
     * set priceChannel with the specificied values
     */
    public ByProjectKeyProductsGet withPriceChannel(final List<String> priceChannel) {
        return copy().withoutQueryParam("priceChannel")
                .addQueryParams(priceChannel.stream()
                        .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceChannel query parameters
     */
    public ByProjectKeyProductsGet addPriceChannel(final List<String> priceChannel) {
        return copy().addQueryParams(priceChannel.stream()
                .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set localeProjection with the specificied value
     */
    public ByProjectKeyProductsGet withLocaleProjection(final String localeProjection) {
        return copy().withQueryParam("localeProjection", localeProjection);
    }

    /**
     * add additional localeProjection query parameter
     */
    public ByProjectKeyProductsGet addLocaleProjection(final String localeProjection) {
        return copy().addQueryParam("localeProjection", localeProjection);
    }

    /**
     * set localeProjection with the specificied values
     */
    public ByProjectKeyProductsGet withLocaleProjection(final List<String> localeProjection) {
        return copy().withoutQueryParam("localeProjection")
                .addQueryParams(localeProjection.stream()
                        .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional localeProjection query parameters
     */
    public ByProjectKeyProductsGet addLocaleProjection(final List<String> localeProjection) {
        return copy().addQueryParams(localeProjection.stream()
                .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set storeProjection with the specificied value
     */
    public ByProjectKeyProductsGet withStoreProjection(final String storeProjection) {
        return copy().withQueryParam("storeProjection", storeProjection);
    }

    /**
     * add additional storeProjection query parameter
     */
    public ByProjectKeyProductsGet addStoreProjection(final String storeProjection) {
        return copy().addQueryParam("storeProjection", storeProjection);
    }

    /**
     * set storeProjection with the specificied values
     */
    public ByProjectKeyProductsGet withStoreProjection(final List<String> storeProjection) {
        return copy().withoutQueryParam("storeProjection")
                .addQueryParams(storeProjection.stream()
                        .map(s -> new ParamEntry<>("storeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional storeProjection query parameters
     */
    public ByProjectKeyProductsGet addStoreProjection(final List<String> storeProjection) {
        return copy().addQueryParams(storeProjection.stream()
                .map(s -> new ParamEntry<>("storeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyProductsGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductsGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyProductsGet withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyProductsGet addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specificied value
     */
    public ByProjectKeyProductsGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyProductsGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specificied values
     */
    public ByProjectKeyProductsGet withSort(final List<String> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     */
    public ByProjectKeyProductsGet addSort(final List<String> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specificied value
     */
    public ByProjectKeyProductsGet withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyProductsGet addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specificied values
     */
    public ByProjectKeyProductsGet withLimit(final List<Integer> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public ByProjectKeyProductsGet addLimit(final List<Integer> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specificied value
     */
    public ByProjectKeyProductsGet withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyProductsGet addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specificied values
     */
    public ByProjectKeyProductsGet withOffset(final List<Integer> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public ByProjectKeyProductsGet addOffset(final List<Integer> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set withTotal with the specificied value
     */
    public ByProjectKeyProductsGet withWithTotal(final boolean withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     */
    public ByProjectKeyProductsGet addWithTotal(final boolean withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set withTotal with the specificied values
     */
    public ByProjectKeyProductsGet withWithTotal(final List<Boolean> withTotal) {
        return copy().withoutQueryParam("withTotal")
                .addQueryParams(withTotal.stream()
                        .map(s -> new ParamEntry<>("withTotal", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional withTotal query parameters
     */
    public ByProjectKeyProductsGet addWithTotal(final List<Boolean> withTotal) {
        return copy().addQueryParams(
            withTotal.stream().map(s -> new ParamEntry<>("withTotal", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set where with the specificied value
     */
    public ByProjectKeyProductsGet withWhere(final String where) {
        return copy().withQueryParam("where", where);
    }

    /**
     * add additional where query parameter
     */
    public ByProjectKeyProductsGet addWhere(final String where) {
        return copy().addQueryParam("where", where);
    }

    /**
     * set where with the specificied values
     */
    public ByProjectKeyProductsGet withWhere(final List<String> where) {
        return copy().withoutQueryParam("where")
                .addQueryParams(
                    where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional where query parameters
     */
    public ByProjectKeyProductsGet addWhere(final List<String> where) {
        return copy().addQueryParams(
            where.stream().map(s -> new ParamEntry<>("where", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set predicateVar with the specificied value
     */
    public ByProjectKeyProductsGet withPredicateVar(final String varName, final String predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * add additional predicateVar query parameter
     */
    public ByProjectKeyProductsGet addPredicateVar(final String varName, final String predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * set predicateVar with the specificied values
     */
    public ByProjectKeyProductsGet withPredicateVar(final String varName, final List<String> predicateVar) {
        final String placeholderName = String.format("var.%s", varName);
        return copy().withoutQueryParam(placeholderName)
                .addQueryParams(
                    predicateVar.stream().map(s -> new ParamEntry<>(placeholderName, s)).collect(Collectors.toList()));
    }

    /**
     * add additional predicateVar query parameters
     */
    public ByProjectKeyProductsGet addPredicateVar(final String varName, final List<String> predicateVar) {
        final String placeholderName = String.format("var.%s", varName);
        return copy().addQueryParams(
            predicateVar.stream().map(s -> new ParamEntry<>(placeholderName, s)).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductsGet that = (ByProjectKeyProductsGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyProductsGet copy() {
        return new ByProjectKeyProductsGet(this);
    }
}
