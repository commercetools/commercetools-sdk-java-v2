
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
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Quote with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Quote.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public QuoteSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Quote with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Quote.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public QuoteSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Quote with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Quote.</p>
     * @param type value to be set
     * @return Builder
     */

    public QuoteSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Quote.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public QuoteSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Quote.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public QuoteSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Quote.</p>
     * @param fields value to be set
     * @return Builder
     */

    public QuoteSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Quote with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Quote.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Quote.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds QuoteSetCustomTypeAction with checking for non-null required values
     * @return QuoteSetCustomTypeAction
     */
    public QuoteSetCustomTypeAction build() {
        return new QuoteSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds QuoteSetCustomTypeAction without checking for non-null required values
     * @return QuoteSetCustomTypeAction
     */
    public QuoteSetCustomTypeAction buildUnchecked() {
        return new QuoteSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of QuoteSetCustomTypeActionBuilder
     * @return builder
     */
    public static QuoteSetCustomTypeActionBuilder of() {
        return new QuoteSetCustomTypeActionBuilder();
    }

    /**
     * create builder for QuoteSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteSetCustomTypeActionBuilder of(final QuoteSetCustomTypeAction template) {
        QuoteSetCustomTypeActionBuilder builder = new QuoteSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
