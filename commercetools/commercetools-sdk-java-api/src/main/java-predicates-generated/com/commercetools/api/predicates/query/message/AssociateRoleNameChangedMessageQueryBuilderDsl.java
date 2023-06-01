package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssociateRoleNameChangedMessageQueryBuilderDsl  {
    public AssociateRoleNameChangedMessageQueryBuilderDsl() {
    }

    public static AssociateRoleNameChangedMessageQueryBuilderDsl of() {
        return new AssociateRoleNameChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleNameChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleNameChangedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<AssociateRoleNameChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleNameChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<AssociateRoleNameChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleNameChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<AssociateRoleNameChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleNameChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AssociateRoleNameChangedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            AssociateRoleNameChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<AssociateRoleNameChangedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            AssociateRoleNameChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<AssociateRoleNameChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleNameChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AssociateRoleNameChangedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            AssociateRoleNameChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<AssociateRoleNameChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleNameChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AssociateRoleNameChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleNameChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AssociateRoleNameChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            AssociateRoleNameChangedMessageQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<AssociateRoleNameChangedMessageQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleNameChangedMessageQueryBuilderDsl::of));
    }
    
}
