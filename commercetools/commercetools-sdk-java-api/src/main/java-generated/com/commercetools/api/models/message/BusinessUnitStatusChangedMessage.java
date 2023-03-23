
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnitStatus;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change Status update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitStatusChangedMessage businessUnitStatusChangedMessage = BusinessUnitStatusChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .active(BusinessUnitStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitStatusChangedMessageImpl.class)
public interface BusinessUnitStatusChangedMessage extends Message {

    String BUSINESS_UNIT_STATUS_CHANGED = "BusinessUnitStatusChanged";

    /**
     *  <p>Updated status of the Business Unit.</p>
     * @return active
     */
    @NotNull
    @JsonProperty("active")
    public BusinessUnitStatus getActive();

    public void setActive(final BusinessUnitStatus active);

    public static BusinessUnitStatusChangedMessage of() {
        return new BusinessUnitStatusChangedMessageImpl();
    }

    public static BusinessUnitStatusChangedMessage of(final BusinessUnitStatusChangedMessage template) {
        BusinessUnitStatusChangedMessageImpl instance = new BusinessUnitStatusChangedMessageImpl();
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
        instance.setActive(template.getActive());
        return instance;
    }

    public static BusinessUnitStatusChangedMessageBuilder builder() {
        return BusinessUnitStatusChangedMessageBuilder.of();
    }

    public static BusinessUnitStatusChangedMessageBuilder builder(final BusinessUnitStatusChangedMessage template) {
        return BusinessUnitStatusChangedMessageBuilder.of(template);
    }

    default <T> T withBusinessUnitStatusChangedMessage(Function<BusinessUnitStatusChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStatusChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStatusChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStatusChangedMessage>";
            }
        };
    }
}
