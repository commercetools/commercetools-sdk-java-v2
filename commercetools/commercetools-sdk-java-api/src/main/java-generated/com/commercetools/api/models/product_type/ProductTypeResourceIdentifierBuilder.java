package com.commercetools.api.models.product_type;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.product_type.ProductTypeResourceIdentifier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeResourceIdentifier productTypeResourceIdentifier = ProductTypeResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeResourceIdentifierBuilder implements Builder<ProductTypeResourceIdentifier> {

    
    @Nullable
    private String id;
    
    
    @Nullable
    private String key;

    
    /**
     *  <p>Unique identifier of the referenced ProductType. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public ProductTypeResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined unique identifier of the referenced ProductType. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public ProductTypeResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the referenced ProductType. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */
    
    @Nullable
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>User-defined unique identifier of the referenced ProductType. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds ProductTypeResourceIdentifier with checking for non-null required values
     * @return ProductTypeResourceIdentifier
     */
    public ProductTypeResourceIdentifier build() {
        return new ProductTypeResourceIdentifierImpl(id, key);
    }
    
    /**
     * builds ProductTypeResourceIdentifier without checking for non-null required values
     * @return ProductTypeResourceIdentifier
     */
    public ProductTypeResourceIdentifier buildUnchecked() {
        return new ProductTypeResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of ProductTypeResourceIdentifierBuilder
     * @return builder 
     */
    public static ProductTypeResourceIdentifierBuilder of() {
        return new ProductTypeResourceIdentifierBuilder();
    }

    /**
     * create builder for ProductTypeResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeResourceIdentifierBuilder of(final ProductTypeResourceIdentifier template) {
        ProductTypeResourceIdentifierBuilder builder = new ProductTypeResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
