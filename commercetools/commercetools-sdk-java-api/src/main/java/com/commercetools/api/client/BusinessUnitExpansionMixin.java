
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.business_unit.BusinessUnitExpansionBuilderDsl;

public interface BusinessUnitExpansionMixin<T extends ExpandableRequest<T, BusinessUnitExpansionBuilderDsl>>
        extends ExpandableRequest<T, BusinessUnitExpansionBuilderDsl> {
    @Override
    default BusinessUnitExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.businessUnit();
    }

}
