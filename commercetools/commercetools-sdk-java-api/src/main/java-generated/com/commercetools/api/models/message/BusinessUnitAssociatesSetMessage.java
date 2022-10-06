
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String BUSINESS_UNIT_ASSOCIATES_SET = "BusinessUnitAssociatesSet";

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("associates")
    public List<Associate> getAssociates();

    @JsonIgnore
    public void setAssociates(final Associate... associates);

    public void setAssociates(final List<Associate> associates);

    public static BusinessUnitAssociatesSetMessage of() {
        return new BusinessUnitAssociatesSetMessageImpl();
    }

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

    public static BusinessUnitAssociatesSetMessageBuilder builder() {
        return BusinessUnitAssociatesSetMessageBuilder.of();
    }

    public static BusinessUnitAssociatesSetMessageBuilder builder(final BusinessUnitAssociatesSetMessage template) {
        return BusinessUnitAssociatesSetMessageBuilder.of(template);
    }

    default <T> T withBusinessUnitAssociatesSetMessage(Function<BusinessUnitAssociatesSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociatesSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociatesSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociatesSetMessage>";
            }
        };
    }
}
