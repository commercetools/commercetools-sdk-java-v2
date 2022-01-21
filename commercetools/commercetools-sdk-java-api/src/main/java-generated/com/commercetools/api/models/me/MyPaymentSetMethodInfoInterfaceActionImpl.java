
package com.commercetools.api.models.me;

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
public class MyPaymentSetMethodInfoInterfaceActionImpl implements MyPaymentSetMethodInfoInterfaceAction, ModelBase {

    private String action;

    private String _interface;

    @JsonCreator
    MyPaymentSetMethodInfoInterfaceActionImpl(@JsonProperty("interface") final String _interface) {
        this._interface = _interface;
        this.action = SET_METHOD_INFO_INTERFACE;
    }

    public MyPaymentSetMethodInfoInterfaceActionImpl() {
        this.action = SET_METHOD_INFO_INTERFACE;
    }

    public String getAction() {
        return this.action;
    }

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

        MyPaymentSetMethodInfoInterfaceActionImpl that = (MyPaymentSetMethodInfoInterfaceActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(_interface, that._interface).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(_interface).toHashCode();
    }

}
