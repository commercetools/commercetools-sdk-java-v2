package com.commercetools.api.models.product_selection;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionResourceIdentifier productSelectionResourceIdentifier = ProductSelectionResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSelectionResourceIdentifierBuilder implements Builder<ProductSelectionResourceIdentifier> {

    
    @Nullable
    private String id;
    
    
    @Nullable
    private String key;

    
    /**
     *  <p>Unique identifier of the referenced ProductSelection. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public ProductSelectionResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined unique identifier of the referenced ProductSelection. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public ProductSelectionResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the referenced ProductSelection. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */
    
    @Nullable
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>User-defined unique identifier of the referenced ProductSelection. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds ProductSelectionResourceIdentifier with checking for non-null required values
     * @return ProductSelectionResourceIdentifier
     */
    public ProductSelectionResourceIdentifier build() {
        return new ProductSelectionResourceIdentifierImpl(id, key);
    }
    
    /**
     * builds ProductSelectionResourceIdentifier without checking for non-null required values
     * @return ProductSelectionResourceIdentifier
     */
    public ProductSelectionResourceIdentifier buildUnchecked() {
        return new ProductSelectionResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of ProductSelectionResourceIdentifierBuilder
     * @return builder 
     */
    public static ProductSelectionResourceIdentifierBuilder of() {
        return new ProductSelectionResourceIdentifierBuilder();
    }

    /**
     * create builder for ProductSelectionResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionResourceIdentifierBuilder of(final ProductSelectionResourceIdentifier template) {
        ProductSelectionResourceIdentifierBuilder builder = new ProductSelectionResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
