
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleNameSetMessage approvalRuleNameSetMessage = ApprovalRuleNameSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .name("{name}")
 *             .oldName("{oldName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApprovalRuleNameSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleNameSetMessageImpl.class)
public interface ApprovalRuleNameSetMessage extends Message {

    /**
     * discriminator value for ApprovalRuleNameSetMessage
     */
    String APPROVAL_RULE_NAME_SET = "ApprovalRuleNameSet";

    /**
     *  <p>Name of the ApprovalRule after the Set Name update action.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Name of the ApprovalRule before the Set Name update action.</p>
     * @return oldName
     */
    @NotNull
    @JsonProperty("oldName")
    public String getOldName();

    /**
     *  <p>Name of the ApprovalRule after the Set Name update action.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Name of the ApprovalRule before the Set Name update action.</p>
     * @param oldName value to be set
     */

    public void setOldName(final String oldName);

    /**
     * factory method
     * @return instance of ApprovalRuleNameSetMessage
     */
    public static ApprovalRuleNameSetMessage of() {
        return new ApprovalRuleNameSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleNameSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleNameSetMessage of(final ApprovalRuleNameSetMessage template) {
        ApprovalRuleNameSetMessageImpl instance = new ApprovalRuleNameSetMessageImpl();
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
        instance.setName(template.getName());
        instance.setOldName(template.getOldName());
        return instance;
    }

    public ApprovalRuleNameSetMessage copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRuleNameSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleNameSetMessage deepCopy(@Nullable final ApprovalRuleNameSetMessage template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleNameSetMessageImpl instance = new ApprovalRuleNameSetMessageImpl();
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
        instance.setName(template.getName());
        instance.setOldName(template.getOldName());
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleNameSetMessage
     * @return builder
     */
    public static ApprovalRuleNameSetMessageBuilder builder() {
        return ApprovalRuleNameSetMessageBuilder.of();
    }

    /**
     * create builder for ApprovalRuleNameSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleNameSetMessageBuilder builder(final ApprovalRuleNameSetMessage template) {
        return ApprovalRuleNameSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleNameSetMessage(Function<ApprovalRuleNameSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleNameSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleNameSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleNameSetMessage>";
            }
        };
    }
}
