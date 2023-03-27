
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

/**
 * PaymentSetInterfaceIdAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetInterfaceIdActionImpl implements PaymentSetInterfaceIdAction, ModelBase {

    private String action;

    private String interfaceId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentSetInterfaceIdActionImpl(@JsonProperty("interfaceId") final String interfaceId) {
        this.interfaceId = interfaceId;
        this.action = SET_INTERFACE_ID;
    }

    /**
     * create empty instance
     */
    public PaymentSetInterfaceIdActionImpl() {
        this.action = SET_INTERFACE_ID;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. Once set, the <code>interfaceId</code> cannot be changed.</p>
     */

    public String getInterfaceId() {
        return this.interfaceId;
    }

    public void setInterfaceId(final String interfaceId) {
        this.interfaceId = interfaceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentSetInterfaceIdActionImpl that = (PaymentSetInterfaceIdActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(interfaceId, that.interfaceId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(interfaceId).toHashCode();
    }

}
