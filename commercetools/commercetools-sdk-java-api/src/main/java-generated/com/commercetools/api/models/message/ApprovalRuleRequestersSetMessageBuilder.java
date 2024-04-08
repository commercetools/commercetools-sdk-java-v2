
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleRequestersSetMessageBuilder
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
public class ApprovalRuleRequestersSetMessageBuilder implements Builder<ApprovalRuleRequestersSetMessage> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private Long sequenceNumber;

    private com.commercetools.api.models.common.Reference resource;

    private Long resourceVersion;

    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> requesters;

    private java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> oldRequesters;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder withResourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiers> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of());
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param requesters value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder requesters(
            final com.commercetools.api.models.approval_rule.RuleRequester... requesters) {
        this.requesters = new ArrayList<>(Arrays.asList(requesters));
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param requesters value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder requesters(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> requesters) {
        this.requesters = requesters;
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param requesters value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder plusRequesters(
            final com.commercetools.api.models.approval_rule.RuleRequester... requesters) {
        if (this.requesters == null) {
            this.requesters = new ArrayList<>();
        }
        this.requesters.addAll(Arrays.asList(requesters));
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder plusRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequesterBuilder> builder) {
        if (this.requesters == null) {
            this.requesters = new ArrayList<>();
        }
        this.requesters
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()).build());
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder withRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequesterBuilder> builder) {
        this.requesters = new ArrayList<>();
        this.requesters
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()).build());
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder addRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequester> builder) {
        return plusRequesters(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()));
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder setRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequester> builder) {
        return requesters(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()));
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param oldRequesters value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder oldRequesters(
            final com.commercetools.api.models.approval_rule.RuleRequester... oldRequesters) {
        this.oldRequesters = new ArrayList<>(Arrays.asList(oldRequesters));
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param oldRequesters value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder oldRequesters(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> oldRequesters) {
        this.oldRequesters = oldRequesters;
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param oldRequesters value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder plusOldRequesters(
            final com.commercetools.api.models.approval_rule.RuleRequester... oldRequesters) {
        if (this.oldRequesters == null) {
            this.oldRequesters = new ArrayList<>();
        }
        this.oldRequesters.addAll(Arrays.asList(oldRequesters));
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param builder function to build the oldRequesters value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder plusOldRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequesterBuilder> builder) {
        if (this.oldRequesters == null) {
            this.oldRequesters = new ArrayList<>();
        }
        this.oldRequesters
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()).build());
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param builder function to build the oldRequesters value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder withOldRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequesterBuilder> builder) {
        this.oldRequesters = new ArrayList<>();
        this.oldRequesters
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()).build());
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param builder function to build the oldRequesters value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder addOldRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequester> builder) {
        return plusOldRequesters(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()));
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param builder function to build the oldRequesters value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessageBuilder setOldRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequester> builder) {
        return oldRequesters(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()));
    }

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @return sequenceNumber
     */

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return resource
     */

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @return resourceVersion
     */

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return resourceUserProvidedIdentifiers
     */

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @return requesters
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> getRequesters() {
        return this.requesters;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @return oldRequesters
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> getOldRequesters() {
        return this.oldRequesters;
    }

    /**
     * builds ApprovalRuleRequestersSetMessage with checking for non-null required values
     * @return ApprovalRuleRequestersSetMessage
     */
    public ApprovalRuleRequestersSetMessage build() {
        Objects.requireNonNull(id, ApprovalRuleRequestersSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, ApprovalRuleRequestersSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, ApprovalRuleRequestersSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ApprovalRuleRequestersSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, ApprovalRuleRequestersSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, ApprovalRuleRequestersSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            ApprovalRuleRequestersSetMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(requesters, ApprovalRuleRequestersSetMessage.class + ": requesters is missing");
        Objects.requireNonNull(oldRequesters, ApprovalRuleRequestersSetMessage.class + ": oldRequesters is missing");
        return new ApprovalRuleRequestersSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, requesters,
            oldRequesters);
    }

    /**
     * builds ApprovalRuleRequestersSetMessage without checking for non-null required values
     * @return ApprovalRuleRequestersSetMessage
     */
    public ApprovalRuleRequestersSetMessage buildUnchecked() {
        return new ApprovalRuleRequestersSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, requesters,
            oldRequesters);
    }

    /**
     * factory method for an instance of ApprovalRuleRequestersSetMessageBuilder
     * @return builder
     */
    public static ApprovalRuleRequestersSetMessageBuilder of() {
        return new ApprovalRuleRequestersSetMessageBuilder();
    }

    /**
     * create builder for ApprovalRuleRequestersSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleRequestersSetMessageBuilder of(final ApprovalRuleRequestersSetMessage template) {
        ApprovalRuleRequestersSetMessageBuilder builder = new ApprovalRuleRequestersSetMessageBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.sequenceNumber = template.getSequenceNumber();
        builder.resource = template.getResource();
        builder.resourceVersion = template.getResourceVersion();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.requesters = template.getRequesters();
        builder.oldRequesters = template.getOldRequesters();
        return builder;
    }

}
