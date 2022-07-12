
package com.commercetools.api.models.quote_request;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestSetCustomFieldAction quoteRequestSetCustomFieldAction = QuoteRequestSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestSetCustomFieldActionBuilder implements Builder<QuoteRequestSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public QuoteRequestSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public QuoteRequestSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public QuoteRequestSetCustomFieldAction build() {
        Objects.requireNonNull(name, QuoteRequestSetCustomFieldAction.class + ": name is missing");
        return new QuoteRequestSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds QuoteRequestSetCustomFieldAction without checking for non null required values
     */
    public QuoteRequestSetCustomFieldAction buildUnchecked() {
        return new QuoteRequestSetCustomFieldActionImpl(name, value);
    }

    public static QuoteRequestSetCustomFieldActionBuilder of() {
        return new QuoteRequestSetCustomFieldActionBuilder();
    }

    public static QuoteRequestSetCustomFieldActionBuilder of(final QuoteRequestSetCustomFieldAction template) {
        QuoteRequestSetCustomFieldActionBuilder builder = new QuoteRequestSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
