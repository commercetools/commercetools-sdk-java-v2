package com.commercetools.ml.models.common;

import com.commercetools.ml.models.common.Reference;
import com.commercetools.ml.models.common.ReferenceTypeId;
import com.commercetools.ml.models.common.CategoryReference;
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

    
    /**
     * set the value to the id
     * @param id value to be set
     * @return Builder
     */
    
    public CategoryReferenceBuilder id( final String id) {
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
     * builds CategoryReference with checking for non-null required values
     * @return CategoryReference
     */
    public CategoryReference build() {
        Objects.requireNonNull(id, CategoryReference.class + ": id is missing");
        return new CategoryReferenceImpl(id);
    }
    
    /**
     * builds CategoryReference without checking for non-null required values
     * @return CategoryReference
     */
    public CategoryReference buildUnchecked() {
        return new CategoryReferenceImpl(id);
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
        return builder;
    }

}
