
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AssociateRoleCreatedMessageQueryBuilderDsl {
    public AssociateRoleCreatedMessageQueryBuilderDsl() {
    }

    public static AssociateRoleCreatedMessageQueryBuilderDsl of() {
        return new AssociateRoleCreatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleCreatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleCreatedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<AssociateRoleCreatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<AssociateRoleCreatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<AssociateRoleCreatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssociateRoleCreatedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            AssociateRoleCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AssociateRoleCreatedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            AssociateRoleCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<AssociateRoleCreatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssociateRoleCreatedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            AssociateRoleCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<AssociateRoleCreatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleCreatedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AssociateRoleCreatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssociateRoleCreatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            AssociateRoleCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AssociateRoleCreatedMessageQueryBuilderDsl> associateRole(
            Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("associateRole"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl.of())),
            AssociateRoleCreatedMessageQueryBuilderDsl::of);
    }

}
