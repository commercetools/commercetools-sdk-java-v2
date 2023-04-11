
package com.commercetools.api.client;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.ApiMethod;

public interface ByProjectKeyProductProjectionsSearchPostMixin {

    /**
     * add an additional form parameter
     * @param key form parameter name
     * @param value form parameter value
     * @param <V> value type
     * @return T
     */
    public <V> ByProjectKeyProductProjectionsSearchPost addFormParam(final String key, final V value);

    /**
     * set the form parameter with the specified value
     * @param key form parameter name
     * @param value form parameter value
     * @param <V> value type
     * @return T
     */
    public <V> ByProjectKeyProductProjectionsSearchPost withFormParam(final String key, final V value);

    /**
     * removes the specified form parameter
     * @param key form parameter name
     * @return T
     */
    public ByProjectKeyProductProjectionsSearchPost withoutFormParam(final String key);

    /**
     * set the form parameters
     * @param formParams list of form parameters
     * @return T
     */
    public ByProjectKeyProductProjectionsSearchPost withFormParams(
            final List<ApiMethod.ParamEntry<String, String>> formParams);

    public ByProjectKeyProductProjectionsSearchPost addFormParams(
            final List<ApiMethod.ParamEntry<String, String>> formParams);

    /**
     * set fuzzy with the specified value
     * @param fuzzy value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withFuzzy(final TValue fuzzy) {
        return withFormParam("fuzzy", fuzzy);
    }

    /**
     * add additional fuzzy query parameter
     * @param fuzzy value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addFuzzy(final TValue fuzzy) {
        return addFormParam("fuzzy", fuzzy);
    }

    /**
     * set fuzzy with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withFuzzy(final Supplier<Boolean> supplier) {
        return withFormParam("fuzzy", supplier.get());
    }

    /**
     * add additional fuzzy query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addFuzzy(final Supplier<Boolean> supplier) {
        return addFormParam("fuzzy", supplier.get());
    }

    /**
     * set fuzzy with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withFuzzy(final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("fuzzy", op.apply(new StringBuilder()));
    }

    /**
     * add additional fuzzy query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addFuzzy(final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("fuzzy", op.apply(new StringBuilder()));
    }

    /**
     * set fuzzy with the specified values
     * @param fuzzy values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withFuzzy(final Collection<TValue> fuzzy) {
        return withoutFormParam("fuzzy").addQueryParams(
            fuzzy.stream().map(s -> new ApiMethod.ParamEntry<>("fuzzy", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional fuzzy query parameters
     * @param fuzzy values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addFuzzy(final Collection<TValue> fuzzy) {
        return addFormParams(
            fuzzy.stream().map(s -> new ApiMethod.ParamEntry<>("fuzzy", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set fuzzyLevel with the specified value
     * @param fuzzyLevel value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withFuzzyLevel(final TValue fuzzyLevel) {
        return withFormParam("fuzzyLevel", fuzzyLevel);
    }

    /**
     * add additional fuzzyLevel query parameter
     * @param fuzzyLevel value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addFuzzyLevel(final TValue fuzzyLevel) {
        return addFormParam("fuzzyLevel", fuzzyLevel);
    }

    /**
     * set fuzzyLevel with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withFuzzyLevel(final Supplier<Double> supplier) {
        return withFormParam("fuzzyLevel", supplier.get());
    }

    /**
     * add additional fuzzyLevel query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addFuzzyLevel(final Supplier<Double> supplier) {
        return addFormParam("fuzzyLevel", supplier.get());
    }

    /**
     * set fuzzyLevel with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withFuzzyLevel(
            final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("fuzzyLevel", op.apply(new StringBuilder()));
    }

    /**
     * add additional fuzzyLevel query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addFuzzyLevel(
            final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("fuzzyLevel", op.apply(new StringBuilder()));
    }

    /**
     * set fuzzyLevel with the specified values
     * @param fuzzyLevel values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withFuzzyLevel(
            final Collection<TValue> fuzzyLevel) {
        return withoutFormParam("fuzzyLevel").addQueryParams(fuzzyLevel.stream()
                .map(s -> new ApiMethod.ParamEntry<>("fuzzyLevel", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * add additional fuzzyLevel query parameters
     * @param fuzzyLevel values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addFuzzyLevel(
            final Collection<TValue> fuzzyLevel) {
        return addFormParams(fuzzyLevel.stream()
                .map(s -> new ApiMethod.ParamEntry<>("fuzzyLevel", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set markMatchingVariants with the specified value
     * @param markMatchingVariants value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withMarkMatchingVariants(
            final TValue markMatchingVariants) {
        return withFormParam("markMatchingVariants", markMatchingVariants);
    }

    /**
     * add additional markMatchingVariants query parameter
     * @param markMatchingVariants value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addMarkMatchingVariants(
            final TValue markMatchingVariants) {
        return addFormParam("markMatchingVariants", markMatchingVariants);
    }

    /**
     * set markMatchingVariants with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withMarkMatchingVariants(final Supplier<Boolean> supplier) {
        return withFormParam("markMatchingVariants", supplier.get());
    }

    /**
     * add additional markMatchingVariants query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addMarkMatchingVariants(final Supplier<Boolean> supplier) {
        return addFormParam("markMatchingVariants", supplier.get());
    }

    /**
     * set markMatchingVariants with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withMarkMatchingVariants(
            final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("markMatchingVariants", op.apply(new StringBuilder()));
    }

    /**
     * add additional markMatchingVariants query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addMarkMatchingVariants(
            final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("markMatchingVariants", op.apply(new StringBuilder()));
    }

    /**
     * set markMatchingVariants with the specified values
     * @param markMatchingVariants values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withMarkMatchingVariants(
            final Collection<TValue> markMatchingVariants) {
        return withoutFormParam("markMatchingVariants").addQueryParams(markMatchingVariants.stream()
                .map(s -> new ApiMethod.ParamEntry<>("markMatchingVariants", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * add additional markMatchingVariants query parameters
     * @param markMatchingVariants values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addMarkMatchingVariants(
            final Collection<TValue> markMatchingVariants) {
        return addFormParams(markMatchingVariants.stream()
                .map(s -> new ApiMethod.ParamEntry<>("markMatchingVariants", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set filter with the specified value
     * @param filter value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withFilter(final TValue filter) {
        return withFormParam("filter", filter);
    }

    /**
     * add additional filter query parameter
     * @param filter value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addFilter(final TValue filter) {
        return addFormParam("filter", filter);
    }

    /**
     * set filter with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withFilter(final Supplier<String> supplier) {
        return withFormParam("filter", supplier.get());
    }

    /**
     * add additional filter query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addFilter(final Supplier<String> supplier) {
        return addFormParam("filter", supplier.get());
    }

    /**
     * set filter with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withFilter(
            final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("filter", op.apply(new StringBuilder()));
    }

    /**
     * add additional filter query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addFilter(final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("filter", op.apply(new StringBuilder()));
    }

    /**
     * set filter with the specified values
     * @param filter values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withFilter(final Collection<TValue> filter) {
        return withoutFormParam("filter").addQueryParams(
            filter.stream().map(s -> new ApiMethod.ParamEntry<>("filter", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional filter query parameters
     * @param filter values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addFilter(final Collection<TValue> filter) {
        return addFormParams(
            filter.stream().map(s -> new ApiMethod.ParamEntry<>("filter", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set filterFacets with the specified value
     * @param filterFacets value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withFilterFacets(final TValue filterFacets) {
        return withFormParam("filter.facets", filterFacets);
    }

    /**
     * add additional filterFacets query parameter
     * @param filterFacets value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addFilterFacets(final TValue filterFacets) {
        return addFormParam("filter.facets", filterFacets);
    }

    /**
     * set filterFacets with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withFilterFacets(final Supplier<String> supplier) {
        return withFormParam("filter.facets", supplier.get());
    }

    /**
     * add additional filterFacets query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addFilterFacets(final Supplier<String> supplier) {
        return addFormParam("filter.facets", supplier.get());
    }

    /**
     * set filterFacets with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withFilterFacets(
            final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("filter.facets", op.apply(new StringBuilder()));
    }

    /**
     * add additional filterFacets query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addFilterFacets(
            final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("filter.facets", op.apply(new StringBuilder()));
    }

    /**
     * set filterFacets with the specified values
     * @param filterFacets values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withFilterFacets(
            final Collection<TValue> filterFacets) {
        return withoutFormParam("filter.facets").addQueryParams(filterFacets.stream()
                .map(s -> new ApiMethod.ParamEntry<>("filter.facets", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * add additional filterFacets query parameters
     * @param filterFacets values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addFilterFacets(
            final Collection<TValue> filterFacets) {
        return addFormParams(filterFacets.stream()
                .map(s -> new ApiMethod.ParamEntry<>("filter.facets", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set filterQuery with the specified value
     * @param filterQuery value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withFilterQuery(final TValue filterQuery) {
        return withFormParam("filter.query", filterQuery);
    }

    /**
     * add additional filterQuery query parameter
     * @param filterQuery value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addFilterQuery(final TValue filterQuery) {
        return addFormParam("filter.query", filterQuery);
    }

    /**
     * set filterQuery with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withFilterQuery(final Supplier<String> supplier) {
        return withFormParam("filter.query", supplier.get());
    }

    /**
     * add additional filterQuery query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addFilterQuery(final Supplier<String> supplier) {
        return addFormParam("filter.query", supplier.get());
    }

    /**
     * set filterQuery with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withFilterQuery(
            final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("filter.query", op.apply(new StringBuilder()));
    }

    /**
     * add additional filterQuery query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addFilterQuery(
            final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("filter.query", op.apply(new StringBuilder()));
    }

    /**
     * set filterQuery with the specified values
     * @param filterQuery values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withFilterQuery(
            final Collection<TValue> filterQuery) {
        return withoutFormParam("filter.query").addQueryParams(filterQuery.stream()
                .map(s -> new ApiMethod.ParamEntry<>("filter.query", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * add additional filterQuery query parameters
     * @param filterQuery values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addFilterQuery(
            final Collection<TValue> filterQuery) {
        return addFormParams(filterQuery.stream()
                .map(s -> new ApiMethod.ParamEntry<>("filter.query", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set facet with the specified value
     * @param facet value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withFacet(final TValue facet) {
        return withFormParam("facet", facet);
    }

    /**
     * add additional facet query parameter
     * @param facet value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addFacet(final TValue facet) {
        return addFormParam("facet", facet);
    }

    /**
     * set facet with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withFacet(final Supplier<String> supplier) {
        return withFormParam("facet", supplier.get());
    }

    /**
     * add additional facet query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addFacet(final Supplier<String> supplier) {
        return addFormParam("facet", supplier.get());
    }

    /**
     * set facet with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withFacet(final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("facet", op.apply(new StringBuilder()));
    }

    /**
     * add additional facet query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addFacet(final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("facet", op.apply(new StringBuilder()));
    }

    /**
     * set facet with the specified values
     * @param facet values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withFacet(final Collection<TValue> facet) {
        return withoutFormParam("facet").addQueryParams(
            facet.stream().map(s -> new ApiMethod.ParamEntry<>("facet", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional facet query parameters
     * @param facet values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addFacet(final Collection<TValue> facet) {
        return addFormParams(
            facet.stream().map(s -> new ApiMethod.ParamEntry<>("facet", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set sort with the specified value
     * @param sort value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withSort(final TValue sort) {
        return withFormParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     * @param sort value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addSort(final TValue sort) {
        return addFormParam("sort", sort);
    }

    /**
     * set sort with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withSort(final Supplier<String> supplier) {
        return withFormParam("sort", supplier.get());
    }

    /**
     * add additional sort query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addSort(final Supplier<String> supplier) {
        return addFormParam("sort", supplier.get());
    }

    /**
     * set sort with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withSort(final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * add additional sort query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addSort(final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("sort", op.apply(new StringBuilder()));
    }

    /**
     * set sort with the specified values
     * @param sort values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withSort(final Collection<TValue> sort) {
        return withoutFormParam("sort").addQueryParams(
            sort.stream().map(s -> new ApiMethod.ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional sort query parameters
     * @param sort values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addSort(final Collection<TValue> sort) {
        return addFormParams(
            sort.stream().map(s -> new ApiMethod.ParamEntry<>("sort", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set limit with the specified value
     * @param limit value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withLimit(final TValue limit) {
        return withFormParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     * @param limit value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addLimit(final TValue limit) {
        return addFormParam("limit", limit);
    }

    /**
     * set limit with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withLimit(final Supplier<Integer> supplier) {
        return withFormParam("limit", supplier.get());
    }

    /**
     * add additional limit query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addLimit(final Supplier<Integer> supplier) {
        return addFormParam("limit", supplier.get());
    }

    /**
     * set limit with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withLimit(final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * add additional limit query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addLimit(final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("limit", op.apply(new StringBuilder()));
    }

    /**
     * set limit with the specified values
     * @param limit values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withLimit(final Collection<TValue> limit) {
        return withoutFormParam("limit").addQueryParams(
            limit.stream().map(s -> new ApiMethod.ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     * @param limit values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addLimit(final Collection<TValue> limit) {
        return addFormParams(
            limit.stream().map(s -> new ApiMethod.ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specified value
     * @param offset value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withOffset(final TValue offset) {
        return withFormParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     * @param offset value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addOffset(final TValue offset) {
        return addFormParam("offset", offset);
    }

    /**
     * set offset with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withOffset(final Supplier<Integer> supplier) {
        return withFormParam("offset", supplier.get());
    }

    /**
     * add additional offset query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addOffset(final Supplier<Integer> supplier) {
        return addFormParam("offset", supplier.get());
    }

    /**
     * set offset with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withOffset(
            final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * add additional offset query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addOffset(final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("offset", op.apply(new StringBuilder()));
    }

    /**
     * set offset with the specified values
     * @param offset values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withOffset(final Collection<TValue> offset) {
        return withoutFormParam("offset").addQueryParams(
            offset.stream().map(s -> new ApiMethod.ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     * @param offset values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addOffset(final Collection<TValue> offset) {
        return addFormParams(
            offset.stream().map(s -> new ApiMethod.ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set withTotal with the specified value
     * @param withTotal value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withWithTotal(final TValue withTotal) {
        return withFormParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     * @param withTotal value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addWithTotal(final TValue withTotal) {
        return addFormParam("withTotal", withTotal);
    }

    /**
     * set withTotal with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withWithTotal(final Supplier<Boolean> supplier) {
        return withFormParam("withTotal", supplier.get());
    }

    /**
     * add additional withTotal query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addWithTotal(final Supplier<Boolean> supplier) {
        return addFormParam("withTotal", supplier.get());
    }

    /**
     * set withTotal with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withWithTotal(
            final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * add additional withTotal query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addWithTotal(
            final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("withTotal", op.apply(new StringBuilder()));
    }

    /**
     * set withTotal with the specified values
     * @param withTotal values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withWithTotal(final Collection<TValue> withTotal) {
        return withoutFormParam("withTotal").addQueryParams(withTotal.stream()
                .map(s -> new ApiMethod.ParamEntry<>("withTotal", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * add additional withTotal query parameters
     * @param withTotal values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addWithTotal(final Collection<TValue> withTotal) {
        return addFormParams(withTotal.stream()
                .map(s -> new ApiMethod.ParamEntry<>("withTotal", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set staged with the specified value
     * @param staged value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withStaged(final TValue staged) {
        return withFormParam("staged", staged);
    }

    /**
     * add additional staged query parameter
     * @param staged value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addStaged(final TValue staged) {
        return addFormParam("staged", staged);
    }

    /**
     * set staged with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withStaged(final Supplier<Boolean> supplier) {
        return withFormParam("staged", supplier.get());
    }

    /**
     * add additional staged query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addStaged(final Supplier<Boolean> supplier) {
        return addFormParam("staged", supplier.get());
    }

    /**
     * set staged with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withStaged(
            final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * add additional staged query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addStaged(final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("staged", op.apply(new StringBuilder()));
    }

    /**
     * set staged with the specified values
     * @param staged values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withStaged(final Collection<TValue> staged) {
        return withoutFormParam("staged").addQueryParams(
            staged.stream().map(s -> new ApiMethod.ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional staged query parameters
     * @param staged values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addStaged(final Collection<TValue> staged) {
        return addFormParams(
            staged.stream().map(s -> new ApiMethod.ParamEntry<>("staged", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set priceCurrency with the specified value
     * @param priceCurrency value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withPriceCurrency(final TValue priceCurrency) {
        return withFormParam("priceCurrency", priceCurrency);
    }

    /**
     * add additional priceCurrency query parameter
     * @param priceCurrency value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addPriceCurrency(final TValue priceCurrency) {
        return addFormParam("priceCurrency", priceCurrency);
    }

    /**
     * set priceCurrency with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withPriceCurrency(final Supplier<String> supplier) {
        return withFormParam("priceCurrency", supplier.get());
    }

    /**
     * add additional priceCurrency query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addPriceCurrency(final Supplier<String> supplier) {
        return addFormParam("priceCurrency", supplier.get());
    }

    /**
     * set priceCurrency with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withPriceCurrency(
            final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCurrency query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addPriceCurrency(
            final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("priceCurrency", op.apply(new StringBuilder()));
    }

    /**
     * set priceCurrency with the specified values
     * @param priceCurrency values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withPriceCurrency(
            final Collection<TValue> priceCurrency) {
        return withoutFormParam("priceCurrency").addQueryParams(priceCurrency.stream()
                .map(s -> new ApiMethod.ParamEntry<>("priceCurrency", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * add additional priceCurrency query parameters
     * @param priceCurrency values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addPriceCurrency(
            final Collection<TValue> priceCurrency) {
        return addFormParams(priceCurrency.stream()
                .map(s -> new ApiMethod.ParamEntry<>("priceCurrency", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCountry with the specified value
     * @param priceCountry value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withPriceCountry(final TValue priceCountry) {
        return withFormParam("priceCountry", priceCountry);
    }

    /**
     * add additional priceCountry query parameter
     * @param priceCountry value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addPriceCountry(final TValue priceCountry) {
        return addFormParam("priceCountry", priceCountry);
    }

    /**
     * set priceCountry with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withPriceCountry(final Supplier<String> supplier) {
        return withFormParam("priceCountry", supplier.get());
    }

    /**
     * add additional priceCountry query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addPriceCountry(final Supplier<String> supplier) {
        return addFormParam("priceCountry", supplier.get());
    }

    /**
     * set priceCountry with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withPriceCountry(
            final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCountry query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addPriceCountry(
            final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("priceCountry", op.apply(new StringBuilder()));
    }

    /**
     * set priceCountry with the specified values
     * @param priceCountry values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withPriceCountry(
            final Collection<TValue> priceCountry) {
        return withoutFormParam("priceCountry").addQueryParams(priceCountry.stream()
                .map(s -> new ApiMethod.ParamEntry<>("priceCountry", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * add additional priceCountry query parameters
     * @param priceCountry values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addPriceCountry(
            final Collection<TValue> priceCountry) {
        return addFormParams(priceCountry.stream()
                .map(s -> new ApiMethod.ParamEntry<>("priceCountry", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param priceCustomerGroup value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withPriceCustomerGroup(
            final TValue priceCustomerGroup) {
        return withFormParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param priceCustomerGroup value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addPriceCustomerGroup(
            final TValue priceCustomerGroup) {
        return addFormParam("priceCustomerGroup", priceCustomerGroup);
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withPriceCustomerGroup(final Supplier<String> supplier) {
        return withFormParam("priceCustomerGroup", supplier.get());
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addPriceCustomerGroup(final Supplier<String> supplier) {
        return addFormParam("priceCustomerGroup", supplier.get());
    }

    /**
     * set priceCustomerGroup with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withPriceCustomerGroup(
            final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceCustomerGroup query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addPriceCustomerGroup(
            final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("priceCustomerGroup", op.apply(new StringBuilder()));
    }

    /**
     * set priceCustomerGroup with the specified values
     * @param priceCustomerGroup values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withPriceCustomerGroup(
            final Collection<TValue> priceCustomerGroup) {
        return withoutFormParam("priceCustomerGroup").addQueryParams(priceCustomerGroup.stream()
                .map(s -> new ApiMethod.ParamEntry<>("priceCustomerGroup", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * add additional priceCustomerGroup query parameters
     * @param priceCustomerGroup values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addPriceCustomerGroup(
            final Collection<TValue> priceCustomerGroup) {
        return addFormParams(priceCustomerGroup.stream()
                .map(s -> new ApiMethod.ParamEntry<>("priceCustomerGroup", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set priceChannel with the specified value
     * @param priceChannel value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withPriceChannel(final TValue priceChannel) {
        return withFormParam("priceChannel", priceChannel);
    }

    /**
     * add additional priceChannel query parameter
     * @param priceChannel value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addPriceChannel(final TValue priceChannel) {
        return addFormParam("priceChannel", priceChannel);
    }

    /**
     * set priceChannel with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withPriceChannel(final Supplier<String> supplier) {
        return withFormParam("priceChannel", supplier.get());
    }

    /**
     * add additional priceChannel query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addPriceChannel(final Supplier<String> supplier) {
        return addFormParam("priceChannel", supplier.get());
    }

    /**
     * set priceChannel with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withPriceChannel(
            final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * add additional priceChannel query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addPriceChannel(
            final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("priceChannel", op.apply(new StringBuilder()));
    }

    /**
     * set priceChannel with the specified values
     * @param priceChannel values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withPriceChannel(
            final Collection<TValue> priceChannel) {
        return withoutFormParam("priceChannel").addQueryParams(priceChannel.stream()
                .map(s -> new ApiMethod.ParamEntry<>("priceChannel", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * add additional priceChannel query parameters
     * @param priceChannel values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addPriceChannel(
            final Collection<TValue> priceChannel) {
        return addFormParams(priceChannel.stream()
                .map(s -> new ApiMethod.ParamEntry<>("priceChannel", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set localeProjection with the specified value
     * @param localeProjection value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withLocaleProjection(
            final TValue localeProjection) {
        return withFormParam("localeProjection", localeProjection);
    }

    /**
     * add additional localeProjection query parameter
     * @param localeProjection value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addLocaleProjection(
            final TValue localeProjection) {
        return addFormParam("localeProjection", localeProjection);
    }

    /**
     * set localeProjection with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withLocaleProjection(final Supplier<String> supplier) {
        return withFormParam("localeProjection", supplier.get());
    }

    /**
     * add additional localeProjection query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addLocaleProjection(final Supplier<String> supplier) {
        return addFormParam("localeProjection", supplier.get());
    }

    /**
     * set localeProjection with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withLocaleProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * add additional localeProjection query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addLocaleProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("localeProjection", op.apply(new StringBuilder()));
    }

    /**
     * set localeProjection with the specified values
     * @param localeProjection values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withLocaleProjection(
            final Collection<TValue> localeProjection) {
        return withoutFormParam("localeProjection").addQueryParams(localeProjection.stream()
                .map(s -> new ApiMethod.ParamEntry<>("localeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * add additional localeProjection query parameters
     * @param localeProjection values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addLocaleProjection(
            final Collection<TValue> localeProjection) {
        return addFormParams(localeProjection.stream()
                .map(s -> new ApiMethod.ParamEntry<>("localeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set storeProjection with the specified value
     * @param storeProjection value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withStoreProjection(final TValue storeProjection) {
        return withFormParam("storeProjection", storeProjection);
    }

    /**
     * add additional storeProjection query parameter
     * @param storeProjection value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addStoreProjection(final TValue storeProjection) {
        return addFormParam("storeProjection", storeProjection);
    }

    /**
     * set storeProjection with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withStoreProjection(final Supplier<String> supplier) {
        return withFormParam("storeProjection", supplier.get());
    }

    /**
     * add additional storeProjection query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addStoreProjection(final Supplier<String> supplier) {
        return addFormParam("storeProjection", supplier.get());
    }

    /**
     * set storeProjection with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withStoreProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("storeProjection", op.apply(new StringBuilder()));
    }

    /**
     * add additional storeProjection query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addStoreProjection(
            final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("storeProjection", op.apply(new StringBuilder()));
    }

    /**
     * set storeProjection with the specified values
     * @param storeProjection values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withStoreProjection(
            final Collection<TValue> storeProjection) {
        return withoutFormParam("storeProjection").addQueryParams(storeProjection.stream()
                .map(s -> new ApiMethod.ParamEntry<>("storeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * add additional storeProjection query parameters
     * @param storeProjection values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addStoreProjection(
            final Collection<TValue> storeProjection) {
        return addFormParams(storeProjection.stream()
                .map(s -> new ApiMethod.ParamEntry<>("storeProjection", s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withExpand(final TValue expand) {
        return withFormParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addExpand(final TValue expand) {
        return addFormParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withExpand(final Supplier<String> supplier) {
        return withFormParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addExpand(final Supplier<String> supplier) {
        return addFormParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return withFormParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default ByProjectKeyProductProjectionsSearchPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return addFormParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withExpand(final Collection<TValue> expand) {
        return withoutFormParam("expand").addQueryParams(
            expand.stream().map(s -> new ApiMethod.ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addExpand(final Collection<TValue> expand) {
        return addFormParams(
            expand.stream().map(s -> new ApiMethod.ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set text with the specificied value
     * @param <TValue> value type
     * @param locale parameter name
     * @param text parameter value
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withText(final String locale, final TValue text) {
        return withFormParam(String.format("text.%s", locale), text);
    }

    /**
     * add additional text query parameter
     * @param <TValue> value type
     * @param locale parameter name
     * @param text parameter value
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addText(final String locale, final TValue text) {
        return addFormParam(String.format("text.%s", locale), text);
    }

    /**
     * set text with the specificied values
     * @param <TValue> value type
     * @param locale parameter name
     * @param text parameter values
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost withText(final String locale,
            final Collection<TValue> text) {
        final String placeholderName = String.format("var.%s", locale);
        return withoutFormParam(placeholderName).addQueryParams(text.stream()
                .map(s -> new ApiMethod.ParamEntry<>(placeholderName, s.toString()))
                .collect(Collectors.toList()));
    }

    /**
     * add additional text query parameters
     * @param <TValue> value type
     * @param locale parameter name
     * @param text parameter values
     * @return ByProjectKeyProductProjectionsSearchPost
     */
    public default <TValue> ByProjectKeyProductProjectionsSearchPost addText(final String locale,
            final Collection<TValue> text) {
        final String placeholderName = String.format("var.%s", locale);
        return addFormParams(text.stream()
                .map(s -> new ApiMethod.ParamEntry<>(placeholderName, s.toString()))
                .collect(Collectors.toList()));
    }
}
