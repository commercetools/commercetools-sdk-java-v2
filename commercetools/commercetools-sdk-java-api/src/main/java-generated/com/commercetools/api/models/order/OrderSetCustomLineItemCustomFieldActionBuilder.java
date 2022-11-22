
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetCustomLineItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetCustomLineItemCustomFieldAction orderSetCustomLineItemCustomFieldAction = OrderSetCustomLineItemCustomFieldAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetCustomLineItemCustomFieldActionBuilder
        implements Builder<OrderSetCustomLineItemCustomFieldAction> {

    private String customLineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *
     */

    public OrderSetCustomLineItemCustomFieldActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public OrderSetCustomLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public OrderSetCustomLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public OrderSetCustomLineItemCustomFieldAction build() {
        Objects.requireNonNull(customLineItemId,
            OrderSetCustomLineItemCustomFieldAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(name, OrderSetCustomLineItemCustomFieldAction.class + ": name is missing");
        return new OrderSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
    }

    /**
     * builds OrderSetCustomLineItemCustomFieldAction without checking for non null required values
     */
    public OrderSetCustomLineItemCustomFieldAction buildUnchecked() {
        return new OrderSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
    }

    public static OrderSetCustomLineItemCustomFieldActionBuilder of() {
        return new OrderSetCustomLineItemCustomFieldActionBuilder();
    }

    public static OrderSetCustomLineItemCustomFieldActionBuilder of(
            final OrderSetCustomLineItemCustomFieldAction template) {
        OrderSetCustomLineItemCustomFieldActionBuilder builder = new OrderSetCustomLineItemCustomFieldActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
