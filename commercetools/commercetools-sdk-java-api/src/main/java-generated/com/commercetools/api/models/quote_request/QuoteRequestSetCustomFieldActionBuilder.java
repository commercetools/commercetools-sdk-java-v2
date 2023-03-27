
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
     * @param name value to be set
     * @return Builder
     */

    public QuoteRequestSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public QuoteRequestSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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
     * builds QuoteRequestSetCustomFieldAction with checking for non-null required values
     * @return QuoteRequestSetCustomFieldAction
     */
    public QuoteRequestSetCustomFieldAction build() {
        Objects.requireNonNull(name, QuoteRequestSetCustomFieldAction.class + ": name is missing");
        return new QuoteRequestSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds QuoteRequestSetCustomFieldAction without checking for non-null required values
     * @return QuoteRequestSetCustomFieldAction
     */
    public QuoteRequestSetCustomFieldAction buildUnchecked() {
        return new QuoteRequestSetCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of QuoteRequestSetCustomFieldActionBuilder
     * @return builder
     */
    public static QuoteRequestSetCustomFieldActionBuilder of() {
        return new QuoteRequestSetCustomFieldActionBuilder();
    }

    /**
     * create builder for QuoteRequestSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestSetCustomFieldActionBuilder of(final QuoteRequestSetCustomFieldAction template) {
        QuoteRequestSetCustomFieldActionBuilder builder = new QuoteRequestSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
