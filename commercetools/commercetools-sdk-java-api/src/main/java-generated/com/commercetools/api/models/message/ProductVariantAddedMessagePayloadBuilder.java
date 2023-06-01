package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.message.ProductVariantAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantAddedMessagePayload productVariantAddedMessagePayload = ProductVariantAddedMessagePayload.builder()
 *             .variant(variantBuilder -> variantBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductVariantAddedMessagePayloadBuilder implements Builder<ProductVariantAddedMessagePayload> {

    
    
    private com.commercetools.api.models.product.ProductVariant variant;
    
    
    
    private Boolean staged;

    
    /**
     *  <p>Unique identifier of the Product Variant that was added.</p>
     * @param builder function to build the variant value
     * @return Builder
     */
    
    public ProductVariantAddedMessagePayloadBuilder variant(Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.variant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Unique identifier of the Product Variant that was added.</p>
     * @param builder function to build the variant value
     * @return Builder
     */
    
    public ProductVariantAddedMessagePayloadBuilder withVariant(Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariant> builder) {
        this.variant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Unique identifier of the Product Variant that was added.</p>
     * @param variant value to be set
     * @return Builder
     */
    
    public ProductVariantAddedMessagePayloadBuilder variant( final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
        return this;
    }
    
    
    
    
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     * @return Builder
     */
    
    public ProductVariantAddedMessagePayloadBuilder staged( final Boolean staged) {
        this.staged = staged;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the Product Variant that was added.</p>
     * @return variant
     */
    
    
    public com.commercetools.api.models.product.ProductVariant getVariant(){
        return this.variant;
    }
    
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    
    
    public Boolean getStaged(){
        return this.staged;
    }

    /**
     * builds ProductVariantAddedMessagePayload with checking for non-null required values
     * @return ProductVariantAddedMessagePayload
     */
    public ProductVariantAddedMessagePayload build() {
        Objects.requireNonNull(variant, ProductVariantAddedMessagePayload.class + ": variant is missing");
        Objects.requireNonNull(staged, ProductVariantAddedMessagePayload.class + ": staged is missing");
        return new ProductVariantAddedMessagePayloadImpl(variant, staged);
    }
    
    /**
     * builds ProductVariantAddedMessagePayload without checking for non-null required values
     * @return ProductVariantAddedMessagePayload
     */
    public ProductVariantAddedMessagePayload buildUnchecked() {
        return new ProductVariantAddedMessagePayloadImpl(variant, staged);
    }

    /**
     * factory method for an instance of ProductVariantAddedMessagePayloadBuilder
     * @return builder 
     */
    public static ProductVariantAddedMessagePayloadBuilder of() {
        return new ProductVariantAddedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductVariantAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantAddedMessagePayloadBuilder of(final ProductVariantAddedMessagePayload template) {
        ProductVariantAddedMessagePayloadBuilder builder = new ProductVariantAddedMessagePayloadBuilder();
        builder.variant = template.getVariant();
        builder.staged = template.getStaged();
        return builder;
    }

}
