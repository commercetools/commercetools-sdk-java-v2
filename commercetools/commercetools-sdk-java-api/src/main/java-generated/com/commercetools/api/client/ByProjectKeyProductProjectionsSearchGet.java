
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Search Product Projection</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductProjectionsSearchGet extends
        ApiMethod<ByProjectKeyProductProjectionsSearchGet, com.commercetools.api.models.product.ProductProjectionPagedSearchResponse>
        implements com.commercetools.api.client.SortableTrait<ByProjectKeyProductProjectionsSearchGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyProductProjectionsSearchGet>,
        com.commercetools.api.client.PriceselectingTrait<ByProjectKeyProductProjectionsSearchGet>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductProjectionsSearchGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductProjectionsSearchGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductProjectionsSearchGet> {

    private String projectKey;

    public ByProjectKeyProductProjectionsSearchGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductProjectionsSearchGet(ByProjectKeyProductProjectionsSearchGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-projections/search", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedSearchResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.product.ProductProjectionPagedSearchResponse.class),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedSearchResponse>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(),
            com.commercetools.api.models.product.ProductProjectionPagedSearchResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getFuzzy() {
        return this.getQueryParam("fuzzy");
    }

    public List<String> getFuzzyLevel() {
        return this.getQueryParam("fuzzyLevel");
    }

    public List<String> getMarkMatchingVariants() {
        return this.getQueryParam("markMatchingVariants");
    }

    public List<String> getStaged() {
        return this.getQueryParam("staged");
    }

    public List<String> getFilter() {
        return this.getQueryParam("filter");
    }

    public List<String> getFilterFacets() {
        return this.getQueryParam("filter.facets");
    }

    public List<String> getFilterQuery() {
        return this.getQueryParam("filter.query");
    }

    public List<String> getFacet() {
        return this.getQueryParam("facet");
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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set fuzzy with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withFuzzy(final boolean fuzzy) {
        return copy().withQueryParam("fuzzy", fuzzy);
    }

    /**
     * add additional fuzzy query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFuzzy(final boolean fuzzy) {
        return copy().addQueryParam("fuzzy", fuzzy);
    }

    /**
     * set fuzzyLevel with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withFuzzyLevel(final double fuzzyLevel) {
        return copy().withQueryParam("fuzzyLevel", fuzzyLevel);
    }

    /**
     * add additional fuzzyLevel query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFuzzyLevel(final double fuzzyLevel) {
        return copy().addQueryParam("fuzzyLevel", fuzzyLevel);
    }

    /**
     * set markMatchingVariants with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withMarkMatchingVariants(final boolean markMatchingVariants) {
        return copy().withQueryParam("markMatchingVariants", markMatchingVariants);
    }

    /**
     * add additional markMatchingVariants query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addMarkMatchingVariants(final boolean markMatchingVariants) {
        return copy().addQueryParam("markMatchingVariants", markMatchingVariants);
    }

    /**
     * set staged with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withStaged(final boolean staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addStaged(final boolean staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set filter with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withFilter(final String filter) {
        return copy().withQueryParam("filter", filter);
    }

    /**
     * add additional filter query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFilter(final String filter) {
        return copy().addQueryParam("filter", filter);
    }

    /**
     * set filterFacets with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withFilterFacets(final String filterFacets) {
        return copy().withQueryParam("filter.facets", filterFacets);
    }

    /**
     * add additional filterFacets query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFilterFacets(final String filterFacets) {
        return copy().addQueryParam("filter.facets", filterFacets);
    }

    /**
     * set filterQuery with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withFilterQuery(final String filterQuery) {
        return copy().withQueryParam("filter.query", filterQuery);
    }

    /**
     * add additional filterQuery query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFilterQuery(final String filterQuery) {
        return copy().addQueryParam("filter.query", filterQuery);
    }

    /**
     * set facet with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withFacet(final String facet) {
        return copy().withQueryParam("facet", facet);
    }

    /**
     * add additional facet query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFacet(final String facet) {
        return copy().addQueryParam("facet", facet);
    }

    /**
     * set sort with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set limit with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set offset with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set withTotal with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withWithTotal(final boolean withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addWithTotal(final boolean withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set priceCurrency with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withPriceCurrency(final String priceCurrency) {
        return copy().withQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * add additional priceCurrency query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addPriceCurrency(final String priceCurrency) {
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * set priceCountry with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withPriceCountry(final String priceCountry) {
        return copy().withQueryParam("priceCountry", priceCountry);
    }

    /**
     * add additional priceCountry query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addPriceCountry(final String priceCountry) {
        return copy().addQueryParam("priceCountry", priceCountry);
    }

    /**
     * set priceCustomerGroup with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withPriceCustomerGroup(final String priceCustomerGroup) {
        return copy().withQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * add additional priceCustomerGroup query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addPriceCustomerGroup(final String priceCustomerGroup) {
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * set priceChannel with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withPriceChannel(final String priceChannel) {
        return copy().withQueryParam("priceChannel", priceChannel);
    }

    /**
     * add additional priceChannel query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addPriceChannel(final String priceChannel) {
        return copy().addQueryParam("priceChannel", priceChannel);
    }

    /**
     * set localeProjection with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withLocaleProjection(final String localeProjection) {
        return copy().withQueryParam("localeProjection", localeProjection);
    }

    /**
     * add additional localeProjection query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addLocaleProjection(final String localeProjection) {
        return copy().addQueryParam("localeProjection", localeProjection);
    }

    /**
     * set storeProjection with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withStoreProjection(final String storeProjection) {
        return copy().withQueryParam("storeProjection", storeProjection);
    }

    /**
     * add additional storeProjection query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addStoreProjection(final String storeProjection) {
        return copy().addQueryParam("storeProjection", storeProjection);
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set text with the specificied value
     */
    public ByProjectKeyProductProjectionsSearchGet withText(final String locale, final String text) {
        return copy().withQueryParam(String.format("text.%s", locale), text);
    }

    /**
     * add additional text query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addText(final String locale, final String text) {
        return copy().addQueryParam(String.format("text.%s", locale), text);
    }

    @Override
    protected ByProjectKeyProductProjectionsSearchGet copy() {
        return new ByProjectKeyProductProjectionsSearchGet(this);
    }
}
