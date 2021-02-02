
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerChangePasswordImpl.class)
public interface CustomerChangePassword {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("currentPassword")
    public String getCurrentPassword();

    @NotNull
    @JsonProperty("newPassword")
    public String getNewPassword();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCurrentPassword(final String currentPassword);

    public void setNewPassword(final String newPassword);

    public static CustomerChangePassword of() {
        return new CustomerChangePasswordImpl();
    }

    public static CustomerChangePassword of(final CustomerChangePassword template) {
        CustomerChangePasswordImpl instance = new CustomerChangePasswordImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCurrentPassword(template.getCurrentPassword());
        instance.setNewPassword(template.getNewPassword());
        return instance;
    }

    public static CustomerChangePasswordBuilder builder() {
        return CustomerChangePasswordBuilder.of();
    }

    public static CustomerChangePasswordBuilder builder(final CustomerChangePassword template) {
        return CustomerChangePasswordBuilder.of(template);
    }

    default <T> T withCustomerChangePassword(Function<CustomerChangePassword, T> helper) {
        return helper.apply(this);
    }
}
