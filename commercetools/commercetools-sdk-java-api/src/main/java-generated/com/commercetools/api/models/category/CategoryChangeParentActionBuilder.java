
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryChangeParentActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryChangeParentAction categoryChangeParentAction = CategoryChangeParentAction.builder()
 *             .parent(parentBuilder -> parentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryChangeParentActionBuilder implements Builder<CategoryChangeParentAction> {

    private com.commercetools.api.models.category.CategoryResourceIdentifier parent;

    /**
     *  <p>New value to set as parent.</p>
     */

    public CategoryChangeParentActionBuilder parent(
            Function<com.commercetools.api.models.category.CategoryResourceIdentifierBuilder, com.commercetools.api.models.category.CategoryResourceIdentifierBuilder> builder) {
        this.parent = builder.apply(com.commercetools.api.models.category.CategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New value to set as parent.</p>
     */

    public CategoryChangeParentActionBuilder parent(
            final com.commercetools.api.models.category.CategoryResourceIdentifier parent) {
        this.parent = parent;
        return this;
    }

    public com.commercetools.api.models.category.CategoryResourceIdentifier getParent() {
        return this.parent;
    }

    public CategoryChangeParentAction build() {
        Objects.requireNonNull(parent, CategoryChangeParentAction.class + ": parent is missing");
        return new CategoryChangeParentActionImpl(parent);
    }

    /**
     * builds CategoryChangeParentAction without checking for non null required values
     */
    public CategoryChangeParentAction buildUnchecked() {
        return new CategoryChangeParentActionImpl(parent);
    }

    public static CategoryChangeParentActionBuilder of() {
        return new CategoryChangeParentActionBuilder();
    }

    public static CategoryChangeParentActionBuilder of(final CategoryChangeParentAction template) {
        CategoryChangeParentActionBuilder builder = new CategoryChangeParentActionBuilder();
        builder.parent = template.getParent();
        return builder;
    }

}
