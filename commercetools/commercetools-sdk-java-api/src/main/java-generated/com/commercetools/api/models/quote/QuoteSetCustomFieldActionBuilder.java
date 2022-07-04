
package com.commercetools.api.models.quote;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteSetCustomFieldAction quoteSetCustomFieldAction = QuoteSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteSetCustomFieldActionBuilder implements Builder<QuoteSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public QuoteSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public QuoteSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public QuoteSetCustomFieldAction build() {
        Objects.requireNonNull(name, QuoteSetCustomFieldAction.class + ": name is missing");
        return new QuoteSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds QuoteSetCustomFieldAction without checking for non null required values
     */
    public QuoteSetCustomFieldAction buildUnchecked() {
        return new QuoteSetCustomFieldActionImpl(name, value);
    }

    public static QuoteSetCustomFieldActionBuilder of() {
        return new QuoteSetCustomFieldActionBuilder();
    }

    public static QuoteSetCustomFieldActionBuilder of(final QuoteSetCustomFieldAction template) {
        QuoteSetCustomFieldActionBuilder builder = new QuoteSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
