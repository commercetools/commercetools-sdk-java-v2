
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeApprovalRuleModeAction" rel="nofollow">Change Approval Rule Mode</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitApprovalRuleModeChangedMessage businessUnitApprovalRuleModeChangedMessage = BusinessUnitApprovalRuleModeChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .approvalRuleMode(BusinessUnitApprovalRuleMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitApprovalRuleModeChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitApprovalRuleModeChangedMessageImpl.class)
public interface BusinessUnitApprovalRuleModeChangedMessage extends Message {

    /**
     * discriminator value for BusinessUnitApprovalRuleModeChangedMessage
     */
    String BUSINESS_UNIT_APPROVAL_RULE_MODE_CHANGED = "BusinessUnitApprovalRuleModeChanged";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitApprovalRuleMode" rel="nofollow">BusinessUnitApprovalRuleMode</a> of the Business Unit after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeApprovalRuleModeAction" rel="nofollow">Change Approval Rule Mode</a> update action.</p>
     * @return approvalRuleMode
     */
    @NotNull
    @JsonProperty("approvalRuleMode")
    public BusinessUnitApprovalRuleMode getApprovalRuleMode();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitApprovalRuleMode" rel="nofollow">BusinessUnitApprovalRuleMode</a> of the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeApprovalRuleModeAction" rel="nofollow">Change Approval Rule Mode</a> update action.</p>
     * @return oldApprovalRuleMode
     */

    @JsonProperty("oldApprovalRuleMode")
    public BusinessUnitApprovalRuleMode getOldApprovalRuleMode();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitApprovalRuleMode" rel="nofollow">BusinessUnitApprovalRuleMode</a> of the Business Unit after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeApprovalRuleModeAction" rel="nofollow">Change Approval Rule Mode</a> update action.</p>
     * @param approvalRuleMode value to be set
     */

    public void setApprovalRuleMode(final BusinessUnitApprovalRuleMode approvalRuleMode);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitApprovalRuleMode" rel="nofollow">BusinessUnitApprovalRuleMode</a> of the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeApprovalRuleModeAction" rel="nofollow">Change Approval Rule Mode</a> update action.</p>
     * @param oldApprovalRuleMode value to be set
     */

    public void setOldApprovalRuleMode(final BusinessUnitApprovalRuleMode oldApprovalRuleMode);

    /**
     * factory method
     * @return instance of BusinessUnitApprovalRuleModeChangedMessage
     */
    public static BusinessUnitApprovalRuleModeChangedMessage of() {
        return new BusinessUnitApprovalRuleModeChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitApprovalRuleModeChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitApprovalRuleModeChangedMessage of(
            final BusinessUnitApprovalRuleModeChangedMessage template) {
        BusinessUnitApprovalRuleModeChangedMessageImpl instance = new BusinessUnitApprovalRuleModeChangedMessageImpl();
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
        instance.setApprovalRuleMode(template.getApprovalRuleMode());
        instance.setOldApprovalRuleMode(template.getOldApprovalRuleMode());
        return instance;
    }

    public BusinessUnitApprovalRuleModeChangedMessage copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitApprovalRuleModeChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitApprovalRuleModeChangedMessage deepCopy(
            @Nullable final BusinessUnitApprovalRuleModeChangedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitApprovalRuleModeChangedMessageImpl instance = new BusinessUnitApprovalRuleModeChangedMessageImpl();
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
        instance.setApprovalRuleMode(template.getApprovalRuleMode());
        instance.setOldApprovalRuleMode(template.getOldApprovalRuleMode());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitApprovalRuleModeChangedMessage
     * @return builder
     */
    public static BusinessUnitApprovalRuleModeChangedMessageBuilder builder() {
        return BusinessUnitApprovalRuleModeChangedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitApprovalRuleModeChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitApprovalRuleModeChangedMessageBuilder builder(
            final BusinessUnitApprovalRuleModeChangedMessage template) {
        return BusinessUnitApprovalRuleModeChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitApprovalRuleModeChangedMessage(
            Function<BusinessUnitApprovalRuleModeChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitApprovalRuleModeChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitApprovalRuleModeChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitApprovalRuleModeChangedMessage>";
            }
        };
    }
}
