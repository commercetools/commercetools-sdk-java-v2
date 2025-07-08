
package com.commercetools.api.models.recurring_order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderSetCustomTypeAction recurringOrderSetCustomTypeAction = RecurringOrderSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderSetCustomTypeActionBuilder implements Builder<RecurringOrderSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the RecurringOrder with Custom Fields. If absent, any existing Type and Custom Fields are removed from the RecurringOrder.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public RecurringOrderSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the RecurringOrder with Custom Fields. If absent, any existing Type and Custom Fields are removed from the RecurringOrder.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public RecurringOrderSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the RecurringOrder with Custom Fields. If absent, any existing Type and Custom Fields are removed from the RecurringOrder.</p>
     * @param type value to be set
     * @return Builder
     */

    public RecurringOrderSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the RecurringOrder.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public RecurringOrderSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the RecurringOrder.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public RecurringOrderSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the RecurringOrder.</p>
     * @param fields value to be set
     * @return Builder
     */

    public RecurringOrderSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the RecurringOrder with Custom Fields. If absent, any existing Type and Custom Fields are removed from the RecurringOrder.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the RecurringOrder.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds RecurringOrderSetCustomTypeAction with checking for non-null required values
     * @return RecurringOrderSetCustomTypeAction
     */
    public RecurringOrderSetCustomTypeAction build() {
        return new RecurringOrderSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds RecurringOrderSetCustomTypeAction without checking for non-null required values
     * @return RecurringOrderSetCustomTypeAction
     */
    public RecurringOrderSetCustomTypeAction buildUnchecked() {
        return new RecurringOrderSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of RecurringOrderSetCustomTypeActionBuilder
     * @return builder
     */
    public static RecurringOrderSetCustomTypeActionBuilder of() {
        return new RecurringOrderSetCustomTypeActionBuilder();
    }

    /**
     * create builder for RecurringOrderSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderSetCustomTypeActionBuilder of(final RecurringOrderSetCustomTypeAction template) {
        RecurringOrderSetCustomTypeActionBuilder builder = new RecurringOrderSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
