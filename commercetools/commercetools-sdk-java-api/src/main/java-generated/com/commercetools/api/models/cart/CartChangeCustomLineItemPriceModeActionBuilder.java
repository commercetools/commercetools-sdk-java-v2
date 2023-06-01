package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CustomLineItemPriceMode;
import com.commercetools.api.models.cart.CartChangeCustomLineItemPriceModeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartChangeCustomLineItemPriceModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeCustomLineItemPriceModeAction cartChangeCustomLineItemPriceModeAction = CartChangeCustomLineItemPriceModeAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .mode(CustomLineItemPriceMode.STANDARD)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartChangeCustomLineItemPriceModeActionBuilder implements Builder<CartChangeCustomLineItemPriceModeAction> {

    
    
    private String customLineItemId;
    
    
    
    private com.commercetools.api.models.cart.CustomLineItemPriceMode mode;

    
    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */
    
    public CartChangeCustomLineItemPriceModeActionBuilder customLineItemId( final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }
    
    
    
    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param mode value to be set
     * @return Builder
     */
    
    public CartChangeCustomLineItemPriceModeActionBuilder mode( final com.commercetools.api.models.cart.CustomLineItemPriceMode mode) {
        this.mode = mode;
        return this;
    }
    
    

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @return customLineItemId
     */
    
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return mode
     */
    
    
    public com.commercetools.api.models.cart.CustomLineItemPriceMode getMode(){
        return this.mode;
    }

    /**
     * builds CartChangeCustomLineItemPriceModeAction with checking for non-null required values
     * @return CartChangeCustomLineItemPriceModeAction
     */
    public CartChangeCustomLineItemPriceModeAction build() {
        Objects.requireNonNull(customLineItemId, CartChangeCustomLineItemPriceModeAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(mode, CartChangeCustomLineItemPriceModeAction.class + ": mode is missing");
        return new CartChangeCustomLineItemPriceModeActionImpl(customLineItemId, mode);
    }
    
    /**
     * builds CartChangeCustomLineItemPriceModeAction without checking for non-null required values
     * @return CartChangeCustomLineItemPriceModeAction
     */
    public CartChangeCustomLineItemPriceModeAction buildUnchecked() {
        return new CartChangeCustomLineItemPriceModeActionImpl(customLineItemId, mode);
    }

    /**
     * factory method for an instance of CartChangeCustomLineItemPriceModeActionBuilder
     * @return builder 
     */
    public static CartChangeCustomLineItemPriceModeActionBuilder of() {
        return new CartChangeCustomLineItemPriceModeActionBuilder();
    }

    /**
     * create builder for CartChangeCustomLineItemPriceModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartChangeCustomLineItemPriceModeActionBuilder of(final CartChangeCustomLineItemPriceModeAction template) {
        CartChangeCustomLineItemPriceModeActionBuilder builder = new CartChangeCustomLineItemPriceModeActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.mode = template.getMode();
        return builder;
    }

}
