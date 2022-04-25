
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerEmailVerifiedMessagePayloadImpl.class)
public interface CustomerEmailVerifiedMessagePayload extends MessagePayload {

    String CUSTOMER_EMAIL_VERIFIED = "CustomerEmailVerified";

    public static CustomerEmailVerifiedMessagePayload of() {
        return new CustomerEmailVerifiedMessagePayloadImpl();
    }

    public static CustomerEmailVerifiedMessagePayload of(final CustomerEmailVerifiedMessagePayload template) {
        CustomerEmailVerifiedMessagePayloadImpl instance = new CustomerEmailVerifiedMessagePayloadImpl();
        return instance;
    }

    public static CustomerEmailVerifiedMessagePayloadBuilder builder() {
        return CustomerEmailVerifiedMessagePayloadBuilder.of();
    }

    public static CustomerEmailVerifiedMessagePayloadBuilder builder(
            final CustomerEmailVerifiedMessagePayload template) {
        return CustomerEmailVerifiedMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomerEmailVerifiedMessagePayload(Function<CustomerEmailVerifiedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerEmailVerifiedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerEmailVerifiedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerEmailVerifiedMessagePayload>";
            }
        };
    }
}
