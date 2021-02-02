
package com.commercetools.api.models.me;

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
@JsonDeserialize(as = MyShoppingListSetTextLineItemCustomTypeActionImpl.class)
public interface MyShoppingListSetTextLineItemCustomTypeAction extends MyShoppingListUpdateAction {

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

    public static MyShoppingListSetTextLineItemCustomTypeAction of() {
        return new MyShoppingListSetTextLineItemCustomTypeActionImpl();
    }

    public static MyShoppingListSetTextLineItemCustomTypeAction of(
            final MyShoppingListSetTextLineItemCustomTypeAction template) {
        MyShoppingListSetTextLineItemCustomTypeActionImpl instance = new MyShoppingListSetTextLineItemCustomTypeActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static MyShoppingListSetTextLineItemCustomTypeActionBuilder builder() {
        return MyShoppingListSetTextLineItemCustomTypeActionBuilder.of();
    }

    public static MyShoppingListSetTextLineItemCustomTypeActionBuilder builder(
            final MyShoppingListSetTextLineItemCustomTypeAction template) {
        return MyShoppingListSetTextLineItemCustomTypeActionBuilder.of(template);
    }

    default <T> T withMyShoppingListSetTextLineItemCustomTypeAction(
            Function<MyShoppingListSetTextLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
