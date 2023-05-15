
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class ProductRevertedStagedChangesMessagePayloadQueryBuilderDsl {
    public ProductRevertedStagedChangesMessagePayloadQueryBuilderDsl() {
    }

    public static ProductRevertedStagedChangesMessagePayloadQueryBuilderDsl of() {
        return new ProductRevertedStagedChangesMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductRevertedStagedChangesMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductRevertedStagedChangesMessagePayloadQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ProductRevertedStagedChangesMessagePayloadQueryBuilderDsl> removedImageUrls() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedImageUrls")),
            p -> new CombinationQueryPredicate<>(p, ProductRevertedStagedChangesMessagePayloadQueryBuilderDsl::of));
    }
}
