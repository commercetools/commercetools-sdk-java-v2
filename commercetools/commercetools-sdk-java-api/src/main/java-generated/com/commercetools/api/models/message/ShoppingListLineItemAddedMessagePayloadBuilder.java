
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListLineItemAddedMessagePayloadBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListLineItemAddedMessagePayloadBuilder
        implements Builder<ShoppingListLineItemAddedMessagePayload> {

    private com.commercetools.api.models.shopping_list.ShoppingListLineItem lineItem;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">Line Item</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public ShoppingListLineItemAddedMessagePayloadBuilder lineItem(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">Line Item</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public ShoppingListLineItemAddedMessagePayloadBuilder withLineItem(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItem> builder) {
        this.lineItem = builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">Line Item</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @param lineItem value to be set
     * @return Builder
     */

    public ShoppingListLineItemAddedMessagePayloadBuilder lineItem(
            final com.commercetools.api.models.shopping_list.ShoppingListLineItem lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">Line Item</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @return lineItem
     */

    public com.commercetools.api.models.shopping_list.ShoppingListLineItem getLineItem() {
        return this.lineItem;
    }

    /**
     * builds ShoppingListLineItemAddedMessagePayload with checking for non-null required values
     * @return ShoppingListLineItemAddedMessagePayload
     */
    public ShoppingListLineItemAddedMessagePayload build() {
        Objects.requireNonNull(lineItem, ShoppingListLineItemAddedMessagePayload.class + ": lineItem is missing");
        return new ShoppingListLineItemAddedMessagePayloadImpl(lineItem);
    }

    /**
     * builds ShoppingListLineItemAddedMessagePayload without checking for non-null required values
     * @return ShoppingListLineItemAddedMessagePayload
     */
    public ShoppingListLineItemAddedMessagePayload buildUnchecked() {
        return new ShoppingListLineItemAddedMessagePayloadImpl(lineItem);
    }

    /**
     * factory method for an instance of ShoppingListLineItemAddedMessagePayloadBuilder
     * @return builder
     */
    public static ShoppingListLineItemAddedMessagePayloadBuilder of() {
        return new ShoppingListLineItemAddedMessagePayloadBuilder();
    }

    /**
     * create builder for ShoppingListLineItemAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListLineItemAddedMessagePayloadBuilder of(
            final ShoppingListLineItemAddedMessagePayload template) {
        ShoppingListLineItemAddedMessagePayloadBuilder builder = new ShoppingListLineItemAddedMessagePayloadBuilder();
        builder.lineItem = template.getLineItem();
        return builder;
    }

}
