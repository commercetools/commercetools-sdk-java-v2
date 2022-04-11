
package com.commercetools.api.models.zone;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ZoneDraftBuilder implements Builder<ZoneDraft> {

    @Nullable
    private String key;

    private String name;

    @Nullable
    private String description;

    @Nullable
    private java.util.List<com.commercetools.api.models.zone.Location> locations;

    public ZoneDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ZoneDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ZoneDraftBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    public ZoneDraftBuilder locations(@Nullable final com.commercetools.api.models.zone.Location... locations) {
        this.locations = new ArrayList<>(Arrays.asList(locations));
        return this;
    }

    public ZoneDraftBuilder locations(
            @Nullable final java.util.List<com.commercetools.api.models.zone.Location> locations) {
        this.locations = locations;
        return this;
    }

    public ZoneDraftBuilder plusLocations(@Nullable final com.commercetools.api.models.zone.Location... locations) {
        if (this.locations == null) {
            this.locations = new ArrayList<>();
        }
        this.locations.addAll(Arrays.asList(locations));
        return this;
    }

    public ZoneDraftBuilder plusLocations(
            Function<com.commercetools.api.models.zone.LocationBuilder, com.commercetools.api.models.zone.LocationBuilder> builder) {
        if (this.locations == null) {
            this.locations = new ArrayList<>();
        }
        this.locations.add(builder.apply(com.commercetools.api.models.zone.LocationBuilder.of()).build());
        return this;
    }

    public ZoneDraftBuilder withLocations(
            Function<com.commercetools.api.models.zone.LocationBuilder, com.commercetools.api.models.zone.LocationBuilder> builder) {
        this.locations = new ArrayList<>();
        this.locations.add(builder.apply(com.commercetools.api.models.zone.LocationBuilder.of()).build());
        return this;
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

    @Nullable
    public java.util.List<com.commercetools.api.models.zone.Location> getLocations() {
        return this.locations;
    }

    public ZoneDraft build() {
        Objects.requireNonNull(name, ZoneDraft.class + ": name is missing");
        return new ZoneDraftImpl(key, name, description, locations);
    }

    /**
     * builds ZoneDraft without checking for non null required values
     */
    public ZoneDraft buildUnchecked() {
        return new ZoneDraftImpl(key, name, description, locations);
    }

    public static ZoneDraftBuilder of() {
        return new ZoneDraftBuilder();
    }

    public static ZoneDraftBuilder of(final ZoneDraft template) {
        ZoneDraftBuilder builder = new ZoneDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.locations = template.getLocations();
        return builder;
    }

}
