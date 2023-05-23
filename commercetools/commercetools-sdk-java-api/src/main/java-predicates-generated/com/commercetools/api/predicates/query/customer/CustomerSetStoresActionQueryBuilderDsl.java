
package com.commercetools.api.predicates.query.customer;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerSetStoresActionQueryBuilderDsl {
    public CustomerSetStoresActionQueryBuilderDsl() {
    }

    public static CustomerSetStoresActionQueryBuilderDsl of() {
        return new CustomerSetStoresActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetStoresActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetStoresActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerSetStoresActionQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("stores"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            CustomerSetStoresActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomerSetStoresActionQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetStoresActionQueryBuilderDsl::of));
    }

}
