
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.associate_role.AssociateRoleExpansionBuilderDsl;

public interface AssociateRoleExpansionMixin<T extends ExpandableRequest<T, AssociateRoleExpansionBuilderDsl>>
        extends ExpandableRequest<T, AssociateRoleExpansionBuilderDsl> {
    @Override
    default AssociateRoleExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.associateRole();
    }
}
