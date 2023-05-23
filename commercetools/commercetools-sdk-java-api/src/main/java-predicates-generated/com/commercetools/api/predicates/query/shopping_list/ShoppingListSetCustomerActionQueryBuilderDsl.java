
package com.commercetools.api.predicates.query.shopping_list;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListSetCustomerActionQueryBuilderDsl {
    public ShoppingListSetCustomerActionQueryBuilderDsl() {
    }

    public static ShoppingListSetCustomerActionQueryBuilderDsl of() {
        return new ShoppingListSetCustomerActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListSetCustomerActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListSetCustomerActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListSetCustomerActionQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customer"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of())),
            ShoppingListSetCustomerActionQueryBuilderDsl::of);
    }

}
