
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerChangePasswordImpl.class)
public interface MyCustomerChangePassword {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("currentPassword")
    public String getCurrentPassword();

    @NotNull
    @JsonProperty("newPassword")
    public String getNewPassword();

    public void setVersion(final Long version);

    public void setCurrentPassword(final String currentPassword);

    public void setNewPassword(final String newPassword);

    public static MyCustomerChangePassword of() {
        return new MyCustomerChangePasswordImpl();
    }

    public static MyCustomerChangePassword of(final MyCustomerChangePassword template) {
        MyCustomerChangePasswordImpl instance = new MyCustomerChangePasswordImpl();
        instance.setVersion(template.getVersion());
        instance.setCurrentPassword(template.getCurrentPassword());
        instance.setNewPassword(template.getNewPassword());
        return instance;
    }

    public static MyCustomerChangePasswordBuilder builder() {
        return MyCustomerChangePasswordBuilder.of();
    }

    public static MyCustomerChangePasswordBuilder builder(final MyCustomerChangePassword template) {
        return MyCustomerChangePasswordBuilder.of(template);
    }

    default <T> T withMyCustomerChangePassword(Function<MyCustomerChangePassword, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerChangePassword> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerChangePassword>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerChangePassword>";
            }
        };
    }
}
