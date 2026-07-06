
package com.commercetools.api.predicates.query.variant_attributes;

import com.commercetools.api.predicates.query.*;

public class VariantAttributesChannelAvailabilityQueryBuilderDsl {
    public VariantAttributesChannelAvailabilityQueryBuilderDsl() {
    }

    public static VariantAttributesChannelAvailabilityQueryBuilderDsl of() {
        return new VariantAttributesChannelAvailabilityQueryBuilderDsl();
    }

    public BooleanComparisonPredicateBuilder<VariantAttributesChannelAvailabilityQueryBuilderDsl> isOnStock() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isOnStock")),
            p -> new CombinationQueryPredicate<>(p, VariantAttributesChannelAvailabilityQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantAttributesChannelAvailabilityQueryBuilderDsl> availableQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("availableQuantity")),
            p -> new CombinationQueryPredicate<>(p, VariantAttributesChannelAvailabilityQueryBuilderDsl::of));
    }

}
