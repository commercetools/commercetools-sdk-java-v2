
package com.commercetools.api.models.recurring_order;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderStateDraftBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderStateDraftBuilder {

    public com.commercetools.api.models.recurring_order.RecurringOrderActiveBuilder activeBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderActiveBuilder.of();
    }

    public com.commercetools.api.models.recurring_order.RecurringOrderCanceledBuilder canceledBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderCanceledBuilder.of();
    }

    public com.commercetools.api.models.recurring_order.RecurringOrderExpiredBuilder expiredBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderExpiredBuilder.of();
    }

    public com.commercetools.api.models.recurring_order.RecurringOrderPausedBuilder pausedBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderPausedBuilder.of();
    }

    /**
     * factory method for an instance of RecurringOrderStateDraftBuilder
     * @return builder
     */
    public static RecurringOrderStateDraftBuilder of() {
        return new RecurringOrderStateDraftBuilder();
    }

}
