
package com.commercetools.api.client;

import java.util.function.Function;

import com.commercetools.api.search.products.FacetExpression;
import com.commercetools.api.search.products.FilterExpression;
import com.commercetools.api.search.products.ProductFacetExpressionBuilder;
import com.commercetools.api.search.products.ProductFilterExpressionBuilder;

public interface ByProjectKeyProductProjectionsSearchGetMixin {
    public <TValue> ByProjectKeyProductProjectionsSearchGet addFilter(final TValue filter);

    public <TValue> ByProjectKeyProductProjectionsSearchGet addFilterFacets(final TValue filterFacets);

    public <TValue> ByProjectKeyProductProjectionsSearchGet addFilterQuery(final TValue filterQuery);

    public <TValue> ByProjectKeyProductProjectionsSearchGet addFacet(final TValue facet);

    default ProductFilterExpressionBuilder filterDsl() {
        return new ProductFilterExpressionBuilder();
    }

    default ProductFacetExpressionBuilder facetDsl() {
        return new ProductFacetExpressionBuilder();
    }

    default ByProjectKeyProductProjectionsSearchGet filter(
            Function<ProductFilterExpressionBuilder, FilterExpression> fn) {
        return addFilter(fn.apply(filterDsl()).render());
    }

    default ByProjectKeyProductProjectionsSearchGet filterFacets(
            Function<ProductFilterExpressionBuilder, FilterExpression> fn) {
        return addFilterFacets(fn.apply(filterDsl()).render());
    }

    default ByProjectKeyProductProjectionsSearchGet filterQuery(
            Function<ProductFilterExpressionBuilder, FilterExpression> fn) {
        return addFilterQuery(fn.apply(filterDsl()).render());
    }

    default ByProjectKeyProductProjectionsSearchGet facet(
            Function<ProductFacetExpressionBuilder, FacetExpression<?>> fn) {
        return addFacet(fn.apply(facetDsl()).render());
    }
}
