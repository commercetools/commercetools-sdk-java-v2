
package com.commercetools.api.models.approval_rule;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ApprovalRule
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRule approvalRule = ApprovalRule.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name("{name}")
 *             .status(ApprovalRuleStatus.ACTIVE)
 *             .predicate("{predicate}")
 *             .approvers(approversBuilder -> approversBuilder)
 *             .plusRequesters(requestersBuilder -> requestersBuilder)
 *             .businessUnit(businessUnitBuilder -> businessUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleImpl.class)
public interface ApprovalRule extends BaseResource {

    /**
     *  <p>Unique identifier of the Approval Rule.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Approval Rule.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Approval Rule was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>IDs and references that created the ApprovalRule.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Date and time (UTC) the Approval Rule was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the ApprovalRule.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>User-defined unique identifier of the Approval Rule. Must be unique within a Business Unit.</p>
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
     *  <p>The Order Predicate describing the Orders the Approval Rule should match against.</p>
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
    public ApproverHierarchy getApprovers();

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @return requesters
     */
    @NotNull
    @Valid
    @JsonProperty("requesters")
    public List<RuleRequester> getRequesters();

    /**
     *  <p>The Business Unit the Approval Rule belongs to.</p>
     * @return businessUnit
     */
    @NotNull
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitKeyReference getBusinessUnit();

    /**
     *  <p>Custom Fields on the Approval Rule.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Unique identifier of the Approval Rule.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Approval Rule.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Approval Rule was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>IDs and references that created the ApprovalRule.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Date and time (UTC) the Approval Rule was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the ApprovalRule.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>User-defined unique identifier of the Approval Rule. Must be unique within a Business Unit.</p>
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
     *  <p>The Order Predicate describing the Orders the Approval Rule should match against.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     *  <p>The hierarchy of approvers within the Approval Rule.</p>
     * @param approvers value to be set
     */

    public void setApprovers(final ApproverHierarchy approvers);

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param requesters values to be set
     */

    @JsonIgnore
    public void setRequesters(final RuleRequester... requesters);

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param requesters values to be set
     */

    public void setRequesters(final List<RuleRequester> requesters);

    /**
     *  <p>The Business Unit the Approval Rule belongs to.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitKeyReference businessUnit);

    /**
     *  <p>Custom Fields on the Approval Rule.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * factory method
     * @return instance of ApprovalRule
     */
    public static ApprovalRule of() {
        return new ApprovalRuleImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRule
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRule of(final ApprovalRule template) {
        ApprovalRuleImpl instance = new ApprovalRuleImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setStatus(template.getStatus());
        instance.setPredicate(template.getPredicate());
        instance.setApprovers(template.getApprovers());
        instance.setRequesters(template.getRequesters());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public ApprovalRule copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRule
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRule deepCopy(@Nullable final ApprovalRule template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleImpl instance = new ApprovalRuleImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setStatus(template.getStatus());
        instance.setPredicate(template.getPredicate());
        instance.setApprovers(
            com.commercetools.api.models.approval_rule.ApproverHierarchy.deepCopy(template.getApprovers()));
        instance.setRequesters(Optional.ofNullable(template.getRequesters())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.RuleRequester::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setBusinessUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getBusinessUnit()));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for ApprovalRule
     * @return builder
     */
    public static ApprovalRuleBuilder builder() {
        return ApprovalRuleBuilder.of();
    }

    /**
     * create builder for ApprovalRule instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleBuilder builder(final ApprovalRule template) {
        return ApprovalRuleBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRule(Function<ApprovalRule, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRule> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRule>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRule>";
            }
        };
    }
}
