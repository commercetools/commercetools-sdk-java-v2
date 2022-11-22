
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetCustomFieldAction categorySetCustomFieldAction = CategorySetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetCustomFieldActionBuilder implements Builder<CategorySetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public CategorySetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public CategorySetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public CategorySetCustomFieldAction build() {
        Objects.requireNonNull(name, CategorySetCustomFieldAction.class + ": name is missing");
        return new CategorySetCustomFieldActionImpl(name, value);
    }

    /**
     * builds CategorySetCustomFieldAction without checking for non null required values
     */
    public CategorySetCustomFieldAction buildUnchecked() {
        return new CategorySetCustomFieldActionImpl(name, value);
    }

    public static CategorySetCustomFieldActionBuilder of() {
        return new CategorySetCustomFieldActionBuilder();
    }

    public static CategorySetCustomFieldActionBuilder of(final CategorySetCustomFieldAction template) {
        CategorySetCustomFieldActionBuilder builder = new CategorySetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
