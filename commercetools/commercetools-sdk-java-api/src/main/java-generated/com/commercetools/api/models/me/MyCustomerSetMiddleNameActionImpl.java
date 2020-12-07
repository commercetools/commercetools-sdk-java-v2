package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
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
public final class MyCustomerSetMiddleNameActionImpl implements MyCustomerSetMiddleNameAction {

    private String action;
    
    private String middleName;

    @JsonCreator
    MyCustomerSetMiddleNameActionImpl(@JsonProperty("middleName") final String middleName) {
        this.middleName = middleName;
        this.action = "setMiddleName";
    }
    public MyCustomerSetMiddleNameActionImpl() {
        this.action = "setMiddleName";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getMiddleName(){
        return this.middleName;
    }

    public void setMiddleName(final String middleName){
        this.middleName = middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyCustomerSetMiddleNameActionImpl that = (MyCustomerSetMiddleNameActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(middleName, that.middleName)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(middleName)
            .toHashCode();
    }

}
