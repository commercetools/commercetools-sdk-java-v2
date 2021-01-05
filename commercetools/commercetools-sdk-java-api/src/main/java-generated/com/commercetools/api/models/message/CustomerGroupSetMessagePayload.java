package com.commercetools.api.models.message;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CustomerGroupSetMessagePayloadImpl;

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
@JsonDeserialize(as = CustomerGroupSetMessagePayloadImpl.class)
public interface CustomerGroupSetMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public static CustomerGroupSetMessagePayload of(){
        return new CustomerGroupSetMessagePayloadImpl();
    }
    

    public static CustomerGroupSetMessagePayload of(final CustomerGroupSetMessagePayload template) {
        CustomerGroupSetMessagePayloadImpl instance = new CustomerGroupSetMessagePayloadImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        return instance;
    }

    public static CustomerGroupSetMessagePayloadBuilder builder(){
        return CustomerGroupSetMessagePayloadBuilder.of();
    }
    
    public static CustomerGroupSetMessagePayloadBuilder builder(final CustomerGroupSetMessagePayload template){
        return CustomerGroupSetMessagePayloadBuilder.of(template);
    }
    

    default <T> T withCustomerGroupSetMessagePayload(Function<CustomerGroupSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
