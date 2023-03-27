
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
     * @param name value to be set
     * @return Builder
     */

    public CategorySetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public CategorySetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds CategorySetCustomFieldAction with checking for non-null required values
     * @return CategorySetCustomFieldAction
     */
    public CategorySetCustomFieldAction build() {
        Objects.requireNonNull(name, CategorySetCustomFieldAction.class + ": name is missing");
        return new CategorySetCustomFieldActionImpl(name, value);
    }

    /**
     * builds CategorySetCustomFieldAction without checking for non-null required values
     * @return CategorySetCustomFieldAction
     */
    public CategorySetCustomFieldAction buildUnchecked() {
        return new CategorySetCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of CategorySetCustomFieldActionBuilder
     * @return builder
     */
    public static CategorySetCustomFieldActionBuilder of() {
        return new CategorySetCustomFieldActionBuilder();
    }

    /**
     * create builder for CategorySetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetCustomFieldActionBuilder of(final CategorySetCustomFieldAction template) {
        CategorySetCustomFieldActionBuilder builder = new CategorySetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
