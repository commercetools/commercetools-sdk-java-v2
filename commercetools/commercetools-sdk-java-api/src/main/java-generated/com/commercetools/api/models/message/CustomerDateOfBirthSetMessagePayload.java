package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import java.time.LocalDate;
import com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayloadImpl;

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
@JsonDeserialize(as = CustomerDateOfBirthSetMessagePayloadImpl.class)
public interface CustomerDateOfBirthSetMessagePayload extends MessagePayload {

    
    @NotNull
    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    public void setDateOfBirth(final LocalDate dateOfBirth);

    public static CustomerDateOfBirthSetMessagePayload of(){
        return new CustomerDateOfBirthSetMessagePayloadImpl();
    }
    

    public static CustomerDateOfBirthSetMessagePayload of(final CustomerDateOfBirthSetMessagePayload template) {
        CustomerDateOfBirthSetMessagePayloadImpl instance = new CustomerDateOfBirthSetMessagePayloadImpl();
        instance.setDateOfBirth(template.getDateOfBirth());
        return instance;
    }

    public static CustomerDateOfBirthSetMessagePayloadBuilder builder(){
        return CustomerDateOfBirthSetMessagePayloadBuilder.of();
    }
    
    public static CustomerDateOfBirthSetMessagePayloadBuilder builder(final CustomerDateOfBirthSetMessagePayload template){
        return CustomerDateOfBirthSetMessagePayloadBuilder.of(template);
    }
    

    default <T> T withCustomerDateOfBirthSetMessagePayload(Function<CustomerDateOfBirthSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
