
package com.commercetools.api.predicates.query.state;

import com.commercetools.api.predicates.query.*;

public class StateSetRolesActionQueryBuilderDsl {
    public StateSetRolesActionQueryBuilderDsl() {
    }

    public static StateSetRolesActionQueryBuilderDsl of() {
        return new StateSetRolesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StateSetRolesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StateSetRolesActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<StateSetRolesActionQueryBuilderDsl> roles() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("roles")),
            p -> new CombinationQueryPredicate<>(p, StateSetRolesActionQueryBuilderDsl::of));
    }

}
