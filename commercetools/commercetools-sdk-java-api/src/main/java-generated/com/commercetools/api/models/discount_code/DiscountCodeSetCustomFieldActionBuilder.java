
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetCustomFieldAction discountCodeSetCustomFieldAction = DiscountCodeSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeSetCustomFieldActionBuilder implements Builder<DiscountCodeSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public DiscountCodeSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public DiscountCodeSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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
     * builds DiscountCodeSetCustomFieldAction with checking for non-null required values
     * @return DiscountCodeSetCustomFieldAction
     */
    public DiscountCodeSetCustomFieldAction build() {
        Objects.requireNonNull(name, DiscountCodeSetCustomFieldAction.class + ": name is missing");
        return new DiscountCodeSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds DiscountCodeSetCustomFieldAction without checking for non-null required values
     * @return DiscountCodeSetCustomFieldAction
     */
    public DiscountCodeSetCustomFieldAction buildUnchecked() {
        return new DiscountCodeSetCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of DiscountCodeSetCustomFieldActionBuilder
     * @return builder
     */
    public static DiscountCodeSetCustomFieldActionBuilder of() {
        return new DiscountCodeSetCustomFieldActionBuilder();
    }

    /**
     * create builder for DiscountCodeSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetCustomFieldActionBuilder of(final DiscountCodeSetCustomFieldAction template) {
        DiscountCodeSetCustomFieldActionBuilder builder = new DiscountCodeSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
