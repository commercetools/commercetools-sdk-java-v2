
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreImprintUrlSetMessageQueryBuilderDsl {
    public StoreImprintUrlSetMessageQueryBuilderDsl() {
    }

    public static StoreImprintUrlSetMessageQueryBuilderDsl of() {
        return new StoreImprintUrlSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreImprintUrlSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StoreImprintUrlSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StoreImprintUrlSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StoreImprintUrlSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreImprintUrlSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StoreImprintUrlSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreImprintUrlSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StoreImprintUrlSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreImprintUrlSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StoreImprintUrlSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreImprintUrlSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StoreImprintUrlSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreImprintUrlSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StoreImprintUrlSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreImprintUrlSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StoreImprintUrlSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreImprintUrlSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StoreImprintUrlSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreImprintUrlSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreImprintUrlSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreImprintUrlSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StoreImprintUrlSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StoreImprintUrlSetMessageQueryBuilderDsl> imprintUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("imprintUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreImprintUrlSetMessageQueryBuilderDsl::of));
    }

}
