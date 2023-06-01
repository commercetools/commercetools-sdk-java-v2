package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_selection.ProductVariantSelection;
import com.commercetools.api.models.error.ProductPresentWithDifferentVariantSelectionError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPresentWithDifferentVariantSelectionErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPresentWithDifferentVariantSelectionError productPresentWithDifferentVariantSelectionError = ProductPresentWithDifferentVariantSelectionError.builder()
 *             .message("{message}")
 *             .product(productBuilder -> productBuilder)
 *             .existingVariantSelection(existingVariantSelectionBuilder -> existingVariantSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductPresentWithDifferentVariantSelectionErrorBuilder implements Builder<ProductPresentWithDifferentVariantSelectionError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private com.commercetools.api.models.product.ProductReference product;
    
    
    
    private com.commercetools.api.models.product_selection.ProductVariantSelection existingVariantSelection;

    
    /**
     *  <p><code>"Product is already present with the following different $variantSelections."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public ProductPresentWithDifferentVariantSelectionErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public ProductPresentWithDifferentVariantSelectionErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public ProductPresentWithDifferentVariantSelectionErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     * @param builder function to build the product value
     * @return Builder
     */
    
    public ProductPresentWithDifferentVariantSelectionErrorBuilder product(Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     * @param builder function to build the product value
     * @return Builder
     */
    
    public ProductPresentWithDifferentVariantSelectionErrorBuilder withProduct(Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     * @param product value to be set
     * @return Builder
     */
    
    public ProductPresentWithDifferentVariantSelectionErrorBuilder product( final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }
    
    
    
    
    /**
     *  <p>Existing Product Variant Selection or Exclusion for the Product in the Product Selection.</p>
     * @param existingVariantSelection value to be set
     * @return Builder
     */
    
    public ProductPresentWithDifferentVariantSelectionErrorBuilder existingVariantSelection( final com.commercetools.api.models.product_selection.ProductVariantSelection existingVariantSelection) {
        this.existingVariantSelection = existingVariantSelection;
        return this;
    }
    
    
    /**
     *  <p>Existing Product Variant Selection or Exclusion for the Product in the Product Selection.</p>
     * @param builder function to build the existingVariantSelection value
     * @return Builder
     */
    
    public ProductPresentWithDifferentVariantSelectionErrorBuilder existingVariantSelection(Function<com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductVariantSelection>> builder) {
        this.existingVariantSelection = builder.apply(com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder.of()).build();
        return this;
    }
                    

    /**
     *  <p><code>"Product is already present with the following different $variantSelections."</code></p>
     * @return message
     */
    
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */
    
    
    public Map<String, java.lang.Object> getValues(){
        return this.values;
    }
    
    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     * @return product
     */
    
    
    public com.commercetools.api.models.product.ProductReference getProduct(){
        return this.product;
    }
    
    /**
     *  <p>Existing Product Variant Selection or Exclusion for the Product in the Product Selection.</p>
     * @return existingVariantSelection
     */
    
    
    public com.commercetools.api.models.product_selection.ProductVariantSelection getExistingVariantSelection(){
        return this.existingVariantSelection;
    }

    /**
     * builds ProductPresentWithDifferentVariantSelectionError with checking for non-null required values
     * @return ProductPresentWithDifferentVariantSelectionError
     */
    public ProductPresentWithDifferentVariantSelectionError build() {
        Objects.requireNonNull(message, ProductPresentWithDifferentVariantSelectionError.class + ": message is missing");
        Objects.requireNonNull(product, ProductPresentWithDifferentVariantSelectionError.class + ": product is missing");
        Objects.requireNonNull(existingVariantSelection, ProductPresentWithDifferentVariantSelectionError.class + ": existingVariantSelection is missing");
        return new ProductPresentWithDifferentVariantSelectionErrorImpl(message, values, product, existingVariantSelection);
    }
    
    /**
     * builds ProductPresentWithDifferentVariantSelectionError without checking for non-null required values
     * @return ProductPresentWithDifferentVariantSelectionError
     */
    public ProductPresentWithDifferentVariantSelectionError buildUnchecked() {
        return new ProductPresentWithDifferentVariantSelectionErrorImpl(message, values, product, existingVariantSelection);
    }

    /**
     * factory method for an instance of ProductPresentWithDifferentVariantSelectionErrorBuilder
     * @return builder 
     */
    public static ProductPresentWithDifferentVariantSelectionErrorBuilder of() {
        return new ProductPresentWithDifferentVariantSelectionErrorBuilder();
    }

    /**
     * create builder for ProductPresentWithDifferentVariantSelectionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPresentWithDifferentVariantSelectionErrorBuilder of(final ProductPresentWithDifferentVariantSelectionError template) {
        ProductPresentWithDifferentVariantSelectionErrorBuilder builder = new ProductPresentWithDifferentVariantSelectionErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.product = template.getProduct();
        builder.existingVariantSelection = template.getExistingVariantSelection();
        return builder;
    }

}
