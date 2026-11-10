
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerStoresSetMessagePayloadQueryBuilderDsl {
    public CustomerStoresSetMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerStoresSetMessagePayloadQueryBuilderDsl of() {
        return new CustomerStoresSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerStoresSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerStoresSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerStoresSetMessagePayloadQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("stores"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            CustomerStoresSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomerStoresSetMessagePayloadQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, CustomerStoresSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerStoresSetMessagePayloadQueryBuilderDsl> oldStores(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("oldStores"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            CustomerStoresSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomerStoresSetMessagePayloadQueryBuilderDsl> oldStores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldStores")),
            p -> new CombinationQueryPredicate<>(p, CustomerStoresSetMessagePayloadQueryBuilderDsl::of));
    }

}
