package com.commercetools.api.models.category;

import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.category.CategoryReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryReference categoryReference = CategoryReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CategoryReferenceBuilder implements Builder<CategoryReference> {

    
    
    private String id;
    
    
    @Nullable
    private com.commercetools.api.models.category.Category obj;

    
    /**
     *  <p>Unique identifier of the referenced Category.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public CategoryReferenceBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Contains the representation of the expanded Category. Only present in responses to requests with Reference Expansion for Categories.</p>
     * @param builder function to build the obj value
     * @return Builder
     */
    
    public CategoryReferenceBuilder obj(Function<com.commercetools.api.models.category.CategoryBuilder, com.commercetools.api.models.category.CategoryBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.category.CategoryBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Contains the representation of the expanded Category. Only present in responses to requests with Reference Expansion for Categories.</p>
     * @param builder function to build the obj value
     * @return Builder
     */
    
    public CategoryReferenceBuilder withObj(Function<com.commercetools.api.models.category.CategoryBuilder, com.commercetools.api.models.category.Category> builder) {
        this.obj = builder.apply(com.commercetools.api.models.category.CategoryBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Contains the representation of the expanded Category. Only present in responses to requests with Reference Expansion for Categories.</p>
     * @param obj value to be set
     * @return Builder
     */
    
    public CategoryReferenceBuilder obj(@Nullable final com.commercetools.api.models.category.Category obj) {
        this.obj = obj;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the referenced Category.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Contains the representation of the expanded Category. Only present in responses to requests with Reference Expansion for Categories.</p>
     * @return obj
     */
    
    @Nullable
    public com.commercetools.api.models.category.Category getObj(){
        return this.obj;
    }

    /**
     * builds CategoryReference with checking for non-null required values
     * @return CategoryReference
     */
    public CategoryReference build() {
        Objects.requireNonNull(id, CategoryReference.class + ": id is missing");
        return new CategoryReferenceImpl(id, obj);
    }
    
    /**
     * builds CategoryReference without checking for non-null required values
     * @return CategoryReference
     */
    public CategoryReference buildUnchecked() {
        return new CategoryReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of CategoryReferenceBuilder
     * @return builder 
     */
    public static CategoryReferenceBuilder of() {
        return new CategoryReferenceBuilder();
    }

    /**
     * create builder for CategoryReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryReferenceBuilder of(final CategoryReference template) {
        CategoryReferenceBuilder builder = new CategoryReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
