package com.commercetools.api.models.product;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductReference productReference = ProductReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductReferenceBuilder implements Builder<ProductReference> {

    
    
    private String id;
    
    
    @Nullable
    private com.commercetools.api.models.product.Product obj;

    
    /**
     *  <p>Unique identifier of the referenced Product.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public ProductReferenceBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Contains the representation of the expanded Product. Only present in responses to requests with Reference Expansion for Products.</p>
     * @param builder function to build the obj value
     * @return Builder
     */
    
    public ProductReferenceBuilder obj(Function<com.commercetools.api.models.product.ProductBuilder, com.commercetools.api.models.product.ProductBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.product.ProductBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Contains the representation of the expanded Product. Only present in responses to requests with Reference Expansion for Products.</p>
     * @param builder function to build the obj value
     * @return Builder
     */
    
    public ProductReferenceBuilder withObj(Function<com.commercetools.api.models.product.ProductBuilder, com.commercetools.api.models.product.Product> builder) {
        this.obj = builder.apply(com.commercetools.api.models.product.ProductBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Contains the representation of the expanded Product. Only present in responses to requests with Reference Expansion for Products.</p>
     * @param obj value to be set
     * @return Builder
     */
    
    public ProductReferenceBuilder obj(@Nullable final com.commercetools.api.models.product.Product obj) {
        this.obj = obj;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the referenced Product.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Contains the representation of the expanded Product. Only present in responses to requests with Reference Expansion for Products.</p>
     * @return obj
     */
    
    @Nullable
    public com.commercetools.api.models.product.Product getObj(){
        return this.obj;
    }

    /**
     * builds ProductReference with checking for non-null required values
     * @return ProductReference
     */
    public ProductReference build() {
        Objects.requireNonNull(id, ProductReference.class + ": id is missing");
        return new ProductReferenceImpl(id, obj);
    }
    
    /**
     * builds ProductReference without checking for non-null required values
     * @return ProductReference
     */
    public ProductReference buildUnchecked() {
        return new ProductReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of ProductReferenceBuilder
     * @return builder 
     */
    public static ProductReferenceBuilder of() {
        return new ProductReferenceBuilder();
    }

    /**
     * create builder for ProductReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductReferenceBuilder of(final ProductReference template) {
        ProductReferenceBuilder builder = new ProductReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
