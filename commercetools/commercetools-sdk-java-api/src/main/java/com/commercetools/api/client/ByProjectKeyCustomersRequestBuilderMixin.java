
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerDraft;
import com.commercetools.api.models.customer.CustomerDraftBuilder;
import com.commercetools.api.models.customer.CustomerUpdate;
import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerUpdateActionBuilder;

public interface ByProjectKeyCustomersRequestBuilderMixin {
    public ByProjectKeyCustomersByIDRequestBuilder withId(String ID);

    public ByProjectKeyCustomersPost post(CustomerDraft customerDraft);

    public default ByProjectKeyCustomersByIDPost update(Versioned<Customer> customer,
            List<CustomerUpdateAction> actions) {
        return withId(customer.getId())
                .post(builder -> CustomerUpdate.builder().version(customer.getVersion()).actions(actions));
    }

    public default ByProjectKeyCustomersByIDPost update(Versioned<Customer> customer,
            UnaryOperator<UpdateActionBuilder<CustomerUpdateAction, CustomerUpdateActionBuilder>> op) {
        return withId(customer.getId()).post(builder -> CustomerUpdate.builder()
                .version(customer.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(CustomerUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<CustomerUpdateAction, CustomerUpdateActionBuilder, ByProjectKeyCustomersByIDPost> update(
            Versioned<Customer> customer) {
        return builder -> withId(customer.getId()).post(b -> CustomerUpdate.builder()
                .version(customer.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(CustomerUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyCustomersByIDDelete delete(Versioned<Customer> customer) {
        return withId(customer.getId()).delete().withVersion(customer.getVersion());
    }

    public default ByProjectKeyCustomersPost create(CustomerDraft customerDraft) {
        return post(customerDraft);
    }

    public default ByProjectKeyCustomersPost create(UnaryOperator<CustomerDraftBuilder> op) {
        return post(op.apply(CustomerDraftBuilder.of()).build());
    }
}
