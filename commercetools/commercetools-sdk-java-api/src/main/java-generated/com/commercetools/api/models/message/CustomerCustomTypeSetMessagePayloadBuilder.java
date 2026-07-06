
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerCustomTypeSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCustomTypeSetMessagePayload customerCustomTypeSetMessagePayload = CustomerCustomTypeSetMessagePayload.builder()
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerCustomTypeSetMessagePayloadBuilder implements Builder<CustomerCustomTypeSetMessagePayload> {

    private com.commercetools.api.models.type.CustomFields customFields;

    @Nullable
    private String previousTypeId;

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param builder function to build the customFields value
     * @return Builder
     */

    public CustomerCustomTypeSetMessagePayloadBuilder customFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.customFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param builder function to build the customFields value
     * @return Builder
     */

    public CustomerCustomTypeSetMessagePayloadBuilder withCustomFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.customFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param customFields value to be set
     * @return Builder
     */

    public CustomerCustomTypeSetMessagePayloadBuilder customFields(
            final com.commercetools.api.models.type.CustomFields customFields) {
        this.customFields = customFields;
        return this;
    }

    /**
     *  <p><code>id</code> of the previous <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a>. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     * @return Builder
     */

    public CustomerCustomTypeSetMessagePayloadBuilder previousTypeId(@Nullable final String previousTypeId) {
        this.previousTypeId = previousTypeId;
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
     *  <p><code>id</code> of the previous <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a>. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @Nullable
    public String getPreviousTypeId() {
        return this.previousTypeId;
    }

    /**
     * builds CustomerCustomTypeSetMessagePayload with checking for non-null required values
     * @return CustomerCustomTypeSetMessagePayload
     */
    public CustomerCustomTypeSetMessagePayload build() {
        Objects.requireNonNull(customFields, CustomerCustomTypeSetMessagePayload.class + ": customFields is missing");
        return new CustomerCustomTypeSetMessagePayloadImpl(customFields, previousTypeId);
    }

    /**
     * builds CustomerCustomTypeSetMessagePayload without checking for non-null required values
     * @return CustomerCustomTypeSetMessagePayload
     */
    public CustomerCustomTypeSetMessagePayload buildUnchecked() {
        return new CustomerCustomTypeSetMessagePayloadImpl(customFields, previousTypeId);
    }

    /**
     * factory method for an instance of CustomerCustomTypeSetMessagePayloadBuilder
     * @return builder
     */
    public static CustomerCustomTypeSetMessagePayloadBuilder of() {
        return new CustomerCustomTypeSetMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCustomTypeSetMessagePayloadBuilder of(final CustomerCustomTypeSetMessagePayload template) {
        CustomerCustomTypeSetMessagePayloadBuilder builder = new CustomerCustomTypeSetMessagePayloadBuilder();
        builder.customFields = template.getCustomFields();
        builder.previousTypeId = template.getPreviousTypeId();
        return builder;
    }

}
