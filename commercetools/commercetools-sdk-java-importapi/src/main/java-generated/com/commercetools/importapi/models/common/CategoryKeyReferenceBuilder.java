
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryKeyReference categoryKeyReference = CategoryKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryKeyReferenceBuilder implements Builder<CategoryKeyReference> {

    private String key;

    /**
     *  <p>User-defined unique identifier of the referenced Category.</p>
     * @param key value to be set
     * @return Builder
     */

    public CategoryKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Category.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds CategoryKeyReference with checking for non-null required values
     * @return CategoryKeyReference
     */
    public CategoryKeyReference build() {
        Objects.requireNonNull(key, CategoryKeyReference.class + ": key is missing");
        return new CategoryKeyReferenceImpl(key);
    }

    /**
     * builds CategoryKeyReference without checking for non-null required values
     * @return CategoryKeyReference
     */
    public CategoryKeyReference buildUnchecked() {
        return new CategoryKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of CategoryKeyReferenceBuilder
     * @return builder
     */
    public static CategoryKeyReferenceBuilder of() {
        return new CategoryKeyReferenceBuilder();
    }

    /**
     * create builder for CategoryKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryKeyReferenceBuilder of(final CategoryKeyReference template) {
        CategoryKeyReferenceBuilder builder = new CategoryKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
