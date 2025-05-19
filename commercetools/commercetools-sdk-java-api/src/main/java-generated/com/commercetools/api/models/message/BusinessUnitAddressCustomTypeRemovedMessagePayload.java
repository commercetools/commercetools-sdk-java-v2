
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after removing a Custom Type from an address of a Business Unit using the Set Custom Type in Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressCustomTypeRemovedMessagePayload businessUnitAddressCustomTypeRemovedMessagePayload = BusinessUnitAddressCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitAddressCustomTypeRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddressCustomTypeRemovedMessagePayloadImpl.class)
public interface BusinessUnitAddressCustomTypeRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitAddressCustomTypeRemovedMessagePayload
     */
    String BUSINESS_UNIT_ADDRESS_CUSTOM_TYPE_REMOVED = "BusinessUnitAddressCustomTypeRemoved";

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @JsonProperty("oldTypeId")
    public String getOldTypeId();

    /**
     *  <p><code>id</code> of the Address from which the Custom Type was removed.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     */

    public void setOldTypeId(final String oldTypeId);

    /**
     *  <p><code>id</code> of the Address from which the Custom Type was removed.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     * factory method
     * @return instance of BusinessUnitAddressCustomTypeRemovedMessagePayload
     */
    public static BusinessUnitAddressCustomTypeRemovedMessagePayload of() {
        return new BusinessUnitAddressCustomTypeRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAddressCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddressCustomTypeRemovedMessagePayload of(
            final BusinessUnitAddressCustomTypeRemovedMessagePayload template) {
        BusinessUnitAddressCustomTypeRemovedMessagePayloadImpl instance = new BusinessUnitAddressCustomTypeRemovedMessagePayloadImpl();
        instance.setOldTypeId(template.getOldTypeId());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    public BusinessUnitAddressCustomTypeRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitAddressCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAddressCustomTypeRemovedMessagePayload deepCopy(
            @Nullable final BusinessUnitAddressCustomTypeRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAddressCustomTypeRemovedMessagePayloadImpl instance = new BusinessUnitAddressCustomTypeRemovedMessagePayloadImpl();
        instance.setOldTypeId(template.getOldTypeId());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddressCustomTypeRemovedMessagePayload
     * @return builder
     */
    public static BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder builder() {
        return BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddressCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder builder(
            final BusinessUnitAddressCustomTypeRemovedMessagePayload template) {
        return BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddressCustomTypeRemovedMessagePayload(
            Function<BusinessUnitAddressCustomTypeRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressCustomTypeRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressCustomTypeRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddressCustomTypeRemovedMessagePayload>";
            }
        };
    }
}
