
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.customer_group.CustomerGroup;
import com.commercetools.api.models.customer_group.CustomerGroupDraft;
import com.commercetools.api.models.customer_group.CustomerGroupDraftBuilder;
import com.commercetools.api.models.customer_group.CustomerGroupUpdate;
import com.commercetools.api.models.customer_group.CustomerGroupUpdateAction;
import com.commercetools.api.models.customer_group.CustomerGroupUpdateActionBuilder;

public interface ByProjectKeyCustomerGroupsRequestBuilderMixin {
    public ByProjectKeyCustomerGroupsByIDRequestBuilder withId(String ID);

    public ByProjectKeyCustomerGroupsPost post(CustomerGroupDraft customerDraft);

    public default ByProjectKeyCustomerGroupsByIDPost update(Versioned<CustomerGroup> customerGroup,
            java.util.List<CustomerGroupUpdateAction> actions) {
        return withId(customerGroup.getId())
                .post(builder -> CustomerGroupUpdate.builder().version(customerGroup.getVersion()).actions(actions));
    }

    public default ByProjectKeyCustomerGroupsByIDPost update(Versioned<CustomerGroup> customerGroup,
            UnaryOperator<UpdateActionBuilder<CustomerGroupUpdateAction, CustomerGroupUpdateActionBuilder>> op) {
        return withId(customerGroup.getId()).post(builder -> CustomerGroupUpdate.builder()
                .version(customerGroup.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(CustomerGroupUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<CustomerGroupUpdateAction, CustomerGroupUpdateActionBuilder, ByProjectKeyCustomerGroupsByIDPost> update(
            Versioned<CustomerGroup> customerGroup) {
        return builder -> withId(customerGroup.getId()).post(b -> CustomerGroupUpdate.builder()
                .version(customerGroup.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(CustomerGroupUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyCustomerGroupsByIDDelete delete(Versioned<CustomerGroup> customerGroup) {
        return withId(customerGroup.getId()).delete().withVersion(customerGroup.getVersion());
    }

    public default ByProjectKeyCustomerGroupsPost create(CustomerGroupDraft customerGroupDraft) {
        return post(customerGroupDraft);
    }

    public default ByProjectKeyCustomerGroupsPost create(UnaryOperator<CustomerGroupDraftBuilder> op) {
        return post(op.apply(CustomerGroupDraftBuilder.of()).build());
    }
}
