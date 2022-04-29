
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

    /**
    *  <p>Name of the <a href="/../api/projects/custom-fields">Custom Field</a>.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists.
    *  Trying to remove a field that does not exist will fail with an <a href="/../api/errors#general-400-invalid-operation">InvalidOperation</a> error.
    *  If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
    */

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

    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListSetCustomFieldAction>";
            }
        };
    }
}
