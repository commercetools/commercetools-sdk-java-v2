
package com.commercetools.api.predicates.query.customer;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerAddStoreActionQueryBuilderDsl {
    public CustomerAddStoreActionQueryBuilderDsl() {
    }

    public static CustomerAddStoreActionQueryBuilderDsl of() {
        return new CustomerAddStoreActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerAddStoreActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddStoreActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerAddStoreActionQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            CustomerAddStoreActionQueryBuilderDsl::of);
    }

}
