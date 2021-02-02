
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyShoppingListSetCustomFieldActionImpl.class)
public interface MyShoppingListSetCustomFieldAction extends MyShoppingListUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static MyShoppingListSetCustomFieldAction of() {
        return new MyShoppingListSetCustomFieldActionImpl();
    }

    public static MyShoppingListSetCustomFieldAction of(final MyShoppingListSetCustomFieldAction template) {
        MyShoppingListSetCustomFieldActionImpl instance = new MyShoppingListSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static MyShoppingListSetCustomFieldActionBuilder builder() {
        return MyShoppingListSetCustomFieldActionBuilder.of();
    }

    public static MyShoppingListSetCustomFieldActionBuilder builder(final MyShoppingListSetCustomFieldAction template) {
        return MyShoppingListSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withMyShoppingListSetCustomFieldAction(Function<MyShoppingListSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
