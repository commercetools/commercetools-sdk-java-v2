
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Sets the display info pay button text of a PaymentIntegration.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDisplayInfoPayButtonTextUpdateActionImpl implements SetDisplayInfoPayButtonTextUpdateAction, ModelBase {

    private String action;

    private com.commercetools.checkout.models.common.LocalizedString payButtonText;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetDisplayInfoPayButtonTextUpdateActionImpl(
            @JsonProperty("payButtonText") final com.commercetools.checkout.models.common.LocalizedString payButtonText) {
        this.payButtonText = payButtonText;
        this.action = SET_DISPLAY_INFO_PAY_BUTTON_TEXT;
    }

    /**
     * create empty instance
     */
    public SetDisplayInfoPayButtonTextUpdateActionImpl() {
        this.action = SET_DISPLAY_INFO_PAY_BUTTON_TEXT;
    }

    /**
     *  <p>Type of update action to be performed on the PaymentIntegration.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.checkout.models.common.LocalizedString getPayButtonText() {
        return this.payButtonText;
    }

    public void setPayButtonText(final com.commercetools.checkout.models.common.LocalizedString payButtonText) {
        this.payButtonText = payButtonText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetDisplayInfoPayButtonTextUpdateActionImpl that = (SetDisplayInfoPayButtonTextUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(payButtonText, that.payButtonText)
                .append(action, that.action)
                .append(payButtonText, that.payButtonText)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(payButtonText).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("payButtonText", payButtonText)
                .build();
    }

    @Override
    public SetDisplayInfoPayButtonTextUpdateAction copyDeep() {
        return SetDisplayInfoPayButtonTextUpdateAction.deepCopy(this);
    }
}
