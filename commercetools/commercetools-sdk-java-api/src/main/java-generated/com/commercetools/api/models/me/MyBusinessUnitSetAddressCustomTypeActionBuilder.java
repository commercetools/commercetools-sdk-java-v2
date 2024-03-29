
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitSetAddressCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitSetAddressCustomTypeAction myBusinessUnitSetAddressCustomTypeAction = MyBusinessUnitSetAddressCustomTypeAction.builder()
 *             .addressId("{addressId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitSetAddressCustomTypeActionBuilder
        implements Builder<MyBusinessUnitSetAddressCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    private String addressId;

    /**
     *  <p>Defines the Type that extends the <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public MyBusinessUnitSetAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public MyBusinessUnitSetAddressCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
     * @param type value to be set
     * @return Builder
     */

    public MyBusinessUnitSetAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public MyBusinessUnitSetAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public MyBusinessUnitSetAddressCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code>.</p>
     * @param fields value to be set
     * @return Builder
     */

    public MyBusinessUnitSetAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>ID of the <code>address</code> to be extended.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public MyBusinessUnitSetAddressCustomTypeActionBuilder addressId(final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code>.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     *  <p>ID of the <code>address</code> to be extended.</p>
     * @return addressId
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     * builds MyBusinessUnitSetAddressCustomTypeAction with checking for non-null required values
     * @return MyBusinessUnitSetAddressCustomTypeAction
     */
    public MyBusinessUnitSetAddressCustomTypeAction build() {
        Objects.requireNonNull(addressId, MyBusinessUnitSetAddressCustomTypeAction.class + ": addressId is missing");
        return new MyBusinessUnitSetAddressCustomTypeActionImpl(type, fields, addressId);
    }

    /**
     * builds MyBusinessUnitSetAddressCustomTypeAction without checking for non-null required values
     * @return MyBusinessUnitSetAddressCustomTypeAction
     */
    public MyBusinessUnitSetAddressCustomTypeAction buildUnchecked() {
        return new MyBusinessUnitSetAddressCustomTypeActionImpl(type, fields, addressId);
    }

    /**
     * factory method for an instance of MyBusinessUnitSetAddressCustomTypeActionBuilder
     * @return builder
     */
    public static MyBusinessUnitSetAddressCustomTypeActionBuilder of() {
        return new MyBusinessUnitSetAddressCustomTypeActionBuilder();
    }

    /**
     * create builder for MyBusinessUnitSetAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitSetAddressCustomTypeActionBuilder of(
            final MyBusinessUnitSetAddressCustomTypeAction template) {
        MyBusinessUnitSetAddressCustomTypeActionBuilder builder = new MyBusinessUnitSetAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        builder.addressId = template.getAddressId();
        return builder;
    }

}
