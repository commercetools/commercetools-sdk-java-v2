
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetLineItemCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLineItemCustomTypeAction stagedOrderSetLineItemCustomTypeAction = StagedOrderSetLineItemCustomTypeAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetLineItemCustomTypeActionBuilder implements Builder<StagedOrderSetLineItemCustomTypeAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *
     * @param lineItemId value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemCustomTypeActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the LineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the LineItem.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StagedOrderSetLineItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the LineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the LineItem.</p>
     * @param type value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the LineItem.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StagedOrderSetLineItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the LineItem.</p>
     * @param fields value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds StagedOrderSetLineItemCustomTypeAction with checking for non-null required values
     * @return StagedOrderSetLineItemCustomTypeAction
     */
    public StagedOrderSetLineItemCustomTypeAction build() {
        Objects.requireNonNull(lineItemId, StagedOrderSetLineItemCustomTypeAction.class + ": lineItemId is missing");
        return new StagedOrderSetLineItemCustomTypeActionImpl(lineItemId, type, fields);
    }

    /**
     * builds StagedOrderSetLineItemCustomTypeAction without checking for non-null required values
     * @return StagedOrderSetLineItemCustomTypeAction
     */
    public StagedOrderSetLineItemCustomTypeAction buildUnchecked() {
        return new StagedOrderSetLineItemCustomTypeActionImpl(lineItemId, type, fields);
    }

    public static StagedOrderSetLineItemCustomTypeActionBuilder of() {
        return new StagedOrderSetLineItemCustomTypeActionBuilder();
    }

    public static StagedOrderSetLineItemCustomTypeActionBuilder of(
            final StagedOrderSetLineItemCustomTypeAction template) {
        StagedOrderSetLineItemCustomTypeActionBuilder builder = new StagedOrderSetLineItemCustomTypeActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
