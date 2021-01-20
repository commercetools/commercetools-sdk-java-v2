
package com.commercetools.api.models.message;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayloadImpl;
import com.commercetools.api.models.message.MessagePayload;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerEmailVerifiedMessagePayloadImpl.class)
public interface CustomerEmailVerifiedMessagePayload extends MessagePayload {

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
}
