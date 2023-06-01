package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.cart.CartSetShippingMethodTaxRateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetShippingMethodTaxRateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingMethodTaxRateAction cartSetShippingMethodTaxRateAction = CartSetShippingMethodTaxRateAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartSetShippingMethodTaxRateActionBuilder implements Builder<CartSetShippingMethodTaxRateAction> {

    
    @Nullable
    private String shippingKey;
    
    
    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    
    /**
     *  <p><code>key</code> of the ShippingMethod to update. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */
    
    public CartSetShippingMethodTaxRateActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */
    
    public CartSetShippingMethodTaxRateActionBuilder externalTaxRate(Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */
    
    public CartSetShippingMethodTaxRateActionBuilder withExternalTaxRate(Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */
    
    public CartSetShippingMethodTaxRateActionBuilder externalTaxRate(@Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }
    
    

    /**
     *  <p><code>key</code> of the ShippingMethod to update. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */
    
    @Nullable
    public String getShippingKey(){
        return this.shippingKey;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return externalTaxRate
     */
    
    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }

    /**
     * builds CartSetShippingMethodTaxRateAction with checking for non-null required values
     * @return CartSetShippingMethodTaxRateAction
     */
    public CartSetShippingMethodTaxRateAction build() {
        return new CartSetShippingMethodTaxRateActionImpl(shippingKey, externalTaxRate);
    }
    
    /**
     * builds CartSetShippingMethodTaxRateAction without checking for non-null required values
     * @return CartSetShippingMethodTaxRateAction
     */
    public CartSetShippingMethodTaxRateAction buildUnchecked() {
        return new CartSetShippingMethodTaxRateActionImpl(shippingKey, externalTaxRate);
    }

    /**
     * factory method for an instance of CartSetShippingMethodTaxRateActionBuilder
     * @return builder 
     */
    public static CartSetShippingMethodTaxRateActionBuilder of() {
        return new CartSetShippingMethodTaxRateActionBuilder();
    }

    /**
     * create builder for CartSetShippingMethodTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetShippingMethodTaxRateActionBuilder of(final CartSetShippingMethodTaxRateAction template) {
        CartSetShippingMethodTaxRateActionBuilder builder = new CartSetShippingMethodTaxRateActionBuilder();
        builder.shippingKey = template.getShippingKey();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
