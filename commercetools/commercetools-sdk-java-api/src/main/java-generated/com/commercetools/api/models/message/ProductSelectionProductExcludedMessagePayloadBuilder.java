package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_selection.ProductVariantExclusion;
import com.commercetools.api.models.message.ProductSelectionProductExcludedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionProductExcludedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductExcludedMessagePayload productSelectionProductExcludedMessagePayload = ProductSelectionProductExcludedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .variantExclusion(variantExclusionBuilder -> variantExclusionBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSelectionProductExcludedMessagePayloadBuilder implements Builder<ProductSelectionProductExcludedMessagePayload> {

    
    
    private com.commercetools.api.models.product.ProductReference product;
    
    
    
    private com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion;

    
    /**
     *  <p>Product that was excluded from the Product Selection.</p>
     * @param builder function to build the product value
     * @return Builder
     */
    
    public ProductSelectionProductExcludedMessagePayloadBuilder product(Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Product that was excluded from the Product Selection.</p>
     * @param builder function to build the product value
     * @return Builder
     */
    
    public ProductSelectionProductExcludedMessagePayloadBuilder withProduct(Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Product that was excluded from the Product Selection.</p>
     * @param product value to be set
     * @return Builder
     */
    
    public ProductSelectionProductExcludedMessagePayloadBuilder product( final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }
    
    
    
    
    /**
     *  <p>Product Variant Exclusion after the Exclude Product update action.</p>
     * @param builder function to build the variantExclusion value
     * @return Builder
     */
    
    public ProductSelectionProductExcludedMessagePayloadBuilder variantExclusion(Function<com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder, com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder> builder) {
        this.variantExclusion = builder.apply(com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Product Variant Exclusion after the Exclude Product update action.</p>
     * @param builder function to build the variantExclusion value
     * @return Builder
     */
    
    public ProductSelectionProductExcludedMessagePayloadBuilder withVariantExclusion(Function<com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder, com.commercetools.api.models.product_selection.ProductVariantExclusion> builder) {
        this.variantExclusion = builder.apply(com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Product Variant Exclusion after the Exclude Product update action.</p>
     * @param variantExclusion value to be set
     * @return Builder
     */
    
    public ProductSelectionProductExcludedMessagePayloadBuilder variantExclusion( final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion) {
        this.variantExclusion = variantExclusion;
        return this;
    }
    
    

    /**
     *  <p>Product that was excluded from the Product Selection.</p>
     * @return product
     */
    
    
    public com.commercetools.api.models.product.ProductReference getProduct(){
        return this.product;
    }
    
    /**
     *  <p>Product Variant Exclusion after the Exclude Product update action.</p>
     * @return variantExclusion
     */
    
    
    public com.commercetools.api.models.product_selection.ProductVariantExclusion getVariantExclusion(){
        return this.variantExclusion;
    }

    /**
     * builds ProductSelectionProductExcludedMessagePayload with checking for non-null required values
     * @return ProductSelectionProductExcludedMessagePayload
     */
    public ProductSelectionProductExcludedMessagePayload build() {
        Objects.requireNonNull(product, ProductSelectionProductExcludedMessagePayload.class + ": product is missing");
        Objects.requireNonNull(variantExclusion, ProductSelectionProductExcludedMessagePayload.class + ": variantExclusion is missing");
        return new ProductSelectionProductExcludedMessagePayloadImpl(product, variantExclusion);
    }
    
    /**
     * builds ProductSelectionProductExcludedMessagePayload without checking for non-null required values
     * @return ProductSelectionProductExcludedMessagePayload
     */
    public ProductSelectionProductExcludedMessagePayload buildUnchecked() {
        return new ProductSelectionProductExcludedMessagePayloadImpl(product, variantExclusion);
    }

    /**
     * factory method for an instance of ProductSelectionProductExcludedMessagePayloadBuilder
     * @return builder 
     */
    public static ProductSelectionProductExcludedMessagePayloadBuilder of() {
        return new ProductSelectionProductExcludedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductSelectionProductExcludedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionProductExcludedMessagePayloadBuilder of(final ProductSelectionProductExcludedMessagePayload template) {
        ProductSelectionProductExcludedMessagePayloadBuilder builder = new ProductSelectionProductExcludedMessagePayloadBuilder();
        builder.product = template.getProduct();
        builder.variantExclusion = template.getVariantExclusion();
        return builder;
    }

}
