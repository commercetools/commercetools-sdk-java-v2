
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Contact Email update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitContactEmailSetMessage businessUnitContactEmailSetMessage = BusinessUnitContactEmailSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitContactEmailSetMessageImpl.class)
public interface BusinessUnitContactEmailSetMessage extends Message {

    String BUSINESS_UNIT_CONTACT_EMAIL_SET = "BusinessUnitContactEmailSet";

    /**
     *  <p>The contact email that was updated on the Business Unit.</p>
     * @return contactEmail
     */

    @JsonProperty("contactEmail")
    public String getContactEmail();

    public void setContactEmail(final String contactEmail);

    public static BusinessUnitContactEmailSetMessage of() {
        return new BusinessUnitContactEmailSetMessageImpl();
    }

    public static BusinessUnitContactEmailSetMessage of(final BusinessUnitContactEmailSetMessage template) {
        BusinessUnitContactEmailSetMessageImpl instance = new BusinessUnitContactEmailSetMessageImpl();
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
        instance.setContactEmail(template.getContactEmail());
        return instance;
    }

    public static BusinessUnitContactEmailSetMessageBuilder builder() {
        return BusinessUnitContactEmailSetMessageBuilder.of();
    }

    public static BusinessUnitContactEmailSetMessageBuilder builder(final BusinessUnitContactEmailSetMessage template) {
        return BusinessUnitContactEmailSetMessageBuilder.of(template);
    }

    default <T> T withBusinessUnitContactEmailSetMessage(Function<BusinessUnitContactEmailSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitContactEmailSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitContactEmailSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitContactEmailSetMessage>";
            }
        };
    }
}
