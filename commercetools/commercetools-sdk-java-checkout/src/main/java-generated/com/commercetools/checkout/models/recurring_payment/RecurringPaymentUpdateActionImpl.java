
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
 *  <p>Base type for all RecurringPayment update actions.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentUpdateActionImpl implements RecurringPaymentUpdateAction, ModelBase {

    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringPaymentUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }

    /**
     * create empty instance
     */
    public RecurringPaymentUpdateActionImpl() {
    }

    /**
     *  <p>Type of update action to be performed on the RecurringPayment.</p>
     */

    public String getAction() {
        return this.action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringPaymentUpdateActionImpl that = (RecurringPaymentUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(action, that.action).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action).build();
    }

    @Override
    public RecurringPaymentUpdateAction copyDeep() {
        return RecurringPaymentUpdateAction.deepCopy(this);
    }
}
