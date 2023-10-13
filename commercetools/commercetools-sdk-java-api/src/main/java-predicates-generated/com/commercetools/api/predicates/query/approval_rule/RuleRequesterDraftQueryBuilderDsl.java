
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RuleRequesterDraftQueryBuilderDsl {
    public RuleRequesterDraftQueryBuilderDsl() {
    }

    public static RuleRequesterDraftQueryBuilderDsl of() {
        return new RuleRequesterDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<RuleRequesterDraftQueryBuilderDsl> associateRole(
            Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("associateRole"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.associate_role.AssociateRoleResourceIdentifierQueryBuilderDsl
                            .of())),
            RuleRequesterDraftQueryBuilderDsl::of);
    }

}
