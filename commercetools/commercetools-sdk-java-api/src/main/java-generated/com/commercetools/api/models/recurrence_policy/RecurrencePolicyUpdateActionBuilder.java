
package com.commercetools.api.models.recurrence_policy;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurrencePolicyUpdateActionBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicyUpdateActionBuilder {

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicySetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.recurrence_policy.RecurrencePolicySetDescriptionActionBuilder.of();
    }

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicySetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.recurrence_policy.RecurrencePolicySetKeyActionBuilder.of();
    }

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicySetNameActionBuilder setNameBuilder() {
        return com.commercetools.api.models.recurrence_policy.RecurrencePolicySetNameActionBuilder.of();
    }

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicySetScheduleActionBuilder setScheduleBuilder() {
        return com.commercetools.api.models.recurrence_policy.RecurrencePolicySetScheduleActionBuilder.of();
    }

    /**
     * factory method for an instance of RecurrencePolicyUpdateActionBuilder
     * @return builder
     */
    public static RecurrencePolicyUpdateActionBuilder of() {
        return new RecurrencePolicyUpdateActionBuilder();
    }

}
