
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CategoryResourceIdentifier categoryResourceIdentifier = CategoryResourceIdentifier.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryResourceIdentifierBuilder implements Builder<CategoryResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Platform-generated unique identifier of the referenced Category. Either <code>id</code> or <code>key</code> is required.</p>
     */

    public CategoryResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Category. Either <code>id</code> or <code>key</code> is required.</p>
     */

    public CategoryResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public CategoryResourceIdentifier build() {
        return new CategoryResourceIdentifierImpl(id, key);
    }

    /**
     * builds CategoryResourceIdentifier without checking for non null required values
     */
    public CategoryResourceIdentifier buildUnchecked() {
        return new CategoryResourceIdentifierImpl(id, key);
    }

    public static CategoryResourceIdentifierBuilder of() {
        return new CategoryResourceIdentifierBuilder();
    }

    public static CategoryResourceIdentifierBuilder of(final CategoryResourceIdentifier template) {
        CategoryResourceIdentifierBuilder builder = new CategoryResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
