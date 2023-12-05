
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleBuilder
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
public class ApprovalRuleBuilder implements Builder<ApprovalRule> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private String key;

    private String name;

    @Nullable
    private String description;

    private com.commercetools.api.models.approval_rule.ApprovalRuleStatus status;

    private String predicate;

    private com.commercetools.api.models.approval_rule.ApproverHierarchy approvers;

    private java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> requesters;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    /**
     *  <p>Unique identifier of the Approval Rule.</p>
     * @param id value to be set
     * @return Builder
     */

    public ApprovalRuleBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Approval Rule.</p>
     * @param version value to be set
     * @return Builder
     */

    public ApprovalRuleBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Approval Rule was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ApprovalRuleBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Approval Rule was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ApprovalRuleBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ApprovalRuleBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ApprovalRuleBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public ApprovalRuleBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ApprovalRuleBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ApprovalRuleBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public ApprovalRuleBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Approval Rule. Must be unique within a Business Unit.</p>
     * @param key value to be set
     * @return Builder
     */

    public ApprovalRuleBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Approval Rule.</p>
     * @param name value to be set
     * @return Builder
     */

    public ApprovalRuleBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the Approval Rule.</p>
     * @param description value to be set
     * @return Builder
     */

    public ApprovalRuleBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Indicates whether the Approval Rule should be matched against Orders or not.</p>
     * @param status value to be set
     * @return Builder
     */

    public ApprovalRuleBuilder status(final com.commercetools.api.models.approval_rule.ApprovalRuleStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>The Order Predicate describing the Orders the Approval Rule should match against.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public ApprovalRuleBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>The hierarchy of approvers within the Approval Rule.</p>
     * @param builder function to build the approvers value
     * @return Builder
     */

    public ApprovalRuleBuilder approvers(
            Function<com.commercetools.api.models.approval_rule.ApproverHierarchyBuilder, com.commercetools.api.models.approval_rule.ApproverHierarchyBuilder> builder) {
        this.approvers = builder.apply(com.commercetools.api.models.approval_rule.ApproverHierarchyBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The hierarchy of approvers within the Approval Rule.</p>
     * @param builder function to build the approvers value
     * @return Builder
     */

    public ApprovalRuleBuilder withApprovers(
            Function<com.commercetools.api.models.approval_rule.ApproverHierarchyBuilder, com.commercetools.api.models.approval_rule.ApproverHierarchy> builder) {
        this.approvers = builder.apply(com.commercetools.api.models.approval_rule.ApproverHierarchyBuilder.of());
        return this;
    }

    /**
     *  <p>The hierarchy of approvers within the Approval Rule.</p>
     * @param approvers value to be set
     * @return Builder
     */

    public ApprovalRuleBuilder approvers(final com.commercetools.api.models.approval_rule.ApproverHierarchy approvers) {
        this.approvers = approvers;
        return this;
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param requesters value to be set
     * @return Builder
     */

    public ApprovalRuleBuilder requesters(
            final com.commercetools.api.models.approval_rule.RuleRequester... requesters) {
        this.requesters = new ArrayList<>(Arrays.asList(requesters));
        return this;
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param requesters value to be set
     * @return Builder
     */

    public ApprovalRuleBuilder requesters(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> requesters) {
        this.requesters = requesters;
        return this;
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param requesters value to be set
     * @return Builder
     */

    public ApprovalRuleBuilder plusRequesters(
            final com.commercetools.api.models.approval_rule.RuleRequester... requesters) {
        if (this.requesters == null) {
            this.requesters = new ArrayList<>();
        }
        this.requesters.addAll(Arrays.asList(requesters));
        return this;
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleBuilder plusRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequesterBuilder> builder) {
        if (this.requesters == null) {
            this.requesters = new ArrayList<>();
        }
        this.requesters
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleBuilder withRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequesterBuilder> builder) {
        this.requesters = new ArrayList<>();
        this.requesters
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleBuilder addRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequester> builder) {
        return plusRequesters(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()));
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleBuilder setRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequester> builder) {
        return requesters(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()));
    }

    /**
     *  <p>The Business Unit the Approval Rule belongs to.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public ApprovalRuleBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Business Unit the Approval Rule belongs to.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public ApprovalRuleBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Business Unit the Approval Rule belongs to.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public ApprovalRuleBuilder businessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>Unique identifier of the Approval Rule.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Approval Rule.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Approval Rule was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Approval Rule was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>User-defined unique identifier of the Approval Rule. Must be unique within a Business Unit.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the Approval Rule.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Description of the Approval Rule.</p>
     * @return description
     */

    @Nullable
    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Indicates whether the Approval Rule should be matched against Orders or not.</p>
     * @return status
     */

    public com.commercetools.api.models.approval_rule.ApprovalRuleStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>The Order Predicate describing the Orders the Approval Rule should match against.</p>
     * @return predicate
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>The hierarchy of approvers within the Approval Rule.</p>
     * @return approvers
     */

    public com.commercetools.api.models.approval_rule.ApproverHierarchy getApprovers() {
        return this.approvers;
    }

    /**
     *  <p>The Associate Roles customers must hold for their Order to require approval.</p>
     * @return requesters
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> getRequesters() {
        return this.requesters;
    }

    /**
     *  <p>The Business Unit the Approval Rule belongs to.</p>
     * @return businessUnit
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     * builds ApprovalRule with checking for non-null required values
     * @return ApprovalRule
     */
    public ApprovalRule build() {
        Objects.requireNonNull(id, ApprovalRule.class + ": id is missing");
        Objects.requireNonNull(version, ApprovalRule.class + ": version is missing");
        Objects.requireNonNull(createdAt, ApprovalRule.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ApprovalRule.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, ApprovalRule.class + ": name is missing");
        Objects.requireNonNull(status, ApprovalRule.class + ": status is missing");
        Objects.requireNonNull(predicate, ApprovalRule.class + ": predicate is missing");
        Objects.requireNonNull(approvers, ApprovalRule.class + ": approvers is missing");
        Objects.requireNonNull(requesters, ApprovalRule.class + ": requesters is missing");
        Objects.requireNonNull(businessUnit, ApprovalRule.class + ": businessUnit is missing");
        return new ApprovalRuleImpl(id, version, createdAt, lastModifiedAt, createdBy, lastModifiedBy, key, name,
            description, status, predicate, approvers, requesters, businessUnit);
    }

    /**
     * builds ApprovalRule without checking for non-null required values
     * @return ApprovalRule
     */
    public ApprovalRule buildUnchecked() {
        return new ApprovalRuleImpl(id, version, createdAt, lastModifiedAt, createdBy, lastModifiedBy, key, name,
            description, status, predicate, approvers, requesters, businessUnit);
    }

    /**
     * factory method for an instance of ApprovalRuleBuilder
     * @return builder
     */
    public static ApprovalRuleBuilder of() {
        return new ApprovalRuleBuilder();
    }

    /**
     * create builder for ApprovalRule instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleBuilder of(final ApprovalRule template) {
        ApprovalRuleBuilder builder = new ApprovalRuleBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.createdBy = template.getCreatedBy();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.status = template.getStatus();
        builder.predicate = template.getPredicate();
        builder.approvers = template.getApprovers();
        builder.requesters = template.getRequesters();
        builder.businessUnit = template.getBusinessUnit();
        return builder;
    }

}
