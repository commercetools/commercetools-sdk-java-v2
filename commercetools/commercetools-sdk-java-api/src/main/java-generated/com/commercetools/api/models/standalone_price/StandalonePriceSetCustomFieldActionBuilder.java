
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
     *  <p>Name of the Custom Field.</p>
     * @param name
     * @return Builder
     */

    public StandalonePriceSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value
     * @return Builder
     */

    public StandalonePriceSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public StandalonePriceSetCustomFieldAction build() {
        Objects.requireNonNull(name, StandalonePriceSetCustomFieldAction.class + ": name is missing");
        return new StandalonePriceSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds StandalonePriceSetCustomFieldAction without checking for non null required values
     */
    public StandalonePriceSetCustomFieldAction buildUnchecked() {
        return new StandalonePriceSetCustomFieldActionImpl(name, value);
    }

    public static StandalonePriceSetCustomFieldActionBuilder of() {
        return new StandalonePriceSetCustomFieldActionBuilder();
    }

    public static StandalonePriceSetCustomFieldActionBuilder of(final StandalonePriceSetCustomFieldAction template) {
        StandalonePriceSetCustomFieldActionBuilder builder = new StandalonePriceSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
