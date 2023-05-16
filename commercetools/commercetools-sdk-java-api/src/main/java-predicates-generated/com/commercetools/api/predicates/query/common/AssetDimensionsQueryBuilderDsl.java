
package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

public class AssetDimensionsQueryBuilderDsl {
    public AssetDimensionsQueryBuilderDsl() {
    }

    public static AssetDimensionsQueryBuilderDsl of() {
        return new AssetDimensionsQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<AssetDimensionsQueryBuilderDsl> w() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("w")),
            p -> new CombinationQueryPredicate<>(p, AssetDimensionsQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<AssetDimensionsQueryBuilderDsl> h() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("h")),
            p -> new CombinationQueryPredicate<>(p, AssetDimensionsQueryBuilderDsl::of));
    }

}
