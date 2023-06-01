package com.commercetools.api.models.product;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductResourceIdentifier productResourceIdentifier = ProductResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductResourceIdentifierBuilder implements Builder<ProductResourceIdentifier> {

    
    @Nullable
    private String id;
    
    
    @Nullable
    private String key;

    
    /**
     *  <p>Unique identifier of the referenced Product.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public ProductResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined unique identifier of the referenced Product.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public ProductResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the referenced Product.</p>
     * @return id
     */
    
    @Nullable
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>User-defined unique identifier of the referenced Product.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds ProductResourceIdentifier with checking for non-null required values
     * @return ProductResourceIdentifier
     */
    public ProductResourceIdentifier build() {
        return new ProductResourceIdentifierImpl(id, key);
    }
    
    /**
     * builds ProductResourceIdentifier without checking for non-null required values
     * @return ProductResourceIdentifier
     */
    public ProductResourceIdentifier buildUnchecked() {
        return new ProductResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of ProductResourceIdentifierBuilder
     * @return builder 
     */
    public static ProductResourceIdentifierBuilder of() {
        return new ProductResourceIdentifierBuilder();
    }

    /**
     * create builder for ProductResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductResourceIdentifierBuilder of(final ProductResourceIdentifier template) {
        ProductResourceIdentifierBuilder builder = new ProductResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
