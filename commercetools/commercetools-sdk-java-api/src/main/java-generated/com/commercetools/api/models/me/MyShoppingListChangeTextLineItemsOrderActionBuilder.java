package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListChangeTextLineItemsOrderAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListChangeTextLineItemsOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListChangeTextLineItemsOrderAction myShoppingListChangeTextLineItemsOrderAction = MyShoppingListChangeTextLineItemsOrderAction.builder()
 *             .plusTextLineItemOrder(textLineItemOrderBuilder -> textLineItemOrderBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyShoppingListChangeTextLineItemsOrderActionBuilder implements Builder<MyShoppingListChangeTextLineItemsOrderAction> {

    
    
    private java.util.List<String> textLineItemOrder;

    /**
     *  <p>All existing TextLineItem <code>id</code>s in the desired new order.</p>
     * @param textLineItemOrder value to be set
     * @return Builder
     */
    
    public MyShoppingListChangeTextLineItemsOrderActionBuilder textLineItemOrder( final String ...textLineItemOrder) {
        this.textLineItemOrder = new ArrayList<>(Arrays.asList(textLineItemOrder));
        return this;
    }
    
    /**
     *  <p>All existing TextLineItem <code>id</code>s in the desired new order.</p>
     * @param textLineItemOrder value to be set
     * @return Builder
     */
    
    public MyShoppingListChangeTextLineItemsOrderActionBuilder textLineItemOrder( final java.util.List<String> textLineItemOrder) {
        this.textLineItemOrder = textLineItemOrder;
        return this;
    }
    
    /**
     *  <p>All existing TextLineItem <code>id</code>s in the desired new order.</p>
     * @param textLineItemOrder value to be set
     * @return Builder
     */
    
    public MyShoppingListChangeTextLineItemsOrderActionBuilder plusTextLineItemOrder( final String ...textLineItemOrder) {
        if (this.textLineItemOrder == null) {
            this.textLineItemOrder = new ArrayList<>();
        }
        this.textLineItemOrder.addAll(Arrays.asList(textLineItemOrder));
        return this;
    }
    
    
    

    /**
     *  <p>All existing TextLineItem <code>id</code>s in the desired new order.</p>
     * @return textLineItemOrder
     */
    
    
    public java.util.List<String> getTextLineItemOrder(){
        return this.textLineItemOrder;
    }

    /**
     * builds MyShoppingListChangeTextLineItemsOrderAction with checking for non-null required values
     * @return MyShoppingListChangeTextLineItemsOrderAction
     */
    public MyShoppingListChangeTextLineItemsOrderAction build() {
        Objects.requireNonNull(textLineItemOrder, MyShoppingListChangeTextLineItemsOrderAction.class + ": textLineItemOrder is missing");
        return new MyShoppingListChangeTextLineItemsOrderActionImpl(textLineItemOrder);
    }
    
    /**
     * builds MyShoppingListChangeTextLineItemsOrderAction without checking for non-null required values
     * @return MyShoppingListChangeTextLineItemsOrderAction
     */
    public MyShoppingListChangeTextLineItemsOrderAction buildUnchecked() {
        return new MyShoppingListChangeTextLineItemsOrderActionImpl(textLineItemOrder);
    }

    /**
     * factory method for an instance of MyShoppingListChangeTextLineItemsOrderActionBuilder
     * @return builder 
     */
    public static MyShoppingListChangeTextLineItemsOrderActionBuilder of() {
        return new MyShoppingListChangeTextLineItemsOrderActionBuilder();
    }

    /**
     * create builder for MyShoppingListChangeTextLineItemsOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListChangeTextLineItemsOrderActionBuilder of(final MyShoppingListChangeTextLineItemsOrderAction template) {
        MyShoppingListChangeTextLineItemsOrderActionBuilder builder = new MyShoppingListChangeTextLineItemsOrderActionBuilder();
        builder.textLineItemOrder = template.getTextLineItemOrder();
        return builder;
    }

}
