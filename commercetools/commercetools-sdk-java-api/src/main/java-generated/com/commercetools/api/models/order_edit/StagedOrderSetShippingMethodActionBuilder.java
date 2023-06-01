package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetShippingMethodActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingMethodAction stagedOrderSetShippingMethodAction = StagedOrderSetShippingMethodAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderSetShippingMethodActionBuilder implements Builder<StagedOrderSetShippingMethodAction> {

    
    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;
    
    
    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    
    /**
     *  <p>ResourceIdentifier to a ShippingMethod.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */
    
    public StagedOrderSetShippingMethodActionBuilder shippingMethod(Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder> builder) {
        this.shippingMethod = builder.apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>ResourceIdentifier to a ShippingMethod.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */
    
    public StagedOrderSetShippingMethodActionBuilder withShippingMethod(Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier> builder) {
        this.shippingMethod = builder.apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>ResourceIdentifier to a ShippingMethod.</p>
     * @param shippingMethod value to be set
     * @return Builder
     */
    
    public StagedOrderSetShippingMethodActionBuilder shippingMethod(@Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }
    
    
    
    
    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */
    
    public StagedOrderSetShippingMethodActionBuilder externalTaxRate(Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */
    
    public StagedOrderSetShippingMethodActionBuilder withExternalTaxRate(Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */
    
    public StagedOrderSetShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }
    
    

    /**
     *  <p>ResourceIdentifier to a ShippingMethod.</p>
     * @return shippingMethod
     */
    
    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
        return this.shippingMethod;
    }
    
    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @return externalTaxRate
     */
    
    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }

    /**
     * builds StagedOrderSetShippingMethodAction with checking for non-null required values
     * @return StagedOrderSetShippingMethodAction
     */
    public StagedOrderSetShippingMethodAction build() {
        return new StagedOrderSetShippingMethodActionImpl(shippingMethod, externalTaxRate);
    }
    
    /**
     * builds StagedOrderSetShippingMethodAction without checking for non-null required values
     * @return StagedOrderSetShippingMethodAction
     */
    public StagedOrderSetShippingMethodAction buildUnchecked() {
        return new StagedOrderSetShippingMethodActionImpl(shippingMethod, externalTaxRate);
    }

    /**
     * factory method for an instance of StagedOrderSetShippingMethodActionBuilder
     * @return builder 
     */
    public static StagedOrderSetShippingMethodActionBuilder of() {
        return new StagedOrderSetShippingMethodActionBuilder();
    }

    /**
     * create builder for StagedOrderSetShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingMethodActionBuilder of(final StagedOrderSetShippingMethodAction template) {
        StagedOrderSetShippingMethodActionBuilder builder = new StagedOrderSetShippingMethodActionBuilder();
        builder.shippingMethod = template.getShippingMethod();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
