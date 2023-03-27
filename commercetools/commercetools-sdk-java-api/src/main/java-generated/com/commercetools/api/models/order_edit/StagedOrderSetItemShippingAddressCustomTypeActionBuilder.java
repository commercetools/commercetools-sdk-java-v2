
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetItemShippingAddressCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetItemShippingAddressCustomTypeAction stagedOrderSetItemShippingAddressCustomTypeAction = StagedOrderSetItemShippingAddressCustomTypeAction.builder()
 *             .addressKey("{addressKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetItemShippingAddressCustomTypeActionBuilder
        implements Builder<StagedOrderSetItemShippingAddressCustomTypeAction> {

    private String addressKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     * set the value to the addressKey
     * @param addressKey value to be set
     * @return Builder
     */

    public StagedOrderSetItemShippingAddressCustomTypeActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>itemShippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>itemShippingAddress</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StagedOrderSetItemShippingAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>itemShippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>itemShippingAddress</code>.</p>
     * @param type value to be set
     * @return Builder
     */

    public StagedOrderSetItemShippingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>itemShippingAddress</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StagedOrderSetItemShippingAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>itemShippingAddress</code>.</p>
     * @param fields value to be set
     * @return Builder
     */

    public StagedOrderSetItemShippingAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     * value of addressKey}
     * @return addressKey
     */

    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     *  <p>Defines the Type that extends the <code>itemShippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>itemShippingAddress</code>.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>itemShippingAddress</code>.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds StagedOrderSetItemShippingAddressCustomTypeAction with checking for non-null required values
     * @return StagedOrderSetItemShippingAddressCustomTypeAction
     */
    public StagedOrderSetItemShippingAddressCustomTypeAction build() {
        Objects.requireNonNull(addressKey,
            StagedOrderSetItemShippingAddressCustomTypeAction.class + ": addressKey is missing");
        return new StagedOrderSetItemShippingAddressCustomTypeActionImpl(addressKey, type, fields);
    }

    /**
     * builds StagedOrderSetItemShippingAddressCustomTypeAction without checking for non-null required values
     * @return StagedOrderSetItemShippingAddressCustomTypeAction
     */
    public StagedOrderSetItemShippingAddressCustomTypeAction buildUnchecked() {
        return new StagedOrderSetItemShippingAddressCustomTypeActionImpl(addressKey, type, fields);
    }

    /**
     * factory method for an instance of StagedOrderSetItemShippingAddressCustomTypeActionBuilder
     * @return builder
     */
    public static StagedOrderSetItemShippingAddressCustomTypeActionBuilder of() {
        return new StagedOrderSetItemShippingAddressCustomTypeActionBuilder();
    }

    /**
     * create builder for StagedOrderSetItemShippingAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetItemShippingAddressCustomTypeActionBuilder of(
            final StagedOrderSetItemShippingAddressCustomTypeAction template) {
        StagedOrderSetItemShippingAddressCustomTypeActionBuilder builder = new StagedOrderSetItemShippingAddressCustomTypeActionBuilder();
        builder.addressKey = template.getAddressKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
