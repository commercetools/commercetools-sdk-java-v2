package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCartRemoveDiscountCodeActionQueryBuilderDsl  {
    public MyCartRemoveDiscountCodeActionQueryBuilderDsl() {
    }

    public static MyCartRemoveDiscountCodeActionQueryBuilderDsl of() {
        return new MyCartRemoveDiscountCodeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartRemoveDiscountCodeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCartRemoveDiscountCodeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyCartRemoveDiscountCodeActionQueryBuilderDsl> discountCode(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("discountCode"))
            .inner(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl.of())),
            MyCartRemoveDiscountCodeActionQueryBuilderDsl::of);
    }
    
    
}
