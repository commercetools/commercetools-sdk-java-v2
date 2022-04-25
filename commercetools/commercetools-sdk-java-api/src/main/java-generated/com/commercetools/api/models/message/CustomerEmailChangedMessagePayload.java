
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerEmailChangedMessagePayloadImpl.class)
public interface CustomerEmailChangedMessagePayload extends MessagePayload {

    String CUSTOMER_EMAIL_CHANGED = "CustomerEmailChanged";

    @NotNull
    @JsonProperty("email")
    public String getEmail();

    public void setEmail(final String email);

    public static CustomerEmailChangedMessagePayload of() {
        return new CustomerEmailChangedMessagePayloadImpl();
    }

    public static CustomerEmailChangedMessagePayload of(final CustomerEmailChangedMessagePayload template) {
        CustomerEmailChangedMessagePayloadImpl instance = new CustomerEmailChangedMessagePayloadImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    public static CustomerEmailChangedMessagePayloadBuilder builder() {
        return CustomerEmailChangedMessagePayloadBuilder.of();
    }

    public static CustomerEmailChangedMessagePayloadBuilder builder(final CustomerEmailChangedMessagePayload template) {
        return CustomerEmailChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomerEmailChangedMessagePayload(Function<CustomerEmailChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerEmailChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerEmailChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerEmailChangedMessagePayload>";
            }
        };
    }
}
