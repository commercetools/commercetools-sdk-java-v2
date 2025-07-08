
package com.commercetools.api.models.recurring_order;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderUpdateActionBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderUpdateActionBuilder {

    public com.commercetools.api.models.recurring_order.RecurringOrderSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderSetCustomFieldActionBuilder.of();
    }

    public com.commercetools.api.models.recurring_order.RecurringOrderSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderSetCustomTypeActionBuilder.of();
    }

    public com.commercetools.api.models.recurring_order.RecurringOrderSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderSetKeyActionBuilder.of();
    }

    public com.commercetools.api.models.recurring_order.RecurringOrderSetOrderSkipConfigurationActionBuilder setOrderSkipConfigurationBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderSetOrderSkipConfigurationActionBuilder.of();
    }

    public com.commercetools.api.models.recurring_order.RecurringOrderSetScheduleActionBuilder setScheduleBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderSetScheduleActionBuilder.of();
    }

    public com.commercetools.api.models.recurring_order.RecurringOrderSetStartsAtActionBuilder setStartsAtBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderSetStartsAtActionBuilder.of();
    }

    public com.commercetools.api.models.recurring_order.RecurringOrderSetStateActionBuilder setRecurringOrderStateBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderSetStateActionBuilder.of();
    }

    public com.commercetools.api.models.recurring_order.RecurringOrderTransitionStateActionBuilder transitionStateBuilder() {
        return com.commercetools.api.models.recurring_order.RecurringOrderTransitionStateActionBuilder.of();
    }

    /**
     * factory method for an instance of RecurringOrderUpdateActionBuilder
     * @return builder
     */
    public static RecurringOrderUpdateActionBuilder of() {
        return new RecurringOrderUpdateActionBuilder();
    }

}
