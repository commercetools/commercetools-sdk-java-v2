package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import java.time.LocalDate;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Setting the date of birth of the Customer produces the CustomerDateOfBirthSet Message.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCustomerSetDateOfBirthActionImpl implements MyCustomerSetDateOfBirthAction, ModelBase {

    
    private String action;
    
    
    private java.time.LocalDate dateOfBirth;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCustomerSetDateOfBirthActionImpl(@JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.action =  SET_DATE_OF_BIRTH;
    }
    /**
     * create empty instance
     */
    public MyCustomerSetDateOfBirthActionImpl() {
        this.action =  SET_DATE_OF_BIRTH;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */
    
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
