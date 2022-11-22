
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetParcelCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetParcelCustomFieldAction orderSetParcelCustomFieldAction = OrderSetParcelCustomFieldAction.builder()
 *             .parcelId("{parcelId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetParcelCustomFieldActionBuilder implements Builder<OrderSetParcelCustomFieldAction> {

    private String parcelId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *
     */

    public OrderSetParcelCustomFieldActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public OrderSetParcelCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public OrderSetParcelCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public OrderSetParcelCustomFieldAction build() {
        Objects.requireNonNull(parcelId, OrderSetParcelCustomFieldAction.class + ": parcelId is missing");
        Objects.requireNonNull(name, OrderSetParcelCustomFieldAction.class + ": name is missing");
        return new OrderSetParcelCustomFieldActionImpl(parcelId, name, value);
    }

    /**
     * builds OrderSetParcelCustomFieldAction without checking for non null required values
     */
    public OrderSetParcelCustomFieldAction buildUnchecked() {
        return new OrderSetParcelCustomFieldActionImpl(parcelId, name, value);
    }

    public static OrderSetParcelCustomFieldActionBuilder of() {
        return new OrderSetParcelCustomFieldActionBuilder();
    }

    public static OrderSetParcelCustomFieldActionBuilder of(final OrderSetParcelCustomFieldAction template) {
        OrderSetParcelCustomFieldActionBuilder builder = new OrderSetParcelCustomFieldActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
