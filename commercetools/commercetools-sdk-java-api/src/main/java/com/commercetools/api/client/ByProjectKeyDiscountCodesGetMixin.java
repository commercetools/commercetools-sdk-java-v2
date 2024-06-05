
package com.commercetools.api.client;

import com.commercetools.api.models.discount_code.DiscountCodePagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.discount_code.DiscountCodeExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.discount_code.DiscountCodeQueryBuilderDsl;

public interface ByProjectKeyDiscountCodesGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyDiscountCodesGet, DiscountCodePagedQueryResponse, DiscountCodeQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyDiscountCodesGet, DiscountCodeExpansionBuilderDsl> {

    @Override
    default DiscountCodeExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.discountCode();
    }

    @Override
    default DiscountCodeQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.discountCode();
    }
}
