
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerDraft;
import com.commercetools.api.models.customer.CustomerUpdate;
import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerUpdateActionBuilder;

public interface ByProjectKeyInStoreKeyByStoreKeyCustomersRequestMixin {
    ByProjectKeyInStoreKeyByStoreKeyCustomersPost post(CustomerDraft customerDraft);

    ByProjectKeyInStoreKeyByStoreKeyCustomersByIDRequestBuilder withId(String ID);

    public default ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost update(Versioned<Customer> customer,
            List<CustomerUpdateAction> actions) {
        return withId(customer.getId())
                .post(builder -> CustomerUpdate.builder().version(customer.getVersion()).actions(actions));
    }

    public default ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost update(Versioned<Customer> customer,
            UnaryOperator<UpdateActionBuilder<CustomerUpdateAction, CustomerUpdateActionBuilder>> op) {
        return withId(customer.getId()).post(builder -> CustomerUpdate.builder()
                .version(customer.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(CustomerUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<CustomerUpdateAction, CustomerUpdateActionBuilder, ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost> update(
            Versioned<Customer> customer) {
        return builder -> withId(customer.getId()).post(b -> CustomerUpdate.builder()
                .version(customer.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(CustomerUpdateActionBuilder::of)).actions));
    }
}
