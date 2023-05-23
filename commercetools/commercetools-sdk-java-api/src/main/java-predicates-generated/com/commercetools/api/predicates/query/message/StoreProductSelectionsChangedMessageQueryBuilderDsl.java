
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreProductSelectionsChangedMessageQueryBuilderDsl {
    public StoreProductSelectionsChangedMessageQueryBuilderDsl() {
    }

    public static StoreProductSelectionsChangedMessageQueryBuilderDsl of() {
        return new StoreProductSelectionsChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreProductSelectionsChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StoreProductSelectionsChangedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StoreProductSelectionsChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StoreProductSelectionsChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreProductSelectionsChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StoreProductSelectionsChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreProductSelectionsChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StoreProductSelectionsChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreProductSelectionsChangedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StoreProductSelectionsChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreProductSelectionsChangedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StoreProductSelectionsChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreProductSelectionsChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StoreProductSelectionsChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreProductSelectionsChangedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StoreProductSelectionsChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreProductSelectionsChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StoreProductSelectionsChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreProductSelectionsChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreProductSelectionsChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreProductSelectionsChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StoreProductSelectionsChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreProductSelectionsChangedMessageQueryBuilderDsl> addedProductSelections(
            Function<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("addedProductSelections"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl.of())),
            StoreProductSelectionsChangedMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreProductSelectionsChangedMessageQueryBuilderDsl> addedProductSelections() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedProductSelections")),
            p -> new CombinationQueryPredicate<>(p, StoreProductSelectionsChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreProductSelectionsChangedMessageQueryBuilderDsl> removedProductSelections(
            Function<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("removedProductSelections"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl.of())),
            StoreProductSelectionsChangedMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreProductSelectionsChangedMessageQueryBuilderDsl> removedProductSelections() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedProductSelections")),
            p -> new CombinationQueryPredicate<>(p, StoreProductSelectionsChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreProductSelectionsChangedMessageQueryBuilderDsl> updatedProductSelections(
            Function<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("updatedProductSelections"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl.of())),
            StoreProductSelectionsChangedMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreProductSelectionsChangedMessageQueryBuilderDsl> updatedProductSelections() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("updatedProductSelections")),
            p -> new CombinationQueryPredicate<>(p, StoreProductSelectionsChangedMessageQueryBuilderDsl::of));
    }

}
