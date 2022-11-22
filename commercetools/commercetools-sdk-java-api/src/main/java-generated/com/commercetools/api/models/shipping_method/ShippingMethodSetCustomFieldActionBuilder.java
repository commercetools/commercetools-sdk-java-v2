
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetCustomFieldAction shippingMethodSetCustomFieldAction = ShippingMethodSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodSetCustomFieldActionBuilder implements Builder<ShippingMethodSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public ShippingMethodSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public ShippingMethodSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public ShippingMethodSetCustomFieldAction build() {
        Objects.requireNonNull(name, ShippingMethodSetCustomFieldAction.class + ": name is missing");
        return new ShippingMethodSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds ShippingMethodSetCustomFieldAction without checking for non null required values
     */
    public ShippingMethodSetCustomFieldAction buildUnchecked() {
        return new ShippingMethodSetCustomFieldActionImpl(name, value);
    }

    public static ShippingMethodSetCustomFieldActionBuilder of() {
        return new ShippingMethodSetCustomFieldActionBuilder();
    }

    public static ShippingMethodSetCustomFieldActionBuilder of(final ShippingMethodSetCustomFieldAction template) {
        ShippingMethodSetCustomFieldActionBuilder builder = new ShippingMethodSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
