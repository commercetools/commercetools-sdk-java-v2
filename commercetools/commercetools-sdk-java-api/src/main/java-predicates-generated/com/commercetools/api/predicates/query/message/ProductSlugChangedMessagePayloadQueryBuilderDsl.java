
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSlugChangedMessagePayloadQueryBuilderDsl {
    public ProductSlugChangedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductSlugChangedMessagePayloadQueryBuilderDsl of() {
        return new ProductSlugChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSlugChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductSlugChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSlugChangedMessagePayloadQueryBuilderDsl> slug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("slug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductSlugChangedMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSlugChangedMessagePayloadQueryBuilderDsl> oldSlug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldSlug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductSlugChangedMessagePayloadQueryBuilderDsl::of);
    }

}
