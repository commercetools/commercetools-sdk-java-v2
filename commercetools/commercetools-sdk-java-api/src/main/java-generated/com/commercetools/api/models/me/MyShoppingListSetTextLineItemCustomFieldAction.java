
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyShoppingListSetTextLineItemCustomFieldActionImpl.class)
public interface MyShoppingListSetTextLineItemCustomFieldAction extends MyShoppingListUpdateAction {

    String SET_TEXT_LINE_ITEM_CUSTOM_FIELD = "setTextLineItemCustomField";

    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

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

    public void setTextLineItemId(final String textLineItemId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static MyShoppingListSetTextLineItemCustomFieldAction of() {
        return new MyShoppingListSetTextLineItemCustomFieldActionImpl();
    }

    public static MyShoppingListSetTextLineItemCustomFieldAction of(
            final MyShoppingListSetTextLineItemCustomFieldAction template) {
        MyShoppingListSetTextLineItemCustomFieldActionImpl instance = new MyShoppingListSetTextLineItemCustomFieldActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static MyShoppingListSetTextLineItemCustomFieldActionBuilder builder() {
        return MyShoppingListSetTextLineItemCustomFieldActionBuilder.of();
    }

    public static MyShoppingListSetTextLineItemCustomFieldActionBuilder builder(
            final MyShoppingListSetTextLineItemCustomFieldAction template) {
        return MyShoppingListSetTextLineItemCustomFieldActionBuilder.of(template);
    }

    default <T> T withMyShoppingListSetTextLineItemCustomFieldAction(
            Function<MyShoppingListSetTextLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetTextLineItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetTextLineItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListSetTextLineItemCustomFieldAction>";
            }
        };
    }
}
