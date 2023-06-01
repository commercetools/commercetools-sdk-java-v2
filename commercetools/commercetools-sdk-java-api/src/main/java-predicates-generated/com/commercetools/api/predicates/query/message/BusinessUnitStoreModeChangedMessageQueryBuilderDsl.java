package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitStoreModeChangedMessageQueryBuilderDsl  {
    public BusinessUnitStoreModeChangedMessageQueryBuilderDsl() {
    }

    public static BusinessUnitStoreModeChangedMessageQueryBuilderDsl of() {
        return new BusinessUnitStoreModeChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> stores(
        Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("stores"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
                p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> storeMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("storeMode")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> oldStores(
        Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("oldStores"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> oldStores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldStores")),
                p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitStoreModeChangedMessageQueryBuilderDsl> oldStoreMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldStoreMode")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreModeChangedMessageQueryBuilderDsl::of));
    }
    
}
