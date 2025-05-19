
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when a Business Unit <code>topLevelUnit</code> is modified due to a hierarchy change after a successful Set Unit Type or Change Parent Unit update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitTopLevelUnitSetMessagePayload businessUnitTopLevelUnitSetMessagePayload = BusinessUnitTopLevelUnitSetMessagePayload.builder()
 *             .topLevelUnit(topLevelUnitBuilder -> topLevelUnitBuilder)
 *             .oldTopLevelUnit(oldTopLevelUnitBuilder -> oldTopLevelUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitTopLevelUnitSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitTopLevelUnitSetMessagePayloadImpl.class)
public interface BusinessUnitTopLevelUnitSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitTopLevelUnitSetMessagePayload
     */
    String BUSINESS_UNIT_TOP_LEVEL_UNIT_SET = "BusinessUnitTopLevelUnitSet";

    /**
     *  <p>Top-level unit of the Business Unit after the Set Unit Type or Change Parent Unit update action.</p>
     * @return topLevelUnit
     */
    @NotNull
    @Valid
    @JsonProperty("topLevelUnit")
    public BusinessUnitKeyReference getTopLevelUnit();

    /**
     *  <p>Top-level unit of the Business Unit before the Set Unit Type or Change Parent Unit update action.</p>
     * @return oldTopLevelUnit
     */
    @NotNull
    @Valid
    @JsonProperty("oldTopLevelUnit")
    public BusinessUnitKeyReference getOldTopLevelUnit();

    /**
     *  <p>Top-level unit of the Business Unit after the Set Unit Type or Change Parent Unit update action.</p>
     * @param topLevelUnit value to be set
     */

    public void setTopLevelUnit(final BusinessUnitKeyReference topLevelUnit);

    /**
     *  <p>Top-level unit of the Business Unit before the Set Unit Type or Change Parent Unit update action.</p>
     * @param oldTopLevelUnit value to be set
     */

    public void setOldTopLevelUnit(final BusinessUnitKeyReference oldTopLevelUnit);

    /**
     * factory method
     * @return instance of BusinessUnitTopLevelUnitSetMessagePayload
     */
    public static BusinessUnitTopLevelUnitSetMessagePayload of() {
        return new BusinessUnitTopLevelUnitSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitTopLevelUnitSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitTopLevelUnitSetMessagePayload of(
            final BusinessUnitTopLevelUnitSetMessagePayload template) {
        BusinessUnitTopLevelUnitSetMessagePayloadImpl instance = new BusinessUnitTopLevelUnitSetMessagePayloadImpl();
        instance.setTopLevelUnit(template.getTopLevelUnit());
        instance.setOldTopLevelUnit(template.getOldTopLevelUnit());
        return instance;
    }

    public BusinessUnitTopLevelUnitSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitTopLevelUnitSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitTopLevelUnitSetMessagePayload deepCopy(
            @Nullable final BusinessUnitTopLevelUnitSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitTopLevelUnitSetMessagePayloadImpl instance = new BusinessUnitTopLevelUnitSetMessagePayloadImpl();
        instance.setTopLevelUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getTopLevelUnit()));
        instance.setOldTopLevelUnit(com.commercetools.api.models.business_unit.BusinessUnitKeyReference
                .deepCopy(template.getOldTopLevelUnit()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitTopLevelUnitSetMessagePayload
     * @return builder
     */
    public static BusinessUnitTopLevelUnitSetMessagePayloadBuilder builder() {
        return BusinessUnitTopLevelUnitSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitTopLevelUnitSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitTopLevelUnitSetMessagePayloadBuilder builder(
            final BusinessUnitTopLevelUnitSetMessagePayload template) {
        return BusinessUnitTopLevelUnitSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitTopLevelUnitSetMessagePayload(
            Function<BusinessUnitTopLevelUnitSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitTopLevelUnitSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitTopLevelUnitSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitTopLevelUnitSetMessagePayload>";
            }
        };
    }
}
