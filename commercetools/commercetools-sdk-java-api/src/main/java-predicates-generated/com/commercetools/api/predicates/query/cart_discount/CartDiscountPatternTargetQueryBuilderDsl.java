
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountPatternTargetQueryBuilderDsl {
    public CartDiscountPatternTargetQueryBuilderDsl() {
    }

    public static CartDiscountPatternTargetQueryBuilderDsl of() {
        return new CartDiscountPatternTargetQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountPatternTargetQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountPatternTargetQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountPatternTargetQueryBuilderDsl> triggerPattern(
            Function<com.commercetools.api.predicates.query.cart_discount.PatternComponentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.PatternComponentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("triggerPattern"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart_discount.PatternComponentQueryBuilderDsl.of())),
            CartDiscountPatternTargetQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartDiscountPatternTargetQueryBuilderDsl> triggerPattern() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("triggerPattern")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountPatternTargetQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountPatternTargetQueryBuilderDsl> targetPattern(
            Function<com.commercetools.api.predicates.query.cart_discount.PatternComponentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.PatternComponentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("targetPattern"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart_discount.PatternComponentQueryBuilderDsl.of())),
            CartDiscountPatternTargetQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartDiscountPatternTargetQueryBuilderDsl> targetPattern() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("targetPattern")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountPatternTargetQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CartDiscountPatternTargetQueryBuilderDsl> maxOccurrence() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("maxOccurrence")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountPatternTargetQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDiscountPatternTargetQueryBuilderDsl> selectionMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("selectionMode")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountPatternTargetQueryBuilderDsl::of));
    }

}
