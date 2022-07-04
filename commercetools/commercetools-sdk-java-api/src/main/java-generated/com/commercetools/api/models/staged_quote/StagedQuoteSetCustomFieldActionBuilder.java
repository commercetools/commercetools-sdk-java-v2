
package com.commercetools.api.models.staged_quote;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteSetCustomFieldAction stagedQuoteSetCustomFieldAction = StagedQuoteSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteSetCustomFieldActionBuilder implements Builder<StagedQuoteSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public StagedQuoteSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public StagedQuoteSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public StagedQuoteSetCustomFieldAction build() {
        Objects.requireNonNull(name, StagedQuoteSetCustomFieldAction.class + ": name is missing");
        return new StagedQuoteSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds StagedQuoteSetCustomFieldAction without checking for non null required values
     */
    public StagedQuoteSetCustomFieldAction buildUnchecked() {
        return new StagedQuoteSetCustomFieldActionImpl(name, value);
    }

    public static StagedQuoteSetCustomFieldActionBuilder of() {
        return new StagedQuoteSetCustomFieldActionBuilder();
    }

    public static StagedQuoteSetCustomFieldActionBuilder of(final StagedQuoteSetCustomFieldAction template) {
        StagedQuoteSetCustomFieldActionBuilder builder = new StagedQuoteSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
