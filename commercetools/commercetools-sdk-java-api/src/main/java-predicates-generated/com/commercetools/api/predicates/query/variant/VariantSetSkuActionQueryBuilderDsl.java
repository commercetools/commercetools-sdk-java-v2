
package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantSetSkuActionQueryBuilderDsl {
    public VariantSetSkuActionQueryBuilderDsl() {
    }

    public static VariantSetSkuActionQueryBuilderDsl of() {
        return new VariantSetSkuActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantSetSkuActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantSetSkuActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetSkuActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, VariantSetSkuActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantSetSkuActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantSetSkuActionQueryBuilderDsl::of));
    }

}
