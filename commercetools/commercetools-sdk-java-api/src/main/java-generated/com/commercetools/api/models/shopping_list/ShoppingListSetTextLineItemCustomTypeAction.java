
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetTextLineItemCustomTypeActionImpl.class)
public interface ShoppingListSetTextLineItemCustomTypeAction extends ShoppingListUpdateAction {

    String SET_TEXT_LINE_ITEM_CUSTOM_TYPE = "setTextLineItemCustomType";

    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setTextLineItemId(final String textLineItemId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static ShoppingListSetTextLineItemCustomTypeAction of() {
        return new ShoppingListSetTextLineItemCustomTypeActionImpl();
    }

    public static ShoppingListSetTextLineItemCustomTypeAction of(
            final ShoppingListSetTextLineItemCustomTypeAction template) {
        ShoppingListSetTextLineItemCustomTypeActionImpl instance = new ShoppingListSetTextLineItemCustomTypeActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static ShoppingListSetTextLineItemCustomTypeActionBuilder builder() {
        return ShoppingListSetTextLineItemCustomTypeActionBuilder.of();
    }

    public static ShoppingListSetTextLineItemCustomTypeActionBuilder builder(
            final ShoppingListSetTextLineItemCustomTypeAction template) {
        return ShoppingListSetTextLineItemCustomTypeActionBuilder.of(template);
    }

    default <T> T withShoppingListSetTextLineItemCustomTypeAction(
            Function<ShoppingListSetTextLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
