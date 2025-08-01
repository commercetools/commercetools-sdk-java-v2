
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
 *  <p>This action generates the PaymentMethodInfoInterfaceSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetMethodInfoInterfaceActionImpl implements PaymentSetMethodInfoInterfaceAction, ModelBase {

    private String action;

    private String _interface;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentSetMethodInfoInterfaceActionImpl(@JsonProperty("interface") final String _interface) {
        this._interface = _interface;
        this.action = SET_METHOD_INFO_INTERFACE;
    }

    /**
     * create empty instance
     */
    public PaymentSetMethodInfoInterfaceActionImpl() {
        this.action = SET_METHOD_INFO_INTERFACE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. Once set, the <code>paymentInterface</code> of the <code>paymentMethodInfo</code> cannot be changed.</p>
     */

    public String getInterface() {
        return this._interface;
    }

    public void setInterface(final String _interface) {
        this._interface = _interface;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentSetMethodInfoInterfaceActionImpl that = (PaymentSetMethodInfoInterfaceActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(_interface, that._interface)
                .append(action, that.action)
                .append(_interface, that._interface)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(_interface).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("interface", _interface)
                .build();
    }

    @Override
    public PaymentSetMethodInfoInterfaceAction copyDeep() {
        return PaymentSetMethodInfoInterfaceAction.deepCopy(this);
    }
}
