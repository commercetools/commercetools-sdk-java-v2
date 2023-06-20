
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyCartSetDirectDiscountsActionQueryBuilderDsl {
    public MyCartSetDirectDiscountsActionQueryBuilderDsl() {
    }

    public static MyCartSetDirectDiscountsActionQueryBuilderDsl of() {
        return new MyCartSetDirectDiscountsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetDirectDiscountsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetDirectDiscountsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCartSetDirectDiscountsActionQueryBuilderDsl> discounts(
            Function<com.commercetools.api.predicates.query.cart.DirectDiscountDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DirectDiscountDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discounts"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.DirectDiscountDraftQueryBuilderDsl.of())),
            MyCartSetDirectDiscountsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyCartSetDirectDiscountsActionQueryBuilderDsl> discounts() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discounts")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetDirectDiscountsActionQueryBuilderDsl::of));
    }

}
