package com.commercetools.api.models.message;

import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.CustomerCreatedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerCreatedMessageImpl.class)
public interface CustomerCreatedMessage extends Message {

    
    @NotNull
    @Valid
    @JsonProperty("customer")
    public Customer getCustomer();

    public void setCustomer(final Customer customer);

    public static CustomerCreatedMessageImpl of(){
        return new CustomerCreatedMessageImpl();
    }
    

    public static CustomerCreatedMessageImpl of(final CustomerCreatedMessage template) {
        CustomerCreatedMessageImpl instance = new CustomerCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    default <T> T withCustomerCreatedMessage(Function<CustomerCreatedMessage, T> helper) {
        return helper.apply(this);
    }
}
