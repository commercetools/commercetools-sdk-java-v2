
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetCustomFieldAction storeSetCustomFieldAction = StoreSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetCustomFieldActionBuilder implements Builder<StoreSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public StoreSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public StoreSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public StoreSetCustomFieldAction build() {
        Objects.requireNonNull(name, StoreSetCustomFieldAction.class + ": name is missing");
        return new StoreSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds StoreSetCustomFieldAction without checking for non null required values
     */
    public StoreSetCustomFieldAction buildUnchecked() {
        return new StoreSetCustomFieldActionImpl(name, value);
    }

    public static StoreSetCustomFieldActionBuilder of() {
        return new StoreSetCustomFieldActionBuilder();
    }

    public static StoreSetCustomFieldActionBuilder of(final StoreSetCustomFieldAction template) {
        StoreSetCustomFieldActionBuilder builder = new StoreSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
