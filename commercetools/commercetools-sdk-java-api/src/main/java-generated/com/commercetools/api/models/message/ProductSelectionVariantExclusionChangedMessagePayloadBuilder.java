package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_selection.ProductVariantExclusion;
import com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionVariantExclusionChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionVariantExclusionChangedMessagePayload productSelectionVariantExclusionChangedMessagePayload = ProductSelectionVariantExclusionChangedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .oldVariantExclusion(oldVariantExclusionBuilder -> oldVariantExclusionBuilder)
 *             .newVariantExclusion(newVariantExclusionBuilder -> newVariantExclusionBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSelectionVariantExclusionChangedMessagePayloadBuilder implements Builder<ProductSelectionVariantExclusionChangedMessagePayload> {

    
    
    private com.commercetools.api.models.product.ProductReference product;
    
    
    
    private com.commercetools.api.models.product_selection.ProductVariantExclusion oldVariantExclusion;
    
    
    
    private com.commercetools.api.models.product_selection.ProductVariantExclusion newVariantExclusion;

    
    /**
     *  <p>Product for which the Product Variant Exclusion changed.</p>
     * @param builder function to build the product value
     * @return Builder
     */
    
    public ProductSelectionVariantExclusionChangedMessagePayloadBuilder product(Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Product for which the Product Variant Exclusion changed.</p>
     * @param builder function to build the product value
     * @return Builder
     */
    
    public ProductSelectionVariantExclusionChangedMessagePayloadBuilder withProduct(Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Product for which the Product Variant Exclusion changed.</p>
     * @param product value to be set
     * @return Builder
     */
    
    public ProductSelectionVariantExclusionChangedMessagePayloadBuilder product( final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }
    
    
    
    
    /**
     *  <p>Product Variant Exclusion before the Set Variant Exclusion update action.</p>
     * @param builder function to build the oldVariantExclusion value
     * @return Builder
     */
    
    public ProductSelectionVariantExclusionChangedMessagePayloadBuilder oldVariantExclusion(Function<com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder, com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder> builder) {
        this.oldVariantExclusion = builder.apply(com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Product Variant Exclusion before the Set Variant Exclusion update action.</p>
     * @param builder function to build the oldVariantExclusion value
     * @return Builder
     */
    
    public ProductSelectionVariantExclusionChangedMessagePayloadBuilder withOldVariantExclusion(Function<com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder, com.commercetools.api.models.product_selection.ProductVariantExclusion> builder) {
        this.oldVariantExclusion = builder.apply(com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Product Variant Exclusion before the Set Variant Exclusion update action.</p>
     * @param oldVariantExclusion value to be set
     * @return Builder
     */
    
    public ProductSelectionVariantExclusionChangedMessagePayloadBuilder oldVariantExclusion( final com.commercetools.api.models.product_selection.ProductVariantExclusion oldVariantExclusion) {
        this.oldVariantExclusion = oldVariantExclusion;
        return this;
    }
    
    
    
    
    /**
     *  <p>Product Variant Exclusion after the Set Variant Exclusion update action.</p>
     * @param builder function to build the newVariantExclusion value
     * @return Builder
     */
    
    public ProductSelectionVariantExclusionChangedMessagePayloadBuilder newVariantExclusion(Function<com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder, com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder> builder) {
        this.newVariantExclusion = builder.apply(com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Product Variant Exclusion after the Set Variant Exclusion update action.</p>
     * @param builder function to build the newVariantExclusion value
     * @return Builder
     */
    
    public ProductSelectionVariantExclusionChangedMessagePayloadBuilder withNewVariantExclusion(Function<com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder, com.commercetools.api.models.product_selection.ProductVariantExclusion> builder) {
        this.newVariantExclusion = builder.apply(com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Product Variant Exclusion after the Set Variant Exclusion update action.</p>
     * @param newVariantExclusion value to be set
     * @return Builder
     */
    
    public ProductSelectionVariantExclusionChangedMessagePayloadBuilder newVariantExclusion( final com.commercetools.api.models.product_selection.ProductVariantExclusion newVariantExclusion) {
        this.newVariantExclusion = newVariantExclusion;
        return this;
    }
    
    

    /**
     *  <p>Product for which the Product Variant Exclusion changed.</p>
     * @return product
     */
    
    
    public com.commercetools.api.models.product.ProductReference getProduct(){
        return this.product;
    }
    
    /**
     *  <p>Product Variant Exclusion before the Set Variant Exclusion update action.</p>
     * @return oldVariantExclusion
     */
    
    
    public com.commercetools.api.models.product_selection.ProductVariantExclusion getOldVariantExclusion(){
        return this.oldVariantExclusion;
    }
    
    /**
     *  <p>Product Variant Exclusion after the Set Variant Exclusion update action.</p>
     * @return newVariantExclusion
     */
    
    
    public com.commercetools.api.models.product_selection.ProductVariantExclusion getNewVariantExclusion(){
        return this.newVariantExclusion;
    }

    /**
     * builds ProductSelectionVariantExclusionChangedMessagePayload with checking for non-null required values
     * @return ProductSelectionVariantExclusionChangedMessagePayload
     */
    public ProductSelectionVariantExclusionChangedMessagePayload build() {
        Objects.requireNonNull(product, ProductSelectionVariantExclusionChangedMessagePayload.class + ": product is missing");
        Objects.requireNonNull(oldVariantExclusion, ProductSelectionVariantExclusionChangedMessagePayload.class + ": oldVariantExclusion is missing");
        Objects.requireNonNull(newVariantExclusion, ProductSelectionVariantExclusionChangedMessagePayload.class + ": newVariantExclusion is missing");
        return new ProductSelectionVariantExclusionChangedMessagePayloadImpl(product, oldVariantExclusion, newVariantExclusion);
    }
    
    /**
     * builds ProductSelectionVariantExclusionChangedMessagePayload without checking for non-null required values
     * @return ProductSelectionVariantExclusionChangedMessagePayload
     */
    public ProductSelectionVariantExclusionChangedMessagePayload buildUnchecked() {
        return new ProductSelectionVariantExclusionChangedMessagePayloadImpl(product, oldVariantExclusion, newVariantExclusion);
    }

    /**
     * factory method for an instance of ProductSelectionVariantExclusionChangedMessagePayloadBuilder
     * @return builder 
     */
    public static ProductSelectionVariantExclusionChangedMessagePayloadBuilder of() {
        return new ProductSelectionVariantExclusionChangedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductSelectionVariantExclusionChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionVariantExclusionChangedMessagePayloadBuilder of(final ProductSelectionVariantExclusionChangedMessagePayload template) {
        ProductSelectionVariantExclusionChangedMessagePayloadBuilder builder = new ProductSelectionVariantExclusionChangedMessagePayloadBuilder();
        builder.product = template.getProduct();
        builder.oldVariantExclusion = template.getOldVariantExclusion();
        builder.newVariantExclusion = template.getNewVariantExclusion();
        return builder;
    }

}
