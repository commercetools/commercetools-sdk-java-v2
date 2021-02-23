
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListStoreSetMessageBuilder {

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

    private com.commercetools.api.models.store.StoreKeyReference store;

    public ShoppingListStoreSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ShoppingListStoreSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ShoppingListStoreSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ShoppingListStoreSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public ShoppingListStoreSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public ShoppingListStoreSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ShoppingListStoreSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public ShoppingListStoreSetMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public ShoppingListStoreSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public ShoppingListStoreSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    public ShoppingListStoreSetMessageBuilder store(final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
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

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    public ShoppingListStoreSetMessage build() {
        return new ShoppingListStoreSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, store);
    }

    public static ShoppingListStoreSetMessageBuilder of() {
        return new ShoppingListStoreSetMessageBuilder();
    }

    public static ShoppingListStoreSetMessageBuilder of(final ShoppingListStoreSetMessage template) {
        ShoppingListStoreSetMessageBuilder builder = new ShoppingListStoreSetMessageBuilder();
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
        builder.store = template.getStore();
        return builder;
    }

}
