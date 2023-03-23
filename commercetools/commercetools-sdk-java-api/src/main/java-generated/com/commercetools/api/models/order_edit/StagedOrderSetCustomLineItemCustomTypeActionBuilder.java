
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
     *
     * @param customLineItemId
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the CustomLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomLineItem.</p>
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the CustomLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomLineItem.</p>
     * @param type
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the CustomLineItem.</p>
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the CustomLineItem.</p>
     * @param fields
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public StagedOrderSetCustomLineItemCustomTypeAction build() {
        Objects.requireNonNull(customLineItemId,
            StagedOrderSetCustomLineItemCustomTypeAction.class + ": customLineItemId is missing");
        return new StagedOrderSetCustomLineItemCustomTypeActionImpl(customLineItemId, type, fields);
    }

    /**
     * builds StagedOrderSetCustomLineItemCustomTypeAction without checking for non null required values
     */
    public StagedOrderSetCustomLineItemCustomTypeAction buildUnchecked() {
        return new StagedOrderSetCustomLineItemCustomTypeActionImpl(customLineItemId, type, fields);
    }

    public static StagedOrderSetCustomLineItemCustomTypeActionBuilder of() {
        return new StagedOrderSetCustomLineItemCustomTypeActionBuilder();
    }

    public static StagedOrderSetCustomLineItemCustomTypeActionBuilder of(
            final StagedOrderSetCustomLineItemCustomTypeAction template) {
        StagedOrderSetCustomLineItemCustomTypeActionBuilder builder = new StagedOrderSetCustomLineItemCustomTypeActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
