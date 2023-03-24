
package com.commercetools.api.models.product_selection;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSetCustomFieldAction productSelectionSetCustomFieldAction = ProductSelectionSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionSetCustomFieldActionBuilder implements Builder<ProductSelectionSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSelectionSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public ProductSelectionSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    /**
     * builds ProductSelectionSetCustomFieldAction with checking for non-null required values
     * @return ProductSelectionSetCustomFieldAction
     */
    public ProductSelectionSetCustomFieldAction build() {
        Objects.requireNonNull(name, ProductSelectionSetCustomFieldAction.class + ": name is missing");
        return new ProductSelectionSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds ProductSelectionSetCustomFieldAction without checking for non-null required values
     * @return ProductSelectionSetCustomFieldAction
     */
    public ProductSelectionSetCustomFieldAction buildUnchecked() {
        return new ProductSelectionSetCustomFieldActionImpl(name, value);
    }

    public static ProductSelectionSetCustomFieldActionBuilder of() {
        return new ProductSelectionSetCustomFieldActionBuilder();
    }

    public static ProductSelectionSetCustomFieldActionBuilder of(final ProductSelectionSetCustomFieldAction template) {
        ProductSelectionSetCustomFieldActionBuilder builder = new ProductSelectionSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
