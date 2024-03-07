
package com.commercetools.api.predicates.query.product_tailoring;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringUnpublishActionQueryBuilderDsl {
    public ProductTailoringUnpublishActionQueryBuilderDsl() {
    }

    public static ProductTailoringUnpublishActionQueryBuilderDsl of() {
        return new ProductTailoringUnpublishActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringUnpublishActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringUnpublishActionQueryBuilderDsl::of));
    }

}
