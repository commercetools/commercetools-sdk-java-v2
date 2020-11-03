package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.CustomerEmailVerifiedMessageImpl;

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
@JsonDeserialize(as = CustomerEmailVerifiedMessageImpl.class)
public interface CustomerEmailVerifiedMessage extends Message {



    public static CustomerEmailVerifiedMessageImpl of(){
        return new CustomerEmailVerifiedMessageImpl();
    }
    

    public static CustomerEmailVerifiedMessageImpl of(final CustomerEmailVerifiedMessage template) {
        CustomerEmailVerifiedMessageImpl instance = new CustomerEmailVerifiedMessageImpl();
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
        return instance;
    }

    default <T> T withCustomerEmailVerifiedMessage(Function<CustomerEmailVerifiedMessage, T> helper) {
        return helper.apply(this);
    }
}
