
package com.commercetools.checkout.models.recurring_payment;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets or unsets the key of a RecurringPayment.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentSetKeyUpdateActionImpl implements RecurringPaymentSetKeyUpdateAction, ModelBase {

    private String action;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringPaymentSetKeyUpdateActionImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.action = SET_KEY;
    }

    /**
     * create empty instance
     */
    public RecurringPaymentSetKeyUpdateActionImpl() {
        this.action = SET_KEY;
    }

    /**
     *  <p>Type of update action to be performed on the RecurringPayment.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Key to set. If omitted, any existing value is removed.</p>
     */

    public String getKey() {
        return this.key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringPaymentSetKeyUpdateActionImpl that = (RecurringPaymentSetKeyUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(key, that.key)
                .append(action, that.action)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(key).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("key", key)
                .build();
    }

    @Override
    public RecurringPaymentSetKeyUpdateAction copyDeep() {
        return RecurringPaymentSetKeyUpdateAction.deepCopy(this);
    }
}
