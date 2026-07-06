
package com.commercetools.api.models.recurring_order;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderScopeDraftBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderScopeDraftBuilder {

    public com.commercetools.api.models.recurring_order.AnyOrderDraftBuilder anyOrderBuilder() {
        return com.commercetools.api.models.recurring_order.AnyOrderDraftBuilder.of();
    }

    public com.commercetools.api.models.recurring_order.ApplicableRecurrencePoliciesDraftBuilder applicableRecurrencePoliciesBuilder() {
        return com.commercetools.api.models.recurring_order.ApplicableRecurrencePoliciesDraftBuilder.of();
    }

    public com.commercetools.api.models.recurring_order.NonRecurringOrdersOnlyDraftBuilder nonRecurringOrdersOnlyBuilder() {
        return com.commercetools.api.models.recurring_order.NonRecurringOrdersOnlyDraftBuilder.of();
    }

    public com.commercetools.api.models.recurring_order.RecurringOrdersOnlyDraftBuilder recurringOrdersOnlyBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrdersOnlyDraftBuilder.of();
    }

    /**
     * factory method for an instance of RecurringOrderScopeDraftBuilder
     * @return builder
     */
    public static RecurringOrderScopeDraftBuilder of() {
        return new RecurringOrderScopeDraftBuilder();
    }

}
