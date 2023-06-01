package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl  {
    public AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl() {
    }

    public static AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl of() {
        return new AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl> buyerAssignable() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("buyerAssignable")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl::of));
    }
    
}
