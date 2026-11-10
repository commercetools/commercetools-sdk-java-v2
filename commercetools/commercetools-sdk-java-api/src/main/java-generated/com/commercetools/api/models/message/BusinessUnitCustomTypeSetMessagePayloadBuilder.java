
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitCustomTypeSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomTypeSetMessagePayload businessUnitCustomTypeSetMessagePayload = BusinessUnitCustomTypeSetMessagePayload.builder()
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitCustomTypeSetMessagePayloadBuilder
        implements Builder<BusinessUnitCustomTypeSetMessagePayload> {

    private com.commercetools.api.models.type.CustomFields customFields;

    @Nullable
    private String oldTypeId;

    /**
     *  <p>The Custom Fields that were set.</p>
     * @param builder function to build the customFields value
     * @return Builder
     */

    public BusinessUnitCustomTypeSetMessagePayloadBuilder customFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.customFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Custom Fields that were set.</p>
     * @param builder function to build the customFields value
     * @return Builder
     */

    public BusinessUnitCustomTypeSetMessagePayloadBuilder withCustomFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.customFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>The Custom Fields that were set.</p>
     * @param customFields value to be set
     * @return Builder
     */

    public BusinessUnitCustomTypeSetMessagePayloadBuilder customFields(
            final com.commercetools.api.models.type.CustomFields customFields) {
        this.customFields = customFields;
        return this;
    }

    /**
     *  <p><code>id</code> of the previous <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a>. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     * @return Builder
     */

    public BusinessUnitCustomTypeSetMessagePayloadBuilder oldTypeId(@Nullable final String oldTypeId) {
        this.oldTypeId = oldTypeId;
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
     * builds BusinessUnitCustomTypeSetMessagePayload with checking for non-null required values
     * @return BusinessUnitCustomTypeSetMessagePayload
     */
    public BusinessUnitCustomTypeSetMessagePayload build() {
        Objects.requireNonNull(customFields,
            BusinessUnitCustomTypeSetMessagePayload.class + ": customFields is missing");
        return new BusinessUnitCustomTypeSetMessagePayloadImpl(customFields, oldTypeId);
    }

    /**
     * builds BusinessUnitCustomTypeSetMessagePayload without checking for non-null required values
     * @return BusinessUnitCustomTypeSetMessagePayload
     */
    public BusinessUnitCustomTypeSetMessagePayload buildUnchecked() {
        return new BusinessUnitCustomTypeSetMessagePayloadImpl(customFields, oldTypeId);
    }

    /**
     * factory method for an instance of BusinessUnitCustomTypeSetMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitCustomTypeSetMessagePayloadBuilder of() {
        return new BusinessUnitCustomTypeSetMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomTypeSetMessagePayloadBuilder of(
            final BusinessUnitCustomTypeSetMessagePayload template) {
        BusinessUnitCustomTypeSetMessagePayloadBuilder builder = new BusinessUnitCustomTypeSetMessagePayloadBuilder();
        builder.customFields = template.getCustomFields();
        builder.oldTypeId = template.getOldTypeId();
        return builder;
    }

}
