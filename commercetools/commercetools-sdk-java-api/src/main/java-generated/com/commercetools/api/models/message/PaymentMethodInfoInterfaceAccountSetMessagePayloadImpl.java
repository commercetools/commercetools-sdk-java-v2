
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
 *  <p>Generated after a successful Set MethodInfo InterfaceAccount update action on Payments and Set MethodInfo InterfaceAccount update action on My Payments.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoInterfaceAccountSetMessagePayloadImpl
        implements PaymentMethodInfoInterfaceAccountSetMessagePayload, ModelBase {

    private String type;

    private String interfaceAccount;

    private String oldInterfaceAccount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodInfoInterfaceAccountSetMessagePayloadImpl(
            @JsonProperty("interfaceAccount") final String interfaceAccount,
            @JsonProperty("oldInterfaceAccount") final String oldInterfaceAccount) {
        this.interfaceAccount = interfaceAccount;
        this.oldInterfaceAccount = oldInterfaceAccount;
        this.type = PAYMENT_METHOD_INFO_INTERFACE_ACCOUNT_SET;
    }

    /**
     * create empty instance
     */
    public PaymentMethodInfoInterfaceAccountSetMessagePayloadImpl() {
        this.type = PAYMENT_METHOD_INFO_INTERFACE_ACCOUNT_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Interface account of the Payment Method after the Set MethodInfo InterfaceAccount update action.</p>
     */

    public String getInterfaceAccount() {
        return this.interfaceAccount;
    }

    /**
     *  <p>Interface account of the Payment Method before the Set MethodInfo InterfaceAccount update action.</p>
     */

    public String getOldInterfaceAccount() {
        return this.oldInterfaceAccount;
    }

    public void setInterfaceAccount(final String interfaceAccount) {
        this.interfaceAccount = interfaceAccount;
    }

    public void setOldInterfaceAccount(final String oldInterfaceAccount) {
        this.oldInterfaceAccount = oldInterfaceAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodInfoInterfaceAccountSetMessagePayloadImpl that = (PaymentMethodInfoInterfaceAccountSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(interfaceAccount, that.interfaceAccount)
                .append(oldInterfaceAccount, that.oldInterfaceAccount)
                .append(type, that.type)
                .append(interfaceAccount, that.interfaceAccount)
                .append(oldInterfaceAccount, that.oldInterfaceAccount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(interfaceAccount)
                .append(oldInterfaceAccount)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("interfaceAccount", interfaceAccount)
                .append("oldInterfaceAccount", oldInterfaceAccount)
                .build();
    }

    @Override
    public PaymentMethodInfoInterfaceAccountSetMessagePayload copyDeep() {
        return PaymentMethodInfoInterfaceAccountSetMessagePayload.deepCopy(this);
    }
}
