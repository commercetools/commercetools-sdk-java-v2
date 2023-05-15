
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl {
    public BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("stores"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl> storeMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("storeMode")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl> oldStores(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("oldStores"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl> oldStores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldStores")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl> oldStoreMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldStoreMode")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl::of));
    }
}
