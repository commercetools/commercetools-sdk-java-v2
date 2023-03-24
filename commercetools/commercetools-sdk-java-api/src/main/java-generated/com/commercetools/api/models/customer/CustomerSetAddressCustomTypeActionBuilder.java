
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetAddressCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetAddressCustomTypeAction customerSetAddressCustomTypeAction = CustomerSetAddressCustomTypeAction.builder()
 *             .addressId("{addressId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetAddressCustomTypeActionBuilder implements Builder<CustomerSetAddressCustomTypeAction> {

    private String addressId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>User-defined unique identifier of the Address to be updated.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public CustomerSetAddressCustomTypeActionBuilder addressId(final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CustomerSetAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
     * @param type value to be set
     * @return Builder
     */

    public CustomerSetAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CustomerSetAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code>.</p>
     * @param fields value to be set
     * @return Builder
     */

    public CustomerSetAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getAddressId() {
        return this.addressId;
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
     * builds CustomerSetAddressCustomTypeAction with checking for non-null required values
     * @return CustomerSetAddressCustomTypeAction
     */
    public CustomerSetAddressCustomTypeAction build() {
        Objects.requireNonNull(addressId, CustomerSetAddressCustomTypeAction.class + ": addressId is missing");
        return new CustomerSetAddressCustomTypeActionImpl(addressId, type, fields);
    }

    /**
     * builds CustomerSetAddressCustomTypeAction without checking for non-null required values
     * @return CustomerSetAddressCustomTypeAction
     */
    public CustomerSetAddressCustomTypeAction buildUnchecked() {
        return new CustomerSetAddressCustomTypeActionImpl(addressId, type, fields);
    }

    public static CustomerSetAddressCustomTypeActionBuilder of() {
        return new CustomerSetAddressCustomTypeActionBuilder();
    }

    public static CustomerSetAddressCustomTypeActionBuilder of(final CustomerSetAddressCustomTypeAction template) {
        CustomerSetAddressCustomTypeActionBuilder builder = new CustomerSetAddressCustomTypeActionBuilder();
        builder.addressId = template.getAddressId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
