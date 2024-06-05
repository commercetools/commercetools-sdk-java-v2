
package com.commercetools.api.client;

import com.commercetools.api.models.discount_code.DiscountCodePagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.discount_code.DiscountCodeQueryBuilderDsl;

public interface ByProjectKeyDiscountCodesGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyDiscountCodesGet, DiscountCodePagedQueryResponse, DiscountCodeQueryBuilderDsl> {

    @Override
    default DiscountCodeQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.discountCode();
    }
}
