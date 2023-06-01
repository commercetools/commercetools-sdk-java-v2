package com.commercetools.api.models.product;

import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductRemovePriceAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductRemovePriceActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemovePriceAction productRemovePriceAction = ProductRemovePriceAction.builder()
 *             .priceId("{priceId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductRemovePriceActionBuilder implements Builder<ProductRemovePriceAction> {

    
    
    private String priceId;
    
    
    @Nullable
    private String sku;
    
    
    @Nullable
    private Long variantId;
    
    
    @Nullable
    private com.commercetools.api.models.common.PriceDraft price;
    
    
    @Nullable
    private Boolean staged;

    
    /**
     *  <p>The <code>id</code> of the Embedded Price to remove.</p>
     * @param priceId value to be set
     * @return Builder
     */
    
    public ProductRemovePriceActionBuilder priceId( final String priceId) {
        this.priceId = priceId;
        return this;
    }
    
    
    
    
    /**
     *  <p>The <code>sku</code> of the ProductVariant the provided Price should be removed from. Either 'variantId' or 'sku' is required" when <code>priceId</code> is not provided. This field is now deprecated, use 'priceId' instead.</p>
     * @param sku value to be set
     * @return Builder
     */
    
    public ProductRemovePriceActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }
    
    
    
    
    /**
     *  <p>The <code>id</code> of the ProductVariant the provided Price should be removed from. Either 'variantId' or 'sku' is required" when <code>priceId</code> is not provided. This field is now deprecated, use 'priceId' instead.</p>
     * @param variantId value to be set
     * @return Builder
     */
    
    public ProductRemovePriceActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }
    
    
    
    
    /**
     *  <p>The Price identical to the one to be removed from the ProductVariant. This field is now deprecated, use 'priceId' instead.</p>
     * @param builder function to build the price value
     * @return Builder
     */
    
    public ProductRemovePriceActionBuilder price(Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The Price identical to the one to be removed from the ProductVariant. This field is now deprecated, use 'priceId' instead.</p>
     * @param builder function to build the price value
     * @return Builder
     */
    
    public ProductRemovePriceActionBuilder withPrice(Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraft> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The Price identical to the one to be removed from the ProductVariant. This field is now deprecated, use 'priceId' instead.</p>
     * @param price value to be set
     * @return Builder
     */
    
    public ProductRemovePriceActionBuilder price(@Nullable final com.commercetools.api.models.common.PriceDraft price) {
        this.price = price;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is removed. If <code>false</code>, both the current and staged Embedded Price are removed.</p>
     * @param staged value to be set
     * @return Builder
     */
    
    public ProductRemovePriceActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }
    
    

    /**
     *  <p>The <code>id</code> of the Embedded Price to remove.</p>
     * @return priceId
     */
    
    
    public String getPriceId(){
        return this.priceId;
    }
    
    /**
     *  <p>The <code>sku</code> of the ProductVariant the provided Price should be removed from. Either 'variantId' or 'sku' is required" when <code>priceId</code> is not provided. This field is now deprecated, use 'priceId' instead.</p>
     * @return sku
     */
    
    @Nullable
    public String getSku(){
        return this.sku;
    }
    
    /**
     *  <p>The <code>id</code> of the ProductVariant the provided Price should be removed from. Either 'variantId' or 'sku' is required" when <code>priceId</code> is not provided. This field is now deprecated, use 'priceId' instead.</p>
     * @return variantId
     */
    
    @Nullable
    public Long getVariantId(){
        return this.variantId;
    }
    
    /**
     *  <p>The Price identical to the one to be removed from the ProductVariant. This field is now deprecated, use 'priceId' instead.</p>
     * @return price
     */
    
    @Nullable
    public com.commercetools.api.models.common.PriceDraft getPrice(){
        return this.price;
    }
    
    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is removed. If <code>false</code>, both the current and staged Embedded Price are removed.</p>
     * @return staged
     */
    
    @Nullable
    public Boolean getStaged(){
        return this.staged;
    }

    /**
     * builds ProductRemovePriceAction with checking for non-null required values
     * @return ProductRemovePriceAction
     */
    public ProductRemovePriceAction build() {
        Objects.requireNonNull(priceId, ProductRemovePriceAction.class + ": priceId is missing");
        return new ProductRemovePriceActionImpl(priceId, sku, variantId, price, staged);
    }
    
    /**
     * builds ProductRemovePriceAction without checking for non-null required values
     * @return ProductRemovePriceAction
     */
    public ProductRemovePriceAction buildUnchecked() {
        return new ProductRemovePriceActionImpl(priceId, sku, variantId, price, staged);
    }

    /**
     * factory method for an instance of ProductRemovePriceActionBuilder
     * @return builder 
     */
    public static ProductRemovePriceActionBuilder of() {
        return new ProductRemovePriceActionBuilder();
    }

    /**
     * create builder for ProductRemovePriceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductRemovePriceActionBuilder of(final ProductRemovePriceAction template) {
        ProductRemovePriceActionBuilder builder = new ProductRemovePriceActionBuilder();
        builder.priceId = template.getPriceId();
        builder.sku = template.getSku();
        builder.variantId = template.getVariantId();
        builder.price = template.getPrice();
        builder.staged = template.getStaged();
        return builder;
    }

}
