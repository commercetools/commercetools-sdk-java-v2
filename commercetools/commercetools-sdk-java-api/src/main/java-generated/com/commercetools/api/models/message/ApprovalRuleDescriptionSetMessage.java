
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Description update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleDescriptionSetMessage approvalRuleDescriptionSetMessage = ApprovalRuleDescriptionSetMessage.builder()
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
@JsonDeserialize(as = ApprovalRuleDescriptionSetMessageImpl.class)
public interface ApprovalRuleDescriptionSetMessage extends Message {

    /**
     * discriminator value for ApprovalRuleDescriptionSetMessage
     */
    String APPROVAL_RULE_DESCRIPTION_SET = "ApprovalRuleDescriptionSet";

    /**
     *  <p>Description of the ApprovalRule after the Set Description update action.</p>
     * @return description
     */

    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>Description of the ApprovalRule before the Set Description update action.</p>
     * @return oldDescription
     */

    @JsonProperty("oldDescription")
    public String getOldDescription();

    /**
     *  <p>Description of the ApprovalRule after the Set Description update action.</p>
     * @param description value to be set
     */

    public void setDescription(final String description);

    /**
     *  <p>Description of the ApprovalRule before the Set Description update action.</p>
     * @param oldDescription value to be set
     */

    public void setOldDescription(final String oldDescription);

    /**
     * factory method
     * @return instance of ApprovalRuleDescriptionSetMessage
     */
    public static ApprovalRuleDescriptionSetMessage of() {
        return new ApprovalRuleDescriptionSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleDescriptionSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleDescriptionSetMessage of(final ApprovalRuleDescriptionSetMessage template) {
        ApprovalRuleDescriptionSetMessageImpl instance = new ApprovalRuleDescriptionSetMessageImpl();
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
        instance.setDescription(template.getDescription());
        instance.setOldDescription(template.getOldDescription());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApprovalRuleDescriptionSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleDescriptionSetMessage deepCopy(
            @Nullable final ApprovalRuleDescriptionSetMessage template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleDescriptionSetMessageImpl instance = new ApprovalRuleDescriptionSetMessageImpl();
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
        instance.setDescription(template.getDescription());
        instance.setOldDescription(template.getOldDescription());
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleDescriptionSetMessage
     * @return builder
     */
    public static ApprovalRuleDescriptionSetMessageBuilder builder() {
        return ApprovalRuleDescriptionSetMessageBuilder.of();
    }

    /**
     * create builder for ApprovalRuleDescriptionSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleDescriptionSetMessageBuilder builder(final ApprovalRuleDescriptionSetMessage template) {
        return ApprovalRuleDescriptionSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleDescriptionSetMessage(Function<ApprovalRuleDescriptionSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleDescriptionSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleDescriptionSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleDescriptionSetMessage>";
            }
        };
    }
}
