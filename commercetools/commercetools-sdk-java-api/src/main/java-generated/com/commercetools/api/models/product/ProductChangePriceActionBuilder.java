package com.commercetools.api.models.product;

import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductChangePriceAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductChangePriceActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangePriceAction productChangePriceAction = ProductChangePriceAction.builder()
 *             .priceId("{priceId}")
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductChangePriceActionBuilder implements Builder<ProductChangePriceAction> {

    
    
    private String priceId;
    
    
    
    private com.commercetools.api.models.common.PriceDraft price;
    
    
    @Nullable
    private Boolean staged;

    
    /**
     *  <p>The <code>id</code> of the Embedded Price to update.</p>
     * @param priceId value to be set
     * @return Builder
     */
    
    public ProductChangePriceActionBuilder priceId( final String priceId) {
        this.priceId = priceId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value to set.</p>
     * @param builder function to build the price value
     * @return Builder
     */
    
    public ProductChangePriceActionBuilder price(Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to set.</p>
     * @param builder function to build the price value
     * @return Builder
     */
    
    public ProductChangePriceActionBuilder withPrice(Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraft> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to set.</p>
     * @param price value to be set
     * @return Builder
     */
    
    public ProductChangePriceActionBuilder price( final com.commercetools.api.models.common.PriceDraft price) {
        this.price = price;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price are updated.</p>
     * @param staged value to be set
     * @return Builder
     */
    
    public ProductChangePriceActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }
    
    

    /**
     *  <p>The <code>id</code> of the Embedded Price to update.</p>
     * @return priceId
     */
    
    
    public String getPriceId(){
        return this.priceId;
    }
    
    /**
     *  <p>Value to set.</p>
     * @return price
     */
    
    
    public com.commercetools.api.models.common.PriceDraft getPrice(){
        return this.price;
    }
    
    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price are updated.</p>
     * @return staged
     */
    
    @Nullable
    public Boolean getStaged(){
        return this.staged;
    }

    /**
     * builds ProductChangePriceAction with checking for non-null required values
     * @return ProductChangePriceAction
     */
    public ProductChangePriceAction build() {
        Objects.requireNonNull(priceId, ProductChangePriceAction.class + ": priceId is missing");
        Objects.requireNonNull(price, ProductChangePriceAction.class + ": price is missing");
        return new ProductChangePriceActionImpl(priceId, price, staged);
    }
    
    /**
     * builds ProductChangePriceAction without checking for non-null required values
     * @return ProductChangePriceAction
     */
    public ProductChangePriceAction buildUnchecked() {
        return new ProductChangePriceActionImpl(priceId, price, staged);
    }

    /**
     * factory method for an instance of ProductChangePriceActionBuilder
     * @return builder 
     */
    public static ProductChangePriceActionBuilder of() {
        return new ProductChangePriceActionBuilder();
    }

    /**
     * create builder for ProductChangePriceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductChangePriceActionBuilder of(final ProductChangePriceAction template) {
        ProductChangePriceActionBuilder builder = new ProductChangePriceActionBuilder();
        builder.priceId = template.getPriceId();
        builder.price = template.getPrice();
        builder.staged = template.getStaged();
        return builder;
    }

}
