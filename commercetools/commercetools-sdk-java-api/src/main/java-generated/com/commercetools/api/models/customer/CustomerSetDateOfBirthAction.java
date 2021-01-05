package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import java.time.LocalDate;
import com.commercetools.api.models.customer.CustomerSetDateOfBirthActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerSetDateOfBirthActionImpl.class)
public interface CustomerSetDateOfBirthAction extends CustomerUpdateAction {

    /**
    *  <p>If not defined, the date of birth is unset.</p>
    */
    
    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    public void setDateOfBirth(final LocalDate dateOfBirth);

    public static CustomerSetDateOfBirthAction of(){
        return new CustomerSetDateOfBirthActionImpl();
    }
    

    public static CustomerSetDateOfBirthAction of(final CustomerSetDateOfBirthAction template) {
        CustomerSetDateOfBirthActionImpl instance = new CustomerSetDateOfBirthActionImpl();
        instance.setDateOfBirth(template.getDateOfBirth());
        return instance;
    }

    public static CustomerSetDateOfBirthActionBuilder builder(){
        return CustomerSetDateOfBirthActionBuilder.of();
    }
    
    public static CustomerSetDateOfBirthActionBuilder builder(final CustomerSetDateOfBirthAction template){
        return CustomerSetDateOfBirthActionBuilder.of(template);
    }
    

    default <T> T withCustomerSetDateOfBirthAction(Function<CustomerSetDateOfBirthAction, T> helper) {
        return helper.apply(this);
    }
}
