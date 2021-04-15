
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetLastNameActionImpl.class)
public interface MyCustomerSetLastNameAction extends MyCustomerUpdateAction {

    String SET_LAST_NAME = "setLastName";

    @JsonProperty("lastName")
    public String getLastName();

    public void setLastName(final String lastName);

    public static MyCustomerSetLastNameAction of() {
        return new MyCustomerSetLastNameActionImpl();
    }

    public static MyCustomerSetLastNameAction of(final MyCustomerSetLastNameAction template) {
        MyCustomerSetLastNameActionImpl instance = new MyCustomerSetLastNameActionImpl();
        instance.setLastName(template.getLastName());
        return instance;
    }

    public static MyCustomerSetLastNameActionBuilder builder() {
        return MyCustomerSetLastNameActionBuilder.of();
    }

    public static MyCustomerSetLastNameActionBuilder builder(final MyCustomerSetLastNameAction template) {
        return MyCustomerSetLastNameActionBuilder.of(template);
    }

    default <T> T withMyCustomerSetLastNameAction(Function<MyCustomerSetLastNameAction, T> helper) {
        return helper.apply(this);
    }
}
