package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyPaymentUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyPaymentSetMethodInfoInterfaceActionImpl implements MyPaymentSetMethodInfoInterfaceAction {

    private String action;
    
    private String _interface;

    @JsonCreator
    MyPaymentSetMethodInfoInterfaceActionImpl(@JsonProperty("interface") final String _interface) {
        this._interface = _interface;
        this.action = "setMethodInfoInterface";
    }
    public MyPaymentSetMethodInfoInterfaceActionImpl() {
        this.action = "setMethodInfoInterface";
    }

    
    public String getAction(){
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
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyPaymentSetMethodInfoInterfaceActionImpl that = (MyPaymentSetMethodInfoInterfaceActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(_interface, that._interface)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(_interface)
            .toHashCode();
    }

}
