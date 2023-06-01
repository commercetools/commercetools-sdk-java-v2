package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListRemoveTextLineItemAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListRemoveTextLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListRemoveTextLineItemAction myShoppingListRemoveTextLineItemAction = MyShoppingListRemoveTextLineItemAction.builder()
 *             .textLineItemId("{textLineItemId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyShoppingListRemoveTextLineItemActionBuilder implements Builder<MyShoppingListRemoveTextLineItemAction> {

    
    
    private String textLineItemId;
    
    
    @Nullable
    private Long quantity;

    
    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @param textLineItemId value to be set
     * @return Builder
     */
    
    public MyShoppingListRemoveTextLineItemActionBuilder textLineItemId( final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Amount to remove from the <code>quantity</code> of the TextLineItem. If not set, the TextLineItem is removed from the ShoppingList. If this value matches or exceeds the current <code>quantity</code> of the TextLineItem, the TextLineItem is removed from the ShoppingList.</p>
     * @param quantity value to be set
     * @return Builder
     */
    
    public MyShoppingListRemoveTextLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @return textLineItemId
     */
    
    
    public String getTextLineItemId(){
        return this.textLineItemId;
    }
    
    /**
     *  <p>Amount to remove from the <code>quantity</code> of the TextLineItem. If not set, the TextLineItem is removed from the ShoppingList. If this value matches or exceeds the current <code>quantity</code> of the TextLineItem, the TextLineItem is removed from the ShoppingList.</p>
     * @return quantity
     */
    
    @Nullable
    public Long getQuantity(){
        return this.quantity;
    }

    /**
     * builds MyShoppingListRemoveTextLineItemAction with checking for non-null required values
     * @return MyShoppingListRemoveTextLineItemAction
     */
    public MyShoppingListRemoveTextLineItemAction build() {
        Objects.requireNonNull(textLineItemId, MyShoppingListRemoveTextLineItemAction.class + ": textLineItemId is missing");
        return new MyShoppingListRemoveTextLineItemActionImpl(textLineItemId, quantity);
    }
    
    /**
     * builds MyShoppingListRemoveTextLineItemAction without checking for non-null required values
     * @return MyShoppingListRemoveTextLineItemAction
     */
    public MyShoppingListRemoveTextLineItemAction buildUnchecked() {
        return new MyShoppingListRemoveTextLineItemActionImpl(textLineItemId, quantity);
    }

    /**
     * factory method for an instance of MyShoppingListRemoveTextLineItemActionBuilder
     * @return builder 
     */
    public static MyShoppingListRemoveTextLineItemActionBuilder of() {
        return new MyShoppingListRemoveTextLineItemActionBuilder();
    }

    /**
     * create builder for MyShoppingListRemoveTextLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListRemoveTextLineItemActionBuilder of(final MyShoppingListRemoveTextLineItemAction template) {
        MyShoppingListRemoveTextLineItemActionBuilder builder = new MyShoppingListRemoveTextLineItemActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
