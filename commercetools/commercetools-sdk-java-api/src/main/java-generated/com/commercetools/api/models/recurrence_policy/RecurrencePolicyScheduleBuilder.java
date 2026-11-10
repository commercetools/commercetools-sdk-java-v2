
package com.commercetools.api.models.recurrence_policy;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurrencePolicyScheduleBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicyScheduleBuilder {

    public com.commercetools.api.models.recurrence_policy.DayOfMonthScheduleBuilder dayOfMonthBuilder() {
        return com.commercetools.api.models.recurrence_policy.DayOfMonthScheduleBuilder.of();
    }

    public com.commercetools.api.models.recurrence_policy.StandardScheduleBuilder standardBuilder() {
        return com.commercetools.api.models.recurrence_policy.StandardScheduleBuilder.of();
    }

    /**
     * factory method for an instance of RecurrencePolicyScheduleBuilder
     * @return builder
     */
    public static RecurrencePolicyScheduleBuilder of() {
        return new RecurrencePolicyScheduleBuilder();
    }

}
