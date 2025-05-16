
package com.commercetools.api.models.payment;

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
 *  <p>Produces the PaymentStatusInterfaceCodeSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetStatusInterfaceCodeActionImpl implements PaymentSetStatusInterfaceCodeAction, ModelBase {

    private String action;

    private String interfaceCode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentSetStatusInterfaceCodeActionImpl(@JsonProperty("interfaceCode") final String interfaceCode) {
        this.interfaceCode = interfaceCode;
        this.action = SET_STATUS_INTERFACE_CODE;
    }

    /**
     * create empty instance
     */
    public PaymentSetStatusInterfaceCodeActionImpl() {
        this.action = SET_STATUS_INTERFACE_CODE;
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

    public String getInterfaceCode() {
        return this.interfaceCode;
    }

    public void setInterfaceCode(final String interfaceCode) {
        this.interfaceCode = interfaceCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentSetStatusInterfaceCodeActionImpl that = (PaymentSetStatusInterfaceCodeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(interfaceCode, that.interfaceCode)
                .append(action, that.action)
                .append(interfaceCode, that.interfaceCode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(interfaceCode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("interfaceCode", interfaceCode)
                .build();
    }

    @Override
    public PaymentSetStatusInterfaceCodeAction copyDeep() {
        return PaymentSetStatusInterfaceCodeAction.deepCopy(this);
    }
}
