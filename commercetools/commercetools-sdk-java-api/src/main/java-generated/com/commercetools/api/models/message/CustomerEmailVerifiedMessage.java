
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerEmailVerifiedMessageImpl.class)
public interface CustomerEmailVerifiedMessage extends Message {

    String CUSTOMER_EMAIL_VERIFIED = "CustomerEmailVerified";

    public static CustomerEmailVerifiedMessage of() {
        return new CustomerEmailVerifiedMessageImpl();
    }

    public static CustomerEmailVerifiedMessage of(final CustomerEmailVerifiedMessage template) {
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

    public static CustomerEmailVerifiedMessageBuilder builder() {
        return CustomerEmailVerifiedMessageBuilder.of();
    }

    public static CustomerEmailVerifiedMessageBuilder builder(final CustomerEmailVerifiedMessage template) {
        return CustomerEmailVerifiedMessageBuilder.of(template);
    }

    default <T> T withCustomerEmailVerifiedMessage(Function<CustomerEmailVerifiedMessage, T> helper) {
        return helper.apply(this);
    }
}
