
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddressCustomTypeSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressCustomTypeSetMessagePayload customerAddressCustomTypeSetMessagePayload = CustomerAddressCustomTypeSetMessagePayload.builder()
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddressCustomTypeSetMessagePayloadBuilder
        implements Builder<CustomerAddressCustomTypeSetMessagePayload> {

    private com.commercetools.api.models.type.CustomFields customFields;

    @Nullable
    private String previousTypeId;

    @Nullable
    private String addressId;

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param builder function to build the customFields value
     * @return Builder
     */

    public CustomerAddressCustomTypeSetMessagePayloadBuilder customFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.customFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param builder function to build the customFields value
     * @return Builder
     */

    public CustomerAddressCustomTypeSetMessagePayloadBuilder withCustomFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.customFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param customFields value to be set
     * @return Builder
     */

    public CustomerAddressCustomTypeSetMessagePayloadBuilder customFields(
            final com.commercetools.api.models.type.CustomFields customFields) {
        this.customFields = customFields;
        return this;
    }

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     * @return Builder
     */

    public CustomerAddressCustomTypeSetMessagePayloadBuilder previousTypeId(@Nullable final String previousTypeId) {
        this.previousTypeId = previousTypeId;
        return this;
    }

    /**
     *  <p><code>id</code> of the Address on which the Custom Field was set.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public CustomerAddressCustomTypeSetMessagePayloadBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @return customFields
     */

    public com.commercetools.api.models.type.CustomFields getCustomFields() {
        return this.customFields;
    }

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @Nullable
    public String getPreviousTypeId() {
        return this.previousTypeId;
    }

    /**
     *  <p><code>id</code> of the Address on which the Custom Field was set.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     * builds CustomerAddressCustomTypeSetMessagePayload with checking for non-null required values
     * @return CustomerAddressCustomTypeSetMessagePayload
     */
    public CustomerAddressCustomTypeSetMessagePayload build() {
        Objects.requireNonNull(customFields,
            CustomerAddressCustomTypeSetMessagePayload.class + ": customFields is missing");
        return new CustomerAddressCustomTypeSetMessagePayloadImpl(customFields, previousTypeId, addressId);
    }

    /**
     * builds CustomerAddressCustomTypeSetMessagePayload without checking for non-null required values
     * @return CustomerAddressCustomTypeSetMessagePayload
     */
    public CustomerAddressCustomTypeSetMessagePayload buildUnchecked() {
        return new CustomerAddressCustomTypeSetMessagePayloadImpl(customFields, previousTypeId, addressId);
    }

    /**
     * factory method for an instance of CustomerAddressCustomTypeSetMessagePayloadBuilder
     * @return builder
     */
    public static CustomerAddressCustomTypeSetMessagePayloadBuilder of() {
        return new CustomerAddressCustomTypeSetMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerAddressCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressCustomTypeSetMessagePayloadBuilder of(
            final CustomerAddressCustomTypeSetMessagePayload template) {
        CustomerAddressCustomTypeSetMessagePayloadBuilder builder = new CustomerAddressCustomTypeSetMessagePayloadBuilder();
        builder.customFields = template.getCustomFields();
        builder.previousTypeId = template.getPreviousTypeId();
        builder.addressId = template.getAddressId();
        return builder;
    }

}
