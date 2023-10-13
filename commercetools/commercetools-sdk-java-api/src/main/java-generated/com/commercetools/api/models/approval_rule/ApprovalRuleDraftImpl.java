
package com.commercetools.api.models.approval_rule;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ApprovalRuleDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleDraftImpl implements ApprovalRuleDraft, ModelBase {

    private String key;

    private String name;

    private String description;

    private com.commercetools.api.models.approval_rule.ApprovalRuleStatus status;

    private String predicate;

    private com.commercetools.api.models.approval_rule.ApproverHierarchyDraft approvers;

    private java.util.List<com.commercetools.api.models.approval_rule.RuleRequesterDraft> requesters;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalRuleDraftImpl(@JsonProperty("key") final String key, @JsonProperty("name") final String name,
            @JsonProperty("description") final String description,
            @JsonProperty("status") final com.commercetools.api.models.approval_rule.ApprovalRuleStatus status,
            @JsonProperty("predicate") final String predicate,
            @JsonProperty("approvers") final com.commercetools.api.models.approval_rule.ApproverHierarchyDraft approvers,
            @JsonProperty("requesters") final java.util.List<com.commercetools.api.models.approval_rule.RuleRequesterDraft> requesters) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.status = status;
        this.predicate = predicate;
        this.approvers = approvers;
        this.requesters = requesters;
    }

    /**
     * create empty instance
     */
    public ApprovalRuleDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier of the Approval Rule. Uniqueness is enforced within the Business Unit.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the Approval Rule.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Description of the Approval Rule.</p>
     */

    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Indicates whether the Approval Rule should be matched against Orders or not.</p>
     */

    public com.commercetools.api.models.approval_rule.ApprovalRuleStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>The predicate describing the Orders the Approval Rule should match against.</p>
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>The hierarchy of approvers within the Approval Rule.</p>
     */

    public com.commercetools.api.models.approval_rule.ApproverHierarchyDraft getApprovers() {
        return this.approvers;
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleRequesterDraft> getRequesters() {
        return this.requesters;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setStatus(final com.commercetools.api.models.approval_rule.ApprovalRuleStatus status) {
        this.status = status;
    }

    public void setPredicate(final String predicate) {
        this.predicate = predicate;
    }

    public void setApprovers(final com.commercetools.api.models.approval_rule.ApproverHierarchyDraft approvers) {
        this.approvers = approvers;
    }

    public void setRequesters(final com.commercetools.api.models.approval_rule.RuleRequesterDraft... requesters) {
        this.requesters = new ArrayList<>(Arrays.asList(requesters));
    }

    public void setRequesters(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleRequesterDraft> requesters) {
        this.requesters = requesters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalRuleDraftImpl that = (ApprovalRuleDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(status, that.status)
                .append(predicate, that.predicate)
                .append(approvers, that.approvers)
                .append(requesters, that.requesters)
                .append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(status, that.status)
                .append(predicate, that.predicate)
                .append(approvers, that.approvers)
                .append(requesters, that.requesters)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(name)
                .append(description)
                .append(status)
                .append(predicate)
                .append(approvers)
                .append(requesters)
                .toHashCode();
    }

}
