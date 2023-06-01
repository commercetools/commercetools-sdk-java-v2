package com.commercetools.api.predicates.query.state;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StateQueryBuilderDsl  {
    public StateQueryBuilderDsl() {
    }

    public static StateQueryBuilderDsl of() {
        return new StateQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StateQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, StateQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, StateQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<StateQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, StateQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<StateQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, StateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StateQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StateQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StateQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StateQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<StateQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, StateQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StateQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StateQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            StateQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StateQueryBuilderDsl> description(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("description"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            StateQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<StateQueryBuilderDsl> initial() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("initial")),
        p -> new CombinationQueryPredicate<>(p, StateQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<StateQueryBuilderDsl> builtIn() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("builtIn")),
        p -> new CombinationQueryPredicate<>(p, StateQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<StateQueryBuilderDsl> roles() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("roles")),
        p -> new CombinationQueryPredicate<>(p, StateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StateQueryBuilderDsl> transitions(
        Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("transitions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            StateQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StateQueryBuilderDsl> transitions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transitions")),
                p -> new CombinationQueryPredicate<>(p, StateQueryBuilderDsl::of));
    }
    
}
