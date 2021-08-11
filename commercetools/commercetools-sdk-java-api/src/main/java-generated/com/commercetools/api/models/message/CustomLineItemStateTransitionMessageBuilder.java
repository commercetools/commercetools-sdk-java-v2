
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomLineItemStateTransitionMessageBuilder
        implements Builder<CustomLineItemStateTransitionMessage> {

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

    private String customLineItemId;

    private java.time.ZonedDateTime transitionDate;

    private Long quantity;

    private com.commercetools.api.models.state.StateReference fromState;

    private com.commercetools.api.models.state.StateReference toState;

    public CustomLineItemStateTransitionMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder transitionDate(final java.time.ZonedDateTime transitionDate) {
        this.transitionDate = transitionDate;
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder fromState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder fromState(
            final com.commercetools.api.models.state.StateReference fromState) {
        this.fromState = fromState;
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder toState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    public CustomLineItemStateTransitionMessageBuilder toState(
            final com.commercetools.api.models.state.StateReference toState) {
        this.toState = toState;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public java.time.ZonedDateTime getTransitionDate() {
        return this.transitionDate;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public com.commercetools.api.models.state.StateReference getFromState() {
        return this.fromState;
    }

    public com.commercetools.api.models.state.StateReference getToState() {
        return this.toState;
    }

    public CustomLineItemStateTransitionMessage build() {
        Objects.requireNonNull(id, CustomLineItemStateTransitionMessage.class + ": id is missing");
        Objects.requireNonNull(version, CustomLineItemStateTransitionMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, CustomLineItemStateTransitionMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            CustomLineItemStateTransitionMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            CustomLineItemStateTransitionMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, CustomLineItemStateTransitionMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            CustomLineItemStateTransitionMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(customLineItemId,
            CustomLineItemStateTransitionMessage.class + ": customLineItemId is missing");
        Objects.requireNonNull(transitionDate,
            CustomLineItemStateTransitionMessage.class + ": transitionDate is missing");
        Objects.requireNonNull(quantity, CustomLineItemStateTransitionMessage.class + ": quantity is missing");
        Objects.requireNonNull(fromState, CustomLineItemStateTransitionMessage.class + ": fromState is missing");
        Objects.requireNonNull(toState, CustomLineItemStateTransitionMessage.class + ": toState is missing");
        return new CustomLineItemStateTransitionMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, customLineItemId,
            transitionDate, quantity, fromState, toState);
    }

    /**
     * builds CustomLineItemStateTransitionMessage without checking for non null required values
     */
    public CustomLineItemStateTransitionMessage buildUnchecked() {
        return new CustomLineItemStateTransitionMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, customLineItemId,
            transitionDate, quantity, fromState, toState);
    }

    public static CustomLineItemStateTransitionMessageBuilder of() {
        return new CustomLineItemStateTransitionMessageBuilder();
    }

    public static CustomLineItemStateTransitionMessageBuilder of(final CustomLineItemStateTransitionMessage template) {
        CustomLineItemStateTransitionMessageBuilder builder = new CustomLineItemStateTransitionMessageBuilder();
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
        builder.customLineItemId = template.getCustomLineItemId();
        builder.transitionDate = template.getTransitionDate();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        return builder;
    }

}
