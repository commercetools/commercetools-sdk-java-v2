
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * ShoppingListSetTextLineItemCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetTextLineItemCustomTypeAction shoppingListSetTextLineItemCustomTypeAction = ShoppingListSetTextLineItemCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setTextLineItemCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetTextLineItemCustomTypeActionImpl.class)
public interface ShoppingListSetTextLineItemCustomTypeAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListSetTextLineItemCustomTypeAction
     */
    String SET_TEXT_LINE_ITEM_CUSTOM_TYPE = "setTextLineItemCustomType";

    /**
     *  <p>The <code>id</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return textLineItemId
     */

    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    /**
     *  <p>The <code>key</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return textLineItemKey
     */

    @JsonProperty("textLineItemKey")
    public String getTextLineItemKey();

    /**
     *  <p>Defines the Type that extends the TextLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the TextLineItem.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the TextLineItem.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>The <code>id</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemId value to be set
     */

    public void setTextLineItemId(final String textLineItemId);

    /**
     *  <p>The <code>key</code> of the TextLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemKey value to be set
     */

    public void setTextLineItemKey(final String textLineItemKey);

    /**
     *  <p>Defines the Type that extends the TextLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the TextLineItem.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the TextLineItem.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of ShoppingListSetTextLineItemCustomTypeAction
     */
    public static ShoppingListSetTextLineItemCustomTypeAction of() {
        return new ShoppingListSetTextLineItemCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListSetTextLineItemCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListSetTextLineItemCustomTypeAction of(
            final ShoppingListSetTextLineItemCustomTypeAction template) {
        ShoppingListSetTextLineItemCustomTypeActionImpl instance = new ShoppingListSetTextLineItemCustomTypeActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setTextLineItemKey(template.getTextLineItemKey());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public ShoppingListSetTextLineItemCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListSetTextLineItemCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListSetTextLineItemCustomTypeAction deepCopy(
            @Nullable final ShoppingListSetTextLineItemCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListSetTextLineItemCustomTypeActionImpl instance = new ShoppingListSetTextLineItemCustomTypeActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setTextLineItemKey(template.getTextLineItemKey());
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for ShoppingListSetTextLineItemCustomTypeAction
     * @return builder
     */
    public static ShoppingListSetTextLineItemCustomTypeActionBuilder builder() {
        return ShoppingListSetTextLineItemCustomTypeActionBuilder.of();
    }

    /**
     * create builder for ShoppingListSetTextLineItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetTextLineItemCustomTypeActionBuilder builder(
            final ShoppingListSetTextLineItemCustomTypeAction template) {
        return ShoppingListSetTextLineItemCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListSetTextLineItemCustomTypeAction(
            Function<ShoppingListSetTextLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetTextLineItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetTextLineItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetTextLineItemCustomTypeAction>";
            }
        };
    }
}
