
package com.commercetools.api.predicates.query.associate_role;

import com.commercetools.api.predicates.query.*;

public class AssociateRoleSetNameActionQueryBuilderDsl {
    public AssociateRoleSetNameActionQueryBuilderDsl() {
    }

    public static AssociateRoleSetNameActionQueryBuilderDsl of() {
        return new AssociateRoleSetNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleSetNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleSetNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AssociateRoleSetNameActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleSetNameActionQueryBuilderDsl::of));
    }
}
