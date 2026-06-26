
package com.commercetools.api.predicates.query.variant_attributes;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantAttributesAvailabilityQueryBuilderDsl {
    public VariantAttributesAvailabilityQueryBuilderDsl() {
    }

    public static VariantAttributesAvailabilityQueryBuilderDsl of() {
        return new VariantAttributesAvailabilityQueryBuilderDsl();
    }

    public BooleanComparisonPredicateBuilder<VariantAttributesAvailabilityQueryBuilderDsl> isOnStock() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isOnStock")),
            p -> new CombinationQueryPredicate<>(p, VariantAttributesAvailabilityQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantAttributesAvailabilityQueryBuilderDsl> availableQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("availableQuantity")),
            p -> new CombinationQueryPredicate<>(p, VariantAttributesAvailabilityQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantAttributesAvailabilityQueryBuilderDsl> channels(
            Function<com.commercetools.api.predicates.query.variant_attributes.VariantAttributesChannelAvailabilityMapQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant_attributes.VariantAttributesChannelAvailabilityMapQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("channels"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.variant_attributes.VariantAttributesChannelAvailabilityMapQueryBuilderDsl
                            .of())),
            VariantAttributesAvailabilityQueryBuilderDsl::of);
    }

}
