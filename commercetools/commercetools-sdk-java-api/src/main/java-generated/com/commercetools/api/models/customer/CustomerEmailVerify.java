
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerEmailVerifyImpl.class)
public interface CustomerEmailVerify {

    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("tokenValue")
    public String getTokenValue();

    public void setVersion(final Long version);

    public void setTokenValue(final String tokenValue);

    public static CustomerEmailVerify of() {
        return new CustomerEmailVerifyImpl();
    }

    public static CustomerEmailVerify of(final CustomerEmailVerify template) {
        CustomerEmailVerifyImpl instance = new CustomerEmailVerifyImpl();
        instance.setVersion(template.getVersion());
        instance.setTokenValue(template.getTokenValue());
        return instance;
    }

    public static CustomerEmailVerifyBuilder builder() {
        return CustomerEmailVerifyBuilder.of();
    }

    public static CustomerEmailVerifyBuilder builder(final CustomerEmailVerify template) {
        return CustomerEmailVerifyBuilder.of(template);
    }

    default <T> T withCustomerEmailVerify(Function<CustomerEmailVerify, T> helper) {
        return helper.apply(this);
    }
}
