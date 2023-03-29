
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.Associate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Associates update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociatesSetMessage businessUnitAssociatesSetMessage = BusinessUnitAssociatesSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusAssociates(associatesBuilder -> associatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAssociatesSetMessageImpl.class)
public interface BusinessUnitAssociatesSetMessage extends Message {

    /**
     * discriminator value for BusinessUnitAssociatesSetMessage
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
     * @return instance of BusinessUnitAssociatesSetMessage
     */
    public static BusinessUnitAssociatesSetMessage of() {
        return new BusinessUnitAssociatesSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAssociatesSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAssociatesSetMessage of(final BusinessUnitAssociatesSetMessage template) {
        BusinessUnitAssociatesSetMessageImpl instance = new BusinessUnitAssociatesSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setAssociates(template.getAssociates());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitAssociatesSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAssociatesSetMessage deepCopy(@Nullable final BusinessUnitAssociatesSetMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAssociatesSetMessageImpl instance = new BusinessUnitAssociatesSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setAssociates(Optional.ofNullable(template.getAssociates())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.business_unit.Associate::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAssociatesSetMessage
     * @return builder
     */
    public static BusinessUnitAssociatesSetMessageBuilder builder() {
        return BusinessUnitAssociatesSetMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitAssociatesSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociatesSetMessageBuilder builder(final BusinessUnitAssociatesSetMessage template) {
        return BusinessUnitAssociatesSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAssociatesSetMessage(Function<BusinessUnitAssociatesSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociatesSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociatesSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociatesSetMessage>";
            }
        };
    }
}
