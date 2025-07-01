
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Set MethodInfo Interface update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoInterfaceSetMessagePayloadImpl
        implements PaymentMethodInfoInterfaceSetMessagePayload, ModelBase {

    private String type;

    private String _interface;

    private String oldInterface;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodInfoInterfaceSetMessagePayloadImpl(@JsonProperty("interface") final String _interface,
            @JsonProperty("oldInterface") final String oldInterface) {
        this._interface = _interface;
        this.oldInterface = oldInterface;
        this.type = PAYMENT_METHOD_INFO_INTERFACE_SET;
    }

    /**
     * create empty instance
     */
    public PaymentMethodInfoInterfaceSetMessagePayloadImpl() {
        this.type = PAYMENT_METHOD_INFO_INTERFACE_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Payment interface of the Payment Method after the Set MethodInfo Interface update action.</p>
     */

    public String getInterface() {
        return this._interface;
    }

    /**
     *  <p>Payment interface of the Payment Method before the Set MethodInfo Interface update action.</p>
     */

    public String getOldInterface() {
        return this.oldInterface;
    }

    public void setInterface(final String _interface) {
        this._interface = _interface;
    }

    public void setOldInterface(final String oldInterface) {
        this.oldInterface = oldInterface;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodInfoInterfaceSetMessagePayloadImpl that = (PaymentMethodInfoInterfaceSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(_interface, that._interface)
                .append(oldInterface, that.oldInterface)
                .append(type, that.type)
                .append(_interface, that._interface)
                .append(oldInterface, that.oldInterface)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(_interface).append(oldInterface).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("interface", _interface)
                .append("oldInterface", oldInterface)
                .build();
    }

    @Override
    public PaymentMethodInfoInterfaceSetMessagePayload copyDeep() {
        return PaymentMethodInfoInterfaceSetMessagePayload.deepCopy(this);
    }
}
