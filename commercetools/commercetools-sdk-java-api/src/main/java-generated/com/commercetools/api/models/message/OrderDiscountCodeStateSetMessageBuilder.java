
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderDiscountCodeStateSetMessageBuilder implements Builder<OrderDiscountCodeStateSetMessage> {

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

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    private com.commercetools.api.models.cart.DiscountCodeState state;

    @Nullable
    private com.commercetools.api.models.cart.DiscountCodeState oldState;

    public OrderDiscountCodeStateSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public OrderDiscountCodeStateSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public OrderDiscountCodeStateSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OrderDiscountCodeStateSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public OrderDiscountCodeStateSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public OrderDiscountCodeStateSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public OrderDiscountCodeStateSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public OrderDiscountCodeStateSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public OrderDiscountCodeStateSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public OrderDiscountCodeStateSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public OrderDiscountCodeStateSetMessageBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public OrderDiscountCodeStateSetMessageBuilder state(
            final com.commercetools.api.models.cart.DiscountCodeState state) {
        this.state = state;
        return this;
    }

    public OrderDiscountCodeStateSetMessageBuilder oldState(
            @Nullable final com.commercetools.api.models.cart.DiscountCodeState oldState) {
        this.oldState = oldState;
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

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    public com.commercetools.api.models.cart.DiscountCodeState getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.cart.DiscountCodeState getOldState() {
        return this.oldState;
    }

    public OrderDiscountCodeStateSetMessage build() {
        Objects.requireNonNull(id);
        Objects.requireNonNull(version);
        Objects.requireNonNull(createdAt);
        Objects.requireNonNull(lastModifiedAt);
        Objects.requireNonNull(sequenceNumber);
        Objects.requireNonNull(resource);
        Objects.requireNonNull(resourceVersion);
        Objects.requireNonNull(discountCode);
        Objects.requireNonNull(state);
        return new OrderDiscountCodeStateSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, discountCode, state,
            oldState);
    }

    /**
     * builds OrderDiscountCodeStateSetMessage without checking for non null required values
     */
    public OrderDiscountCodeStateSetMessage buildUnchecked() {
        return new OrderDiscountCodeStateSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, discountCode, state,
            oldState);
    }

    public static OrderDiscountCodeStateSetMessageBuilder of() {
        return new OrderDiscountCodeStateSetMessageBuilder();
    }

    public static OrderDiscountCodeStateSetMessageBuilder of(final OrderDiscountCodeStateSetMessage template) {
        OrderDiscountCodeStateSetMessageBuilder builder = new OrderDiscountCodeStateSetMessageBuilder();
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
        builder.discountCode = template.getDiscountCode();
        builder.state = template.getState();
        builder.oldState = template.getOldState();
        return builder;
    }

}
