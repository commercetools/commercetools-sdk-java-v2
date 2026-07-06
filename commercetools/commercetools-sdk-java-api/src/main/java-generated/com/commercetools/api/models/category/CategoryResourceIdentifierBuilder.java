
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryResourceIdentifier categoryResourceIdentifier = CategoryResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryResourceIdentifierBuilder implements Builder<CategoryResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Category</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */

    public CategoryResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */

    public CategoryResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Category</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds CategoryResourceIdentifier with checking for non-null required values
     * @return CategoryResourceIdentifier
     */
    public CategoryResourceIdentifier build() {
        return new CategoryResourceIdentifierImpl(id, key);
    }

    /**
     * builds CategoryResourceIdentifier without checking for non-null required values
     * @return CategoryResourceIdentifier
     */
    public CategoryResourceIdentifier buildUnchecked() {
        return new CategoryResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of CategoryResourceIdentifierBuilder
     * @return builder
     */
    public static CategoryResourceIdentifierBuilder of() {
        return new CategoryResourceIdentifierBuilder();
    }

    /**
     * create builder for CategoryResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryResourceIdentifierBuilder of(final CategoryResourceIdentifier template) {
        CategoryResourceIdentifierBuilder builder = new CategoryResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
