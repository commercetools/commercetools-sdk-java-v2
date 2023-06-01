package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitStoreAddedMessageQueryBuilderDsl  {
    public BusinessUnitStoreAddedMessageQueryBuilderDsl() {
    }

    public static BusinessUnitStoreAddedMessageQueryBuilderDsl of() {
        return new BusinessUnitStoreAddedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitStoreAddedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreAddedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<BusinessUnitStoreAddedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreAddedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<BusinessUnitStoreAddedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreAddedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<BusinessUnitStoreAddedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreAddedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitStoreAddedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            BusinessUnitStoreAddedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<BusinessUnitStoreAddedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            BusinessUnitStoreAddedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<BusinessUnitStoreAddedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreAddedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitStoreAddedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            BusinessUnitStoreAddedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<BusinessUnitStoreAddedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreAddedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitStoreAddedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreAddedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitStoreAddedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            BusinessUnitStoreAddedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<BusinessUnitStoreAddedMessageQueryBuilderDsl> store(
        Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("store"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            BusinessUnitStoreAddedMessageQueryBuilderDsl::of);
    }
    
    
}
