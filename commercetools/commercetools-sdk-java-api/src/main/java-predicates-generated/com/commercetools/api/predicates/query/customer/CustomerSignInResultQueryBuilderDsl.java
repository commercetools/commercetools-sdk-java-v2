
package com.commercetools.api.predicates.query.customer;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerSignInResultQueryBuilderDsl {
    public CustomerSignInResultQueryBuilderDsl() {
    }

    public static CustomerSignInResultQueryBuilderDsl of() {
        return new CustomerSignInResultQueryBuilderDsl();
    }

    public CombinationQueryPredicate<CustomerSignInResultQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customer"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.customer.CustomerQueryBuilderDsl.of())),
            CustomerSignInResultQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerSignInResultQueryBuilderDsl> cart(
            Function<com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("cart"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl.of())),
            CustomerSignInResultQueryBuilderDsl::of);
    }

}
