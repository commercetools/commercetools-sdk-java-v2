
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generated after a successful Transition State update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewStateTransitionMessageImpl implements ReviewStateTransitionMessage, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private Long sequenceNumber;

    private com.commercetools.api.models.common.Reference resource;

    private Long resourceVersion;

    private String type;

    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    private com.commercetools.api.models.state.StateReference oldState;

    private com.commercetools.api.models.state.StateReference newState;

    private Boolean oldIncludedInStatistics;

    private Boolean newIncludedInStatistics;

    private com.commercetools.api.models.common.Reference target;

    private Boolean force;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReviewStateTransitionMessageImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("sequenceNumber") final Long sequenceNumber,
            @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource,
            @JsonProperty("resourceVersion") final Long resourceVersion,
            @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers,
            @JsonProperty("oldState") final com.commercetools.api.models.state.StateReference oldState,
            @JsonProperty("newState") final com.commercetools.api.models.state.StateReference newState,
            @JsonProperty("oldIncludedInStatistics") final Boolean oldIncludedInStatistics,
            @JsonProperty("newIncludedInStatistics") final Boolean newIncludedInStatistics,
            @JsonProperty("target") final com.commercetools.api.models.common.Reference target,
            @JsonProperty("force") final Boolean force) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.sequenceNumber = sequenceNumber;
        this.resource = resource;
        this.resourceVersion = resourceVersion;
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        this.oldState = oldState;
        this.newState = newState;
        this.oldIncludedInStatistics = oldIncludedInStatistics;
        this.newIncludedInStatistics = newIncludedInStatistics;
        this.target = target;
        this.force = force;
        this.type = REVIEW_STATE_TRANSITION;
    }

    /**
     * create empty instance
     */
    public ReviewStateTransitionMessageImpl() {
        this.type = REVIEW_STATE_TRANSITION;
    }

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     */

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     */

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     */

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    /**
     *  <p>Message Type of the Message.</p>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     */

    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    /**
     *  <p>State of the Review before the Transition State update action.</p>
     */

    public com.commercetools.api.models.state.StateReference getOldState() {
        return this.oldState;
    }

    /**
     *  <p>State of the Review after the Transition State update action.</p>
     */

    public com.commercetools.api.models.state.StateReference getNewState() {
        return this.newState;
    }

    /**
     *  <p>Whether the old Review was taken into account in the rating statistics of the target before the state transition.</p>
     */

    public Boolean getOldIncludedInStatistics() {
        return this.oldIncludedInStatistics;
    }

    /**
     *  <p>Whether the new Review was taken into account in the rating statistics of the target after the state transition.</p>
     */

    public Boolean getNewIncludedInStatistics() {
        return this.newIncludedInStatistics;
    }

    /**
     *  <p>Reference to the resource that the Review belongs to.</p>
     */

    public com.commercetools.api.models.common.Reference getTarget() {
        return this.target;
    }

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     */

    public Boolean getForce() {
        return this.force;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setSequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public void setResource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
    }

    public void setResourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public void setResourceUserProvidedIdentifiers(
            final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
    }

    public void setOldState(final com.commercetools.api.models.state.StateReference oldState) {
        this.oldState = oldState;
    }

    public void setNewState(final com.commercetools.api.models.state.StateReference newState) {
        this.newState = newState;
    }

    public void setOldIncludedInStatistics(final Boolean oldIncludedInStatistics) {
        this.oldIncludedInStatistics = oldIncludedInStatistics;
    }

    public void setNewIncludedInStatistics(final Boolean newIncludedInStatistics) {
        this.newIncludedInStatistics = newIncludedInStatistics;
    }

    public void setTarget(final com.commercetools.api.models.common.Reference target) {
        this.target = target;
    }

    public void setForce(final Boolean force) {
        this.force = force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReviewStateTransitionMessageImpl that = (ReviewStateTransitionMessageImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(sequenceNumber, that.sequenceNumber)
                .append(resource, that.resource)
                .append(resourceVersion, that.resourceVersion)
                .append(type, that.type)
                .append(resourceUserProvidedIdentifiers, that.resourceUserProvidedIdentifiers)
                .append(oldState, that.oldState)
                .append(newState, that.newState)
                .append(oldIncludedInStatistics, that.oldIncludedInStatistics)
                .append(newIncludedInStatistics, that.newIncludedInStatistics)
                .append(target, that.target)
                .append(force, that.force)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(sequenceNumber, that.sequenceNumber)
                .append(resource, that.resource)
                .append(resourceVersion, that.resourceVersion)
                .append(type, that.type)
                .append(resourceUserProvidedIdentifiers, that.resourceUserProvidedIdentifiers)
                .append(oldState, that.oldState)
                .append(newState, that.newState)
                .append(oldIncludedInStatistics, that.oldIncludedInStatistics)
                .append(newIncludedInStatistics, that.newIncludedInStatistics)
                .append(target, that.target)
                .append(force, that.force)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(sequenceNumber)
                .append(resource)
                .append(resourceVersion)
                .append(type)
                .append(resourceUserProvidedIdentifiers)
                .append(oldState)
                .append(newState)
                .append(oldIncludedInStatistics)
                .append(newIncludedInStatistics)
                .append(target)
                .append(force)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("lastModifiedBy", lastModifiedBy)
                .append("createdBy", createdBy)
                .append("sequenceNumber", sequenceNumber)
                .append("resource", resource)
                .append("resourceVersion", resourceVersion)
                .append("type", type)
                .append("resourceUserProvidedIdentifiers", resourceUserProvidedIdentifiers)
                .append("oldState", oldState)
                .append("newState", newState)
                .append("oldIncludedInStatistics", oldIncludedInStatistics)
                .append("newIncludedInStatistics", newIncludedInStatistics)
                .append("target", target)
                .append("force", force)
                .build();
    }

    @Override
    public ReviewStateTransitionMessage copyDeep() {
        return ReviewStateTransitionMessage.deepCopy(this);
    }
}
