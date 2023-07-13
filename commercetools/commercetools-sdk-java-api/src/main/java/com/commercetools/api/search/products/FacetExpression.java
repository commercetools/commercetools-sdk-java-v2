
package com.commercetools.api.search.products;

public interface FacetExpression {

    FilterExpression expression();

    Boolean countingProducts();

    String alias();
}
