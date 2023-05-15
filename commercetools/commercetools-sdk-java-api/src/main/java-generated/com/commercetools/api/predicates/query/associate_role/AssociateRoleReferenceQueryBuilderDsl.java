
package com.commercetools.api.predicates.query.associate_role;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AssociateRoleReferenceQueryBuilderDsl {
    public AssociateRoleReferenceQueryBuilderDsl() {
    }

    public static AssociateRoleReferenceQueryBuilderDsl of() {
        return new AssociateRoleReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AssociateRoleReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssociateRoleReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl.of())),
            AssociateRoleReferenceQueryBuilderDsl::of);
    }

}
