
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitAssociateMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Change Associate Mode update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateModeChangedMessagePayload businessUnitAssociateModeChangedMessagePayload = BusinessUnitAssociateModeChangedMessagePayload.builder()
 *             .associateMode(BusinessUnitAssociateMode.EXPLICIT)
 *             .oldAssociateMode(BusinessUnitAssociateMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitAssociateModeChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAssociateModeChangedMessagePayloadImpl.class)
public interface BusinessUnitAssociateModeChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitAssociateModeChangedMessagePayload
     */
    String BUSINESS_UNIT_ASSOCIATE_MODE_CHANGED = "BusinessUnitAssociateModeChanged";

    /**
     *  <p>BusinessUnitAssociateMode of the Business Unit after the Change Associate Mode update action.</p>
     * @return associateMode
     */
    @NotNull
    @JsonProperty("associateMode")
    public BusinessUnitAssociateMode getAssociateMode();

    /**
     *  <p>BusinessUnitAssociateMode of the Business Unit before the Change Associate Mode update action.</p>
     * @return oldAssociateMode
     */
    @NotNull
    @JsonProperty("oldAssociateMode")
    public BusinessUnitAssociateMode getOldAssociateMode();

    /**
     *  <p>BusinessUnitAssociateMode of the Business Unit after the Change Associate Mode update action.</p>
     * @param associateMode value to be set
     */

    public void setAssociateMode(final BusinessUnitAssociateMode associateMode);

    /**
     *  <p>BusinessUnitAssociateMode of the Business Unit before the Change Associate Mode update action.</p>
     * @param oldAssociateMode value to be set
     */

    public void setOldAssociateMode(final BusinessUnitAssociateMode oldAssociateMode);

    /**
     * factory method
     * @return instance of BusinessUnitAssociateModeChangedMessagePayload
     */
    public static BusinessUnitAssociateModeChangedMessagePayload of() {
        return new BusinessUnitAssociateModeChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAssociateModeChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAssociateModeChangedMessagePayload of(
            final BusinessUnitAssociateModeChangedMessagePayload template) {
        BusinessUnitAssociateModeChangedMessagePayloadImpl instance = new BusinessUnitAssociateModeChangedMessagePayloadImpl();
        instance.setAssociateMode(template.getAssociateMode());
        instance.setOldAssociateMode(template.getOldAssociateMode());
        return instance;
    }

    public BusinessUnitAssociateModeChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitAssociateModeChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAssociateModeChangedMessagePayload deepCopy(
            @Nullable final BusinessUnitAssociateModeChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAssociateModeChangedMessagePayloadImpl instance = new BusinessUnitAssociateModeChangedMessagePayloadImpl();
        instance.setAssociateMode(template.getAssociateMode());
        instance.setOldAssociateMode(template.getOldAssociateMode());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAssociateModeChangedMessagePayload
     * @return builder
     */
    public static BusinessUnitAssociateModeChangedMessagePayloadBuilder builder() {
        return BusinessUnitAssociateModeChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitAssociateModeChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociateModeChangedMessagePayloadBuilder builder(
            final BusinessUnitAssociateModeChangedMessagePayload template) {
        return BusinessUnitAssociateModeChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAssociateModeChangedMessagePayload(
            Function<BusinessUnitAssociateModeChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateModeChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateModeChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociateModeChangedMessagePayload>";
            }
        };
    }
}
