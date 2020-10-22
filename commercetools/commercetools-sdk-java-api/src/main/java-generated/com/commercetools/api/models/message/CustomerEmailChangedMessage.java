package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.CustomerEmailChangedMessageImpl;

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
@JsonDeserialize(as = CustomerEmailChangedMessageImpl.class)
public interface CustomerEmailChangedMessage extends Message {

    
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    public void setEmail(final String email);

    public static CustomerEmailChangedMessageImpl of(){
        return new CustomerEmailChangedMessageImpl();
    }
    

    public static CustomerEmailChangedMessageImpl of(final CustomerEmailChangedMessage template) {
        CustomerEmailChangedMessageImpl instance = new CustomerEmailChangedMessageImpl();
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
        instance.setEmail(template.getEmail());
        return instance;
    }

    default <T extends Accessor<CustomerEmailChangedMessage>> T withCustomerEmailChangedMessage(Function<CustomerEmailChangedMessage, T> helper) {
        return helper.apply(this);
    }
}
