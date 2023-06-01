package com.commercetools.api.models.type;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeResourceIdentifier typeResourceIdentifier = TypeResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TypeResourceIdentifierBuilder implements Builder<TypeResourceIdentifier> {

    
    @Nullable
    private String id;
    
    
    @Nullable
    private String key;

    
    /**
     *  <p>Unique identifier of the referenced Type. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public TypeResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined unique identifier of the referenced Type. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public TypeResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the referenced Type. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */
    
    @Nullable
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>User-defined unique identifier of the referenced Type. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds TypeResourceIdentifier with checking for non-null required values
     * @return TypeResourceIdentifier
     */
    public TypeResourceIdentifier build() {
        return new TypeResourceIdentifierImpl(id, key);
    }
    
    /**
     * builds TypeResourceIdentifier without checking for non-null required values
     * @return TypeResourceIdentifier
     */
    public TypeResourceIdentifier buildUnchecked() {
        return new TypeResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of TypeResourceIdentifierBuilder
     * @return builder 
     */
    public static TypeResourceIdentifierBuilder of() {
        return new TypeResourceIdentifierBuilder();
    }

    /**
     * create builder for TypeResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeResourceIdentifierBuilder of(final TypeResourceIdentifier template) {
        TypeResourceIdentifierBuilder builder = new TypeResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
