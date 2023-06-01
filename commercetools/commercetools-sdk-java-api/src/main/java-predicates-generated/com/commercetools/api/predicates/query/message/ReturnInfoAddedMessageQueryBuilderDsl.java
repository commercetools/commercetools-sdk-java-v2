package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ReturnInfoAddedMessageQueryBuilderDsl  {
    public ReturnInfoAddedMessageQueryBuilderDsl() {
    }

    public static ReturnInfoAddedMessageQueryBuilderDsl of() {
        return new ReturnInfoAddedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReturnInfoAddedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ReturnInfoAddedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ReturnInfoAddedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ReturnInfoAddedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ReturnInfoAddedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, ReturnInfoAddedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ReturnInfoAddedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, ReturnInfoAddedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ReturnInfoAddedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ReturnInfoAddedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ReturnInfoAddedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ReturnInfoAddedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ReturnInfoAddedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, ReturnInfoAddedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ReturnInfoAddedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ReturnInfoAddedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ReturnInfoAddedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, ReturnInfoAddedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ReturnInfoAddedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ReturnInfoAddedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ReturnInfoAddedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ReturnInfoAddedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ReturnInfoAddedMessageQueryBuilderDsl> returnInfo(
        Function<com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("returnInfo"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl.of())),
            ReturnInfoAddedMessageQueryBuilderDsl::of);
    }
    
    
}
