package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StandalonePriceActiveChangedMessageQueryBuilderDsl  {
    public StandalonePriceActiveChangedMessageQueryBuilderDsl() {
    }

    public static StandalonePriceActiveChangedMessageQueryBuilderDsl of() {
        return new StandalonePriceActiveChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceActiveChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceActiveChangedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StandalonePriceActiveChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceActiveChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<StandalonePriceActiveChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceActiveChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<StandalonePriceActiveChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceActiveChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StandalonePriceActiveChangedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StandalonePriceActiveChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StandalonePriceActiveChangedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StandalonePriceActiveChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<StandalonePriceActiveChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceActiveChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StandalonePriceActiveChangedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StandalonePriceActiveChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<StandalonePriceActiveChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceActiveChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StandalonePriceActiveChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceActiveChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StandalonePriceActiveChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StandalonePriceActiveChangedMessageQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<StandalonePriceActiveChangedMessageQueryBuilderDsl> active() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("active")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceActiveChangedMessageQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<StandalonePriceActiveChangedMessageQueryBuilderDsl> oldActive() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldActive")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceActiveChangedMessageQueryBuilderDsl::of));
    }
    
}
