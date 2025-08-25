
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after removing a Custom Type from a Business Unit using the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomTypeAction" rel="nofollow">Set Custom Type</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomTypeRemovedMessagePayload businessUnitCustomTypeRemovedMessagePayload = BusinessUnitCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitCustomTypeRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitCustomTypeRemovedMessagePayloadImpl.class)
public interface BusinessUnitCustomTypeRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitCustomTypeRemovedMessagePayload
     */
    String BUSINESS_UNIT_CUSTOM_TYPE_REMOVED = "BusinessUnitCustomTypeRemoved";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @JsonProperty("oldTypeId")
    public String getOldTypeId();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     */

    public void setOldTypeId(final String oldTypeId);

    /**
     * factory method
     * @return instance of BusinessUnitCustomTypeRemovedMessagePayload
     */
    public static BusinessUnitCustomTypeRemovedMessagePayload of() {
        return new BusinessUnitCustomTypeRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitCustomTypeRemovedMessagePayload of(
            final BusinessUnitCustomTypeRemovedMessagePayload template) {
        BusinessUnitCustomTypeRemovedMessagePayloadImpl instance = new BusinessUnitCustomTypeRemovedMessagePayloadImpl();
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    public BusinessUnitCustomTypeRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitCustomTypeRemovedMessagePayload deepCopy(
            @Nullable final BusinessUnitCustomTypeRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitCustomTypeRemovedMessagePayloadImpl instance = new BusinessUnitCustomTypeRemovedMessagePayloadImpl();
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitCustomTypeRemovedMessagePayload
     * @return builder
     */
    public static BusinessUnitCustomTypeRemovedMessagePayloadBuilder builder() {
        return BusinessUnitCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomTypeRemovedMessagePayloadBuilder builder(
            final BusinessUnitCustomTypeRemovedMessagePayload template) {
        return BusinessUnitCustomTypeRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitCustomTypeRemovedMessagePayload(
            Function<BusinessUnitCustomTypeRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomTypeRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomTypeRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCustomTypeRemovedMessagePayload>";
            }
        };
    }
}
