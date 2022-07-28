
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryOrderHintsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryOrderHints categoryOrderHints = CategoryOrderHints.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryOrderHintsBuilder implements Builder<CategoryOrderHints> {

    public CategoryOrderHints build() {
        return new CategoryOrderHintsImpl();
    }

    /**
     * builds CategoryOrderHints without checking for non null required values
     */
    public CategoryOrderHints buildUnchecked() {
        return new CategoryOrderHintsImpl();
    }

    public static CategoryOrderHintsBuilder of() {
        return new CategoryOrderHintsBuilder();
    }

    public static CategoryOrderHintsBuilder of(final CategoryOrderHints template) {
        CategoryOrderHintsBuilder builder = new CategoryOrderHintsBuilder();
        return builder;
    }

}
