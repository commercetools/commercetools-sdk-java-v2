
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
 *  <p>Generated after a successful Remove ShoppingListLineItem update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListLineItemRemovedMessage shoppingListLineItemRemovedMessage = ShoppingListLineItemRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListLineItemRemovedMessageImpl.class)
public interface ShoppingListLineItemRemovedMessage extends ShoppingListMessage {

    /**
     * discriminator value for ShoppingListLineItemRemovedMessage
     */
    String SHOPPING_LIST_LINE_ITEM_REMOVED = "ShoppingListLineItemRemoved";

    /**
     *  <p>Line Item that was removed from the ShoppingList.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public ShoppingListLineItem getLineItem();

    /**
     *  <p>Line Item that was removed from the ShoppingList.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final ShoppingListLineItem lineItem);

    /**
     * factory method
     * @return instance of ShoppingListLineItemRemovedMessage
     */
    public static ShoppingListLineItemRemovedMessage of() {
        return new ShoppingListLineItemRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListLineItemRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListLineItemRemovedMessage of(final ShoppingListLineItemRemovedMessage template) {
        ShoppingListLineItemRemovedMessageImpl instance = new ShoppingListLineItemRemovedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setLineItem(template.getLineItem());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShoppingListLineItemRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListLineItemRemovedMessage deepCopy(
            @Nullable final ShoppingListLineItemRemovedMessage template) {
        if (template == null) {
            return null;
        }
        ShoppingListLineItemRemovedMessageImpl instance = new ShoppingListLineItemRemovedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setLineItem(
            com.commercetools.api.models.shopping_list.ShoppingListLineItem.deepCopy(template.getLineItem()));
        return instance;
    }

    /**
     * builder factory method for ShoppingListLineItemRemovedMessage
     * @return builder
     */
    public static ShoppingListLineItemRemovedMessageBuilder builder() {
        return ShoppingListLineItemRemovedMessageBuilder.of();
    }

    /**
     * create builder for ShoppingListLineItemRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListLineItemRemovedMessageBuilder builder(final ShoppingListLineItemRemovedMessage template) {
        return ShoppingListLineItemRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListLineItemRemovedMessage(Function<ShoppingListLineItemRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItemRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItemRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListLineItemRemovedMessage>";
            }
        };
    }
}
