
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.customer.CustomerReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ClientLoggingImpl.class)
public interface ClientLogging {

    @JsonProperty("clientId")
    public String getClientId();

    @JsonProperty("externalUserId")
    public String getExternalUserId();

    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    public void setClientId(final String clientId);

    public void setExternalUserId(final String externalUserId);

    public void setCustomer(final CustomerReference customer);

    public void setAnonymousId(final String anonymousId);

    public static ClientLogging of() {
        return new ClientLoggingImpl();
    }

    public static ClientLogging of(final ClientLogging template) {
        ClientLoggingImpl instance = new ClientLoggingImpl();
        instance.setClientId(template.getClientId());
        instance.setExternalUserId(template.getExternalUserId());
        instance.setCustomer(template.getCustomer());
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    public static ClientLoggingBuilder builder() {
        return ClientLoggingBuilder.of();
    }

    public static ClientLoggingBuilder builder(final ClientLogging template) {
        return ClientLoggingBuilder.of(template);
    }

    default <T> T withClientLogging(Function<ClientLogging, T> helper) {
        return helper.apply(this);
    }
}
