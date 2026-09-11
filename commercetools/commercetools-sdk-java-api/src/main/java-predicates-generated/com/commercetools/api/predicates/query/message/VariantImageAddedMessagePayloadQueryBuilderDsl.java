
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantImageAddedMessagePayloadQueryBuilderDsl {
    public VariantImageAddedMessagePayloadQueryBuilderDsl() {
    }

    public static VariantImageAddedMessagePayloadQueryBuilderDsl of() {
        return new VariantImageAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantImageAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantImageAddedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantImageAddedMessagePayloadQueryBuilderDsl> image(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("image"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            VariantImageAddedMessagePayloadQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<VariantImageAddedMessagePayloadQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantImageAddedMessagePayloadQueryBuilderDsl::of));
    }

}
