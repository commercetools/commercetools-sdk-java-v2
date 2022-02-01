
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
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.api.models.product.ProductProjectionPagedSearchResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedSearchResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product.ProductProjectionPagedSearchResponse.class);
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
     * set fuzzy with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withFuzzy(final List<Boolean> fuzzy) {
        return copy().withoutQueryParam("fuzzy")
                .addQueryParams(
                    fuzzy.stream().map(s -> new ParamEntry<>("fuzzy", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional fuzzy query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addFuzzy(final List<Boolean> fuzzy) {
        return copy().addQueryParams(
            fuzzy.stream().map(s -> new ParamEntry<>("fuzzy", s.toString())).collect(Collectors.toList()));
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
     * set fuzzyLevel with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withFuzzyLevel(final List<Double> fuzzyLevel) {
        return copy().withoutQueryParam("fuzzyLevel")
                .addQueryParams(fuzzyLevel.stream()
                        .map(s -> new ParamEntry<>("fuzzyLevel", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional fuzzyLevel query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addFuzzyLevel(final List<Double> fuzzyLevel) {
        return copy().addQueryParams(
            fuzzyLevel.stream().map(s -> new ParamEntry<>("fuzzyLevel", s.toString())).collect(Collectors.toList()));
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
     * set markMatchingVariants with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withMarkMatchingVariants(final List<Boolean> markMatchingVariants) {
        return copy().withoutQueryParam("markMatchingVariants")
                .addQueryParams(markMatchingVariants.stream()
                        .map(s -> new ParamEntry<>("markMatchingVariants", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional markMatchingVariants query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addMarkMatchingVariants(final List<Boolean> markMatchingVariants) {
        return copy().addQueryParams(markMatchingVariants.stream()
                .map(s -> new ParamEntry<>("markMatchingVariants", s.toString()))
                .collect(Collectors.toList()));
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
     * set staged with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withStaged(final List<Boolean> staged) {
        return copy().withoutQueryParam("staged")
                .addQueryParams(
                    staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional staged query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addStaged(final List<Boolean> staged) {
        return copy().addQueryParams(
            staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
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
     * set filter with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withFilter(final List<String> filter) {
        return copy().withoutQueryParam("filter")
                .addQueryParams(
                    filter.stream().map(s -> new ParamEntry<>("filter", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional filter query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addFilter(final List<String> filter) {
        return copy().addQueryParams(
            filter.stream().map(s -> new ParamEntry<>("filter", s.toString())).collect(Collectors.toList()));
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
     * set filterFacets with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withFilterFacets(final List<String> filterFacets) {
        return copy().withoutQueryParam("filter.facets")
                .addQueryParams(filterFacets.stream()
                        .map(s -> new ParamEntry<>("filter.facets", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional filterFacets query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addFilterFacets(final List<String> filterFacets) {
        return copy().addQueryParams(filterFacets.stream()
                .map(s -> new ParamEntry<>("filter.facets", s.toString()))
                .collect(Collectors.toList()));
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
     * set filterQuery with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withFilterQuery(final List<String> filterQuery) {
        return copy().withoutQueryParam("filter.query")
                .addQueryParams(filterQuery.stream()
                        .map(s -> new ParamEntry<>("filter.query", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional filterQuery query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addFilterQuery(final List<String> filterQuery) {
        return copy().addQueryParams(
            filterQuery.stream().map(s -> new ParamEntry<>("filter.query", s.toString())).collect(Collectors.toList()));
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
     * set facet with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withFacet(final List<String> facet) {
        return copy().withoutQueryParam("facet")
                .addQueryParams(
                    facet.stream().map(s -> new ParamEntry<>("facet", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional facet query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addFacet(final List<String> facet) {
        return copy().addQueryParams(
            facet.stream().map(s -> new ParamEntry<>("facet", s.toString())).collect(Collectors.toList()));
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
     * set sort with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withSort(final List<String> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addSort(final List<String> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
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
     * set limit with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withLimit(final List<Integer> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addLimit(final List<Integer> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
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
     * set offset with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withOffset(final List<Integer> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addOffset(final List<Integer> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
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
     * set withTotal with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withWithTotal(final List<Boolean> withTotal) {
        return copy().withoutQueryParam("withTotal")
                .addQueryParams(withTotal.stream()
                        .map(s -> new ParamEntry<>("withTotal", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional withTotal query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addWithTotal(final List<Boolean> withTotal) {
        return copy().addQueryParams(
            withTotal.stream().map(s -> new ParamEntry<>("withTotal", s.toString())).collect(Collectors.toList()));
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
     * set priceCurrency with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withPriceCurrency(final List<String> priceCurrency) {
        return copy().withoutQueryParam("priceCurrency")
                .addQueryParams(priceCurrency.stream()
                        .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCurrency query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addPriceCurrency(final List<String> priceCurrency) {
        return copy().addQueryParams(priceCurrency.stream()
                .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                .collect(Collectors.toList()));
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
     * set priceCountry with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withPriceCountry(final List<String> priceCountry) {
        return copy().withoutQueryParam("priceCountry")
                .addQueryParams(priceCountry.stream()
                        .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCountry query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addPriceCountry(final List<String> priceCountry) {
        return copy().addQueryParams(priceCountry.stream()
                .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                .collect(Collectors.toList()));
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
     * set priceCustomerGroup with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withPriceCustomerGroup(final List<String> priceCustomerGroup) {
        return copy().withoutQueryParam("priceCustomerGroup")
                .addQueryParams(priceCustomerGroup.stream()
                        .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCustomerGroup query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addPriceCustomerGroup(final List<String> priceCustomerGroup) {
        return copy().addQueryParams(priceCustomerGroup.stream()
                .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                .collect(Collectors.toList()));
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
     * set priceChannel with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withPriceChannel(final List<String> priceChannel) {
        return copy().withoutQueryParam("priceChannel")
                .addQueryParams(priceChannel.stream()
                        .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceChannel query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addPriceChannel(final List<String> priceChannel) {
        return copy().addQueryParams(priceChannel.stream()
                .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                .collect(Collectors.toList()));
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
     * set localeProjection with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withLocaleProjection(final List<String> localeProjection) {
        return copy().withoutQueryParam("localeProjection")
                .addQueryParams(localeProjection.stream()
                        .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional localeProjection query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addLocaleProjection(final List<String> localeProjection) {
        return copy().addQueryParams(localeProjection.stream()
                .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                .collect(Collectors.toList()));
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
     * set storeProjection with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withStoreProjection(final List<String> storeProjection) {
        return copy().withoutQueryParam("storeProjection")
                .addQueryParams(storeProjection.stream()
                        .map(s -> new ParamEntry<>("storeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional storeProjection query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addStoreProjection(final List<String> storeProjection) {
        return copy().addQueryParams(storeProjection.stream()
                .map(s -> new ParamEntry<>("storeProjection", s.toString()))
                .collect(Collectors.toList()));
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
     * set expand with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
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

    /**
     * set text with the specificied values
     */
    public ByProjectKeyProductProjectionsSearchGet withText(final String locale, final List<String> text) {
        final String placeholderName = String.format("var.%s", locale);
        return copy().withoutQueryParam(placeholderName)
                .addQueryParams(
                    text.stream().map(s -> new ParamEntry<>(placeholderName, s)).collect(Collectors.toList()));
    }

    /**
     * add additional text query parameters
     */
    public ByProjectKeyProductProjectionsSearchGet addText(final String locale, final List<String> text) {
        final String placeholderName = String.format("var.%s", locale);
        return copy().addQueryParams(
            text.stream().map(s -> new ParamEntry<>(placeholderName, s)).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductProjectionsSearchGet that = (ByProjectKeyProductProjectionsSearchGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyProductProjectionsSearchGet copy() {
        return new ByProjectKeyProductProjectionsSearchGet(this);
    }
}
