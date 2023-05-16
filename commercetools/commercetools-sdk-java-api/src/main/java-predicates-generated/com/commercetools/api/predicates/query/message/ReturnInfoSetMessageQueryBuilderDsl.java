
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReturnInfoSetMessageQueryBuilderDsl {
    public ReturnInfoSetMessageQueryBuilderDsl() {
    }

    public static ReturnInfoSetMessageQueryBuilderDsl of() {
        return new ReturnInfoSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReturnInfoSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ReturnInfoSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ReturnInfoSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ReturnInfoSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ReturnInfoSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ReturnInfoSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ReturnInfoSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ReturnInfoSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReturnInfoSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ReturnInfoSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReturnInfoSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ReturnInfoSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ReturnInfoSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ReturnInfoSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReturnInfoSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ReturnInfoSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ReturnInfoSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ReturnInfoSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ReturnInfoSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ReturnInfoSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReturnInfoSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ReturnInfoSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ReturnInfoSetMessageQueryBuilderDsl> returnInfo(
            Function<com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("returnInfo"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl.of())),
            ReturnInfoSetMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ReturnInfoSetMessageQueryBuilderDsl> returnInfo() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnInfo")),
            p -> new CombinationQueryPredicate<>(p, ReturnInfoSetMessageQueryBuilderDsl::of));
    }

}
