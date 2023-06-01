package com.commercetools.api.models.attribute_group;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.attribute_group.AttributeGroupResourceIdentifier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupResourceIdentifier attributeGroupResourceIdentifier = AttributeGroupResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeGroupResourceIdentifierBuilder implements Builder<AttributeGroupResourceIdentifier> {

    
    @Nullable
    private String id;
    
    
    @Nullable
    private String key;

    
    /**
     *  <p>Platform-generated unique identifier of the referenced AttributeGroup. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public AttributeGroupResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-generated unique identifier of the referenced AttributeGroup. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public AttributeGroupResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Platform-generated unique identifier of the referenced AttributeGroup. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */
    
    @Nullable
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>User-generated unique identifier of the referenced AttributeGroup. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds AttributeGroupResourceIdentifier with checking for non-null required values
     * @return AttributeGroupResourceIdentifier
     */
    public AttributeGroupResourceIdentifier build() {
        return new AttributeGroupResourceIdentifierImpl(id, key);
    }
    
    /**
     * builds AttributeGroupResourceIdentifier without checking for non-null required values
     * @return AttributeGroupResourceIdentifier
     */
    public AttributeGroupResourceIdentifier buildUnchecked() {
        return new AttributeGroupResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of AttributeGroupResourceIdentifierBuilder
     * @return builder 
     */
    public static AttributeGroupResourceIdentifierBuilder of() {
        return new AttributeGroupResourceIdentifierBuilder();
    }

    /**
     * create builder for AttributeGroupResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupResourceIdentifierBuilder of(final AttributeGroupResourceIdentifier template) {
        AttributeGroupResourceIdentifierBuilder builder = new AttributeGroupResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
