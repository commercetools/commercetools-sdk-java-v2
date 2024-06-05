
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.discount_code.DiscountCodeExpansionBuilderDsl;

public interface DiscountCodeExpansionMixin<T extends ExpandableRequest<T, DiscountCodeExpansionBuilderDsl>>
        extends ExpandableRequest<T, DiscountCodeExpansionBuilderDsl> {

    @Override
    default DiscountCodeExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.discountCode();
    }

}
