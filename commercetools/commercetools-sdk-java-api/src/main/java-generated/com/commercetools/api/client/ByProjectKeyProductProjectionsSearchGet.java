
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
    protected ApiHttpRequest buildHttpRequest() {
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
     * set fuzzy with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withFuzzy(final TValue fuzzy) {
        return copy().withQueryParam("fuzzy", fuzzy);
    }

    /**
     * add additional fuzzy query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addFuzzy(final TValue fuzzy) {
        return copy().addQueryParam("fuzzy", fuzzy);
    }

    /**
     * set fuzzy with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withFuzzy(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("fuzzy", supplier.get());
    }

    /**
     * add additional fuzzy query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFuzzy(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("fuzzy", supplier.get());
    }

    /**
     * set fuzzy with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withFuzzy(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("fuzzy", op.apply(new StringBuilder()));
    }

    /**
     * add additional fuzzy query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFuzzy(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("fuzzy", op.apply(new StringBuilder()));
    }

    /**
     * set fuzzy with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withFuzzy(final List<TValue> fuzzy) {
        return copy().withoutQueryParam("fuzzy")
                .addQueryParams(
                    fuzzy.stream().map(s -> new ParamEntry<>("fuzzy", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional fuzzy query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addFuzzy(final List<TValue> fuzzy) {
        return copy().addQueryParams(
            fuzzy.stream().map(s -> new ParamEntry<>("fuzzy", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set fuzzyLevel with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withFuzzyLevel(final TValue fuzzyLevel) {
        return copy().withQueryParam("fuzzyLevel", fuzzyLevel);
    }

    /**
     * add additional fuzzyLevel query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addFuzzyLevel(final TValue fuzzyLevel) {
        return copy().addQueryParam("fuzzyLevel", fuzzyLevel);
    }

    /**
     * set fuzzyLevel with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withFuzzyLevel(final Supplier<Double> supplier) {
        return copy().withQueryParam("fuzzyLevel", supplier.get());
    }

    /**
     * add additional fuzzyLevel query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFuzzyLevel(final Supplier<Double> supplier) {
        return copy().addQueryParam("fuzzyLevel", supplier.get());
    }

    /**
     * set fuzzyLevel with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withFuzzyLevel(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("fuzzyLevel", op.apply(new StringBuilder()));
    }

    /**
     * add additional fuzzyLevel query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFuzzyLevel(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("fuzzyLevel", op.apply(new StringBuilder()));
    }

    /**
     * set fuzzyLevel with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withFuzzyLevel(final List<TValue> fuzzyLevel) {
        return copy().withoutQueryParam("fuzzyLevel")
                .addQueryParams(fuzzyLevel.stream()
                        .map(s -> new ParamEntry<>("fuzzyLevel", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional fuzzyLevel query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addFuzzyLevel(final List<TValue> fuzzyLevel) {
        return copy().addQueryParams(
            fuzzyLevel.stream().map(s -> new ParamEntry<>("fuzzyLevel", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set markMatchingVariants with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withMarkMatchingVariants(
            final TValue markMatchingVariants) {
        return copy().withQueryParam("markMatchingVariants", markMatchingVariants);
    }

    /**
     * add additional markMatchingVariants query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addMarkMatchingVariants(final TValue markMatchingVariants) {
        return copy().addQueryParam("markMatchingVariants", markMatchingVariants);
    }

    /**
     * set markMatchingVariants with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withMarkMatchingVariants(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("markMatchingVariants", supplier.get());
    }

    /**
     * add additional markMatchingVariants query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addMarkMatchingVariants(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("markMatchingVariants", supplier.get());
    }

    /**
     * set markMatchingVariants with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withMarkMatchingVariants(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("markMatchingVariants", op.apply(new StringBuilder()));
    }

    /**
     * add additional markMatchingVariants query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addMarkMatchingVariants(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("markMatchingVariants", op.apply(new StringBuilder()));
    }

    /**
     * set markMatchingVariants with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withMarkMatchingVariants(
            final List<TValue> markMatchingVariants) {
        return copy().withoutQueryParam("markMatchingVariants")
                .addQueryParams(markMatchingVariants.stream()
                        .map(s -> new ParamEntry<>("markMatchingVariants", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional markMatchingVariants query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addMarkMatchingVariants(
            final List<TValue> markMatchingVariants) {
        return copy().addQueryParams(markMatchingVariants.stream()
                .map(s -> new ParamEntry<>("markMatchingVariants", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set staged with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withStaged(final TValue staged) {
        return copy().withQueryParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addStaged(final TValue staged) {
        return copy().addQueryParam("staged", staged);
    }

    /**
     * set staged with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withStaged(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("staged", supplier.get());
    }

    /**
     * add additional staged query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addStaged(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("staged", supplier.get());
    }

    /**
     * set staged with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withStaged(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * add additional staged query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addStaged(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * set staged with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withStaged(final List<TValue> staged) {
        return copy().withoutQueryParam("staged")
                .addQueryParams(
                    staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional staged query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addStaged(final List<TValue> staged) {
        return copy().addQueryParams(
            staged.stream().map(s -> new ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set filter with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withFilter(final TValue filter) {
        return copy().withQueryParam("filter", filter);
    }

    /**
     * add additional filter query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addFilter(final TValue filter) {
        return copy().addQueryParam("filter", filter);
    }

    /**
     * set filter with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withFilter(final Supplier<String> supplier) {
        return copy().withQueryParam("filter", supplier.get());
    }

    /**
     * add additional filter query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFilter(final Supplier<String> supplier) {
        return copy().addQueryParam("filter", supplier.get());
    }

    /**
     * set filter with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withFilter(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("filter", op.apply(new StringBuilder()));
    }

    /**
     * add additional filter query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFilter(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("filter", op.apply(new StringBuilder()));
    }

    /**
     * set filter with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withFilter(final List<TValue> filter) {
        return copy().withoutQueryParam("filter")
                .addQueryParams(
                    filter.stream().map(s -> new ParamEntry<>("filter", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional filter query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addFilter(final List<TValue> filter) {
        return copy().addQueryParams(
            filter.stream().map(s -> new ParamEntry<>("filter", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set filterFacets with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withFilterFacets(final TValue filterFacets) {
        return copy().withQueryParam("filter.facets", filterFacets);
    }

    /**
     * add additional filterFacets query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addFilterFacets(final TValue filterFacets) {
        return copy().addQueryParam("filter.facets", filterFacets);
    }

    /**
     * set filterFacets with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withFilterFacets(final Supplier<String> supplier) {
        return copy().withQueryParam("filter.facets", supplier.get());
    }

    /**
     * add additional filterFacets query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFilterFacets(final Supplier<String> supplier) {
        return copy().addQueryParam("filter.facets", supplier.get());
    }

    /**
     * set filterFacets with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withFilterFacets(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("filter.facets", op.apply(new StringBuilder()));
    }

    /**
     * add additional filterFacets query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFilterFacets(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("filter.facets", op.apply(new StringBuilder()));
    }

    /**
     * set filterFacets with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withFilterFacets(final List<TValue> filterFacets) {
        return copy().withoutQueryParam("filter.facets")
                .addQueryParams(filterFacets.stream()
                        .map(s -> new ParamEntry<>("filter.facets", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional filterFacets query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addFilterFacets(final List<TValue> filterFacets) {
        return copy().addQueryParams(filterFacets.stream()
                .map(s -> new ParamEntry<>("filter.facets", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set filterQuery with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withFilterQuery(final TValue filterQuery) {
        return copy().withQueryParam("filter.query", filterQuery);
    }

    /**
     * add additional filterQuery query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addFilterQuery(final TValue filterQuery) {
        return copy().addQueryParam("filter.query", filterQuery);
    }

    /**
     * set filterQuery with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withFilterQuery(final Supplier<String> supplier) {
        return copy().withQueryParam("filter.query", supplier.get());
    }

    /**
     * add additional filterQuery query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFilterQuery(final Supplier<String> supplier) {
        return copy().addQueryParam("filter.query", supplier.get());
    }

    /**
     * set filterQuery with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withFilterQuery(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("filter.query", op.apply(new StringBuilder()));
    }

    /**
     * add additional filterQuery query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFilterQuery(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("filter.query", op.apply(new StringBuilder()));
    }

    /**
     * set filterQuery with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withFilterQuery(final List<TValue> filterQuery) {
        return copy().withoutQueryParam("filter.query")
                .addQueryParams(filterQuery.stream()
                        .map(s -> new ParamEntry<>("filter.query", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional filterQuery query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addFilterQuery(final List<TValue> filterQuery) {
        return copy().addQueryParams(
            filterQuery.stream().map(s -> new ParamEntry<>("filter.query", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set facet with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withFacet(final TValue facet) {
        return copy().withQueryParam("facet", facet);
    }

    /**
     * add additional facet query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addFacet(final TValue facet) {
        return copy().addQueryParam("facet", facet);
    }

    /**
     * set facet with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withFacet(final Supplier<String> supplier) {
        return copy().withQueryParam("facet", supplier.get());
    }

    /**
     * add additional facet query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFacet(final Supplier<String> supplier) {
        return copy().addQueryParam("facet", supplier.get());
    }

    /**
     * set facet with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withFacet(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("facet", op.apply(new StringBuilder()));
    }

    /**
     * add additional facet query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addFacet(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("facet", op.apply(new StringBuilder()));
    }

    /**
     * set facet with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withFacet(final List<TValue> facet) {
        return copy().withoutQueryParam("facet")
                .addQueryParams(
                    facet.stream().map(s -> new ParamEntry<>("facet", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional facet query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addFacet(final List<TValue> facet) {
        return copy().addQueryParams(
            facet.stream().map(s -> new ParamEntry<>("facet", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withSort(final TValue sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addSort(final TValue sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withSort(final Supplier<String> supplier) {
        return copy().withQueryParam("sort", supplier.get());
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addSort(final Supplier<String> supplier) {
        return copy().addQueryParam("sort", supplier.get());
    }

    /**
     * set sort with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addSort(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * set sort with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withSort(final List<TValue> sort) {
        return copy().withoutQueryParam("sort")
                .addQueryParams(
                    sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addSort(final List<TValue> sort) {
        return copy().addQueryParams(
            sort.stream().map(s -> new ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withLimit(final TValue limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addLimit(final TValue limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withLimit(final Supplier<Integer> supplier) {
        return copy().withQueryParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addLimit(final Supplier<Integer> supplier) {
        return copy().addQueryParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addLimit(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withLimit(final List<TValue> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addLimit(final List<TValue> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withOffset(final TValue offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addOffset(final TValue offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withOffset(final Supplier<Integer> supplier) {
        return copy().withQueryParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addOffset(final Supplier<Integer> supplier) {
        return copy().addQueryParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addOffset(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withOffset(final List<TValue> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addOffset(final List<TValue> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set withTotal with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withWithTotal(final TValue withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addWithTotal(final TValue withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set withTotal with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withWithTotal(final Supplier<Boolean> supplier) {
        return copy().withQueryParam("withTotal", supplier.get());
    }

    /**
     * add additional withTotal query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addWithTotal(final Supplier<Boolean> supplier) {
        return copy().addQueryParam("withTotal", supplier.get());
    }

    /**
     * set withTotal with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withWithTotal(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * add additional withTotal query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addWithTotal(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * set withTotal with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withWithTotal(final List<TValue> withTotal) {
        return copy().withoutQueryParam("withTotal")
                .addQueryParams(withTotal.stream()
                        .map(s -> new ParamEntry<>("withTotal", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional withTotal query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addWithTotal(final List<TValue> withTotal) {
        return copy().addQueryParams(
            withTotal.stream().map(s -> new ParamEntry<>("withTotal", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set priceCurrency with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withPriceCurrency(final TValue priceCurrency) {
        return copy().withQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * add additional priceCurrency query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addPriceCurrency(final TValue priceCurrency) {
        return copy().addQueryParam("priceCurrency", priceCurrency);
    }

    /**
     * set priceCurrency with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withPriceCurrency(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCurrency", supplier.get());
    }

    /**
     * add additional priceCurrency query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addPriceCurrency(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCurrency", supplier.get());
    }

    /**
     * set priceCurrency with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withPriceCurrency(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCurrency query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addPriceCurrency(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * set priceCurrency with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withPriceCurrency(final List<TValue> priceCurrency) {
        return copy().withoutQueryParam("priceCurrency")
                .addQueryParams(priceCurrency.stream()
                        .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCurrency query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addPriceCurrency(final List<TValue> priceCurrency) {
        return copy().addQueryParams(priceCurrency.stream()
                .map(s -> new ParamEntry<>("priceCurrency", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCountry with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withPriceCountry(final TValue priceCountry) {
        return copy().withQueryParam("priceCountry", priceCountry);
    }

    /**
     * add additional priceCountry query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addPriceCountry(final TValue priceCountry) {
        return copy().addQueryParam("priceCountry", priceCountry);
    }

    /**
     * set priceCountry with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withPriceCountry(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCountry", supplier.get());
    }

    /**
     * add additional priceCountry query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addPriceCountry(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCountry", supplier.get());
    }

    /**
     * set priceCountry with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withPriceCountry(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCountry query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addPriceCountry(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * set priceCountry with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withPriceCountry(final List<TValue> priceCountry) {
        return copy().withoutQueryParam("priceCountry")
                .addQueryParams(priceCountry.stream()
                        .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCountry query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addPriceCountry(final List<TValue> priceCountry) {
        return copy().addQueryParams(priceCountry.stream()
                .map(s -> new ParamEntry<>("priceCountry", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCustomerGroup with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withPriceCustomerGroup(final TValue priceCustomerGroup) {
        return copy().withQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * add additional priceCustomerGroup query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addPriceCustomerGroup(final TValue priceCustomerGroup) {
        return copy().addQueryParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * set priceCustomerGroup with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withPriceCustomerGroup(final Supplier<String> supplier) {
        return copy().withQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * add additional priceCustomerGroup query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addPriceCustomerGroup(final Supplier<String> supplier) {
        return copy().addQueryParam("priceCustomerGroup", supplier.get());
    }

    /**
     * set priceCustomerGroup with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withPriceCustomerGroup(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCustomerGroup query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addPriceCustomerGroup(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * set priceCustomerGroup with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withPriceCustomerGroup(
            final List<TValue> priceCustomerGroup) {
        return copy().withoutQueryParam("priceCustomerGroup")
                .addQueryParams(priceCustomerGroup.stream()
                        .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceCustomerGroup query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addPriceCustomerGroup(
            final List<TValue> priceCustomerGroup) {
        return copy().addQueryParams(priceCustomerGroup.stream()
                .map(s -> new ParamEntry<>("priceCustomerGroup", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceChannel with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withPriceChannel(final TValue priceChannel) {
        return copy().withQueryParam("priceChannel", priceChannel);
    }

    /**
     * add additional priceChannel query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addPriceChannel(final TValue priceChannel) {
        return copy().addQueryParam("priceChannel", priceChannel);
    }

    /**
     * set priceChannel with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withPriceChannel(final Supplier<String> supplier) {
        return copy().withQueryParam("priceChannel", supplier.get());
    }

    /**
     * add additional priceChannel query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addPriceChannel(final Supplier<String> supplier) {
        return copy().addQueryParam("priceChannel", supplier.get());
    }

    /**
     * set priceChannel with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withPriceChannel(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceChannel query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addPriceChannel(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * set priceChannel with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withPriceChannel(final List<TValue> priceChannel) {
        return copy().withoutQueryParam("priceChannel")
                .addQueryParams(priceChannel.stream()
                        .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional priceChannel query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addPriceChannel(final List<TValue> priceChannel) {
        return copy().addQueryParams(priceChannel.stream()
                .map(s -> new ParamEntry<>("priceChannel", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set localeProjection with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withLocaleProjection(final TValue localeProjection) {
        return copy().withQueryParam("localeProjection", localeProjection);
    }

    /**
     * add additional localeProjection query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addLocaleProjection(final TValue localeProjection) {
        return copy().addQueryParam("localeProjection", localeProjection);
    }

    /**
     * set localeProjection with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withLocaleProjection(final Supplier<String> supplier) {
        return copy().withQueryParam("localeProjection", supplier.get());
    }

    /**
     * add additional localeProjection query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addLocaleProjection(final Supplier<String> supplier) {
        return copy().addQueryParam("localeProjection", supplier.get());
    }

    /**
     * set localeProjection with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withLocaleProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * add additional localeProjection query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addLocaleProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * set localeProjection with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withLocaleProjection(final List<TValue> localeProjection) {
        return copy().withoutQueryParam("localeProjection")
                .addQueryParams(localeProjection.stream()
                        .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional localeProjection query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addLocaleProjection(final List<TValue> localeProjection) {
        return copy().addQueryParams(localeProjection.stream()
                .map(s -> new ParamEntry<>("localeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set storeProjection with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withStoreProjection(final TValue storeProjection) {
        return copy().withQueryParam("storeProjection", storeProjection);
    }

    /**
     * add additional storeProjection query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addStoreProjection(final TValue storeProjection) {
        return copy().addQueryParam("storeProjection", storeProjection);
    }

    /**
     * set storeProjection with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withStoreProjection(final Supplier<String> supplier) {
        return copy().withQueryParam("storeProjection", supplier.get());
    }

    /**
     * add additional storeProjection query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addStoreProjection(final Supplier<String> supplier) {
        return copy().addQueryParam("storeProjection", supplier.get());
    }

    /**
     * set storeProjection with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withStoreProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("storeProjection", op.apply(new StringBuilder()));
    }

    /**
     * add additional storeProjection query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addStoreProjection(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("storeProjection", op.apply(new StringBuilder()));
    }

    /**
     * set storeProjection with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withStoreProjection(final List<TValue> storeProjection) {
        return copy().withoutQueryParam("storeProjection")
                .addQueryParams(storeProjection.stream()
                        .map(s -> new ParamEntry<>("storeProjection", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional storeProjection query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addStoreProjection(final List<TValue> storeProjection) {
        return copy().addQueryParams(storeProjection.stream()
                .map(s -> new ParamEntry<>("storeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyProductProjectionsSearchGet withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductProjectionsSearchGet addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set text with the specificied value
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withText(final String locale, final TValue text) {
        return copy().withQueryParam(String.format("text.%s", locale), text);
    }

    /**
     * add additional text query parameter
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addText(final String locale, final TValue text) {
        return copy().addQueryParam(String.format("text.%s", locale), text);
    }

    /**
     * set text with the specificied values
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet withText(final String locale, final List<TValue> text) {
        final String placeholderName = String.format("var.%s", locale);
        return copy().withoutQueryParam(placeholderName)
                .addQueryParams(text.stream()
                        .map(s -> new ParamEntry<>(placeholderName, s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional text query parameters
     */
    public <TValue> ByProjectKeyProductProjectionsSearchGet addText(final String locale, final List<TValue> text) {
        final String placeholderName = String.format("var.%s", locale);
        return copy().addQueryParams(
            text.stream().map(s -> new ParamEntry<>(placeholderName, s.toString())).collect(Collectors.toList()));
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
