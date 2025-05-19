
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.Associate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Change Associate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateChangedMessagePayload businessUnitAssociateChangedMessagePayload = BusinessUnitAssociateChangedMessagePayload.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitAssociateChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAssociateChangedMessagePayloadImpl.class)
public interface BusinessUnitAssociateChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitAssociateChangedMessagePayload
     */
    String BUSINESS_UNIT_ASSOCIATE_CHANGED = "BusinessUnitAssociateChanged";

    /**
     *  <p>The Associate that was updated.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public Associate getAssociate();

    /**
     *  <p>The Associate that was updated.</p>
     * @param associate value to be set
     */

    public void setAssociate(final Associate associate);

    /**
     * factory method
     * @return instance of BusinessUnitAssociateChangedMessagePayload
     */
    public static BusinessUnitAssociateChangedMessagePayload of() {
        return new BusinessUnitAssociateChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAssociateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAssociateChangedMessagePayload of(
            final BusinessUnitAssociateChangedMessagePayload template) {
        BusinessUnitAssociateChangedMessagePayloadImpl instance = new BusinessUnitAssociateChangedMessagePayloadImpl();
        instance.setAssociate(template.getAssociate());
        return instance;
    }

    public BusinessUnitAssociateChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitAssociateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAssociateChangedMessagePayload deepCopy(
            @Nullable final BusinessUnitAssociateChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAssociateChangedMessagePayloadImpl instance = new BusinessUnitAssociateChangedMessagePayloadImpl();
        instance.setAssociate(com.commercetools.api.models.business_unit.Associate.deepCopy(template.getAssociate()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAssociateChangedMessagePayload
     * @return builder
     */
    public static BusinessUnitAssociateChangedMessagePayloadBuilder builder() {
        return BusinessUnitAssociateChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitAssociateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociateChangedMessagePayloadBuilder builder(
            final BusinessUnitAssociateChangedMessagePayload template) {
        return BusinessUnitAssociateChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAssociateChangedMessagePayload(
            Function<BusinessUnitAssociateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociateChangedMessagePayload>";
            }
        };
    }
}
