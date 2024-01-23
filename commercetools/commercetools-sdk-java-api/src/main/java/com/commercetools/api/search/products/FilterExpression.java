
package com.commercetools.api.search.products;

public interface FilterExpression {
    default String render() {
        return "";
    };
}
