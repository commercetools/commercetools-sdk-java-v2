
package com.commercetools.checkout.models.application;

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
 * SetPaymentReturnUrlUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetPaymentReturnUrlUpdateActionImpl implements SetPaymentReturnUrlUpdateAction, ModelBase {

    private String action;

    private String paymentReturnUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetPaymentReturnUrlUpdateActionImpl(@JsonProperty("paymentReturnUrl") final String paymentReturnUrl) {
        this.paymentReturnUrl = paymentReturnUrl;
        this.action = SET_PAYMENT_RETURN_URL;
    }

    /**
     * create empty instance
     */
    public SetPaymentReturnUrlUpdateActionImpl() {
        this.action = SET_PAYMENT_RETURN_URL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public String getPaymentReturnUrl() {
        return this.paymentReturnUrl;
    }

    public void setPaymentReturnUrl(final String paymentReturnUrl) {
        this.paymentReturnUrl = paymentReturnUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetPaymentReturnUrlUpdateActionImpl that = (SetPaymentReturnUrlUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(paymentReturnUrl, that.paymentReturnUrl)
                .append(action, that.action)
                .append(paymentReturnUrl, that.paymentReturnUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(paymentReturnUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("paymentReturnUrl", paymentReturnUrl)
                .build();
    }

    @Override
    public SetPaymentReturnUrlUpdateAction copyDeep() {
        return SetPaymentReturnUrlUpdateAction.deepCopy(this);
    }
}
