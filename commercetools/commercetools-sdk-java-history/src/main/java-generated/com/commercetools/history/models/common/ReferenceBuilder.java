package com.commercetools.history.models.common;

import com.commercetools.history.models.common.ReferenceTypeId;
import com.commercetools.history.models.common.Reference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Reference reference = Reference.builder()
 *             .id("{id}")
 *             .typeId(ReferenceTypeId.CART)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReferenceBuilder implements Builder<Reference> {

    
    
    private String id;
    
    
    
    private com.commercetools.history.models.common.ReferenceTypeId typeId;

    
    /**
     * set the value to the id
     * @param id value to be set
     * @return Builder
     */
    
    public ReferenceBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     * set the value to the typeId
     * @param typeId value to be set
     * @return Builder
     */
    
    public ReferenceBuilder typeId( final com.commercetools.history.models.common.ReferenceTypeId typeId) {
        this.typeId = typeId;
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
     * value of typeId}
     * @return typeId
     */
    
    
    public com.commercetools.history.models.common.ReferenceTypeId getTypeId(){
        return this.typeId;
    }

    /**
     * builds Reference with checking for non-null required values
     * @return Reference
     */
    public Reference build() {
        Objects.requireNonNull(id, Reference.class + ": id is missing");
        Objects.requireNonNull(typeId, Reference.class + ": typeId is missing");
        return new ReferenceImpl(id, typeId);
    }
    
    /**
     * builds Reference without checking for non-null required values
     * @return Reference
     */
    public Reference buildUnchecked() {
        return new ReferenceImpl(id, typeId);
    }

    /**
     * factory method for an instance of ReferenceBuilder
     * @return builder 
     */
    public static ReferenceBuilder of() {
        return new ReferenceBuilder();
    }

    /**
     * create builder for Reference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReferenceBuilder of(final Reference template) {
        ReferenceBuilder builder = new ReferenceBuilder();
        builder.id = template.getId();
        builder.typeId = template.getTypeId();
        return builder;
    }

}
