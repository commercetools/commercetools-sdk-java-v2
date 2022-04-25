
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerResetPasswordImpl.class)
public interface CustomerResetPassword {

    @NotNull
    @JsonProperty("tokenValue")
    public String getTokenValue();

    @NotNull
    @JsonProperty("newPassword")
    public String getNewPassword();

    @JsonProperty("version")
    public Long getVersion();

    public void setTokenValue(final String tokenValue);

    public void setNewPassword(final String newPassword);

    public void setVersion(final Long version);

    public static CustomerResetPassword of() {
        return new CustomerResetPasswordImpl();
    }

    public static CustomerResetPassword of(final CustomerResetPassword template) {
        CustomerResetPasswordImpl instance = new CustomerResetPasswordImpl();
        instance.setTokenValue(template.getTokenValue());
        instance.setNewPassword(template.getNewPassword());
        instance.setVersion(template.getVersion());
        return instance;
    }

    public static CustomerResetPasswordBuilder builder() {
        return CustomerResetPasswordBuilder.of();
    }

    public static CustomerResetPasswordBuilder builder(final CustomerResetPassword template) {
        return CustomerResetPasswordBuilder.of(template);
    }

    default <T> T withCustomerResetPassword(Function<CustomerResetPassword, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerResetPassword> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerResetPassword>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerResetPassword>";
            }
        };
    }
}
