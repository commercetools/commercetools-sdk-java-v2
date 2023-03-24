
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSetAddressCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetAddressCustomTypeAction businessUnitSetAddressCustomTypeAction = BusinessUnitSetAddressCustomTypeAction.builder()
 *             .addressId("{addressId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSetAddressCustomTypeActionBuilder implements Builder<BusinessUnitSetAddressCustomTypeAction> {

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

    public BusinessUnitSetAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
     * @param type value to be set
     * @return Builder
     */

    public BusinessUnitSetAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields for the <code>address</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public BusinessUnitSetAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields for the <code>address</code>.</p>
     * @param fields value to be set
     * @return Builder
     */

    public BusinessUnitSetAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>ID of the address to be extended.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public BusinessUnitSetAddressCustomTypeActionBuilder addressId(final String addressId) {
        this.addressId = addressId;
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

    public String getAddressId() {
        return this.addressId;
    }

    /**
     * builds BusinessUnitSetAddressCustomTypeAction with checking for non-null required values
     * @return BusinessUnitSetAddressCustomTypeAction
     */
    public BusinessUnitSetAddressCustomTypeAction build() {
        Objects.requireNonNull(addressId, BusinessUnitSetAddressCustomTypeAction.class + ": addressId is missing");
        return new BusinessUnitSetAddressCustomTypeActionImpl(type, fields, addressId);
    }

    /**
     * builds BusinessUnitSetAddressCustomTypeAction without checking for non-null required values
     * @return BusinessUnitSetAddressCustomTypeAction
     */
    public BusinessUnitSetAddressCustomTypeAction buildUnchecked() {
        return new BusinessUnitSetAddressCustomTypeActionImpl(type, fields, addressId);
    }

    public static BusinessUnitSetAddressCustomTypeActionBuilder of() {
        return new BusinessUnitSetAddressCustomTypeActionBuilder();
    }

    public static BusinessUnitSetAddressCustomTypeActionBuilder of(
            final BusinessUnitSetAddressCustomTypeAction template) {
        BusinessUnitSetAddressCustomTypeActionBuilder builder = new BusinessUnitSetAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        builder.addressId = template.getAddressId();
        return builder;
    }

}
