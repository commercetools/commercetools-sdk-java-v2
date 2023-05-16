
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AssociateRolePermissionsSetMessageQueryBuilderDsl {
    public AssociateRolePermissionsSetMessageQueryBuilderDsl() {
    }

    public static AssociateRolePermissionsSetMessageQueryBuilderDsl of() {
        return new AssociateRolePermissionsSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRolePermissionsSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, AssociateRolePermissionsSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<AssociateRolePermissionsSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, AssociateRolePermissionsSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<AssociateRolePermissionsSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, AssociateRolePermissionsSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<AssociateRolePermissionsSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, AssociateRolePermissionsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssociateRolePermissionsSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            AssociateRolePermissionsSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AssociateRolePermissionsSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            AssociateRolePermissionsSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<AssociateRolePermissionsSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, AssociateRolePermissionsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssociateRolePermissionsSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            AssociateRolePermissionsSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<AssociateRolePermissionsSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, AssociateRolePermissionsSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AssociateRolePermissionsSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AssociateRolePermissionsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssociateRolePermissionsSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            AssociateRolePermissionsSetMessageQueryBuilderDsl::of);
    }

    public StringCollectionPredicateBuilder<AssociateRolePermissionsSetMessageQueryBuilderDsl> permissions() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("permissions")),
            p -> new CombinationQueryPredicate<>(p, AssociateRolePermissionsSetMessageQueryBuilderDsl::of));
    }

}
