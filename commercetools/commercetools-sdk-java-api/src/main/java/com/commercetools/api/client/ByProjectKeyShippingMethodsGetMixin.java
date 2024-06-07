
package com.commercetools.api.client;

import com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.shipping_method.ShippingMethodQueryBuilderDsl;

public interface ByProjectKeyShippingMethodsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyShippingMethodsGet, ShippingMethodPagedQueryResponse, ShippingMethodQueryBuilderDsl> {

    @Override
    default ShippingMethodQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.shippingMethod();
    }
}
