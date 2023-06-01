package com.commercetools.api.models.product;

import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductAddPriceAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductAddPriceActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddPriceAction productAddPriceAction = ProductAddPriceAction.builder()
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductAddPriceActionBuilder implements Builder<ProductAddPriceAction> {

    
    @Nullable
    private Long variantId;
    
    
    @Nullable
    private String sku;
    
    
    
    private com.commercetools.api.models.common.PriceDraft price;
    
    
    @Nullable
    private Boolean staged;

    
    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */
    
    public ProductAddPriceActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }
    
    
    
    
    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */
    
    public ProductAddPriceActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }
    
    
    
    
    /**
     *  <p>Embedded Price to add to the Product Variant.</p>
     * @param builder function to build the price value
     * @return Builder
     */
    
    public ProductAddPriceActionBuilder price(Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Embedded Price to add to the Product Variant.</p>
     * @param builder function to build the price value
     * @return Builder
     */
    
    public ProductAddPriceActionBuilder withPrice(Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraft> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Embedded Price to add to the Product Variant.</p>
     * @param price value to be set
     * @return Builder
     */
    
    public ProductAddPriceActionBuilder price( final com.commercetools.api.models.common.PriceDraft price) {
        this.price = price;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>true</code>, only the staged <code>prices</code> is updated. If <code>false</code>, both the current and staged <code>prices</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */
    
    public ProductAddPriceActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }
    
    

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */
    
    @Nullable
    public Long getVariantId(){
        return this.variantId;
    }
    
    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @return sku
     */
    
    @Nullable
    public String getSku(){
        return this.sku;
    }
    
    /**
     *  <p>Embedded Price to add to the Product Variant.</p>
     * @return price
     */
    
    
    public com.commercetools.api.models.common.PriceDraft getPrice(){
        return this.price;
    }
    
    /**
     *  <p>If <code>true</code>, only the staged <code>prices</code> is updated. If <code>false</code>, both the current and staged <code>prices</code> are updated.</p>
     * @return staged
     */
    
    @Nullable
    public Boolean getStaged(){
        return this.staged;
    }

    /**
     * builds ProductAddPriceAction with checking for non-null required values
     * @return ProductAddPriceAction
     */
    public ProductAddPriceAction build() {
        Objects.requireNonNull(price, ProductAddPriceAction.class + ": price is missing");
        return new ProductAddPriceActionImpl(variantId, sku, price, staged);
    }
    
    /**
     * builds ProductAddPriceAction without checking for non-null required values
     * @return ProductAddPriceAction
     */
    public ProductAddPriceAction buildUnchecked() {
        return new ProductAddPriceActionImpl(variantId, sku, price, staged);
    }

    /**
     * factory method for an instance of ProductAddPriceActionBuilder
     * @return builder 
     */
    public static ProductAddPriceActionBuilder of() {
        return new ProductAddPriceActionBuilder();
    }

    /**
     * create builder for ProductAddPriceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductAddPriceActionBuilder of(final ProductAddPriceAction template) {
        ProductAddPriceActionBuilder builder = new ProductAddPriceActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.price = template.getPrice();
        builder.staged = template.getStaged();
        return builder;
    }

}
