package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeResourceIdentifier discountCodeResourceIdentifier = DiscountCodeResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountCodeResourceIdentifierBuilder implements Builder<DiscountCodeResourceIdentifier> {

    
    @Nullable
    private String id;
    
    
    @Nullable
    private String key;

    
    /**
     *  <p>Unique identifier of the referenced DiscountCode. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public DiscountCodeResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined unique identifier of the referenced DiscountCode. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public DiscountCodeResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the referenced DiscountCode. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */
    
    @Nullable
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>User-defined unique identifier of the referenced DiscountCode. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds DiscountCodeResourceIdentifier with checking for non-null required values
     * @return DiscountCodeResourceIdentifier
     */
    public DiscountCodeResourceIdentifier build() {
        return new DiscountCodeResourceIdentifierImpl(id, key);
    }
    
    /**
     * builds DiscountCodeResourceIdentifier without checking for non-null required values
     * @return DiscountCodeResourceIdentifier
     */
    public DiscountCodeResourceIdentifier buildUnchecked() {
        return new DiscountCodeResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of DiscountCodeResourceIdentifierBuilder
     * @return builder 
     */
    public static DiscountCodeResourceIdentifierBuilder of() {
        return new DiscountCodeResourceIdentifierBuilder();
    }

    /**
     * create builder for DiscountCodeResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeResourceIdentifierBuilder of(final DiscountCodeResourceIdentifier template) {
        DiscountCodeResourceIdentifierBuilder builder = new DiscountCodeResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
