
package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantSetAttributeActionQueryBuilderDsl {
    public VariantSetAttributeActionQueryBuilderDsl() {
    }

    public static VariantSetAttributeActionQueryBuilderDsl of() {
        return new VariantSetAttributeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantSetAttributeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAttributeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetAttributeActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAttributeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetAttributeActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAttributeActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantSetAttributeActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAttributeActionQueryBuilderDsl::of));
    }

}
