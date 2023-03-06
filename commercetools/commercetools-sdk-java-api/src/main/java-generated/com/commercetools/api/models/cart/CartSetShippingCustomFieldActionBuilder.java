
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetShippingCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingCustomFieldAction cartSetShippingCustomFieldAction = CartSetShippingCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetShippingCustomFieldActionBuilder implements Builder<CartSetShippingCustomFieldAction> {

    @Nullable
    private String shippingKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>The <code>shippingKey</code> of the Shipping to customize. Used to specify which Shipping Method to customize on a Cart with <code>Multiple</code> ShippingMode. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Cart.</p>
     */

    public CartSetShippingCustomFieldActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public CartSetShippingCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public CartSetShippingCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public CartSetShippingCustomFieldAction build() {
        Objects.requireNonNull(name, CartSetShippingCustomFieldAction.class + ": name is missing");
        return new CartSetShippingCustomFieldActionImpl(shippingKey, name, value);
    }

    /**
     * builds CartSetShippingCustomFieldAction without checking for non null required values
     */
    public CartSetShippingCustomFieldAction buildUnchecked() {
        return new CartSetShippingCustomFieldActionImpl(shippingKey, name, value);
    }

    public static CartSetShippingCustomFieldActionBuilder of() {
        return new CartSetShippingCustomFieldActionBuilder();
    }

    public static CartSetShippingCustomFieldActionBuilder of(final CartSetShippingCustomFieldAction template) {
        CartSetShippingCustomFieldActionBuilder builder = new CartSetShippingCustomFieldActionBuilder();
        builder.shippingKey = template.getShippingKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
