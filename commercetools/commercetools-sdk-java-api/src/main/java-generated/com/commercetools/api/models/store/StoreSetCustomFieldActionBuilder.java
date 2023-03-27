
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
     * @param name value to be set
     * @return Builder
     */

    public StoreSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public StoreSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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
     * builds StoreSetCustomFieldAction with checking for non-null required values
     * @return StoreSetCustomFieldAction
     */
    public StoreSetCustomFieldAction build() {
        Objects.requireNonNull(name, StoreSetCustomFieldAction.class + ": name is missing");
        return new StoreSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds StoreSetCustomFieldAction without checking for non-null required values
     * @return StoreSetCustomFieldAction
     */
    public StoreSetCustomFieldAction buildUnchecked() {
        return new StoreSetCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of StoreSetCustomFieldActionBuilder
     * @return builder
     */
    public static StoreSetCustomFieldActionBuilder of() {
        return new StoreSetCustomFieldActionBuilder();
    }

    /**
     * create builder for StoreSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetCustomFieldActionBuilder of(final StoreSetCustomFieldAction template) {
        StoreSetCustomFieldActionBuilder builder = new StoreSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
