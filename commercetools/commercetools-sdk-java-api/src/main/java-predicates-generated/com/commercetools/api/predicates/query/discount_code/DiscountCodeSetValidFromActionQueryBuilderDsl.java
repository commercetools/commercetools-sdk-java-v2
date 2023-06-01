package com.commercetools.api.predicates.query.discount_code;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DiscountCodeSetValidFromActionQueryBuilderDsl  {
    public DiscountCodeSetValidFromActionQueryBuilderDsl() {
    }

    public static DiscountCodeSetValidFromActionQueryBuilderDsl of() {
        return new DiscountCodeSetValidFromActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeSetValidFromActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, DiscountCodeSetValidFromActionQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<DiscountCodeSetValidFromActionQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
        p -> new CombinationQueryPredicate<>(p, DiscountCodeSetValidFromActionQueryBuilderDsl::of));
    }
    
}
