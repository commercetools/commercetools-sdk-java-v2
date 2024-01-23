
package com.commercetools.api.search.products;

public interface FacetExpression<T> extends FilterExpression {

    FacetExpression<T> countingProducts();

    FacetExpression<T> alias(String alias);
}
