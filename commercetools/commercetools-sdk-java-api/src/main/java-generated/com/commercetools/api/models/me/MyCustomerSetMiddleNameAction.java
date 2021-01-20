
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyCustomerSetMiddleNameActionImpl;
import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetMiddleNameActionImpl.class)
public interface MyCustomerSetMiddleNameAction extends MyCustomerUpdateAction {

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
