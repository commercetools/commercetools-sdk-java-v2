
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupCustomTypeSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupCustomTypeSetMessagePayload customerGroupCustomTypeSetMessagePayload = CustomerGroupCustomTypeSetMessagePayload.builder()
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupCustomTypeSetMessagePayloadBuilder
        implements Builder<CustomerGroupCustomTypeSetMessagePayload> {

    private com.commercetools.api.models.type.CustomFields customFields;

    @Nullable
    private String oldTypeId;

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param builder function to build the customFields value
     * @return Builder
     */

    public CustomerGroupCustomTypeSetMessagePayloadBuilder customFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.customFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param builder function to build the customFields value
     * @return Builder
     */

    public CustomerGroupCustomTypeSetMessagePayloadBuilder withCustomFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.customFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param customFields value to be set
     * @return Builder
     */

    public CustomerGroupCustomTypeSetMessagePayloadBuilder customFields(
            final com.commercetools.api.models.type.CustomFields customFields) {
        this.customFields = customFields;
        return this;
    }

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     * @return Builder
     */

    public CustomerGroupCustomTypeSetMessagePayloadBuilder oldTypeId(@Nullable final String oldTypeId) {
        this.oldTypeId = oldTypeId;
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
     * @return oldTypeId
     */

    @Nullable
    public String getOldTypeId() {
        return this.oldTypeId;
    }

    /**
     * builds CustomerGroupCustomTypeSetMessagePayload with checking for non-null required values
     * @return CustomerGroupCustomTypeSetMessagePayload
     */
    public CustomerGroupCustomTypeSetMessagePayload build() {
        Objects.requireNonNull(customFields,
            CustomerGroupCustomTypeSetMessagePayload.class + ": customFields is missing");
        return new CustomerGroupCustomTypeSetMessagePayloadImpl(customFields, oldTypeId);
    }

    /**
     * builds CustomerGroupCustomTypeSetMessagePayload without checking for non-null required values
     * @return CustomerGroupCustomTypeSetMessagePayload
     */
    public CustomerGroupCustomTypeSetMessagePayload buildUnchecked() {
        return new CustomerGroupCustomTypeSetMessagePayloadImpl(customFields, oldTypeId);
    }

    /**
     * factory method for an instance of CustomerGroupCustomTypeSetMessagePayloadBuilder
     * @return builder
     */
    public static CustomerGroupCustomTypeSetMessagePayloadBuilder of() {
        return new CustomerGroupCustomTypeSetMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerGroupCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupCustomTypeSetMessagePayloadBuilder of(
            final CustomerGroupCustomTypeSetMessagePayload template) {
        CustomerGroupCustomTypeSetMessagePayloadBuilder builder = new CustomerGroupCustomTypeSetMessagePayloadBuilder();
        builder.customFields = template.getCustomFields();
        builder.oldTypeId = template.getOldTypeId();
        return builder;
    }

}
