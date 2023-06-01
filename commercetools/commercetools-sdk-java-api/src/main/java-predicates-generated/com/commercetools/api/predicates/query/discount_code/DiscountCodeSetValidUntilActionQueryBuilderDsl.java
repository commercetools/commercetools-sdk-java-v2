package com.commercetools.api.predicates.query.discount_code;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DiscountCodeSetValidUntilActionQueryBuilderDsl  {
    public DiscountCodeSetValidUntilActionQueryBuilderDsl() {
    }

    public static DiscountCodeSetValidUntilActionQueryBuilderDsl of() {
        return new DiscountCodeSetValidUntilActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeSetValidUntilActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, DiscountCodeSetValidUntilActionQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<DiscountCodeSetValidUntilActionQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
        p -> new CombinationQueryPredicate<>(p, DiscountCodeSetValidUntilActionQueryBuilderDsl::of));
    }
    
}
