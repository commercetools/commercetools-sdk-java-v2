
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartSetShippingCustomFieldActionQueryBuilderDsl {
    public CartSetShippingCustomFieldActionQueryBuilderDsl() {
    }

    public static CartSetShippingCustomFieldActionQueryBuilderDsl of() {
        return new CartSetShippingCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetShippingCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetShippingCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetShippingCustomFieldActionQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, CartSetShippingCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetShippingCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CartSetShippingCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetShippingCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, CartSetShippingCustomFieldActionQueryBuilderDsl::of));
    }
}
