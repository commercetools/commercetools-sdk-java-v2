
package com.commercetools.api.predicates.query.customer;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerRemoveStoreActionQueryBuilderDsl {
    public CustomerRemoveStoreActionQueryBuilderDsl() {
    }

    public static CustomerRemoveStoreActionQueryBuilderDsl of() {
        return new CustomerRemoveStoreActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerRemoveStoreActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerRemoveStoreActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerRemoveStoreActionQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            CustomerRemoveStoreActionQueryBuilderDsl::of);
    }

}
