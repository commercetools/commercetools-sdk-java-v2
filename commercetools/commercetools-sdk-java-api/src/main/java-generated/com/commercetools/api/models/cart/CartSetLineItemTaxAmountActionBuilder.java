package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalTaxAmountDraft;
import com.commercetools.api.models.cart.CartSetLineItemTaxAmountAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetLineItemTaxAmountActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemTaxAmountAction cartSetLineItemTaxAmountAction = CartSetLineItemTaxAmountAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartSetLineItemTaxAmountActionBuilder implements Builder<CartSetLineItemTaxAmountAction> {

    
    
    private String lineItemId;
    
    
    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;
    
    
    @Nullable
    private String shippingKey;

    
    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @param lineItemId value to be set
     * @return Builder
     */
    
    public CartSetLineItemTaxAmountActionBuilder lineItemId( final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the externalTaxAmount value
     * @return Builder
     */
    
    public CartSetLineItemTaxAmountActionBuilder externalTaxAmount(Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder> builder) {
        this.externalTaxAmount = builder.apply(com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the externalTaxAmount value
     * @return Builder
     */
    
    public CartSetLineItemTaxAmountActionBuilder withExternalTaxAmount(Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraft> builder) {
        this.externalTaxAmount = builder.apply(com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param externalTaxAmount value to be set
     * @return Builder
     */
    
    public CartSetLineItemTaxAmountActionBuilder externalTaxAmount(@Nullable final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
        return this;
    }
    
    
    
    
    /**
     *  <p><code>key</code> of the ShippingMethod used for this Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */
    
    public CartSetLineItemTaxAmountActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }
    
    

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @return lineItemId
     */
    
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return externalTaxAmount
     */
    
    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount(){
        return this.externalTaxAmount;
    }
    
    /**
     *  <p><code>key</code> of the ShippingMethod used for this Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */
    
    @Nullable
    public String getShippingKey(){
        return this.shippingKey;
    }

    /**
     * builds CartSetLineItemTaxAmountAction with checking for non-null required values
     * @return CartSetLineItemTaxAmountAction
     */
    public CartSetLineItemTaxAmountAction build() {
        Objects.requireNonNull(lineItemId, CartSetLineItemTaxAmountAction.class + ": lineItemId is missing");
        return new CartSetLineItemTaxAmountActionImpl(lineItemId, externalTaxAmount, shippingKey);
    }
    
    /**
     * builds CartSetLineItemTaxAmountAction without checking for non-null required values
     * @return CartSetLineItemTaxAmountAction
     */
    public CartSetLineItemTaxAmountAction buildUnchecked() {
        return new CartSetLineItemTaxAmountActionImpl(lineItemId, externalTaxAmount, shippingKey);
    }

    /**
     * factory method for an instance of CartSetLineItemTaxAmountActionBuilder
     * @return builder 
     */
    public static CartSetLineItemTaxAmountActionBuilder of() {
        return new CartSetLineItemTaxAmountActionBuilder();
    }

    /**
     * create builder for CartSetLineItemTaxAmountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLineItemTaxAmountActionBuilder of(final CartSetLineItemTaxAmountAction template) {
        CartSetLineItemTaxAmountActionBuilder builder = new CartSetLineItemTaxAmountActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.externalTaxAmount = template.getExternalTaxAmount();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
