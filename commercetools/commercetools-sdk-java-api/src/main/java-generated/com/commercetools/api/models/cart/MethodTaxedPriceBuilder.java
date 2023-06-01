package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.cart.MethodTaxedPrice;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MethodTaxedPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MethodTaxedPrice methodTaxedPrice = MethodTaxedPrice.builder()
 *             .shippingMethodKey("{shippingMethodKey}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MethodTaxedPriceBuilder implements Builder<MethodTaxedPrice> {

    
    
    private String shippingMethodKey;
    
    
    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    
    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingMethodKey value to be set
     * @return Builder
     */
    
    public MethodTaxedPriceBuilder shippingMethodKey( final String shippingMethodKey) {
        this.shippingMethodKey = shippingMethodKey;
        return this;
    }
    
    
    
    
    /**
     *  <p>Taxed price for the Shipping Method.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */
    
    public MethodTaxedPriceBuilder taxedPrice(Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Taxed price for the Shipping Method.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */
    
    public MethodTaxedPriceBuilder withTaxedPrice(Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Taxed price for the Shipping Method.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */
    
    public MethodTaxedPriceBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }
    
    

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingMethodKey
     */
    
    
    public String getShippingMethodKey(){
        return this.shippingMethodKey;
    }
    
    /**
     *  <p>Taxed price for the Shipping Method.</p>
     * @return taxedPrice
     */
    
    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice(){
        return this.taxedPrice;
    }

    /**
     * builds MethodTaxedPrice with checking for non-null required values
     * @return MethodTaxedPrice
     */
    public MethodTaxedPrice build() {
        Objects.requireNonNull(shippingMethodKey, MethodTaxedPrice.class + ": shippingMethodKey is missing");
        return new MethodTaxedPriceImpl(shippingMethodKey, taxedPrice);
    }
    
    /**
     * builds MethodTaxedPrice without checking for non-null required values
     * @return MethodTaxedPrice
     */
    public MethodTaxedPrice buildUnchecked() {
        return new MethodTaxedPriceImpl(shippingMethodKey, taxedPrice);
    }

    /**
     * factory method for an instance of MethodTaxedPriceBuilder
     * @return builder 
     */
    public static MethodTaxedPriceBuilder of() {
        return new MethodTaxedPriceBuilder();
    }

    /**
     * create builder for MethodTaxedPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MethodTaxedPriceBuilder of(final MethodTaxedPrice template) {
        MethodTaxedPriceBuilder builder = new MethodTaxedPriceBuilder();
        builder.shippingMethodKey = template.getShippingMethodKey();
        builder.taxedPrice = template.getTaxedPrice();
        return builder;
    }

}
