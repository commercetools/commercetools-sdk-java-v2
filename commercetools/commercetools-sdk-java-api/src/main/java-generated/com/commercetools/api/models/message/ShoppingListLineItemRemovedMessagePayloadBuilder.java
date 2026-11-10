
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListLineItemRemovedMessagePayloadBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListLineItemRemovedMessagePayloadBuilder
        implements Builder<ShoppingListLineItemRemovedMessagePayload> {

    private com.commercetools.api.models.shopping_list.ShoppingListLineItem lineItem;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">Line Item</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public ShoppingListLineItemRemovedMessagePayloadBuilder lineItem(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">Line Item</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public ShoppingListLineItemRemovedMessagePayloadBuilder withLineItem(
            Function<com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder, com.commercetools.api.models.shopping_list.ShoppingListLineItem> builder) {
        this.lineItem = builder.apply(com.commercetools.api.models.shopping_list.ShoppingListLineItemBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">Line Item</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @param lineItem value to be set
     * @return Builder
     */

    public ShoppingListLineItemRemovedMessagePayloadBuilder lineItem(
            final com.commercetools.api.models.shopping_list.ShoppingListLineItem lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListLineItem" rel="nofollow">Line Item</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     * @return lineItem
     */

    public com.commercetools.api.models.shopping_list.ShoppingListLineItem getLineItem() {
        return this.lineItem;
    }

    /**
     * builds ShoppingListLineItemRemovedMessagePayload with checking for non-null required values
     * @return ShoppingListLineItemRemovedMessagePayload
     */
    public ShoppingListLineItemRemovedMessagePayload build() {
        Objects.requireNonNull(lineItem, ShoppingListLineItemRemovedMessagePayload.class + ": lineItem is missing");
        return new ShoppingListLineItemRemovedMessagePayloadImpl(lineItem);
    }

    /**
     * builds ShoppingListLineItemRemovedMessagePayload without checking for non-null required values
     * @return ShoppingListLineItemRemovedMessagePayload
     */
    public ShoppingListLineItemRemovedMessagePayload buildUnchecked() {
        return new ShoppingListLineItemRemovedMessagePayloadImpl(lineItem);
    }

    /**
     * factory method for an instance of ShoppingListLineItemRemovedMessagePayloadBuilder
     * @return builder
     */
    public static ShoppingListLineItemRemovedMessagePayloadBuilder of() {
        return new ShoppingListLineItemRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for ShoppingListLineItemRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListLineItemRemovedMessagePayloadBuilder of(
            final ShoppingListLineItemRemovedMessagePayload template) {
        ShoppingListLineItemRemovedMessagePayloadBuilder builder = new ShoppingListLineItemRemovedMessagePayloadBuilder();
        builder.lineItem = template.getLineItem();
        return builder;
    }

}
