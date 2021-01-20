
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyCustomerSetCustomFieldActionImpl;
import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetCustomFieldActionImpl.class)
public interface MyCustomerSetCustomFieldAction extends MyCustomerUpdateAction {

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public JsonNode getValue();

    public void setName(final String name);

    public void setValue(final JsonNode value);

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
