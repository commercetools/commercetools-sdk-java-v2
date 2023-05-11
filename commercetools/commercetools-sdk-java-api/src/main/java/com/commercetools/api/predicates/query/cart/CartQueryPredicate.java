
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartQueryPredicate implements QueryPredicate {
    private final QueryPredicate predicate;

    public CartQueryPredicate() {
        this.predicate = null;
    }

    public CartQueryPredicate(QueryPredicate predicate) {
        this.predicate = predicate;
    }

    public QueryPredicate build() {
        return predicate;
    }

    public static CartQueryPredicate of() {
        return new CartQueryPredicate();
    }

    public ComparisonPredicateBuilder<CartQueryPredicate> id() {
        return new ComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CartQueryPredicate::of));
    }

    public CombinationQueryPredicate<CartQueryPredicate> lineItems(
            Function<LineItemQueryPredicate, CombinationQueryPredicate<LineItemQueryPredicate>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("lineItems"))
                .inner(fn.apply(LineItemQueryPredicate.of())),
            CartQueryPredicate::of);
    }

}
