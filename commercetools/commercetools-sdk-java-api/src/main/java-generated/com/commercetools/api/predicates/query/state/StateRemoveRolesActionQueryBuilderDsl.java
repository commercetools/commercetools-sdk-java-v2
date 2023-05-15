
package com.commercetools.api.predicates.query.state;

import com.commercetools.api.predicates.query.*;

public class StateRemoveRolesActionQueryBuilderDsl {
    public StateRemoveRolesActionQueryBuilderDsl() {
    }

    public static StateRemoveRolesActionQueryBuilderDsl of() {
        return new StateRemoveRolesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StateRemoveRolesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StateRemoveRolesActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<StateRemoveRolesActionQueryBuilderDsl> roles() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("roles")),
            p -> new CombinationQueryPredicate<>(p, StateRemoveRolesActionQueryBuilderDsl::of));
    }
}
