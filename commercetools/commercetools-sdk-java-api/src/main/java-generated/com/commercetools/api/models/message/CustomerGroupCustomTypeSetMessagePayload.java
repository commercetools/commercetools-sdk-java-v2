
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after adding a Custom Type to a Customer Group using the Set Custom Type update action.</p>
 *
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
@JsonDeserialize(as = CustomerGroupCustomTypeSetMessagePayloadImpl.class)
public interface CustomerGroupCustomTypeSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerGroupCustomTypeSetMessagePayload
     */
    String CUSTOMER_GROUP_CUSTOM_TYPE_SET = "CustomerGroupCustomTypeSet";

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @return customFields
     */
    @NotNull
    @Valid
    @JsonProperty("customFields")
    public CustomFields getCustomFields();

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @JsonProperty("oldTypeId")
    public String getOldTypeId();

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param customFields value to be set
     */

    public void setCustomFields(final CustomFields customFields);

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     */

    public void setOldTypeId(final String oldTypeId);

    /**
     * factory method
     * @return instance of CustomerGroupCustomTypeSetMessagePayload
     */
    public static CustomerGroupCustomTypeSetMessagePayload of() {
        return new CustomerGroupCustomTypeSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupCustomTypeSetMessagePayload of(final CustomerGroupCustomTypeSetMessagePayload template) {
        CustomerGroupCustomTypeSetMessagePayloadImpl instance = new CustomerGroupCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(template.getCustomFields());
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerGroupCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupCustomTypeSetMessagePayload deepCopy(
            @Nullable final CustomerGroupCustomTypeSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerGroupCustomTypeSetMessagePayloadImpl instance = new CustomerGroupCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustomFields()));
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * builder factory method for CustomerGroupCustomTypeSetMessagePayload
     * @return builder
     */
    public static CustomerGroupCustomTypeSetMessagePayloadBuilder builder() {
        return CustomerGroupCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerGroupCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupCustomTypeSetMessagePayloadBuilder builder(
            final CustomerGroupCustomTypeSetMessagePayload template) {
        return CustomerGroupCustomTypeSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupCustomTypeSetMessagePayload(
            Function<CustomerGroupCustomTypeSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupCustomTypeSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupCustomTypeSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupCustomTypeSetMessagePayload>";
            }
        };
    }
}
