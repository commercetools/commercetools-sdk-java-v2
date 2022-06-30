
package com.commercetools.api.models.staged_quote;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteSetCustomTypeAction stagedQuoteSetCustomTypeAction = StagedQuoteSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteSetCustomTypeActionBuilder implements Builder<StagedQuoteSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the StagedQuote with Custom Fields. If absent, any existing Type and Custom Fields are removed from the StagedQuote.</p>
     */

    public StagedQuoteSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the StagedQuote with Custom Fields. If absent, any existing Type and Custom Fields are removed from the StagedQuote.</p>
     */

    public StagedQuoteSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the StagedQuote.</p>
     */

    public StagedQuoteSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the StagedQuote.</p>
     */

    public StagedQuoteSetCustomTypeActionBuilder fields(
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

    public StagedQuoteSetCustomTypeAction build() {
        return new StagedQuoteSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds StagedQuoteSetCustomTypeAction without checking for non null required values
     */
    public StagedQuoteSetCustomTypeAction buildUnchecked() {
        return new StagedQuoteSetCustomTypeActionImpl(type, fields);
    }

    public static StagedQuoteSetCustomTypeActionBuilder of() {
        return new StagedQuoteSetCustomTypeActionBuilder();
    }

    public static StagedQuoteSetCustomTypeActionBuilder of(final StagedQuoteSetCustomTypeAction template) {
        StagedQuoteSetCustomTypeActionBuilder builder = new StagedQuoteSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
