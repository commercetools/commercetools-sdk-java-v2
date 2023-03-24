
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetReturnItemCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetReturnItemCustomTypeAction stagedOrderSetReturnItemCustomTypeAction = StagedOrderSetReturnItemCustomTypeAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetReturnItemCustomTypeActionBuilder
        implements Builder<StagedOrderSetReturnItemCustomTypeAction> {

    private String returnItemId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *
     * @param returnItemId value to be set
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomTypeActionBuilder returnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the ReturnItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ReturnItem.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the ReturnItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ReturnItem.</p>
     * @param type value to be set
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the ReturnItem.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the ReturnItem.</p>
     * @param fields value to be set
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getReturnItemId() {
        return this.returnItemId;
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
     * builds StagedOrderSetReturnItemCustomTypeAction with checking for non-null required values
     * @return StagedOrderSetReturnItemCustomTypeAction
     */
    public StagedOrderSetReturnItemCustomTypeAction build() {
        Objects.requireNonNull(returnItemId,
            StagedOrderSetReturnItemCustomTypeAction.class + ": returnItemId is missing");
        return new StagedOrderSetReturnItemCustomTypeActionImpl(returnItemId, type, fields);
    }

    /**
     * builds StagedOrderSetReturnItemCustomTypeAction without checking for non-null required values
     * @return StagedOrderSetReturnItemCustomTypeAction
     */
    public StagedOrderSetReturnItemCustomTypeAction buildUnchecked() {
        return new StagedOrderSetReturnItemCustomTypeActionImpl(returnItemId, type, fields);
    }

    public static StagedOrderSetReturnItemCustomTypeActionBuilder of() {
        return new StagedOrderSetReturnItemCustomTypeActionBuilder();
    }

    public static StagedOrderSetReturnItemCustomTypeActionBuilder of(
            final StagedOrderSetReturnItemCustomTypeAction template) {
        StagedOrderSetReturnItemCustomTypeActionBuilder builder = new StagedOrderSetReturnItemCustomTypeActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
