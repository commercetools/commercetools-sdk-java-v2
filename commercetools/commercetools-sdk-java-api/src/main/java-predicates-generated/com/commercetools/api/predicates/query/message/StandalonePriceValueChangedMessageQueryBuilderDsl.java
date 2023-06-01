package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StandalonePriceValueChangedMessageQueryBuilderDsl  {
    public StandalonePriceValueChangedMessageQueryBuilderDsl() {
    }

    public static StandalonePriceValueChangedMessageQueryBuilderDsl of() {
        return new StandalonePriceValueChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceValueChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceValueChangedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StandalonePriceValueChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceValueChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<StandalonePriceValueChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceValueChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<StandalonePriceValueChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceValueChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StandalonePriceValueChangedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StandalonePriceValueChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StandalonePriceValueChangedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StandalonePriceValueChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<StandalonePriceValueChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceValueChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StandalonePriceValueChangedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StandalonePriceValueChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<StandalonePriceValueChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceValueChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StandalonePriceValueChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceValueChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StandalonePriceValueChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StandalonePriceValueChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StandalonePriceValueChangedMessageQueryBuilderDsl> value(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("value"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            StandalonePriceValueChangedMessageQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<StandalonePriceValueChangedMessageQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceValueChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StandalonePriceValueChangedMessageQueryBuilderDsl> oldValue(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("oldValue"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            StandalonePriceValueChangedMessageQueryBuilderDsl::of);
    }
    
    
}
