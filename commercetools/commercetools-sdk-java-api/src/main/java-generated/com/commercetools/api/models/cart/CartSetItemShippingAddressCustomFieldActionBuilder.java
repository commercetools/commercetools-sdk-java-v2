
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CartSetItemShippingAddressCustomFieldAction cartSetItemShippingAddressCustomFieldAction = CartSetItemShippingAddressCustomFieldAction.builder()
           .addressKey("{addressKey}")
           .name("{name}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetItemShippingAddressCustomFieldActionBuilder
        implements Builder<CartSetItemShippingAddressCustomFieldAction> {

    private String addressKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    public CartSetItemShippingAddressCustomFieldActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public CartSetItemShippingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public CartSetItemShippingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public CartSetItemShippingAddressCustomFieldAction build() {
        Objects.requireNonNull(addressKey,
            CartSetItemShippingAddressCustomFieldAction.class + ": addressKey is missing");
        Objects.requireNonNull(name, CartSetItemShippingAddressCustomFieldAction.class + ": name is missing");
        return new CartSetItemShippingAddressCustomFieldActionImpl(addressKey, name, value);
    }

    /**
     * builds CartSetItemShippingAddressCustomFieldAction without checking for non null required values
     */
    public CartSetItemShippingAddressCustomFieldAction buildUnchecked() {
        return new CartSetItemShippingAddressCustomFieldActionImpl(addressKey, name, value);
    }

    public static CartSetItemShippingAddressCustomFieldActionBuilder of() {
        return new CartSetItemShippingAddressCustomFieldActionBuilder();
    }

    public static CartSetItemShippingAddressCustomFieldActionBuilder of(
            final CartSetItemShippingAddressCustomFieldAction template) {
        CartSetItemShippingAddressCustomFieldActionBuilder builder = new CartSetItemShippingAddressCustomFieldActionBuilder();
        builder.addressKey = template.getAddressKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
