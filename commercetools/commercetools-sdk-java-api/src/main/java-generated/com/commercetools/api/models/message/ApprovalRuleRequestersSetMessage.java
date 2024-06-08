
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.approval_rule.RuleRequester;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Requester update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleRequestersSetMessage approvalRuleRequestersSetMessage = ApprovalRuleRequestersSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusRequesters(requestersBuilder -> requestersBuilder)
 *             .plusOldRequesters(oldRequestersBuilder -> oldRequestersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleRequestersSetMessageImpl.class)
public interface ApprovalRuleRequestersSetMessage extends Message {

    /**
     * discriminator value for ApprovalRuleRequestersSetMessage
     */
    String APPROVAL_RULE_REQUESTERS_SET = "ApprovalRuleRequestersSet";

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @return requesters
     */
    @NotNull
    @Valid
    @JsonProperty("requesters")
    public List<RuleRequester> getRequesters();

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @return oldRequesters
     */
    @NotNull
    @Valid
    @JsonProperty("oldRequesters")
    public List<RuleRequester> getOldRequesters();

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param requesters values to be set
     */

    @JsonIgnore
    public void setRequesters(final RuleRequester... requesters);

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param requesters values to be set
     */

    public void setRequesters(final List<RuleRequester> requesters);

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param oldRequesters values to be set
     */

    @JsonIgnore
    public void setOldRequesters(final RuleRequester... oldRequesters);

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param oldRequesters values to be set
     */

    public void setOldRequesters(final List<RuleRequester> oldRequesters);

    /**
     * factory method
     * @return instance of ApprovalRuleRequestersSetMessage
     */
    public static ApprovalRuleRequestersSetMessage of() {
        return new ApprovalRuleRequestersSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleRequestersSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleRequestersSetMessage of(final ApprovalRuleRequestersSetMessage template) {
        ApprovalRuleRequestersSetMessageImpl instance = new ApprovalRuleRequestersSetMessageImpl();
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
        instance.setRequesters(template.getRequesters());
        instance.setOldRequesters(template.getOldRequesters());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApprovalRuleRequestersSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleRequestersSetMessage deepCopy(@Nullable final ApprovalRuleRequestersSetMessage template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleRequestersSetMessageImpl instance = new ApprovalRuleRequestersSetMessageImpl();
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
        instance.setRequesters(Optional.ofNullable(template.getRequesters())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.RuleRequester::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setOldRequesters(Optional.ofNullable(template.getOldRequesters())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.RuleRequester::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleRequestersSetMessage
     * @return builder
     */
    public static ApprovalRuleRequestersSetMessageBuilder builder() {
        return ApprovalRuleRequestersSetMessageBuilder.of();
    }

    /**
     * create builder for ApprovalRuleRequestersSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleRequestersSetMessageBuilder builder(final ApprovalRuleRequestersSetMessage template) {
        return ApprovalRuleRequestersSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleRequestersSetMessage(Function<ApprovalRuleRequestersSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleRequestersSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleRequestersSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleRequestersSetMessage>";
            }
        };
    }
}
