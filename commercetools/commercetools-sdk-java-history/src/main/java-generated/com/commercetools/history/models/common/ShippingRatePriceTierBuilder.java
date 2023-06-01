package com.commercetools.history.models.common;

import com.commercetools.history.models.common.ShippingRateTierType;
import com.commercetools.history.models.common.ShippingRatePriceTier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRatePriceTierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRatePriceTier shippingRatePriceTier = ShippingRatePriceTier.builder()
 *             .type(ShippingRateTierType.CART_VALUE)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingRatePriceTierBuilder implements Builder<ShippingRatePriceTier> {

    
    
    private com.commercetools.history.models.common.ShippingRateTierType type;

    
    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */
    
    public ShippingRatePriceTierBuilder type( final com.commercetools.history.models.common.ShippingRateTierType type) {
        this.type = type;
        return this;
    }
    
    

    /**
     * value of type}
     * @return type
     */
    
    
    public com.commercetools.history.models.common.ShippingRateTierType getType(){
        return this.type;
    }

    /**
     * builds ShippingRatePriceTier with checking for non-null required values
     * @return ShippingRatePriceTier
     */
    public ShippingRatePriceTier build() {
        Objects.requireNonNull(type, ShippingRatePriceTier.class + ": type is missing");
        return new ShippingRatePriceTierImpl(type);
    }
    
    /**
     * builds ShippingRatePriceTier without checking for non-null required values
     * @return ShippingRatePriceTier
     */
    public ShippingRatePriceTier buildUnchecked() {
        return new ShippingRatePriceTierImpl(type);
    }

    /**
     * factory method for an instance of ShippingRatePriceTierBuilder
     * @return builder 
     */
    public static ShippingRatePriceTierBuilder of() {
        return new ShippingRatePriceTierBuilder();
    }

    /**
     * create builder for ShippingRatePriceTier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingRatePriceTierBuilder of(final ShippingRatePriceTier template) {
        ShippingRatePriceTierBuilder builder = new ShippingRatePriceTierBuilder();
        builder.type = template.getType();
        return builder;
    }

}
