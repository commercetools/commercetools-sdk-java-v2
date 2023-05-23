
package com.commercetools.api.predicates.query.discount_code;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeSetValidFromAndUntilActionQueryBuilderDsl {
    public DiscountCodeSetValidFromAndUntilActionQueryBuilderDsl() {
    }

    public static DiscountCodeSetValidFromAndUntilActionQueryBuilderDsl of() {
        return new DiscountCodeSetValidFromAndUntilActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeSetValidFromAndUntilActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeSetValidFromAndUntilActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountCodeSetValidFromAndUntilActionQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeSetValidFromAndUntilActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountCodeSetValidFromAndUntilActionQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeSetValidFromAndUntilActionQueryBuilderDsl::of));
    }

}
