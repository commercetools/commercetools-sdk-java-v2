
package com.commercetools.api.client;

import com.commercetools.api.models.attribute_group.AttributeGroupPagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.attribute_group.AttributeGroupExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.attribute_group.AttributeGroupQueryBuilderDsl;

public interface ByProjectKeyAttributeGroupsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyAttributeGroupsGet, AttributeGroupPagedQueryResponse, AttributeGroupQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyAttributeGroupsGet, AttributeGroupExpansionBuilderDsl> {

    @Override
    default AttributeGroupQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.attributeGroup();
    }

    @Override
    default AttributeGroupExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.attributeGroup();
    }
}
