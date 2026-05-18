
package com.commercetools.api.models.recurring_order;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderScopeBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderScopeBuilder {

    public com.commercetools.api.models.recurring_order.AnyOrderBuilder anyOrderBuilder() {
        return com.commercetools.api.models.recurring_order.AnyOrderBuilder.of();
    }

    public com.commercetools.api.models.recurring_order.ApplicableRecurrencePoliciesBuilder applicableRecurrencePoliciesBuilder() {
        return com.commercetools.api.models.recurring_order.ApplicableRecurrencePoliciesBuilder.of();
    }

    public com.commercetools.api.models.recurring_order.NonRecurringOrdersOnlyBuilder nonRecurringOrdersOnlyBuilder() {
        return com.commercetools.api.models.recurring_order.NonRecurringOrdersOnlyBuilder.of();
    }

    public com.commercetools.api.models.recurring_order.RecurringOrdersOnlyBuilder recurringOrdersOnlyBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrdersOnlyBuilder.of();
    }

    /**
     * factory method for an instance of RecurringOrderScopeBuilder
     * @return builder
     */
    public static RecurringOrderScopeBuilder of() {
        return new RecurringOrderScopeBuilder();
    }

}
