
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetReturnItemCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetReturnItemCustomTypeAction orderSetReturnItemCustomTypeAction = OrderSetReturnItemCustomTypeAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetReturnItemCustomTypeActionBuilder implements Builder<OrderSetReturnItemCustomTypeAction> {

    private String returnItemId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     * set the value to the returnItemId
     * @param returnItemId value to be set
     * @return Builder
     */

    public OrderSetReturnItemCustomTypeActionBuilder returnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the ReturnItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ReturnItem.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public OrderSetReturnItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the ReturnItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ReturnItem.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public OrderSetReturnItemCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the ReturnItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ReturnItem.</p>
     * @param type value to be set
     * @return Builder
     */

    public OrderSetReturnItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the ReturnItem.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public OrderSetReturnItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the ReturnItem.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public OrderSetReturnItemCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the ReturnItem.</p>
     * @param fields value to be set
     * @return Builder
     */

    public OrderSetReturnItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     * value of returnItemId}
     * @return returnItemId
     */

    public String getReturnItemId() {
        return this.returnItemId;
    }

    /**
     *  <p>Defines the Type that extends the ReturnItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ReturnItem.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the ReturnItem.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds OrderSetReturnItemCustomTypeAction with checking for non-null required values
     * @return OrderSetReturnItemCustomTypeAction
     */
    public OrderSetReturnItemCustomTypeAction build() {
        Objects.requireNonNull(returnItemId, OrderSetReturnItemCustomTypeAction.class + ": returnItemId is missing");
        return new OrderSetReturnItemCustomTypeActionImpl(returnItemId, type, fields);
    }

    /**
     * builds OrderSetReturnItemCustomTypeAction without checking for non-null required values
     * @return OrderSetReturnItemCustomTypeAction
     */
    public OrderSetReturnItemCustomTypeAction buildUnchecked() {
        return new OrderSetReturnItemCustomTypeActionImpl(returnItemId, type, fields);
    }

    /**
     * factory method for an instance of OrderSetReturnItemCustomTypeActionBuilder
     * @return builder
     */
    public static OrderSetReturnItemCustomTypeActionBuilder of() {
        return new OrderSetReturnItemCustomTypeActionBuilder();
    }

    /**
     * create builder for OrderSetReturnItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetReturnItemCustomTypeActionBuilder of(final OrderSetReturnItemCustomTypeAction template) {
        OrderSetReturnItemCustomTypeActionBuilder builder = new OrderSetReturnItemCustomTypeActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
