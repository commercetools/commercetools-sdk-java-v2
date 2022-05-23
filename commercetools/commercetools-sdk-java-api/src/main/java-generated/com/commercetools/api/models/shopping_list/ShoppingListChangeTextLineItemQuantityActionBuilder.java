
package com.commercetools.api.models.shopping_list;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ShoppingListChangeTextLineItemQuantityAction shoppingListChangeTextLineItemQuantityAction = ShoppingListChangeTextLineItemQuantityAction.builder()
           .textLineItemId("{textLineItemId}")
           .quantity(0.3)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListChangeTextLineItemQuantityActionBuilder
        implements Builder<ShoppingListChangeTextLineItemQuantityAction> {

    private String textLineItemId;

    private Long quantity;

    public ShoppingListChangeTextLineItemQuantityActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    public ShoppingListChangeTextLineItemQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public ShoppingListChangeTextLineItemQuantityAction build() {
        Objects.requireNonNull(textLineItemId,
            ShoppingListChangeTextLineItemQuantityAction.class + ": textLineItemId is missing");
        Objects.requireNonNull(quantity, ShoppingListChangeTextLineItemQuantityAction.class + ": quantity is missing");
        return new ShoppingListChangeTextLineItemQuantityActionImpl(textLineItemId, quantity);
    }

    /**
     * builds ShoppingListChangeTextLineItemQuantityAction without checking for non null required values
     */
    public ShoppingListChangeTextLineItemQuantityAction buildUnchecked() {
        return new ShoppingListChangeTextLineItemQuantityActionImpl(textLineItemId, quantity);
    }

    public static ShoppingListChangeTextLineItemQuantityActionBuilder of() {
        return new ShoppingListChangeTextLineItemQuantityActionBuilder();
    }

    public static ShoppingListChangeTextLineItemQuantityActionBuilder of(
            final ShoppingListChangeTextLineItemQuantityAction template) {
        ShoppingListChangeTextLineItemQuantityActionBuilder builder = new ShoppingListChangeTextLineItemQuantityActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
