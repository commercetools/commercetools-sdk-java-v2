package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DirectDiscountReferenceQueryBuilderDsl  {
    public DirectDiscountReferenceQueryBuilderDsl() {
    }

    public static DirectDiscountReferenceQueryBuilderDsl of() {
        return new DirectDiscountReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DirectDiscountReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, DirectDiscountReferenceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<DirectDiscountReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, DirectDiscountReferenceQueryBuilderDsl::of));
    }
    
}
