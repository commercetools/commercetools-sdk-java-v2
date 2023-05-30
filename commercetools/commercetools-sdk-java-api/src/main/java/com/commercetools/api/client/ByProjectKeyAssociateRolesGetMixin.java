
package com.commercetools.api.client;

import com.commercetools.api.models.associate_role.AssociateRolePagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl;

public interface ByProjectKeyAssociateRolesGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyAssociateRolesGet, AssociateRolePagedQueryResponse, AssociateRoleQueryBuilderDsl> {
    @Override
    default AssociateRoleQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.associateRole();
    }
}
