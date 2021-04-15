
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerChangeEmailActionImpl.class)
public interface MyCustomerChangeEmailAction extends MyCustomerUpdateAction {

    String CHANGE_EMAIL = "changeEmail";

    @NotNull
    @JsonProperty("email")
    public String getEmail();

    public void setEmail(final String email);

    public static MyCustomerChangeEmailAction of() {
        return new MyCustomerChangeEmailActionImpl();
    }

    public static MyCustomerChangeEmailAction of(final MyCustomerChangeEmailAction template) {
        MyCustomerChangeEmailActionImpl instance = new MyCustomerChangeEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    public static MyCustomerChangeEmailActionBuilder builder() {
        return MyCustomerChangeEmailActionBuilder.of();
    }

    public static MyCustomerChangeEmailActionBuilder builder(final MyCustomerChangeEmailAction template) {
        return MyCustomerChangeEmailActionBuilder.of(template);
    }

    default <T> T withMyCustomerChangeEmailAction(Function<MyCustomerChangeEmailAction, T> helper) {
        return helper.apply(this);
    }
}
