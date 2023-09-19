
package com.commercetools.api.models.approval_rule;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleDraft approvalRuleDraft = ApprovalRuleDraft.builder()
 *             .name("{name}")
 *             .status(ApprovalRuleStatus.ACTIVE)
 *             .predicate("{predicate}")
 *             .approvers(approversBuilder -> approversBuilder)
 *             .plusRequesters(requestersBuilder -> requestersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleDraftImpl.class)
public interface ApprovalRuleDraft extends io.vrap.rmf.base.client.Draft<ApprovalRuleDraft> {

    /**
     *  <p>User-defined unique identifier of the Approval Rule. Uniqueness is enforced within the Business Unit.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the Approval Rule.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Description of the Approval Rule.</p>
     * @return description
     */

    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>Indicates whether the Approval Rule should be matched against Orders or not.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public ApprovalRuleStatus getStatus();

    /**
     *  <p>The predicate describing the Orders the Approval Rule should match against.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>The hierarchy of approvers within the Approval Rule.</p>
     * @return approvers
     */
    @NotNull
    @Valid
    @JsonProperty("approvers")
    public ApproverHierarchyDraft getApprovers();

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @return requesters
     */
    @NotNull
    @Valid
    @JsonProperty("requesters")
    public List<RuleRequesterDraft> getRequesters();

    /**
     *  <p>User-defined unique identifier of the Approval Rule. Uniqueness is enforced within the Business Unit.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the Approval Rule.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Description of the Approval Rule.</p>
     * @param description value to be set
     */

    public void setDescription(final String description);

    /**
     *  <p>Indicates whether the Approval Rule should be matched against Orders or not.</p>
     * @param status value to be set
     */

    public void setStatus(final ApprovalRuleStatus status);

    /**
     *  <p>The predicate describing the Orders the Approval Rule should match against.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     *  <p>The hierarchy of approvers within the Approval Rule.</p>
     * @param approvers value to be set
     */

    public void setApprovers(final ApproverHierarchyDraft approvers);

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param requesters values to be set
     */

    @JsonIgnore
    public void setRequesters(final RuleRequesterDraft... requesters);

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param requesters values to be set
     */

    public void setRequesters(final List<RuleRequesterDraft> requesters);

    /**
     * factory method
     * @return instance of ApprovalRuleDraft
     */
    public static ApprovalRuleDraft of() {
        return new ApprovalRuleDraftImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleDraft of(final ApprovalRuleDraft template) {
        ApprovalRuleDraftImpl instance = new ApprovalRuleDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setStatus(template.getStatus());
        instance.setPredicate(template.getPredicate());
        instance.setApprovers(template.getApprovers());
        instance.setRequesters(template.getRequesters());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApprovalRuleDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleDraft deepCopy(@Nullable final ApprovalRuleDraft template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleDraftImpl instance = new ApprovalRuleDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setStatus(template.getStatus());
        instance.setPredicate(template.getPredicate());
        instance.setApprovers(
            com.commercetools.api.models.approval_rule.ApproverHierarchyDraft.deepCopy(template.getApprovers()));
        instance.setRequesters(Optional.ofNullable(template.getRequesters())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.RuleRequesterDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleDraft
     * @return builder
     */
    public static ApprovalRuleDraftBuilder builder() {
        return ApprovalRuleDraftBuilder.of();
    }

    /**
     * create builder for ApprovalRuleDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleDraftBuilder builder(final ApprovalRuleDraft template) {
        return ApprovalRuleDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleDraft(Function<ApprovalRuleDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleDraft>";
            }
        };
    }
}
