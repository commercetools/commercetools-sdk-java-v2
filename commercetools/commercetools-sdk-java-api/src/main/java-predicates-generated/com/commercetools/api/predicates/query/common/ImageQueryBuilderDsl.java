
package com.commercetools.api.predicates.query.common;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ImageQueryBuilderDsl {
    public ImageQueryBuilderDsl() {
    }

    public static ImageQueryBuilderDsl of() {
        return new ImageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ImageQueryBuilderDsl> url() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("url")),
            p -> new CombinationQueryPredicate<>(p, ImageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ImageQueryBuilderDsl> dimensions(
            Function<com.commercetools.api.predicates.query.common.ImageDimensionsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageDimensionsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("dimensions"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageDimensionsQueryBuilderDsl.of())),
            ImageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ImageQueryBuilderDsl> label() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("label")),
            p -> new CombinationQueryPredicate<>(p, ImageQueryBuilderDsl::of));
    }

}
