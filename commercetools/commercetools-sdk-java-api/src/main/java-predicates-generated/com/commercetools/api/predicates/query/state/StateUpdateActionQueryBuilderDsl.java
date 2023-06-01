package com.commercetools.api.predicates.query.state;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StateUpdateActionQueryBuilderDsl  {
    public StateUpdateActionQueryBuilderDsl() {
    }

    public static StateUpdateActionQueryBuilderDsl of() {
        return new StateUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StateUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StateUpdateActionQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<StateUpdateActionQueryBuilderDsl> asAddRoles(
        Function<com.commercetools.api.predicates.query.state.StateAddRolesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateAddRolesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.state.StateAddRolesActionQueryBuilderDsl.of()),
            StateUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<StateUpdateActionQueryBuilderDsl> asChangeInitial(
        Function<com.commercetools.api.predicates.query.state.StateChangeInitialActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateChangeInitialActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.state.StateChangeInitialActionQueryBuilderDsl.of()),
            StateUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<StateUpdateActionQueryBuilderDsl> asChangeKey(
        Function<com.commercetools.api.predicates.query.state.StateChangeKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateChangeKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.state.StateChangeKeyActionQueryBuilderDsl.of()),
            StateUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<StateUpdateActionQueryBuilderDsl> asChangeType(
        Function<com.commercetools.api.predicates.query.state.StateChangeTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateChangeTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.state.StateChangeTypeActionQueryBuilderDsl.of()),
            StateUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<StateUpdateActionQueryBuilderDsl> asRemoveRoles(
        Function<com.commercetools.api.predicates.query.state.StateRemoveRolesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateRemoveRolesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.state.StateRemoveRolesActionQueryBuilderDsl.of()),
            StateUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<StateUpdateActionQueryBuilderDsl> asSetDescription(
        Function<com.commercetools.api.predicates.query.state.StateSetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateSetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.state.StateSetDescriptionActionQueryBuilderDsl.of()),
            StateUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<StateUpdateActionQueryBuilderDsl> asSetName(
        Function<com.commercetools.api.predicates.query.state.StateSetNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateSetNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.state.StateSetNameActionQueryBuilderDsl.of()),
            StateUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<StateUpdateActionQueryBuilderDsl> asSetRoles(
        Function<com.commercetools.api.predicates.query.state.StateSetRolesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateSetRolesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.state.StateSetRolesActionQueryBuilderDsl.of()),
            StateUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<StateUpdateActionQueryBuilderDsl> asSetTransitions(
        Function<com.commercetools.api.predicates.query.state.StateSetTransitionsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateSetTransitionsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.state.StateSetTransitionsActionQueryBuilderDsl.of()),
            StateUpdateActionQueryBuilderDsl::of);
    }
}
