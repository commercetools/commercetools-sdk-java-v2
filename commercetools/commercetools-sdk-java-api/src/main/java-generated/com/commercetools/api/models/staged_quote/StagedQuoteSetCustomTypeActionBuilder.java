
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
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the StagedQuote with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the StagedQuote.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StagedQuoteSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the StagedQuote with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the StagedQuote.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StagedQuoteSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the StagedQuote with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the StagedQuote.</p>
     * @param type value to be set
     * @return Builder
     */

    public StagedQuoteSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the StagedQuote.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StagedQuoteSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the StagedQuote.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StagedQuoteSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the StagedQuote.</p>
     * @param fields value to be set
     * @return Builder
     */

    public StagedQuoteSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the StagedQuote with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the StagedQuote.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the StagedQuote.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds StagedQuoteSetCustomTypeAction with checking for non-null required values
     * @return StagedQuoteSetCustomTypeAction
     */
    public StagedQuoteSetCustomTypeAction build() {
        return new StagedQuoteSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds StagedQuoteSetCustomTypeAction without checking for non-null required values
     * @return StagedQuoteSetCustomTypeAction
     */
    public StagedQuoteSetCustomTypeAction buildUnchecked() {
        return new StagedQuoteSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of StagedQuoteSetCustomTypeActionBuilder
     * @return builder
     */
    public static StagedQuoteSetCustomTypeActionBuilder of() {
        return new StagedQuoteSetCustomTypeActionBuilder();
    }

    /**
     * create builder for StagedQuoteSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteSetCustomTypeActionBuilder of(final StagedQuoteSetCustomTypeAction template) {
        StagedQuoteSetCustomTypeActionBuilder builder = new StagedQuoteSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
