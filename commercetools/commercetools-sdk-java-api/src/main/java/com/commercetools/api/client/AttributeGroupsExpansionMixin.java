
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.attribute_group.AttributeGroupExpansionBuilderDsl;

public interface AttributeGroupsExpansionMixin<T extends ExpandableRequest<T, AttributeGroupExpansionBuilderDsl>>
        extends ExpandableRequest<T, AttributeGroupExpansionBuilderDsl> {
    @Override
    default AttributeGroupExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.attributeGroup();
    }
}
