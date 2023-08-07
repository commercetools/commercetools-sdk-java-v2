
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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCustomLineItemCustomTypeActionBuilder
        implements Builder<StagedOrderSetCustomLineItemCustomTypeAction> {

    @Nullable
    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder customLineItemId(
            @Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder customLineItemKey(
            @Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Custom Line Item with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Custom Line Item.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Custom Line Item with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Custom Line Item.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Custom Line Item with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Custom Line Item.</p>
     * @param type value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Custom Line Item.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Custom Line Item.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Custom Line Item.</p>
     * @param fields value to be set
     * @return Builder
     */

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @Nullable
    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @Nullable
    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>Defines the Type that extends the Custom Line Item with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Custom Line Item.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Custom Line Item.</p>
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
        return new StagedOrderSetCustomLineItemCustomTypeActionImpl(customLineItemId, customLineItemKey, type, fields);
    }

    /**
     * builds StagedOrderSetCustomLineItemCustomTypeAction without checking for non-null required values
     * @return StagedOrderSetCustomLineItemCustomTypeAction
     */
    public StagedOrderSetCustomLineItemCustomTypeAction buildUnchecked() {
        return new StagedOrderSetCustomLineItemCustomTypeActionImpl(customLineItemId, customLineItemKey, type, fields);
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
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
