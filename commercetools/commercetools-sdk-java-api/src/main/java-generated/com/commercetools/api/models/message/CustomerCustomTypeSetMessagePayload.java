
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
 *  <p>Generated after adding a Custom Type to a Customer using the Set Custom Type update action.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("CustomerCustomTypeSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerCustomTypeSetMessagePayloadImpl.class)
public interface CustomerCustomTypeSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerCustomTypeSetMessagePayload
     */
    String CUSTOMER_CUSTOM_TYPE_SET = "CustomerCustomTypeSet";

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
     * @return previousTypeId
     */

    @JsonProperty("previousTypeId")
    public String getPreviousTypeId();

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param customFields value to be set
     */

    public void setCustomFields(final CustomFields customFields);

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     */

    public void setPreviousTypeId(final String previousTypeId);

    /**
     * factory method
     * @return instance of CustomerCustomTypeSetMessagePayload
     */
    public static CustomerCustomTypeSetMessagePayload of() {
        return new CustomerCustomTypeSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerCustomTypeSetMessagePayload of(final CustomerCustomTypeSetMessagePayload template) {
        CustomerCustomTypeSetMessagePayloadImpl instance = new CustomerCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(template.getCustomFields());
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    public CustomerCustomTypeSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerCustomTypeSetMessagePayload deepCopy(
            @Nullable final CustomerCustomTypeSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerCustomTypeSetMessagePayloadImpl instance = new CustomerCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustomFields()));
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    /**
     * builder factory method for CustomerCustomTypeSetMessagePayload
     * @return builder
     */
    public static CustomerCustomTypeSetMessagePayloadBuilder builder() {
        return CustomerCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCustomTypeSetMessagePayloadBuilder builder(
            final CustomerCustomTypeSetMessagePayload template) {
        return CustomerCustomTypeSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerCustomTypeSetMessagePayload(Function<CustomerCustomTypeSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerCustomTypeSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerCustomTypeSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerCustomTypeSetMessagePayload>";
            }
        };
    }
}
