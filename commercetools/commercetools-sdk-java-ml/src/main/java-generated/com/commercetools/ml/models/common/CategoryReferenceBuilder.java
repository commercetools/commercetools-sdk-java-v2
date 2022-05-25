
package com.commercetools.ml.models.common;

import java.util.*;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryReferenceBuilder implements Builder<CategoryReference> {

    private String id;

    /**
     *
     */

    public CategoryReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public CategoryReference build() {
        Objects.requireNonNull(id, CategoryReference.class + ": id is missing");
        return new CategoryReferenceImpl(id);
    }

    /**
     * builds CategoryReference without checking for non null required values
     */
    public CategoryReference buildUnchecked() {
        return new CategoryReferenceImpl(id);
    }

    public static CategoryReferenceBuilder of() {
        return new CategoryReferenceBuilder();
    }

    public static CategoryReferenceBuilder of(final CategoryReference template) {
        CategoryReferenceBuilder builder = new CategoryReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
