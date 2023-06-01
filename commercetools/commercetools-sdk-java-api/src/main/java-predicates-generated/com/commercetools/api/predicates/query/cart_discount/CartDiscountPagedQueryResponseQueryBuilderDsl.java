package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartDiscountPagedQueryResponseQueryBuilderDsl  {
    public CartDiscountPagedQueryResponseQueryBuilderDsl() {
    }

    public static CartDiscountPagedQueryResponseQueryBuilderDsl of() {
        return new CartDiscountPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<CartDiscountPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CartDiscountPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CartDiscountPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CartDiscountPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountPagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartDiscountPagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart_discount.CartDiscountQueryBuilderDsl.of())),
            CartDiscountPagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CartDiscountPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, CartDiscountPagedQueryResponseQueryBuilderDsl::of));
    }
    
}
