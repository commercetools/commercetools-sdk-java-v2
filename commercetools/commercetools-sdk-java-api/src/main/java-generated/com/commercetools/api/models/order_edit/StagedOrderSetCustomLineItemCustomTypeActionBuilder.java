
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomLineItemCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomLineItemCustomTypeAction stagedOrderSetCustomLineItemCustomTypeAction = StagedOrderSetCustomLineItemCustomTypeAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCustomLineItemCustomTypeActionBuilder
        implements Builder<StagedOrderSetCustomLineItemCustomTypeAction> {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the CustomLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomLineItem.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the CustomLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomLineItem.</p>
     * @param type value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the CustomLineItem.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the CustomLineItem.</p>
     * @param fields value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     * value of customLineItemId}
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>Defines the Type that extends the CustomLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomLineItem.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the CustomLineItem.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds StagedOrderSetCustomLineItemCustomTypeAction with checking for non-null required values
     * @return StagedOrderSetCustomLineItemCustomTypeAction
     */
    public StagedOrderSetCustomLineItemCustomTypeAction build() {
        Objects.requireNonNull(customLineItemId,
            StagedOrderSetCustomLineItemCustomTypeAction.class + ": customLineItemId is missing");
        return new StagedOrderSetCustomLineItemCustomTypeActionImpl(customLineItemId, type, fields);
    }

    /**
     * builds StagedOrderSetCustomLineItemCustomTypeAction without checking for non-null required values
     * @return StagedOrderSetCustomLineItemCustomTypeAction
     */
    public StagedOrderSetCustomLineItemCustomTypeAction buildUnchecked() {
        return new StagedOrderSetCustomLineItemCustomTypeActionImpl(customLineItemId, type, fields);
    }

    /**
     * factory method for an instance of StagedOrderSetCustomLineItemCustomTypeActionBuilder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemCustomTypeActionBuilder of() {
        return new StagedOrderSetCustomLineItemCustomTypeActionBuilder();
    }

    /**
     * create builder for StagedOrderSetCustomLineItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemCustomTypeActionBuilder of(
            final StagedOrderSetCustomLineItemCustomTypeAction template) {
        StagedOrderSetCustomLineItemCustomTypeActionBuilder builder = new StagedOrderSetCustomLineItemCustomTypeActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
