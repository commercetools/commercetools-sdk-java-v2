package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartSetCustomerGroupActionQueryBuilderDsl  {
    public CartSetCustomerGroupActionQueryBuilderDsl() {
    }

    public static CartSetCustomerGroupActionQueryBuilderDsl of() {
        return new CartSetCustomerGroupActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetCustomerGroupActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartSetCustomerGroupActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartSetCustomerGroupActionQueryBuilderDsl> customerGroup(
        Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customerGroup"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl.of())),
            CartSetCustomerGroupActionQueryBuilderDsl::of);
    }
    
    
}
