
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

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the TextLineItem with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the TextLineItem.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the TextLineItem.</p>
    */
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

    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetTextLineItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetTextLineItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListSetTextLineItemCustomTypeAction>";
            }
        };
    }
}
