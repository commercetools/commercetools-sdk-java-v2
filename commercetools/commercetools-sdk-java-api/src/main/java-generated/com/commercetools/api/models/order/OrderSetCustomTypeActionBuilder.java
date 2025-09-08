
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetCustomTypeAction orderSetCustomTypeAction = OrderSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetCustomTypeActionBuilder implements Builder<OrderSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Order with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Order.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public OrderSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Order with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Order.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public OrderSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Order with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Order.</p>
     * @param type value to be set
     * @return Builder
     */

    public OrderSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Order.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public OrderSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Order.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public OrderSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Order.</p>
     * @param fields value to be set
     * @return Builder
     */

    public OrderSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Order with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Order.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Order.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds OrderSetCustomTypeAction with checking for non-null required values
     * @return OrderSetCustomTypeAction
     */
    public OrderSetCustomTypeAction build() {
        return new OrderSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds OrderSetCustomTypeAction without checking for non-null required values
     * @return OrderSetCustomTypeAction
     */
    public OrderSetCustomTypeAction buildUnchecked() {
        return new OrderSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of OrderSetCustomTypeActionBuilder
     * @return builder
     */
    public static OrderSetCustomTypeActionBuilder of() {
        return new OrderSetCustomTypeActionBuilder();
    }

    /**
     * create builder for OrderSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetCustomTypeActionBuilder of(final OrderSetCustomTypeAction template) {
        OrderSetCustomTypeActionBuilder builder = new OrderSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
