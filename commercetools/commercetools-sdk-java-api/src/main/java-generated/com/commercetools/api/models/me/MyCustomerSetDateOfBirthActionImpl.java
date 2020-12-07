package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import java.time.LocalDate;
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
public final class MyCustomerSetDateOfBirthActionImpl implements MyCustomerSetDateOfBirthAction {

    private String action;
    
    private java.time.LocalDate dateOfBirth;

    @JsonCreator
    MyCustomerSetDateOfBirthActionImpl(@JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.action = "setDateOfBirth";
    }
    public MyCustomerSetDateOfBirthActionImpl() {
        this.action = "setDateOfBirth";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public java.time.LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(final java.time.LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyCustomerSetDateOfBirthActionImpl that = (MyCustomerSetDateOfBirthActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(dateOfBirth, that.dateOfBirth)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(dateOfBirth)
            .toHashCode();
    }

}
