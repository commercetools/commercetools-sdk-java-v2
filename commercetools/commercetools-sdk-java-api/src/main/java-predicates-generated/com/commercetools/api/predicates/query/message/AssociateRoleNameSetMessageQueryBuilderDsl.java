
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AssociateRoleNameSetMessageQueryBuilderDsl {
    public AssociateRoleNameSetMessageQueryBuilderDsl() {
    }

    public static AssociateRoleNameSetMessageQueryBuilderDsl of() {
        return new AssociateRoleNameSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleNameSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleNameSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<AssociateRoleNameSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleNameSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<AssociateRoleNameSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleNameSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<AssociateRoleNameSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleNameSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssociateRoleNameSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            AssociateRoleNameSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AssociateRoleNameSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            AssociateRoleNameSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<AssociateRoleNameSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleNameSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssociateRoleNameSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            AssociateRoleNameSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<AssociateRoleNameSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleNameSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AssociateRoleNameSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleNameSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssociateRoleNameSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            AssociateRoleNameSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<AssociateRoleNameSetMessageQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleNameSetMessageQueryBuilderDsl::of));
    }

}
