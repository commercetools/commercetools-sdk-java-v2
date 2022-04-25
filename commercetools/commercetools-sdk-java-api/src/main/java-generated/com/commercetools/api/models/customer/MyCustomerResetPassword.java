
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerResetPasswordImpl.class)
public interface MyCustomerResetPassword {

    @NotNull
    @JsonProperty("tokenValue")
    public String getTokenValue();

    @NotNull
    @JsonProperty("newPassword")
    public String getNewPassword();

    public void setTokenValue(final String tokenValue);

    public void setNewPassword(final String newPassword);

    public static MyCustomerResetPassword of() {
        return new MyCustomerResetPasswordImpl();
    }

    public static MyCustomerResetPassword of(final MyCustomerResetPassword template) {
        MyCustomerResetPasswordImpl instance = new MyCustomerResetPasswordImpl();
        instance.setTokenValue(template.getTokenValue());
        instance.setNewPassword(template.getNewPassword());
        return instance;
    }

    public static MyCustomerResetPasswordBuilder builder() {
        return MyCustomerResetPasswordBuilder.of();
    }

    public static MyCustomerResetPasswordBuilder builder(final MyCustomerResetPassword template) {
        return MyCustomerResetPasswordBuilder.of(template);
    }

    default <T> T withMyCustomerResetPassword(Function<MyCustomerResetPassword, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerResetPassword> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerResetPassword>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerResetPassword>";
            }
        };
    }
}
