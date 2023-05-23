
package com.commercetools.api.predicates.query.associate_role;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AssociateRoleUpdateQueryBuilderDsl {
    public AssociateRoleUpdateQueryBuilderDsl() {
    }

    public static AssociateRoleUpdateQueryBuilderDsl of() {
        return new AssociateRoleUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<AssociateRoleUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssociateRoleUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.associate_role.AssociateRoleUpdateActionQueryBuilderDsl
                            .of())),
            AssociateRoleUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<AssociateRoleUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleUpdateQueryBuilderDsl::of));
    }

}
