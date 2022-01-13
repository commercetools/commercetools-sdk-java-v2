
package com.commercetools.api.models.custom_object;

import java.util.Objects;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;

public class GenericCustomObjectBuilder<TValue> implements Builder<GenericCustomObject<TValue>> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String container;

    private String key;

    private TValue value;

    public GenericCustomObjectBuilder<TValue> id(final String id) {
        this.id = id;
        return this;
    }

    public GenericCustomObjectBuilder<TValue> version(final Long version) {
        this.version = version;
        return this;
    }

    public GenericCustomObjectBuilder<TValue> createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public GenericCustomObjectBuilder<TValue> lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public GenericCustomObjectBuilder<TValue> lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public GenericCustomObjectBuilder<TValue> lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public GenericCustomObjectBuilder<TValue> createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public GenericCustomObjectBuilder<TValue> createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public GenericCustomObjectBuilder<TValue> container(final String container) {
        this.container = container;
        return this;
    }

    public GenericCustomObjectBuilder<TValue> key(final String key) {
        this.key = key;
        return this;
    }

    public GenericCustomObjectBuilder<TValue> value(final TValue value) {
        this.value = value;
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

    public String getContainer() {
        return this.container;
    }

    public String getKey() {
        return this.key;
    }

    public TValue getValue() {
        return this.value;
    }

    public GenericCustomObject<TValue> build() {
        Objects.requireNonNull(id, CustomObject.class + ": id is missing");
        Objects.requireNonNull(version, CustomObject.class + ": version is missing");
        Objects.requireNonNull(createdAt, CustomObject.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, CustomObject.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(container, CustomObject.class + ": container is missing");
        Objects.requireNonNull(key, CustomObject.class + ": key is missing");
        Objects.requireNonNull(value, CustomObject.class + ": value is missing");
        return new GenericCustomObjectImpl<>(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            container, key, value);
    }

    /**
     * builds CustomObject without checking for non null required values
     */
    public GenericCustomObject<TValue> buildUnchecked() {
        return new GenericCustomObjectImpl<>(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            container, key, value);
    }

    public static <T> GenericCustomObjectBuilder<T> of(T value) {
        GenericCustomObjectBuilder<T> builder = new GenericCustomObjectBuilder<>();
        builder.value = value;
        return builder;
    }

    public static <T> GenericCustomObjectBuilder<T> of(final GenericCustomObject<T> template) {
        GenericCustomObjectBuilder<T> builder = new GenericCustomObjectBuilder<>();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.container = template.getContainer();
        builder.key = template.getKey();
        builder.value = template.getValue();
        return builder;
    }

}
