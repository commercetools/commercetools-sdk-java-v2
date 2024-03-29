
package com.commercetools.api.models.review;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetCustomTypeAction reviewSetCustomTypeAction = ReviewSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewSetCustomTypeActionBuilder implements Builder<ReviewSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the Review with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Review.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ReviewSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Review with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Review.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ReviewSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Review with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Review.</p>
     * @param type value to be set
     * @return Builder
     */

    public ReviewSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Review.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ReviewSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Review.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ReviewSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Review.</p>
     * @param fields value to be set
     * @return Builder
     */

    public ReviewSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Review with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Review.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Review.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds ReviewSetCustomTypeAction with checking for non-null required values
     * @return ReviewSetCustomTypeAction
     */
    public ReviewSetCustomTypeAction build() {
        return new ReviewSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds ReviewSetCustomTypeAction without checking for non-null required values
     * @return ReviewSetCustomTypeAction
     */
    public ReviewSetCustomTypeAction buildUnchecked() {
        return new ReviewSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of ReviewSetCustomTypeActionBuilder
     * @return builder
     */
    public static ReviewSetCustomTypeActionBuilder of() {
        return new ReviewSetCustomTypeActionBuilder();
    }

    /**
     * create builder for ReviewSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetCustomTypeActionBuilder of(final ReviewSetCustomTypeAction template) {
        ReviewSetCustomTypeActionBuilder builder = new ReviewSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
