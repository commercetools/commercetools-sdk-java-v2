
package com.commercetools.api.models.standalone_price;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetCustomFieldAction standalonePriceSetCustomFieldAction = StandalonePriceSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetCustomFieldActionBuilder implements Builder<StandalonePriceSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public StandalonePriceSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public StandalonePriceSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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
     * builds StandalonePriceSetCustomFieldAction with checking for non-null required values
     * @return StandalonePriceSetCustomFieldAction
     */
    public StandalonePriceSetCustomFieldAction build() {
        Objects.requireNonNull(name, StandalonePriceSetCustomFieldAction.class + ": name is missing");
        return new StandalonePriceSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds StandalonePriceSetCustomFieldAction without checking for non-null required values
     * @return StandalonePriceSetCustomFieldAction
     */
    public StandalonePriceSetCustomFieldAction buildUnchecked() {
        return new StandalonePriceSetCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of StandalonePriceSetCustomFieldActionBuilder
     * @return builder
     */
    public static StandalonePriceSetCustomFieldActionBuilder of() {
        return new StandalonePriceSetCustomFieldActionBuilder();
    }

    /**
     * create builder for StandalonePriceSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetCustomFieldActionBuilder of(final StandalonePriceSetCustomFieldAction template) {
        StandalonePriceSetCustomFieldActionBuilder builder = new StandalonePriceSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
