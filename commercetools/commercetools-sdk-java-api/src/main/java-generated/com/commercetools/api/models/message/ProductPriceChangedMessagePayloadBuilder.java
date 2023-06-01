package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ProductPriceChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceChangedMessagePayload productPriceChangedMessagePayload = ProductPriceChangedMessagePayload.builder()
 *             .variantId(0.3)
 *             .oldPrice(oldPriceBuilder -> oldPriceBuilder)
 *             .newPrice(newPriceBuilder -> newPriceBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductPriceChangedMessagePayloadBuilder implements Builder<ProductPriceChangedMessagePayload> {

    
    
    private Long variantId;
    
    
    
    private com.commercetools.api.models.common.Price oldPrice;
    
    
    
    private com.commercetools.api.models.common.Price newPrice;
    
    
    
    private Boolean staged;
    
    
    @Nullable
    private com.commercetools.api.models.common.Price oldStagedPrice;

    
    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was changed.</p>
     * @param variantId value to be set
     * @return Builder
     */
    
    public ProductPriceChangedMessagePayloadBuilder variantId( final Long variantId) {
        this.variantId = variantId;
        return this;
    }
    
    
    
    
    /**
     *  <p>The current Embedded Price before the Change Embedded Price update action.</p>
     * @param builder function to build the oldPrice value
     * @return Builder
     */
    
    public ProductPriceChangedMessagePayloadBuilder oldPrice(Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.oldPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The current Embedded Price before the Change Embedded Price update action.</p>
     * @param builder function to build the oldPrice value
     * @return Builder
     */
    
    public ProductPriceChangedMessagePayloadBuilder withOldPrice(Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.Price> builder) {
        this.oldPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The current Embedded Price before the Change Embedded Price update action.</p>
     * @param oldPrice value to be set
     * @return Builder
     */
    
    public ProductPriceChangedMessagePayloadBuilder oldPrice( final com.commercetools.api.models.common.Price oldPrice) {
        this.oldPrice = oldPrice;
        return this;
    }
    
    
    
    
    /**
     *  <p>The Embedded Price after the Change Embedded Price update action.</p>
     * @param builder function to build the newPrice value
     * @return Builder
     */
    
    public ProductPriceChangedMessagePayloadBuilder newPrice(Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.newPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The Embedded Price after the Change Embedded Price update action.</p>
     * @param builder function to build the newPrice value
     * @return Builder
     */
    
    public ProductPriceChangedMessagePayloadBuilder withNewPrice(Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.Price> builder) {
        this.newPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The Embedded Price after the Change Embedded Price update action.</p>
     * @param newPrice value to be set
     * @return Builder
     */
    
    public ProductPriceChangedMessagePayloadBuilder newPrice( final com.commercetools.api.models.common.Price newPrice) {
        this.newPrice = newPrice;
        return this;
    }
    
    
    
    
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     * @return Builder
     */
    
    public ProductPriceChangedMessagePayloadBuilder staged( final Boolean staged) {
        this.staged = staged;
        return this;
    }
    
    
    
    
    /**
     *  <p>The staged Embedded Price before the Change Embedded Price update action.</p>
     * @param builder function to build the oldStagedPrice value
     * @return Builder
     */
    
    public ProductPriceChangedMessagePayloadBuilder oldStagedPrice(Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.oldStagedPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The staged Embedded Price before the Change Embedded Price update action.</p>
     * @param builder function to build the oldStagedPrice value
     * @return Builder
     */
    
    public ProductPriceChangedMessagePayloadBuilder withOldStagedPrice(Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.Price> builder) {
        this.oldStagedPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The staged Embedded Price before the Change Embedded Price update action.</p>
     * @param oldStagedPrice value to be set
     * @return Builder
     */
    
    public ProductPriceChangedMessagePayloadBuilder oldStagedPrice(@Nullable final com.commercetools.api.models.common.Price oldStagedPrice) {
        this.oldStagedPrice = oldStagedPrice;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was changed.</p>
     * @return variantId
     */
    
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    /**
     *  <p>The current Embedded Price before the Change Embedded Price update action.</p>
     * @return oldPrice
     */
    
    
    public com.commercetools.api.models.common.Price getOldPrice(){
        return this.oldPrice;
    }
    
    /**
     *  <p>The Embedded Price after the Change Embedded Price update action.</p>
     * @return newPrice
     */
    
    
    public com.commercetools.api.models.common.Price getNewPrice(){
        return this.newPrice;
    }
    
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    
    
    public Boolean getStaged(){
        return this.staged;
    }
    
    /**
     *  <p>The staged Embedded Price before the Change Embedded Price update action.</p>
     * @return oldStagedPrice
     */
    
    @Nullable
    public com.commercetools.api.models.common.Price getOldStagedPrice(){
        return this.oldStagedPrice;
    }

    /**
     * builds ProductPriceChangedMessagePayload with checking for non-null required values
     * @return ProductPriceChangedMessagePayload
     */
    public ProductPriceChangedMessagePayload build() {
        Objects.requireNonNull(variantId, ProductPriceChangedMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(oldPrice, ProductPriceChangedMessagePayload.class + ": oldPrice is missing");
        Objects.requireNonNull(newPrice, ProductPriceChangedMessagePayload.class + ": newPrice is missing");
        Objects.requireNonNull(staged, ProductPriceChangedMessagePayload.class + ": staged is missing");
        return new ProductPriceChangedMessagePayloadImpl(variantId, oldPrice, newPrice, staged, oldStagedPrice);
    }
    
    /**
     * builds ProductPriceChangedMessagePayload without checking for non-null required values
     * @return ProductPriceChangedMessagePayload
     */
    public ProductPriceChangedMessagePayload buildUnchecked() {
        return new ProductPriceChangedMessagePayloadImpl(variantId, oldPrice, newPrice, staged, oldStagedPrice);
    }

    /**
     * factory method for an instance of ProductPriceChangedMessagePayloadBuilder
     * @return builder 
     */
    public static ProductPriceChangedMessagePayloadBuilder of() {
        return new ProductPriceChangedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductPriceChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceChangedMessagePayloadBuilder of(final ProductPriceChangedMessagePayload template) {
        ProductPriceChangedMessagePayloadBuilder builder = new ProductPriceChangedMessagePayloadBuilder();
        builder.variantId = template.getVariantId();
        builder.oldPrice = template.getOldPrice();
        builder.newPrice = template.getNewPrice();
        builder.staged = template.getStaged();
        builder.oldStagedPrice = template.getOldStagedPrice();
        return builder;
    }

}
