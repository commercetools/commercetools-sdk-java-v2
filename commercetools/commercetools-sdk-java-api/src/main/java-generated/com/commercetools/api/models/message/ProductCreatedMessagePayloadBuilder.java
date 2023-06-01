package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.message.ProductCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductCreatedMessagePayload productCreatedMessagePayload = ProductCreatedMessagePayload.builder()
 *             .productProjection(productProjectionBuilder -> productProjectionBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductCreatedMessagePayloadBuilder implements Builder<ProductCreatedMessagePayload> {

    
    
    private com.commercetools.api.models.product.ProductProjection productProjection;

    
    /**
     *  <p>The staged Product Projection of the Product at the time of creation.</p>
     * @param builder function to build the productProjection value
     * @return Builder
     */
    
    public ProductCreatedMessagePayloadBuilder productProjection(Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        this.productProjection = builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The staged Product Projection of the Product at the time of creation.</p>
     * @param builder function to build the productProjection value
     * @return Builder
     */
    
    public ProductCreatedMessagePayloadBuilder withProductProjection(Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjection> builder) {
        this.productProjection = builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The staged Product Projection of the Product at the time of creation.</p>
     * @param productProjection value to be set
     * @return Builder
     */
    
    public ProductCreatedMessagePayloadBuilder productProjection( final com.commercetools.api.models.product.ProductProjection productProjection) {
        this.productProjection = productProjection;
        return this;
    }
    
    

    /**
     *  <p>The staged Product Projection of the Product at the time of creation.</p>
     * @return productProjection
     */
    
    
    public com.commercetools.api.models.product.ProductProjection getProductProjection(){
        return this.productProjection;
    }

    /**
     * builds ProductCreatedMessagePayload with checking for non-null required values
     * @return ProductCreatedMessagePayload
     */
    public ProductCreatedMessagePayload build() {
        Objects.requireNonNull(productProjection, ProductCreatedMessagePayload.class + ": productProjection is missing");
        return new ProductCreatedMessagePayloadImpl(productProjection);
    }
    
    /**
     * builds ProductCreatedMessagePayload without checking for non-null required values
     * @return ProductCreatedMessagePayload
     */
    public ProductCreatedMessagePayload buildUnchecked() {
        return new ProductCreatedMessagePayloadImpl(productProjection);
    }

    /**
     * factory method for an instance of ProductCreatedMessagePayloadBuilder
     * @return builder 
     */
    public static ProductCreatedMessagePayloadBuilder of() {
        return new ProductCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductCreatedMessagePayloadBuilder of(final ProductCreatedMessagePayload template) {
        ProductCreatedMessagePayloadBuilder builder = new ProductCreatedMessagePayloadBuilder();
        builder.productProjection = template.getProductProjection();
        return builder;
    }

}
