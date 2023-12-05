
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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetReturnItemCustomTypeActionBuilder
        implements Builder<StagedOrderSetReturnItemCustomTypeAction> {

    @Nullable
    private String returnItemId;

    @Nullable
    private String returnItemKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p><code>id</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemId value to be set
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomTypeActionBuilder returnItemId(@Nullable final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemKey value to be set
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomTypeActionBuilder returnItemKey(@Nullable final String returnItemKey) {
        this.returnItemKey = returnItemKey;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Return Item with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Return Item.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Return Item with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Return Item.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Return Item with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Return Item.</p>
     * @param type value to be set
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Return Item.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Return Item.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Return Item.</p>
     * @param fields value to be set
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p><code>id</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @return returnItemId
     */

    @Nullable
    public String getReturnItemId() {
        return this.returnItemId;
    }

    /**
     *  <p><code>key</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @return returnItemKey
     */

    @Nullable
    public String getReturnItemKey() {
        return this.returnItemKey;
    }

    /**
     *  <p>Defines the Type that extends the Return Item with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Return Item.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Return Item.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds StagedOrderSetReturnItemCustomTypeAction with checking for non-null required values
     * @return StagedOrderSetReturnItemCustomTypeAction
     */
    public StagedOrderSetReturnItemCustomTypeAction build() {
        return new StagedOrderSetReturnItemCustomTypeActionImpl(returnItemId, returnItemKey, type, fields);
    }

    /**
     * builds StagedOrderSetReturnItemCustomTypeAction without checking for non-null required values
     * @return StagedOrderSetReturnItemCustomTypeAction
     */
    public StagedOrderSetReturnItemCustomTypeAction buildUnchecked() {
        return new StagedOrderSetReturnItemCustomTypeActionImpl(returnItemId, returnItemKey, type, fields);
    }

    /**
     * factory method for an instance of StagedOrderSetReturnItemCustomTypeActionBuilder
     * @return builder
     */
    public static StagedOrderSetReturnItemCustomTypeActionBuilder of() {
        return new StagedOrderSetReturnItemCustomTypeActionBuilder();
    }

    /**
     * create builder for StagedOrderSetReturnItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetReturnItemCustomTypeActionBuilder of(
            final StagedOrderSetReturnItemCustomTypeAction template) {
        StagedOrderSetReturnItemCustomTypeActionBuilder builder = new StagedOrderSetReturnItemCustomTypeActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.returnItemKey = template.getReturnItemKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
