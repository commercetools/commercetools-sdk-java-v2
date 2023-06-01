package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartPagedQueryResponseQueryBuilderDsl  {
    public CartPagedQueryResponseQueryBuilderDsl() {
    }

    public static CartPagedQueryResponseQueryBuilderDsl of() {
        return new CartPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<CartPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, CartPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CartPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, CartPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CartPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, CartPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CartPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, CartPagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartPagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl.of())),
            CartPagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CartPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, CartPagedQueryResponseQueryBuilderDsl::of));
    }
    
}
