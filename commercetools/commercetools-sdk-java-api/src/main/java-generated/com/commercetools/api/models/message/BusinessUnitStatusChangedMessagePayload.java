
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitStatus;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Change Status update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitStatusChangedMessagePayload businessUnitStatusChangedMessagePayload = BusinessUnitStatusChangedMessagePayload.builder()
 *             .active(BusinessUnitStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitStatusChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitStatusChangedMessagePayloadImpl.class)
public interface BusinessUnitStatusChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitStatusChangedMessagePayload
     */
    String BUSINESS_UNIT_STATUS_CHANGED = "BusinessUnitStatusChanged";

    /**
     *  <p>Updated status of the Business Unit.</p>
     * @return active
     */
    @NotNull
    @JsonProperty("active")
    public BusinessUnitStatus getActive();

    /**
     *  <p>Updated status of the Business Unit.</p>
     * @param active value to be set
     */

    public void setActive(final BusinessUnitStatus active);

    /**
     * factory method
     * @return instance of BusinessUnitStatusChangedMessagePayload
     */
    public static BusinessUnitStatusChangedMessagePayload of() {
        return new BusinessUnitStatusChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitStatusChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitStatusChangedMessagePayload of(final BusinessUnitStatusChangedMessagePayload template) {
        BusinessUnitStatusChangedMessagePayloadImpl instance = new BusinessUnitStatusChangedMessagePayloadImpl();
        instance.setActive(template.getActive());
        return instance;
    }

    public BusinessUnitStatusChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitStatusChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitStatusChangedMessagePayload deepCopy(
            @Nullable final BusinessUnitStatusChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitStatusChangedMessagePayloadImpl instance = new BusinessUnitStatusChangedMessagePayloadImpl();
        instance.setActive(template.getActive());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitStatusChangedMessagePayload
     * @return builder
     */
    public static BusinessUnitStatusChangedMessagePayloadBuilder builder() {
        return BusinessUnitStatusChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitStatusChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitStatusChangedMessagePayloadBuilder builder(
            final BusinessUnitStatusChangedMessagePayload template) {
        return BusinessUnitStatusChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitStatusChangedMessagePayload(
            Function<BusinessUnitStatusChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStatusChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStatusChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStatusChangedMessagePayload>";
            }
        };
    }
}
