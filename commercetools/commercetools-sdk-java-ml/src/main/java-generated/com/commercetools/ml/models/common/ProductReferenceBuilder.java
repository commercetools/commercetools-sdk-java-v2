package com.commercetools.ml.models.common;

import com.commercetools.ml.models.common.Reference;
import com.commercetools.ml.models.common.ReferenceTypeId;
import com.commercetools.ml.models.common.ProductReference;
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

    
    /**
     * set the value to the id
     * @param id value to be set
     * @return Builder
     */
    
    public ProductReferenceBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    

    /**
     * value of id}
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }

    /**
     * builds ProductReference with checking for non-null required values
     * @return ProductReference
     */
    public ProductReference build() {
        Objects.requireNonNull(id, ProductReference.class + ": id is missing");
        return new ProductReferenceImpl(id);
    }
    
    /**
     * builds ProductReference without checking for non-null required values
     * @return ProductReference
     */
    public ProductReference buildUnchecked() {
        return new ProductReferenceImpl(id);
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
        return builder;
    }

}
