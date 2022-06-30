
package com.commercetools.api.models.quote_request;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestSetCustomTypeAction quoteRequestSetCustomTypeAction = QuoteRequestSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestSetCustomTypeActionBuilder implements Builder<QuoteRequestSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the QuoteRequest with Custom Fields. If absent, any existing Type and Custom Fields are removed from the QuoteRequest.</p>
     */

    public QuoteRequestSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the QuoteRequest with Custom Fields. If absent, any existing Type and Custom Fields are removed from the QuoteRequest.</p>
     */

    public QuoteRequestSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the QuoteRequest.</p>
     */

    public QuoteRequestSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the QuoteRequest.</p>
     */

    public QuoteRequestSetCustomTypeActionBuilder fields(
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

    public QuoteRequestSetCustomTypeAction build() {
        return new QuoteRequestSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds QuoteRequestSetCustomTypeAction without checking for non null required values
     */
    public QuoteRequestSetCustomTypeAction buildUnchecked() {
        return new QuoteRequestSetCustomTypeActionImpl(type, fields);
    }

    public static QuoteRequestSetCustomTypeActionBuilder of() {
        return new QuoteRequestSetCustomTypeActionBuilder();
    }

    public static QuoteRequestSetCustomTypeActionBuilder of(final QuoteRequestSetCustomTypeAction template) {
        QuoteRequestSetCustomTypeActionBuilder builder = new QuoteRequestSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
