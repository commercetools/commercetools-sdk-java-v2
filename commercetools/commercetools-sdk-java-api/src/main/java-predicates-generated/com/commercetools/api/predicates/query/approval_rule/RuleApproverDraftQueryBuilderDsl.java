
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RuleApproverDraftQueryBuilderDsl {
    public RuleApproverDraftQueryBuilderDsl() {
    }

    public static RuleApproverDraftQueryBuilderDsl of() {
        return new RuleApproverDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<RuleApproverDraftQueryBuilderDsl> associateRole(
            Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("associateRole"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.associate_role.AssociateRoleResourceIdentifierQueryBuilderDsl
                            .of())),
            RuleApproverDraftQueryBuilderDsl::of);
    }

}
