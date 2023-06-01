package com.commercetools.api.predicates.query.associate_role;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssociateRoleQueryBuilderDsl  {
    public AssociateRoleQueryBuilderDsl() {
    }

    public static AssociateRoleQueryBuilderDsl of() {
        return new AssociateRoleQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<AssociateRoleQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<AssociateRoleQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<AssociateRoleQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AssociateRoleQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            AssociateRoleQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<AssociateRoleQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            AssociateRoleQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<AssociateRoleQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<AssociateRoleQueryBuilderDsl> buyerAssignable() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("buyerAssignable")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AssociateRoleQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<AssociateRoleQueryBuilderDsl> permissions() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("permissions")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AssociateRoleQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            AssociateRoleQueryBuilderDsl::of);
    }
    
    
}
