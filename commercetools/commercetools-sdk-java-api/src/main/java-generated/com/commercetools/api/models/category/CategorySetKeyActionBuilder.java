
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetKeyAction categorySetKeyAction = CategorySetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetKeyActionBuilder implements Builder<CategorySetKeyAction> {

    @Nullable
    private String key;

    /**
     <*  <p>User-defined unique identifier for the category. Keys can only contain alphanumeric characters (<code>a-Z, 0-9</code>), underscores and hyphens (<code>-, _</code>) and be between 2 and 256 characters. If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>>
     */

    public CategorySetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public CategorySetKeyAction build() {
        return new CategorySetKeyActionImpl(key);
    }

    /**
     * builds CategorySetKeyAction without checking for non null required values
     */
    public CategorySetKeyAction buildUnchecked() {
        return new CategorySetKeyActionImpl(key);
    }

    public static CategorySetKeyActionBuilder of() {
        return new CategorySetKeyActionBuilder();
    }

    public static CategorySetKeyActionBuilder of(final CategorySetKeyAction template) {
        CategorySetKeyActionBuilder builder = new CategorySetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
