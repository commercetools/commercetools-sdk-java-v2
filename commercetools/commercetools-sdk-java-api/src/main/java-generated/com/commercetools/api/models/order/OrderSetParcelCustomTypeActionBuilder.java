
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetParcelCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetParcelCustomTypeAction orderSetParcelCustomTypeAction = OrderSetParcelCustomTypeAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetParcelCustomTypeActionBuilder implements Builder<OrderSetParcelCustomTypeAction> {

    private String parcelId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     * set the value to the parcelId
     * @param parcelId value to be set
     * @return Builder
     */

    public OrderSetParcelCustomTypeActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Parcel with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Parcel.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public OrderSetParcelCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Parcel with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Parcel.</p>
     * @param type value to be set
     * @return Builder
     */

    public OrderSetParcelCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Parcel.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public OrderSetParcelCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Parcel.</p>
     * @param fields value to be set
     * @return Builder
     */

    public OrderSetParcelCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     * value of parcelId}
     * @return parcelId
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p>Defines the Type that extends the Parcel with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Parcel.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Parcel.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds OrderSetParcelCustomTypeAction with checking for non-null required values
     * @return OrderSetParcelCustomTypeAction
     */
    public OrderSetParcelCustomTypeAction build() {
        Objects.requireNonNull(parcelId, OrderSetParcelCustomTypeAction.class + ": parcelId is missing");
        return new OrderSetParcelCustomTypeActionImpl(parcelId, type, fields);
    }

    /**
     * builds OrderSetParcelCustomTypeAction without checking for non-null required values
     * @return OrderSetParcelCustomTypeAction
     */
    public OrderSetParcelCustomTypeAction buildUnchecked() {
        return new OrderSetParcelCustomTypeActionImpl(parcelId, type, fields);
    }

    /**
     * factory method for an instance of OrderSetParcelCustomTypeActionBuilder
     * @return builder
     */
    public static OrderSetParcelCustomTypeActionBuilder of() {
        return new OrderSetParcelCustomTypeActionBuilder();
    }

    /**
     * create builder for OrderSetParcelCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetParcelCustomTypeActionBuilder of(final OrderSetParcelCustomTypeAction template) {
        OrderSetParcelCustomTypeActionBuilder builder = new OrderSetParcelCustomTypeActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
