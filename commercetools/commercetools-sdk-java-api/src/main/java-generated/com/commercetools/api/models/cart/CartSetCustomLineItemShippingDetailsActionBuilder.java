package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.cart.CartSetCustomLineItemShippingDetailsAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCustomLineItemShippingDetailsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomLineItemShippingDetailsAction cartSetCustomLineItemShippingDetailsAction = CartSetCustomLineItemShippingDetailsAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartSetCustomLineItemShippingDetailsActionBuilder implements Builder<CartSetCustomLineItemShippingDetailsAction> {

    
    
    private String customLineItemId;
    
    
    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    
    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */
    
    public CartSetCustomLineItemShippingDetailsActionBuilder customLineItemId( final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */
    
    public CartSetCustomLineItemShippingDetailsActionBuilder shippingDetails(Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */
    
    public CartSetCustomLineItemShippingDetailsActionBuilder withShippingDetails(Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraft> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */
    
    public CartSetCustomLineItemShippingDetailsActionBuilder shippingDetails(@Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
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
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return shippingDetails
     */
    
    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails(){
        return this.shippingDetails;
    }

    /**
     * builds CartSetCustomLineItemShippingDetailsAction with checking for non-null required values
     * @return CartSetCustomLineItemShippingDetailsAction
     */
    public CartSetCustomLineItemShippingDetailsAction build() {
        Objects.requireNonNull(customLineItemId, CartSetCustomLineItemShippingDetailsAction.class + ": customLineItemId is missing");
        return new CartSetCustomLineItemShippingDetailsActionImpl(customLineItemId, shippingDetails);
    }
    
    /**
     * builds CartSetCustomLineItemShippingDetailsAction without checking for non-null required values
     * @return CartSetCustomLineItemShippingDetailsAction
     */
    public CartSetCustomLineItemShippingDetailsAction buildUnchecked() {
        return new CartSetCustomLineItemShippingDetailsActionImpl(customLineItemId, shippingDetails);
    }

    /**
     * factory method for an instance of CartSetCustomLineItemShippingDetailsActionBuilder
     * @return builder 
     */
    public static CartSetCustomLineItemShippingDetailsActionBuilder of() {
        return new CartSetCustomLineItemShippingDetailsActionBuilder();
    }

    /**
     * create builder for CartSetCustomLineItemShippingDetailsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomLineItemShippingDetailsActionBuilder of(final CartSetCustomLineItemShippingDetailsAction template) {
        CartSetCustomLineItemShippingDetailsActionBuilder builder = new CartSetCustomLineItemShippingDetailsActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
