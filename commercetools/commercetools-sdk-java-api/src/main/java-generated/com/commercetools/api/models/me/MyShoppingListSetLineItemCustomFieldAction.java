
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyShoppingListSetLineItemCustomFieldActionImpl;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyShoppingListSetLineItemCustomFieldActionImpl.class)
public interface MyShoppingListSetLineItemCustomFieldAction extends MyShoppingListUpdateAction {

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public JsonNode getValue();

    public void setLineItemId(final String lineItemId);

    public void setName(final String name);

    public void setValue(final JsonNode value);

    public static MyShoppingListSetLineItemCustomFieldAction of() {
        return new MyShoppingListSetLineItemCustomFieldActionImpl();
    }

    public static MyShoppingListSetLineItemCustomFieldAction of(
            final MyShoppingListSetLineItemCustomFieldAction template) {
        MyShoppingListSetLineItemCustomFieldActionImpl instance = new MyShoppingListSetLineItemCustomFieldActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static MyShoppingListSetLineItemCustomFieldActionBuilder builder() {
        return MyShoppingListSetLineItemCustomFieldActionBuilder.of();
    }

    public static MyShoppingListSetLineItemCustomFieldActionBuilder builder(
            final MyShoppingListSetLineItemCustomFieldAction template) {
        return MyShoppingListSetLineItemCustomFieldActionBuilder.of(template);
    }

    default <T> T withMyShoppingListSetLineItemCustomFieldAction(
            Function<MyShoppingListSetLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
