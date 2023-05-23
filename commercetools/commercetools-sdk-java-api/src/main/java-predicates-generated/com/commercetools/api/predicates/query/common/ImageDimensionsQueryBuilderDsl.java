
package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

public class ImageDimensionsQueryBuilderDsl {
    public ImageDimensionsQueryBuilderDsl() {
    }

    public static ImageDimensionsQueryBuilderDsl of() {
        return new ImageDimensionsQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ImageDimensionsQueryBuilderDsl> w() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("w")),
            p -> new CombinationQueryPredicate<>(p, ImageDimensionsQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ImageDimensionsQueryBuilderDsl> h() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("h")),
            p -> new CombinationQueryPredicate<>(p, ImageDimensionsQueryBuilderDsl::of));
    }

}
