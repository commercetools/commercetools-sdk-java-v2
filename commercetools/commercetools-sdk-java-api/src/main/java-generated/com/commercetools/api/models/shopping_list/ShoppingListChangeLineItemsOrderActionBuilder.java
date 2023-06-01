package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListChangeLineItemsOrderAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListChangeLineItemsOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListChangeLineItemsOrderAction shoppingListChangeLineItemsOrderAction = ShoppingListChangeLineItemsOrderAction.builder()
 *             .plusLineItemOrder(lineItemOrderBuilder -> lineItemOrderBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShoppingListChangeLineItemsOrderActionBuilder implements Builder<ShoppingListChangeLineItemsOrderAction> {

    
    
    private java.util.List<String> lineItemOrder;

    /**
     *  <p>All existing ShoppingListLineItem <code>id</code>s in the desired new order.</p>
     * @param lineItemOrder value to be set
     * @return Builder
     */
    
    public ShoppingListChangeLineItemsOrderActionBuilder lineItemOrder( final String ...lineItemOrder) {
        this.lineItemOrder = new ArrayList<>(Arrays.asList(lineItemOrder));
        return this;
    }
    
    /**
     *  <p>All existing ShoppingListLineItem <code>id</code>s in the desired new order.</p>
     * @param lineItemOrder value to be set
     * @return Builder
     */
    
    public ShoppingListChangeLineItemsOrderActionBuilder lineItemOrder( final java.util.List<String> lineItemOrder) {
        this.lineItemOrder = lineItemOrder;
        return this;
    }
    
    /**
     *  <p>All existing ShoppingListLineItem <code>id</code>s in the desired new order.</p>
     * @param lineItemOrder value to be set
     * @return Builder
     */
    
    public ShoppingListChangeLineItemsOrderActionBuilder plusLineItemOrder( final String ...lineItemOrder) {
        if (this.lineItemOrder == null) {
            this.lineItemOrder = new ArrayList<>();
        }
        this.lineItemOrder.addAll(Arrays.asList(lineItemOrder));
        return this;
    }
    
    
    

    /**
     *  <p>All existing ShoppingListLineItem <code>id</code>s in the desired new order.</p>
     * @return lineItemOrder
     */
    
    
    public java.util.List<String> getLineItemOrder(){
        return this.lineItemOrder;
    }

    /**
     * builds ShoppingListChangeLineItemsOrderAction with checking for non-null required values
     * @return ShoppingListChangeLineItemsOrderAction
     */
    public ShoppingListChangeLineItemsOrderAction build() {
        Objects.requireNonNull(lineItemOrder, ShoppingListChangeLineItemsOrderAction.class + ": lineItemOrder is missing");
        return new ShoppingListChangeLineItemsOrderActionImpl(lineItemOrder);
    }
    
    /**
     * builds ShoppingListChangeLineItemsOrderAction without checking for non-null required values
     * @return ShoppingListChangeLineItemsOrderAction
     */
    public ShoppingListChangeLineItemsOrderAction buildUnchecked() {
        return new ShoppingListChangeLineItemsOrderActionImpl(lineItemOrder);
    }

    /**
     * factory method for an instance of ShoppingListChangeLineItemsOrderActionBuilder
     * @return builder 
     */
    public static ShoppingListChangeLineItemsOrderActionBuilder of() {
        return new ShoppingListChangeLineItemsOrderActionBuilder();
    }

    /**
     * create builder for ShoppingListChangeLineItemsOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListChangeLineItemsOrderActionBuilder of(final ShoppingListChangeLineItemsOrderAction template) {
        ShoppingListChangeLineItemsOrderActionBuilder builder = new ShoppingListChangeLineItemsOrderActionBuilder();
        builder.lineItemOrder = template.getLineItemOrder();
        return builder;
    }

}
