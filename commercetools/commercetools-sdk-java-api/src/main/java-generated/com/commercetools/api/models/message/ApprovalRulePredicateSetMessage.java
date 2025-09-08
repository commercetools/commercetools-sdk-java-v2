
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetPredicateAction" rel="nofollow">Set Predicate</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRulePredicateSetMessage approvalRulePredicateSetMessage = ApprovalRulePredicateSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .predicate("{predicate}")
 *             .oldPredicate("{oldPredicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApprovalRulePredicateSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRulePredicateSetMessageImpl.class)
public interface ApprovalRulePredicateSetMessage extends Message {

    /**
     * discriminator value for ApprovalRulePredicateSetMessage
     */
    String APPROVAL_RULE_PREDICATE_SET = "ApprovalRulePredicateSet";

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetPredicateAction" rel="nofollow">Set Predicate</a> update action.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetPredicateAction" rel="nofollow">Set Predicate</a> update action.</p>
     * @return oldPredicate
     */
    @NotNull
    @JsonProperty("oldPredicate")
    public String getOldPredicate();

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetPredicateAction" rel="nofollow">Set Predicate</a> update action.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetPredicateAction" rel="nofollow">Set Predicate</a> update action.</p>
     * @param oldPredicate value to be set
     */

    public void setOldPredicate(final String oldPredicate);

    /**
     * factory method
     * @return instance of ApprovalRulePredicateSetMessage
     */
    public static ApprovalRulePredicateSetMessage of() {
        return new ApprovalRulePredicateSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRulePredicateSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRulePredicateSetMessage of(final ApprovalRulePredicateSetMessage template) {
        ApprovalRulePredicateSetMessageImpl instance = new ApprovalRulePredicateSetMessageImpl();
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
        instance.setPredicate(template.getPredicate());
        instance.setOldPredicate(template.getOldPredicate());
        return instance;
    }

    public ApprovalRulePredicateSetMessage copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRulePredicateSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRulePredicateSetMessage deepCopy(@Nullable final ApprovalRulePredicateSetMessage template) {
        if (template == null) {
            return null;
        }
        ApprovalRulePredicateSetMessageImpl instance = new ApprovalRulePredicateSetMessageImpl();
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
        instance.setPredicate(template.getPredicate());
        instance.setOldPredicate(template.getOldPredicate());
        return instance;
    }

    /**
     * builder factory method for ApprovalRulePredicateSetMessage
     * @return builder
     */
    public static ApprovalRulePredicateSetMessageBuilder builder() {
        return ApprovalRulePredicateSetMessageBuilder.of();
    }

    /**
     * create builder for ApprovalRulePredicateSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRulePredicateSetMessageBuilder builder(final ApprovalRulePredicateSetMessage template) {
        return ApprovalRulePredicateSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRulePredicateSetMessage(Function<ApprovalRulePredicateSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRulePredicateSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRulePredicateSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRulePredicateSetMessage>";
            }
        };
    }
}
