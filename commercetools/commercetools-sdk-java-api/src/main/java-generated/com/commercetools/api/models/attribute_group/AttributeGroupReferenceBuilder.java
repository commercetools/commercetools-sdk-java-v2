package com.commercetools.api.models.attribute_group;

import com.commercetools.api.models.attribute_group.AttributeGroup;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.attribute_group.AttributeGroupReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupReference attributeGroupReference = AttributeGroupReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeGroupReferenceBuilder implements Builder<AttributeGroupReference> {

    
    
    private String id;
    
    
    @Nullable
    private com.commercetools.api.models.attribute_group.AttributeGroup obj;

    
    /**
     *  <p>Platform-generated unique identifier of the referenced AttributeGroup.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public AttributeGroupReferenceBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Contains the representation of the expanded AttributeGroup. Only present in responses to requests with Reference Expansion for AttributeGroup.</p>
     * @param builder function to build the obj value
     * @return Builder
     */
    
    public AttributeGroupReferenceBuilder obj(Function<com.commercetools.api.models.attribute_group.AttributeGroupBuilder, com.commercetools.api.models.attribute_group.AttributeGroupBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.attribute_group.AttributeGroupBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Contains the representation of the expanded AttributeGroup. Only present in responses to requests with Reference Expansion for AttributeGroup.</p>
     * @param builder function to build the obj value
     * @return Builder
     */
    
    public AttributeGroupReferenceBuilder withObj(Function<com.commercetools.api.models.attribute_group.AttributeGroupBuilder, com.commercetools.api.models.attribute_group.AttributeGroup> builder) {
        this.obj = builder.apply(com.commercetools.api.models.attribute_group.AttributeGroupBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Contains the representation of the expanded AttributeGroup. Only present in responses to requests with Reference Expansion for AttributeGroup.</p>
     * @param obj value to be set
     * @return Builder
     */
    
    public AttributeGroupReferenceBuilder obj(@Nullable final com.commercetools.api.models.attribute_group.AttributeGroup obj) {
        this.obj = obj;
        return this;
    }
    
    

    /**
     *  <p>Platform-generated unique identifier of the referenced AttributeGroup.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Contains the representation of the expanded AttributeGroup. Only present in responses to requests with Reference Expansion for AttributeGroup.</p>
     * @return obj
     */
    
    @Nullable
    public com.commercetools.api.models.attribute_group.AttributeGroup getObj(){
        return this.obj;
    }

    /**
     * builds AttributeGroupReference with checking for non-null required values
     * @return AttributeGroupReference
     */
    public AttributeGroupReference build() {
        Objects.requireNonNull(id, AttributeGroupReference.class + ": id is missing");
        return new AttributeGroupReferenceImpl(id, obj);
    }
    
    /**
     * builds AttributeGroupReference without checking for non-null required values
     * @return AttributeGroupReference
     */
    public AttributeGroupReference buildUnchecked() {
        return new AttributeGroupReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of AttributeGroupReferenceBuilder
     * @return builder 
     */
    public static AttributeGroupReferenceBuilder of() {
        return new AttributeGroupReferenceBuilder();
    }

    /**
     * create builder for AttributeGroupReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupReferenceBuilder of(final AttributeGroupReference template) {
        AttributeGroupReferenceBuilder builder = new AttributeGroupReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
