
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartSetLineItemCustomFieldActionQueryBuilderDsl {
    public CartSetLineItemCustomFieldActionQueryBuilderDsl() {
    }

    public static CartSetLineItemCustomFieldActionQueryBuilderDsl of() {
        return new CartSetLineItemCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetLineItemCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetLineItemCustomFieldActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetLineItemCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetLineItemCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }
}
