
package com.commercetools.api.models.recurring_order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderSetCustomFieldAction recurringOrderSetCustomFieldAction = RecurringOrderSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderSetCustomFieldActionBuilder implements Builder<RecurringOrderSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public RecurringOrderSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public RecurringOrderSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds RecurringOrderSetCustomFieldAction with checking for non-null required values
     * @return RecurringOrderSetCustomFieldAction
     */
    public RecurringOrderSetCustomFieldAction build() {
        Objects.requireNonNull(name, RecurringOrderSetCustomFieldAction.class + ": name is missing");
        return new RecurringOrderSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds RecurringOrderSetCustomFieldAction without checking for non-null required values
     * @return RecurringOrderSetCustomFieldAction
     */
    public RecurringOrderSetCustomFieldAction buildUnchecked() {
        return new RecurringOrderSetCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of RecurringOrderSetCustomFieldActionBuilder
     * @return builder
     */
    public static RecurringOrderSetCustomFieldActionBuilder of() {
        return new RecurringOrderSetCustomFieldActionBuilder();
    }

    /**
     * create builder for RecurringOrderSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderSetCustomFieldActionBuilder of(final RecurringOrderSetCustomFieldAction template) {
        RecurringOrderSetCustomFieldActionBuilder builder = new RecurringOrderSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
