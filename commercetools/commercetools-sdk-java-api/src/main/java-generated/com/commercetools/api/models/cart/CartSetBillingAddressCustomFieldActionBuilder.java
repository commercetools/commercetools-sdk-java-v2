
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetBillingAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetBillingAddressCustomFieldAction cartSetBillingAddressCustomFieldAction = CartSetBillingAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetBillingAddressCustomFieldActionBuilder implements Builder<CartSetBillingAddressCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     <*  <p>Name of the Custom Field.</p>>
     */

    public CartSetBillingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     <*  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>>
     */

    public CartSetBillingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public CartSetBillingAddressCustomFieldAction build() {
        Objects.requireNonNull(name, CartSetBillingAddressCustomFieldAction.class + ": name is missing");
        return new CartSetBillingAddressCustomFieldActionImpl(name, value);
    }

    /**
     * builds CartSetBillingAddressCustomFieldAction without checking for non null required values
     */
    public CartSetBillingAddressCustomFieldAction buildUnchecked() {
        return new CartSetBillingAddressCustomFieldActionImpl(name, value);
    }

    public static CartSetBillingAddressCustomFieldActionBuilder of() {
        return new CartSetBillingAddressCustomFieldActionBuilder();
    }

    public static CartSetBillingAddressCustomFieldActionBuilder of(
            final CartSetBillingAddressCustomFieldAction template) {
        CartSetBillingAddressCustomFieldActionBuilder builder = new CartSetBillingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
