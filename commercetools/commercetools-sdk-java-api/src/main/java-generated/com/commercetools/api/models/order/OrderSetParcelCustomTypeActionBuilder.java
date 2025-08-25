
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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetParcelCustomTypeActionBuilder implements Builder<OrderSetParcelCustomTypeAction> {

    @Nullable
    private String parcelId;

    @Nullable
    private String parcelKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelId value to be set
     * @return Builder
     */

    public OrderSetParcelCustomTypeActionBuilder parcelId(@Nullable final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *  <p><code>key</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelKey value to be set
     * @return Builder
     */

    public OrderSetParcelCustomTypeActionBuilder parcelKey(@Nullable final String parcelKey) {
        this.parcelKey = parcelKey;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Parcel with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Parcel.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public OrderSetParcelCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Parcel with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Parcel.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public OrderSetParcelCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Parcel with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Parcel.</p>
     * @param type value to be set
     * @return Builder
     */

    public OrderSetParcelCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Parcel.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public OrderSetParcelCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Parcel.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public OrderSetParcelCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Parcel.</p>
     * @param fields value to be set
     * @return Builder
     */

    public OrderSetParcelCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelId
     */

    @Nullable
    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p><code>key</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelKey
     */

    @Nullable
    public String getParcelKey() {
        return this.parcelKey;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Parcel with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Parcel.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Parcel.</p>
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
        return new OrderSetParcelCustomTypeActionImpl(parcelId, parcelKey, type, fields);
    }

    /**
     * builds OrderSetParcelCustomTypeAction without checking for non-null required values
     * @return OrderSetParcelCustomTypeAction
     */
    public OrderSetParcelCustomTypeAction buildUnchecked() {
        return new OrderSetParcelCustomTypeActionImpl(parcelId, parcelKey, type, fields);
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
        builder.parcelKey = template.getParcelKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
