
package com.commercetools.api.client;

import com.commercetools.api.models.attribute_group.AttributeGroupPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.attribute_group.AttributeGroupQueryBuilderDsl;

public interface ByProjectKeyAttributeGroupsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyAttributeGroupsGet, AttributeGroupPagedQueryResponse, AttributeGroupQueryBuilderDsl> {

    @Override
    default AttributeGroupQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.attributeGroup();
    }
}
