package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartChangeCustomLineItemQuantityActionQueryBuilderDsl  {
    public CartChangeCustomLineItemQuantityActionQueryBuilderDsl() {
    }

    public static CartChangeCustomLineItemQuantityActionQueryBuilderDsl of() {
        return new CartChangeCustomLineItemQuantityActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartChangeCustomLineItemQuantityActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartChangeCustomLineItemQuantityActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartChangeCustomLineItemQuantityActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
        p -> new CombinationQueryPredicate<>(p, CartChangeCustomLineItemQuantityActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CartChangeCustomLineItemQuantityActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, CartChangeCustomLineItemQuantityActionQueryBuilderDsl::of));
    }
    
}
