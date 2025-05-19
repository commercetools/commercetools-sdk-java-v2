
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.shopping_list.ShoppingListLineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Add ShoppingListLineItem update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListLineItemAddedMessagePayload shoppingListLineItemAddedMessagePayload = ShoppingListLineItemAddedMessagePayload.builder()
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShoppingListLineItemAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListLineItemAddedMessagePayloadImpl.class)
public interface ShoppingListLineItemAddedMessagePayload extends ShoppingListMessagePayload {

    /**
     * discriminator value for ShoppingListLineItemAddedMessagePayload
     */
    String SHOPPING_LIST_LINE_ITEM_ADDED = "ShoppingListLineItemAdded";

    /**
     *  <p>Line Item that was added to the ShoppingList.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public ShoppingListLineItem getLineItem();

    /**
     *  <p>Line Item that was added to the ShoppingList.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final ShoppingListLineItem lineItem);

    /**
     * factory method
     * @return instance of ShoppingListLineItemAddedMessagePayload
     */
    public static ShoppingListLineItemAddedMessagePayload of() {
        return new ShoppingListLineItemAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListLineItemAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListLineItemAddedMessagePayload of(final ShoppingListLineItemAddedMessagePayload template) {
        ShoppingListLineItemAddedMessagePayloadImpl instance = new ShoppingListLineItemAddedMessagePayloadImpl();
        instance.setLineItem(template.getLineItem());
        return instance;
    }

    public ShoppingListLineItemAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListLineItemAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListLineItemAddedMessagePayload deepCopy(
            @Nullable final ShoppingListLineItemAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ShoppingListLineItemAddedMessagePayloadImpl instance = new ShoppingListLineItemAddedMessagePayloadImpl();
        instance.setLineItem(
            com.commercetools.api.models.shopping_list.ShoppingListLineItem.deepCopy(template.getLineItem()));
        return instance;
    }

    /**
     * builder factory method for ShoppingListLineItemAddedMessagePayload
     * @return builder
     */
    public static ShoppingListLineItemAddedMessagePayloadBuilder builder() {
        return ShoppingListLineItemAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ShoppingListLineItemAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListLineItemAddedMessagePayloadBuilder builder(
            final ShoppingListLineItemAddedMessagePayload template) {
        return ShoppingListLineItemAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListLineItemAddedMessagePayload(
            Function<ShoppingListLineItemAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItemAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItemAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListLineItemAddedMessagePayload>";
            }
        };
    }
}
