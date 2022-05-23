
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

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ShoppingListSetTextLineItemCustomTypeAction shoppingListSetTextLineItemCustomTypeAction = ShoppingListSetTextLineItemCustomTypeAction.builder()
           .textLineItemId("{textLineItemId}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetTextLineItemCustomTypeActionImpl.class)
public interface ShoppingListSetTextLineItemCustomTypeAction extends ShoppingListUpdateAction {

    String SET_TEXT_LINE_ITEM_CUSTOM_TYPE = "setTextLineItemCustomType";

    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    /**
     *  <p>Defines the Type that extends the TextLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the TextLineItem.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the TextLineItem.</p>
     */
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

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetTextLineItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetTextLineItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetTextLineItemCustomTypeAction>";
            }
        };
    }
}
