package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl  {
    public StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl() {
    }

    public static StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl of() {
        return new StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl> addedProductSelections(
        Function<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("addedProductSelections"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl.of())),
            StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl> addedProductSelections() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedProductSelections")),
                p -> new CombinationQueryPredicate<>(p, StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl> removedProductSelections(
        Function<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("removedProductSelections"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl.of())),
            StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl> removedProductSelections() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedProductSelections")),
                p -> new CombinationQueryPredicate<>(p, StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl> updatedProductSelections(
        Function<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("updatedProductSelections"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl.of())),
            StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl> updatedProductSelections() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("updatedProductSelections")),
                p -> new CombinationQueryPredicate<>(p, StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl::of));
    }
    
}
