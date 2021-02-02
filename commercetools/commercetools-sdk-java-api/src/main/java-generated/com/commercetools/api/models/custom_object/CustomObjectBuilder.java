
package com.commercetools.api.models.custom_object;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomObjectBuilder {

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

    private java.lang.Object value;

    public CustomObjectBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public CustomObjectBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public CustomObjectBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public CustomObjectBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public CustomObjectBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public CustomObjectBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public CustomObjectBuilder container(final String container) {
        this.container = container;
        return this;
    }

    public CustomObjectBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public CustomObjectBuilder value(final java.lang.Object value) {
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

    public java.lang.Object getValue() {
        return this.value;
    }

    public CustomObject build() {
        return new CustomObjectImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, container, key,
            value);
    }

    public static CustomObjectBuilder of() {
        return new CustomObjectBuilder();
    }

    public static CustomObjectBuilder of(final CustomObject template) {
        CustomObjectBuilder builder = new CustomObjectBuilder();
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
