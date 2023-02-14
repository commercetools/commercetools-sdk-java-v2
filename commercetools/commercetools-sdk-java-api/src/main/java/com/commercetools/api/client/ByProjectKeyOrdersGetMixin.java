package com.commercetools.api.client;

public interface ByProjectKeyOrdersGetMixin extends com.commercetools.api.models.PagedQueryResourceRequest<ByProjectKeyOrdersGet, com.commercetools.api.models.order.OrderPagedQueryResponse> {

    default ByProjectKeyOrdersGet byCustomerId(final String customerId) {
        return withWhere("customerId = :customerId", "customerId", customerId);
    }

    default ByProjectKeyOrdersGet byCustomerEmail(final String customerEmail) {
        return withWhere("customerEmail = :customerEmail", "customerEmail", customerEmail);
    }
}
