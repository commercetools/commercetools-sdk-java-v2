
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * ShoppingListSetTextLineItemDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetTextLineItemDescriptionAction shoppingListSetTextLineItemDescriptionAction = ShoppingListSetTextLineItemDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setTextLineItemDescription")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetTextLineItemDescriptionActionImpl.class)
public interface ShoppingListSetTextLineItemDescriptionAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListSetTextLineItemDescriptionAction
     */
    String SET_TEXT_LINE_ITEM_DESCRIPTION = "setTextLineItemDescription";

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
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

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
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * factory method
     * @return instance of ShoppingListSetTextLineItemDescriptionAction
     */
    public static ShoppingListSetTextLineItemDescriptionAction of() {
        return new ShoppingListSetTextLineItemDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListSetTextLineItemDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListSetTextLineItemDescriptionAction of(
            final ShoppingListSetTextLineItemDescriptionAction template) {
        ShoppingListSetTextLineItemDescriptionActionImpl instance = new ShoppingListSetTextLineItemDescriptionActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setTextLineItemKey(template.getTextLineItemKey());
        instance.setDescription(template.getDescription());
        return instance;
    }

    public ShoppingListSetTextLineItemDescriptionAction copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListSetTextLineItemDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListSetTextLineItemDescriptionAction deepCopy(
            @Nullable final ShoppingListSetTextLineItemDescriptionAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListSetTextLineItemDescriptionActionImpl instance = new ShoppingListSetTextLineItemDescriptionActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setTextLineItemKey(template.getTextLineItemKey());
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for ShoppingListSetTextLineItemDescriptionAction
     * @return builder
     */
    public static ShoppingListSetTextLineItemDescriptionActionBuilder builder() {
        return ShoppingListSetTextLineItemDescriptionActionBuilder.of();
    }

    /**
     * create builder for ShoppingListSetTextLineItemDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetTextLineItemDescriptionActionBuilder builder(
            final ShoppingListSetTextLineItemDescriptionAction template) {
        return ShoppingListSetTextLineItemDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListSetTextLineItemDescriptionAction(
            Function<ShoppingListSetTextLineItemDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetTextLineItemDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetTextLineItemDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetTextLineItemDescriptionAction>";
            }
        };
    }
}
