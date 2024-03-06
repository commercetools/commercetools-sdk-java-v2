
package com.commercetools.api.predicates.query.product_tailoring;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringPublishActionQueryBuilderDsl {
    public ProductTailoringPublishActionQueryBuilderDsl() {
    }

    public static ProductTailoringPublishActionQueryBuilderDsl of() {
        return new ProductTailoringPublishActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringPublishActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringPublishActionQueryBuilderDsl::of));
    }

}
