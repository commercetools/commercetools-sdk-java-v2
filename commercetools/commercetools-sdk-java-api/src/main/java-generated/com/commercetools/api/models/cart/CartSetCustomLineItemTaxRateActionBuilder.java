package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCustomLineItemTaxRateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomLineItemTaxRateAction cartSetCustomLineItemTaxRateAction = CartSetCustomLineItemTaxRateAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartSetCustomLineItemTaxRateActionBuilder implements Builder<CartSetCustomLineItemTaxRateAction> {

    
    
    private String customLineItemId;
    
    
    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    
    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */
    
    public CartSetCustomLineItemTaxRateActionBuilder customLineItemId( final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value to set. If empty, an existing value is removed.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */
    
    public CartSetCustomLineItemTaxRateActionBuilder externalTaxRate(Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to set. If empty, an existing value is removed.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */
    
    public CartSetCustomLineItemTaxRateActionBuilder withExternalTaxRate(Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to set. If empty, an existing value is removed.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */
    
    public CartSetCustomLineItemTaxRateActionBuilder externalTaxRate(@Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
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
     *  <p>Value to set. If empty, an existing value is removed.</p>
     * @return externalTaxRate
     */
    
    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }

    /**
     * builds CartSetCustomLineItemTaxRateAction with checking for non-null required values
     * @return CartSetCustomLineItemTaxRateAction
     */
    public CartSetCustomLineItemTaxRateAction build() {
        Objects.requireNonNull(customLineItemId, CartSetCustomLineItemTaxRateAction.class + ": customLineItemId is missing");
        return new CartSetCustomLineItemTaxRateActionImpl(customLineItemId, externalTaxRate);
    }
    
    /**
     * builds CartSetCustomLineItemTaxRateAction without checking for non-null required values
     * @return CartSetCustomLineItemTaxRateAction
     */
    public CartSetCustomLineItemTaxRateAction buildUnchecked() {
        return new CartSetCustomLineItemTaxRateActionImpl(customLineItemId, externalTaxRate);
    }

    /**
     * factory method for an instance of CartSetCustomLineItemTaxRateActionBuilder
     * @return builder 
     */
    public static CartSetCustomLineItemTaxRateActionBuilder of() {
        return new CartSetCustomLineItemTaxRateActionBuilder();
    }

    /**
     * create builder for CartSetCustomLineItemTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomLineItemTaxRateActionBuilder of(final CartSetCustomLineItemTaxRateAction template) {
        CartSetCustomLineItemTaxRateActionBuilder builder = new CartSetCustomLineItemTaxRateActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
