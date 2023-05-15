
package com.commercetools.api.predicates.query.state;

import com.commercetools.api.predicates.query.*;

public class StateAddRolesActionQueryBuilderDsl {
    public StateAddRolesActionQueryBuilderDsl() {
    }

    public static StateAddRolesActionQueryBuilderDsl of() {
        return new StateAddRolesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StateAddRolesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StateAddRolesActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<StateAddRolesActionQueryBuilderDsl> roles() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("roles")),
            p -> new CombinationQueryPredicate<>(p, StateAddRolesActionQueryBuilderDsl::of));
    }
}
