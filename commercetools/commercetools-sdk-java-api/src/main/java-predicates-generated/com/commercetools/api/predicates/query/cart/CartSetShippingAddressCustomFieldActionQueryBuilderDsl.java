
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartSetShippingAddressCustomFieldActionQueryBuilderDsl {
    public CartSetShippingAddressCustomFieldActionQueryBuilderDsl() {
    }

    public static CartSetShippingAddressCustomFieldActionQueryBuilderDsl of() {
        return new CartSetShippingAddressCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetShippingAddressCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetShippingAddressCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetShippingAddressCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CartSetShippingAddressCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetShippingAddressCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, CartSetShippingAddressCustomFieldActionQueryBuilderDsl::of));
    }

}
