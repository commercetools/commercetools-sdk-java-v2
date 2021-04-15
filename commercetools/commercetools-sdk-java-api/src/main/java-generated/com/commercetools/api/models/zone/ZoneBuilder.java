
package com.commercetools.api.models.zone;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ZoneBuilder {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private String key;

    private String name;

    @Nullable
    private String description;

    private java.util.List<com.commercetools.api.models.zone.Location> locations;

    public ZoneBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ZoneBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ZoneBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ZoneBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public ZoneBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public ZoneBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ZoneBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ZoneBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ZoneBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    public ZoneBuilder locations(final com.commercetools.api.models.zone.Location... locations) {
        this.locations = new ArrayList<>(Arrays.asList(locations));
        return this;
    }

    public ZoneBuilder locations(final java.util.List<com.commercetools.api.models.zone.Location> locations) {
        this.locations = locations;
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

    @Nullable
    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    public java.util.List<com.commercetools.api.models.zone.Location> getLocations() {
        return this.locations;
    }

    public Zone build() {
        return new ZoneImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name, description,
            locations);
    }

    public static ZoneBuilder of() {
        return new ZoneBuilder();
    }

    public static ZoneBuilder of(final Zone template) {
        ZoneBuilder builder = new ZoneBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.locations = template.getLocations();
        return builder;
    }

}
