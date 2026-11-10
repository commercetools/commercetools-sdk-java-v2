
package com.commercetools.api.predicates.query.product_tailoring;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringAttributeQueryBuilderDsl {
    public ProductTailoringAttributeQueryBuilderDsl() {
    }

    public static ProductTailoringAttributeQueryBuilderDsl of() {
        return new ProductTailoringAttributeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringAttributeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAttributeQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringAttributeQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAttributeQueryBuilderDsl::of));
    }

}
