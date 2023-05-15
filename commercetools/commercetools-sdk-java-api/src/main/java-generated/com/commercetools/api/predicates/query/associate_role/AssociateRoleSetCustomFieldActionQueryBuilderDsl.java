
package com.commercetools.api.predicates.query.associate_role;

import com.commercetools.api.predicates.query.*;

public class AssociateRoleSetCustomFieldActionQueryBuilderDsl {
    public AssociateRoleSetCustomFieldActionQueryBuilderDsl() {
    }

    public static AssociateRoleSetCustomFieldActionQueryBuilderDsl of() {
        return new AssociateRoleSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AssociateRoleSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AssociateRoleSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleSetCustomFieldActionQueryBuilderDsl::of));
    }
}
