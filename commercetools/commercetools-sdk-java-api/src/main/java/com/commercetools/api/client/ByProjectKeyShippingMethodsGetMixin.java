
package com.commercetools.api.client;

import com.commercetools.api.models.shipping_method.ShippingMethodPagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.shipping_method.ShippingMethodExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.shipping_method.ShippingMethodQueryBuilderDsl;

public interface ByProjectKeyShippingMethodsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyShippingMethodsGet, ShippingMethodPagedQueryResponse, ShippingMethodQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyShippingMethodsGet, ShippingMethodExpansionBuilderDsl> {

    @Override
    default ShippingMethodExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.shippingMethod();
    }

    @Override
    default ShippingMethodQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.shippingMethod();
    }
}
