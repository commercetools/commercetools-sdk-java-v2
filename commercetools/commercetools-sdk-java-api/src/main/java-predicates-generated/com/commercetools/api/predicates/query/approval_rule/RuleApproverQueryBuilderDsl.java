
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RuleApproverQueryBuilderDsl {
    public RuleApproverQueryBuilderDsl() {
    }

    public static RuleApproverQueryBuilderDsl of() {
        return new RuleApproverQueryBuilderDsl();
    }

    public CombinationQueryPredicate<RuleApproverQueryBuilderDsl> associateRole(
            Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("associateRole"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl
                            .of())),
            RuleApproverQueryBuilderDsl::of);
    }

}
