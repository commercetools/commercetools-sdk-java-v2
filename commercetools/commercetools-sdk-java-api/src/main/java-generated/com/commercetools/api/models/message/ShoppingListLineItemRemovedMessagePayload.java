
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListRemoveLineItemAction" rel="nofollow">Remove ShoppingListLineItem</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListLineItemRemovedMessagePayload shoppingListLineItemRemovedMessagePayload = ShoppingListLineItemRemovedMessagePayload.builder()
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShoppingListLineItemRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListLineItemRemovedMessagePayloadImpl.class)
public interface ShoppingListLineItemRemovedMessagePayload extends ShoppingListMessagePayload {

    /**
     * discriminator value for ShoppingListLineItemRemovedMessagePayload
     */
    String SHOPPING_LIST_LINE_ITEM_REMOVED = "ShoppingListLineItemRemoved";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">Line Item</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public ShoppingListLineItem getLineItem();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">Line Item</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final ShoppingListLineItem lineItem);

    /**
     * factory method
     * @return instance of ShoppingListLineItemRemovedMessagePayload
     */
    public static ShoppingListLineItemRemovedMessagePayload of() {
        return new ShoppingListLineItemRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListLineItemRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListLineItemRemovedMessagePayload of(
            final ShoppingListLineItemRemovedMessagePayload template) {
        ShoppingListLineItemRemovedMessagePayloadImpl instance = new ShoppingListLineItemRemovedMessagePayloadImpl();
        instance.setLineItem(template.getLineItem());
        return instance;
    }

    public ShoppingListLineItemRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListLineItemRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListLineItemRemovedMessagePayload deepCopy(
            @Nullable final ShoppingListLineItemRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ShoppingListLineItemRemovedMessagePayloadImpl instance = new ShoppingListLineItemRemovedMessagePayloadImpl();
        instance.setLineItem(
            com.commercetools.api.models.shopping_list.ShoppingListLineItem.deepCopy(template.getLineItem()));
        return instance;
    }

    /**
     * builder factory method for ShoppingListLineItemRemovedMessagePayload
     * @return builder
     */
    public static ShoppingListLineItemRemovedMessagePayloadBuilder builder() {
        return ShoppingListLineItemRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ShoppingListLineItemRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListLineItemRemovedMessagePayloadBuilder builder(
            final ShoppingListLineItemRemovedMessagePayload template) {
        return ShoppingListLineItemRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListLineItemRemovedMessagePayload(
            Function<ShoppingListLineItemRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItemRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItemRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListLineItemRemovedMessagePayload>";
            }
        };
    }
}
