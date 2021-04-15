
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetCustomFieldActionImpl.class)
public interface MyCustomerSetCustomFieldAction extends MyCustomerUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static MyCustomerSetCustomFieldAction of() {
        return new MyCustomerSetCustomFieldActionImpl();
    }

    public static MyCustomerSetCustomFieldAction of(final MyCustomerSetCustomFieldAction template) {
        MyCustomerSetCustomFieldActionImpl instance = new MyCustomerSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static MyCustomerSetCustomFieldActionBuilder builder() {
        return MyCustomerSetCustomFieldActionBuilder.of();
    }

    public static MyCustomerSetCustomFieldActionBuilder builder(final MyCustomerSetCustomFieldAction template) {
        return MyCustomerSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withMyCustomerSetCustomFieldAction(Function<MyCustomerSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
