
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFullTextExpressionQueryBuilderDsl {
    public ProductSearchFullTextExpressionQueryBuilderDsl() {
    }

    public static ProductSearchFullTextExpressionQueryBuilderDsl of() {
        return new ProductSearchFullTextExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchFullTextExpressionQueryBuilderDsl> fullText(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFullTextValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFullTextValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("fullText"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchFullTextValueQueryBuilderDsl
                            .of())),
            ProductSearchFullTextExpressionQueryBuilderDsl::of);
    }

}
