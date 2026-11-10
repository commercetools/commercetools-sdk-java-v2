
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl {
    public RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl() {
    }

    public static RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl of() {
        return new RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl> previousTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousTypeId")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl::of));
    }

}
