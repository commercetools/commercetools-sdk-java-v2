
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetMiddleNameActionImpl.class)
public interface MyCustomerSetMiddleNameAction extends MyCustomerUpdateAction {

    String SET_MIDDLE_NAME = "setMiddleName";

    @JsonProperty("middleName")
    public String getMiddleName();

    public void setMiddleName(final String middleName);

    public static MyCustomerSetMiddleNameAction of() {
        return new MyCustomerSetMiddleNameActionImpl();
    }

    public static MyCustomerSetMiddleNameAction of(final MyCustomerSetMiddleNameAction template) {
        MyCustomerSetMiddleNameActionImpl instance = new MyCustomerSetMiddleNameActionImpl();
        instance.setMiddleName(template.getMiddleName());
        return instance;
    }

    public static MyCustomerSetMiddleNameActionBuilder builder() {
        return MyCustomerSetMiddleNameActionBuilder.of();
    }

    public static MyCustomerSetMiddleNameActionBuilder builder(final MyCustomerSetMiddleNameAction template) {
        return MyCustomerSetMiddleNameActionBuilder.of(template);
    }

    default <T> T withMyCustomerSetMiddleNameAction(Function<MyCustomerSetMiddleNameAction, T> helper) {
        return helper.apply(this);
    }
}
