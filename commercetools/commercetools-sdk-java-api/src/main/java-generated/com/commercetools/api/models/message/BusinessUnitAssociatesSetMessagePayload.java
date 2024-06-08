
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.Associate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Associates update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociatesSetMessagePayload businessUnitAssociatesSetMessagePayload = BusinessUnitAssociatesSetMessagePayload.builder()
 *             .plusAssociates(associatesBuilder -> associatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAssociatesSetMessagePayloadImpl.class)
public interface BusinessUnitAssociatesSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitAssociatesSetMessagePayload
     */
    String BUSINESS_UNIT_ASSOCIATES_SET = "BusinessUnitAssociatesSet";

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @return associates
     */
    @NotNull
    @Valid
    @JsonProperty("associates")
    public List<Associate> getAssociates();

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @param associates values to be set
     */

    @JsonIgnore
    public void setAssociates(final Associate... associates);

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @param associates values to be set
     */

    public void setAssociates(final List<Associate> associates);

    /**
     * factory method
     * @return instance of BusinessUnitAssociatesSetMessagePayload
     */
    public static BusinessUnitAssociatesSetMessagePayload of() {
        return new BusinessUnitAssociatesSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAssociatesSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAssociatesSetMessagePayload of(final BusinessUnitAssociatesSetMessagePayload template) {
        BusinessUnitAssociatesSetMessagePayloadImpl instance = new BusinessUnitAssociatesSetMessagePayloadImpl();
        instance.setAssociates(template.getAssociates());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitAssociatesSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAssociatesSetMessagePayload deepCopy(
            @Nullable final BusinessUnitAssociatesSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAssociatesSetMessagePayloadImpl instance = new BusinessUnitAssociatesSetMessagePayloadImpl();
        instance.setAssociates(Optional.ofNullable(template.getAssociates())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.business_unit.Associate::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAssociatesSetMessagePayload
     * @return builder
     */
    public static BusinessUnitAssociatesSetMessagePayloadBuilder builder() {
        return BusinessUnitAssociatesSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitAssociatesSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociatesSetMessagePayloadBuilder builder(
            final BusinessUnitAssociatesSetMessagePayload template) {
        return BusinessUnitAssociatesSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAssociatesSetMessagePayload(
            Function<BusinessUnitAssociatesSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociatesSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociatesSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociatesSetMessagePayload>";
            }
        };
    }
}
