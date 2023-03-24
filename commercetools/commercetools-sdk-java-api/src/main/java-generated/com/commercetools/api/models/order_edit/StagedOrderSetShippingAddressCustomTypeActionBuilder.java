
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetShippingAddressCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingAddressCustomTypeAction stagedOrderSetShippingAddressCustomTypeAction = StagedOrderSetShippingAddressCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetShippingAddressCustomTypeActionBuilder
        implements Builder<StagedOrderSetShippingAddressCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the <code>shippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StagedOrderSetShippingAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>shippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>
     * @param type value to be set
     * @return Builder
     */

    public StagedOrderSetShippingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>shippingAddress</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StagedOrderSetShippingAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>shippingAddress</code>.</p>
     * @param fields value to be set
     * @return Builder
     */

    public StagedOrderSetShippingAddressCustomTypeActionBuilder fields(
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

    /**
     * builds StagedOrderSetShippingAddressCustomTypeAction with checking for non-null required values
     * @return StagedOrderSetShippingAddressCustomTypeAction
     */
    public StagedOrderSetShippingAddressCustomTypeAction build() {
        return new StagedOrderSetShippingAddressCustomTypeActionImpl(type, fields);
    }

    /**
     * builds StagedOrderSetShippingAddressCustomTypeAction without checking for non-null required values
     * @return StagedOrderSetShippingAddressCustomTypeAction
     */
    public StagedOrderSetShippingAddressCustomTypeAction buildUnchecked() {
        return new StagedOrderSetShippingAddressCustomTypeActionImpl(type, fields);
    }

    public static StagedOrderSetShippingAddressCustomTypeActionBuilder of() {
        return new StagedOrderSetShippingAddressCustomTypeActionBuilder();
    }

    public static StagedOrderSetShippingAddressCustomTypeActionBuilder of(
            final StagedOrderSetShippingAddressCustomTypeAction template) {
        StagedOrderSetShippingAddressCustomTypeActionBuilder builder = new StagedOrderSetShippingAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
