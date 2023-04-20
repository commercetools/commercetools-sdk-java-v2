
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetLineItemCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetLineItemCustomTypeAction myCartSetLineItemCustomTypeAction = MyCartSetLineItemCustomTypeAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetLineItemCustomTypeActionBuilder implements Builder<MyCartSetLineItemCustomTypeAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public MyCartSetLineItemCustomTypeActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the LineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Line Item.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public MyCartSetLineItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the LineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Line Item.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public MyCartSetLineItemCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the LineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Line Item.</p>
     * @param type value to be set
     * @return Builder
     */

    public MyCartSetLineItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Line Item.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public MyCartSetLineItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Line Item.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public MyCartSetLineItemCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Line Item.</p>
     * @param fields value to be set
     * @return Builder
     */

    public MyCartSetLineItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>Defines the Type that extends the LineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Line Item.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Line Item.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds MyCartSetLineItemCustomTypeAction with checking for non-null required values
     * @return MyCartSetLineItemCustomTypeAction
     */
    public MyCartSetLineItemCustomTypeAction build() {
        Objects.requireNonNull(lineItemId, MyCartSetLineItemCustomTypeAction.class + ": lineItemId is missing");
        return new MyCartSetLineItemCustomTypeActionImpl(lineItemId, type, fields);
    }

    /**
     * builds MyCartSetLineItemCustomTypeAction without checking for non-null required values
     * @return MyCartSetLineItemCustomTypeAction
     */
    public MyCartSetLineItemCustomTypeAction buildUnchecked() {
        return new MyCartSetLineItemCustomTypeActionImpl(lineItemId, type, fields);
    }

    /**
     * factory method for an instance of MyCartSetLineItemCustomTypeActionBuilder
     * @return builder
     */
    public static MyCartSetLineItemCustomTypeActionBuilder of() {
        return new MyCartSetLineItemCustomTypeActionBuilder();
    }

    /**
     * create builder for MyCartSetLineItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetLineItemCustomTypeActionBuilder of(final MyCartSetLineItemCustomTypeAction template) {
        MyCartSetLineItemCustomTypeActionBuilder builder = new MyCartSetLineItemCustomTypeActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
