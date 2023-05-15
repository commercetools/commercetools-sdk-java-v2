
package com.commercetools.api.predicates.query.associate_role;

import com.commercetools.api.predicates.query.*;

public class AssociateRoleUpdateActionQueryBuilderDsl {
    public AssociateRoleUpdateActionQueryBuilderDsl() {
    }

    public static AssociateRoleUpdateActionQueryBuilderDsl of() {
        return new AssociateRoleUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleUpdateActionQueryBuilderDsl::of));
    }
}
