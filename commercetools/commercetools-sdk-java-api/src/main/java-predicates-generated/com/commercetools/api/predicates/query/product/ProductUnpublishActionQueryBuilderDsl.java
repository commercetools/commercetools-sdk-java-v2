
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class ProductUnpublishActionQueryBuilderDsl {
    public ProductUnpublishActionQueryBuilderDsl() {
    }

    public static ProductUnpublishActionQueryBuilderDsl of() {
        return new ProductUnpublishActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductUnpublishActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductUnpublishActionQueryBuilderDsl::of));
    }

}
