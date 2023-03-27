
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
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public CategorySetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds CategorySetKeyAction with checking for non-null required values
     * @return CategorySetKeyAction
     */
    public CategorySetKeyAction build() {
        return new CategorySetKeyActionImpl(key);
    }

    /**
     * builds CategorySetKeyAction without checking for non-null required values
     * @return CategorySetKeyAction
     */
    public CategorySetKeyAction buildUnchecked() {
        return new CategorySetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of CategorySetKeyActionBuilder
     * @return builder
     */
    public static CategorySetKeyActionBuilder of() {
        return new CategorySetKeyActionBuilder();
    }

    /**
     * create builder for CategorySetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetKeyActionBuilder of(final CategorySetKeyAction template) {
        CategorySetKeyActionBuilder builder = new CategorySetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
