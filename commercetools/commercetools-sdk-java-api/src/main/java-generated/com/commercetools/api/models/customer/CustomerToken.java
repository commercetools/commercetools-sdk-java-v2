
package com.commercetools.api.models.customer;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerTokenImpl.class)
public interface CustomerToken {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    @NotNull
    @JsonProperty("customerId")
    public String getCustomerId();

    @NotNull
    @JsonProperty("expiresAt")
    public ZonedDateTime getExpiresAt();

    @NotNull
    @JsonProperty("value")
    public String getValue();

    public void setId(final String id);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setCustomerId(final String customerId);

    public void setExpiresAt(final ZonedDateTime expiresAt);

    public void setValue(final String value);

    public static CustomerToken of() {
        return new CustomerTokenImpl();
    }

    public static CustomerToken of(final CustomerToken template) {
        CustomerTokenImpl instance = new CustomerTokenImpl();
        instance.setId(template.getId());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCustomerId(template.getCustomerId());
        instance.setExpiresAt(template.getExpiresAt());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CustomerTokenBuilder builder() {
        return CustomerTokenBuilder.of();
    }

    public static CustomerTokenBuilder builder(final CustomerToken template) {
        return CustomerTokenBuilder.of(template);
    }

    default <T> T withCustomerToken(Function<CustomerToken, T> helper) {
        return helper.apply(this);
    }
}
