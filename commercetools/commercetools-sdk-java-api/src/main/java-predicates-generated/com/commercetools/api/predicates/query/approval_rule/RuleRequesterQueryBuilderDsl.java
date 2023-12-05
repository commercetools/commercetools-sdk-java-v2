
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RuleRequesterQueryBuilderDsl {
    public RuleRequesterQueryBuilderDsl() {
    }

    public static RuleRequesterQueryBuilderDsl of() {
        return new RuleRequesterQueryBuilderDsl();
    }

    public CombinationQueryPredicate<RuleRequesterQueryBuilderDsl> associateRole(
            Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("associateRole"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl
                            .of())),
            RuleRequesterQueryBuilderDsl::of);
    }

}
