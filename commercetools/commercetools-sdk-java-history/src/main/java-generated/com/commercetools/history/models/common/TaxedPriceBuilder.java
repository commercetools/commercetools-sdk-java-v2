package com.commercetools.history.models.common;

import com.commercetools.history.models.common.Money;
import com.commercetools.history.models.common.TaxedPrice;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxedPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxedPrice taxedPrice = TaxedPrice.builder()
 *             .totalNet(totalNetBuilder -> totalNetBuilder)
 *             .totalGross(totalGrossBuilder -> totalGrossBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TaxedPriceBuilder implements Builder<TaxedPrice> {

    
    
    private com.commercetools.history.models.common.Money totalNet;
    
    
    
    private com.commercetools.history.models.common.Money totalGross;

    
    /**
     * set the value to the totalNet using the builder function
     * @param builder function to build the totalNet value
     * @return Builder
     */
    
    public TaxedPriceBuilder totalNet(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.totalNet = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the totalNet using the builder function
     * @param builder function to build the totalNet value
     * @return Builder
     */
    
    public TaxedPriceBuilder withTotalNet(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.totalNet = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the totalNet
     * @param totalNet value to be set
     * @return Builder
     */
    
    public TaxedPriceBuilder totalNet( final com.commercetools.history.models.common.Money totalNet) {
        this.totalNet = totalNet;
        return this;
    }
    
    
    
    
    /**
     * set the value to the totalGross using the builder function
     * @param builder function to build the totalGross value
     * @return Builder
     */
    
    public TaxedPriceBuilder totalGross(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.totalGross = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the totalGross using the builder function
     * @param builder function to build the totalGross value
     * @return Builder
     */
    
    public TaxedPriceBuilder withTotalGross(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.totalGross = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the totalGross
     * @param totalGross value to be set
     * @return Builder
     */
    
    public TaxedPriceBuilder totalGross( final com.commercetools.history.models.common.Money totalGross) {
        this.totalGross = totalGross;
        return this;
    }
    
    

    /**
     * value of totalNet}
     * @return totalNet
     */
    
    
    public com.commercetools.history.models.common.Money getTotalNet(){
        return this.totalNet;
    }
    
    /**
     * value of totalGross}
     * @return totalGross
     */
    
    
    public com.commercetools.history.models.common.Money getTotalGross(){
        return this.totalGross;
    }

    /**
     * builds TaxedPrice with checking for non-null required values
     * @return TaxedPrice
     */
    public TaxedPrice build() {
        Objects.requireNonNull(totalNet, TaxedPrice.class + ": totalNet is missing");
        Objects.requireNonNull(totalGross, TaxedPrice.class + ": totalGross is missing");
        return new TaxedPriceImpl(totalNet, totalGross);
    }
    
    /**
     * builds TaxedPrice without checking for non-null required values
     * @return TaxedPrice
     */
    public TaxedPrice buildUnchecked() {
        return new TaxedPriceImpl(totalNet, totalGross);
    }

    /**
     * factory method for an instance of TaxedPriceBuilder
     * @return builder 
     */
    public static TaxedPriceBuilder of() {
        return new TaxedPriceBuilder();
    }

    /**
     * create builder for TaxedPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxedPriceBuilder of(final TaxedPrice template) {
        TaxedPriceBuilder builder = new TaxedPriceBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        return builder;
    }

}
