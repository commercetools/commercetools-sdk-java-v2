
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListAddLineItemAction" rel="nofollow">Add ShoppingListLineItem</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListLineItemAddedMessage shoppingListLineItemAddedMessage = ShoppingListLineItemAddedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("ShoppingListLineItemAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListLineItemAddedMessageImpl.class)
public interface ShoppingListLineItemAddedMessage extends ShoppingListMessage {

    /**
     * discriminator value for ShoppingListLineItemAddedMessage
     */
    String SHOPPING_LIST_LINE_ITEM_ADDED = "ShoppingListLineItemAdded";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">Line Item</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public ShoppingListLineItem getLineItem();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">Line Item</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final ShoppingListLineItem lineItem);

    /**
     * factory method
     * @return instance of ShoppingListLineItemAddedMessage
     */
    public static ShoppingListLineItemAddedMessage of() {
        return new ShoppingListLineItemAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListLineItemAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListLineItemAddedMessage of(final ShoppingListLineItemAddedMessage template) {
        ShoppingListLineItemAddedMessageImpl instance = new ShoppingListLineItemAddedMessageImpl();
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

    public ShoppingListLineItemAddedMessage copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListLineItemAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListLineItemAddedMessage deepCopy(@Nullable final ShoppingListLineItemAddedMessage template) {
        if (template == null) {
            return null;
        }
        ShoppingListLineItemAddedMessageImpl instance = new ShoppingListLineItemAddedMessageImpl();
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
     * builder factory method for ShoppingListLineItemAddedMessage
     * @return builder
     */
    public static ShoppingListLineItemAddedMessageBuilder builder() {
        return ShoppingListLineItemAddedMessageBuilder.of();
    }

    /**
     * create builder for ShoppingListLineItemAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListLineItemAddedMessageBuilder builder(final ShoppingListLineItemAddedMessage template) {
        return ShoppingListLineItemAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListLineItemAddedMessage(Function<ShoppingListLineItemAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItemAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListLineItemAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListLineItemAddedMessage>";
            }
        };
    }
}
