
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
import jakarta.validation.constraints.NotNull;

/**
 * ShoppingListChangeTextLineItemNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListChangeTextLineItemNameAction shoppingListChangeTextLineItemNameAction = ShoppingListChangeTextLineItemNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeTextLineItemName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListChangeTextLineItemNameActionImpl.class)
public interface ShoppingListChangeTextLineItemNameAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListChangeTextLineItemNameAction
     */
    String CHANGE_TEXT_LINE_ITEM_NAME = "changeTextLineItemName";

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
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

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
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of ShoppingListChangeTextLineItemNameAction
     */
    public static ShoppingListChangeTextLineItemNameAction of() {
        return new ShoppingListChangeTextLineItemNameActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListChangeTextLineItemNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListChangeTextLineItemNameAction of(final ShoppingListChangeTextLineItemNameAction template) {
        ShoppingListChangeTextLineItemNameActionImpl instance = new ShoppingListChangeTextLineItemNameActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setTextLineItemKey(template.getTextLineItemKey());
        instance.setName(template.getName());
        return instance;
    }

    public ShoppingListChangeTextLineItemNameAction copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListChangeTextLineItemNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListChangeTextLineItemNameAction deepCopy(
            @Nullable final ShoppingListChangeTextLineItemNameAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListChangeTextLineItemNameActionImpl instance = new ShoppingListChangeTextLineItemNameActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setTextLineItemKey(template.getTextLineItemKey());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for ShoppingListChangeTextLineItemNameAction
     * @return builder
     */
    public static ShoppingListChangeTextLineItemNameActionBuilder builder() {
        return ShoppingListChangeTextLineItemNameActionBuilder.of();
    }

    /**
     * create builder for ShoppingListChangeTextLineItemNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListChangeTextLineItemNameActionBuilder builder(
            final ShoppingListChangeTextLineItemNameAction template) {
        return ShoppingListChangeTextLineItemNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListChangeTextLineItemNameAction(
            Function<ShoppingListChangeTextLineItemNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListChangeTextLineItemNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListChangeTextLineItemNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListChangeTextLineItemNameAction>";
            }
        };
    }
}
