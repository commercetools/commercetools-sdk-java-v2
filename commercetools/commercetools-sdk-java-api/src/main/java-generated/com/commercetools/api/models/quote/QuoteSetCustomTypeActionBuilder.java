
package com.commercetools.api.models.quote;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteSetCustomTypeAction quoteSetCustomTypeAction = QuoteSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteSetCustomTypeActionBuilder implements Builder<QuoteSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the Quote with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Quote.</p>
     */

    public QuoteSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Quote with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Quote.</p>
     */

    public QuoteSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Quote.</p>
     */

    public QuoteSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Quote.</p>
     */

    public QuoteSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public QuoteSetCustomTypeAction build() {
        return new QuoteSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds QuoteSetCustomTypeAction without checking for non null required values
     */
    public QuoteSetCustomTypeAction buildUnchecked() {
        return new QuoteSetCustomTypeActionImpl(type, fields);
    }

    public static QuoteSetCustomTypeActionBuilder of() {
        return new QuoteSetCustomTypeActionBuilder();
    }

    public static QuoteSetCustomTypeActionBuilder of(final QuoteSetCustomTypeAction template) {
        QuoteSetCustomTypeActionBuilder builder = new QuoteSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
