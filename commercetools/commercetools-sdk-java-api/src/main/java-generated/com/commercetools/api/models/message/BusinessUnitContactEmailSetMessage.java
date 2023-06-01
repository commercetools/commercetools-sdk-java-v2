package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.BusinessUnitContactEmailSetMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = BusinessUnitContactEmailSetMessageImpl.class)
public interface BusinessUnitContactEmailSetMessage extends Message {

    /**
     * discriminator value for BusinessUnitContactEmailSetMessage
     */
    String BUSINESS_UNIT_CONTACT_EMAIL_SET = "BusinessUnitContactEmailSet";

    /**
     *  <p>The contact email that was updated on the Business Unit.</p>
     * @return contactEmail
     */
    
    @JsonProperty("contactEmail")
    public String getContactEmail();

    /**
     *  <p>The contact email that was updated on the Business Unit.</p>
     * @param contactEmail value to be set
     */
    
    public void setContactEmail(final String contactEmail);
    

    /**
     * factory method
     * @return instance of BusinessUnitContactEmailSetMessage
     */
    public static BusinessUnitContactEmailSetMessage of(){
        return new BusinessUnitContactEmailSetMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy BusinessUnitContactEmailSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of BusinessUnitContactEmailSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitContactEmailSetMessage deepCopy(@Nullable final BusinessUnitContactEmailSetMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitContactEmailSetMessageImpl instance = new BusinessUnitContactEmailSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers.deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setContactEmail(template.getContactEmail());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitContactEmailSetMessage
     * @return builder
     */
    public static BusinessUnitContactEmailSetMessageBuilder builder() {
        return BusinessUnitContactEmailSetMessageBuilder.of();
    }
    
    /**
     * create builder for BusinessUnitContactEmailSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitContactEmailSetMessageBuilder builder(final BusinessUnitContactEmailSetMessage template) {
        return BusinessUnitContactEmailSetMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitContactEmailSetMessage(Function<BusinessUnitContactEmailSetMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitContactEmailSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitContactEmailSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitContactEmailSetMessage>";
            }
        };
    }
}
