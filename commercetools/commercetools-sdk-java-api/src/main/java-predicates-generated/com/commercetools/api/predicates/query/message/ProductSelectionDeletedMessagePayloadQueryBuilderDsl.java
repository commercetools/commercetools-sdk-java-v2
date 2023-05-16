
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionDeletedMessagePayloadQueryBuilderDsl {
    public ProductSelectionDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductSelectionDeletedMessagePayloadQueryBuilderDsl of() {
        return new ProductSelectionDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionDeletedMessagePayloadQueryBuilderDsl::of));
    }

}
