
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PaymentSetStatusInterfaceCodeActionImpl implements PaymentSetStatusInterfaceCodeAction, ModelBase {

    private String action;

    private String interfaceCode;

    @JsonCreator
    PaymentSetStatusInterfaceCodeActionImpl(@JsonProperty("interfaceCode") final String interfaceCode) {
        this.interfaceCode = interfaceCode;
        this.action = SET_STATUS_INTERFACE_CODE;
    }

    public PaymentSetStatusInterfaceCodeActionImpl() {
        this.action = SET_STATUS_INTERFACE_CODE;
    }

    public String getAction() {
        return this.action;
    }

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

        return new EqualsBuilder().append(action, that.action).append(interfaceCode, that.interfaceCode).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(interfaceCode).toHashCode();
    }

}
