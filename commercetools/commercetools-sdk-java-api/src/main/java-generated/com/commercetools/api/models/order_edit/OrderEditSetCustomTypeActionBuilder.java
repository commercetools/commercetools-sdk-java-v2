
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditSetCustomTypeAction orderEditSetCustomTypeAction = OrderEditSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditSetCustomTypeActionBuilder implements Builder<OrderEditSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the OrderEdit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the OrderEdit.</p>
     */

    public OrderEditSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the OrderEdit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the OrderEdit.</p>
     */

    public OrderEditSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the OrderEdit.</p>
     */

    public OrderEditSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the OrderEdit.</p>
     */

    public OrderEditSetCustomTypeActionBuilder fields(
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

    public OrderEditSetCustomTypeAction build() {
        return new OrderEditSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds OrderEditSetCustomTypeAction without checking for non null required values
     */
    public OrderEditSetCustomTypeAction buildUnchecked() {
        return new OrderEditSetCustomTypeActionImpl(type, fields);
    }

    public static OrderEditSetCustomTypeActionBuilder of() {
        return new OrderEditSetCustomTypeActionBuilder();
    }

    public static OrderEditSetCustomTypeActionBuilder of(final OrderEditSetCustomTypeAction template) {
        OrderEditSetCustomTypeActionBuilder builder = new OrderEditSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
