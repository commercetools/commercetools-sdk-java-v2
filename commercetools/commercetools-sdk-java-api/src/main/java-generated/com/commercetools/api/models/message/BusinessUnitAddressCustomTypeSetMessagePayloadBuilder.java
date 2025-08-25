
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAddressCustomTypeSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressCustomTypeSetMessagePayload businessUnitAddressCustomTypeSetMessagePayload = BusinessUnitAddressCustomTypeSetMessagePayload.builder()
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddressCustomTypeSetMessagePayloadBuilder
        implements Builder<BusinessUnitAddressCustomTypeSetMessagePayload> {

    private com.commercetools.api.models.type.CustomFields customFields;

    @Nullable
    private String oldTypeId;

    @Nullable
    private String addressId;

    /**
     *  <p>The Custom Fields that were set.</p>
     * @param builder function to build the customFields value
     * @return Builder
     */

    public BusinessUnitAddressCustomTypeSetMessagePayloadBuilder customFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.customFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Custom Fields that were set.</p>
     * @param builder function to build the customFields value
     * @return Builder
     */

    public BusinessUnitAddressCustomTypeSetMessagePayloadBuilder withCustomFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.customFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>The Custom Fields that were set.</p>
     * @param customFields value to be set
     * @return Builder
     */

    public BusinessUnitAddressCustomTypeSetMessagePayloadBuilder customFields(
            final com.commercetools.api.models.type.CustomFields customFields) {
        this.customFields = customFields;
        return this;
    }

    /**
     *  <p><code>id</code> of the previous <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a>. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     * @return Builder
     */

    public BusinessUnitAddressCustomTypeSetMessagePayloadBuilder oldTypeId(@Nullable final String oldTypeId) {
        this.oldTypeId = oldTypeId;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> on which the Custom Field was set.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public BusinessUnitAddressCustomTypeSetMessagePayloadBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>The Custom Fields that were set.</p>
     * @return customFields
     */

    public com.commercetools.api.models.type.CustomFields getCustomFields() {
        return this.customFields;
    }

    /**
     *  <p><code>id</code> of the previous <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a>. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @Nullable
    public String getOldTypeId() {
        return this.oldTypeId;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> on which the Custom Field was set.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     * builds BusinessUnitAddressCustomTypeSetMessagePayload with checking for non-null required values
     * @return BusinessUnitAddressCustomTypeSetMessagePayload
     */
    public BusinessUnitAddressCustomTypeSetMessagePayload build() {
        Objects.requireNonNull(customFields,
            BusinessUnitAddressCustomTypeSetMessagePayload.class + ": customFields is missing");
        return new BusinessUnitAddressCustomTypeSetMessagePayloadImpl(customFields, oldTypeId, addressId);
    }

    /**
     * builds BusinessUnitAddressCustomTypeSetMessagePayload without checking for non-null required values
     * @return BusinessUnitAddressCustomTypeSetMessagePayload
     */
    public BusinessUnitAddressCustomTypeSetMessagePayload buildUnchecked() {
        return new BusinessUnitAddressCustomTypeSetMessagePayloadImpl(customFields, oldTypeId, addressId);
    }

    /**
     * factory method for an instance of BusinessUnitAddressCustomTypeSetMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitAddressCustomTypeSetMessagePayloadBuilder of() {
        return new BusinessUnitAddressCustomTypeSetMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitAddressCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressCustomTypeSetMessagePayloadBuilder of(
            final BusinessUnitAddressCustomTypeSetMessagePayload template) {
        BusinessUnitAddressCustomTypeSetMessagePayloadBuilder builder = new BusinessUnitAddressCustomTypeSetMessagePayloadBuilder();
        builder.customFields = template.getCustomFields();
        builder.oldTypeId = template.getOldTypeId();
        builder.addressId = template.getAddressId();
        return builder;
    }

}
