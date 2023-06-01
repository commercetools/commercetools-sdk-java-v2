package com.commercetools.api.models.zone;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.zone.Location;
import java.time.ZonedDateTime;
import com.commercetools.api.models.zone.Zone;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Zone zone = Zone.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name("{name}")
 *             .plusLocations(locationsBuilder -> locationsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ZoneBuilder implements Builder<Zone> {

    
    
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

    
    /**
     *  <p>Unique identifier of the Zone.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public ZoneBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Current version of the Zone.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public ZoneBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time (UTC) the Zone was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */
    
    public ZoneBuilder createdAt( final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time (UTC) the Zone was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */
    
    public ZoneBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */
    
    public ZoneBuilder lastModifiedBy(Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */
    
    public ZoneBuilder withLastModifiedBy(Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */
    
    public ZoneBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }
    
    
    
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */
    
    public ZoneBuilder createdBy(Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */
    
    public ZoneBuilder withCreatedBy(Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */
    
    public ZoneBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined unique identifier of the Zone.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public ZoneBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the Zone.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public ZoneBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>Description of the Zone.</p>
     * @param description value to be set
     * @return Builder
     */
    
    public ZoneBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }
    
    
    
    /**
     *  <p>List of locations that belong to the Zone.</p>
     * @param locations value to be set
     * @return Builder
     */
    
    public ZoneBuilder locations( final com.commercetools.api.models.zone.Location ...locations) {
        this.locations = new ArrayList<>(Arrays.asList(locations));
        return this;
    }
    
    /**
     *  <p>List of locations that belong to the Zone.</p>
     * @param locations value to be set
     * @return Builder
     */
    
    public ZoneBuilder locations( final java.util.List<com.commercetools.api.models.zone.Location> locations) {
        this.locations = locations;
        return this;
    }
    
    /**
     *  <p>List of locations that belong to the Zone.</p>
     * @param locations value to be set
     * @return Builder
     */
    
    public ZoneBuilder plusLocations( final com.commercetools.api.models.zone.Location ...locations) {
        if (this.locations == null) {
            this.locations = new ArrayList<>();
        }
        this.locations.addAll(Arrays.asList(locations));
        return this;
    }
    
    
    
    /**
     *  <p>List of locations that belong to the Zone.</p>
     * @param builder function to build the locations value
     * @return Builder
     */
    
    public ZoneBuilder plusLocations(Function<com.commercetools.api.models.zone.LocationBuilder, com.commercetools.api.models.zone.LocationBuilder> builder) {
        if (this.locations == null) {
            this.locations = new ArrayList<>();
        }
        this.locations.add(builder.apply(com.commercetools.api.models.zone.LocationBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>List of locations that belong to the Zone.</p>
     * @param builder function to build the locations value
     * @return Builder
     */
    
    public ZoneBuilder withLocations(Function<com.commercetools.api.models.zone.LocationBuilder, com.commercetools.api.models.zone.LocationBuilder> builder) {
        this.locations = new ArrayList<>();
        this.locations.add(builder.apply(com.commercetools.api.models.zone.LocationBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>List of locations that belong to the Zone.</p>
     * @param builder function to build the locations value
     * @return Builder
     */
    
    public ZoneBuilder addLocations(Function<com.commercetools.api.models.zone.LocationBuilder, com.commercetools.api.models.zone.Location> builder) {
        return plusLocations(builder.apply(com.commercetools.api.models.zone.LocationBuilder.of()));
    }
    
    /**
     *  <p>List of locations that belong to the Zone.</p>
     * @param builder function to build the locations value
     * @return Builder
     */
    
    public ZoneBuilder setLocations(Function<com.commercetools.api.models.zone.LocationBuilder, com.commercetools.api.models.zone.Location> builder) {
        return locations(builder.apply(com.commercetools.api.models.zone.LocationBuilder.of()));
    }
                    

    /**
     *  <p>Unique identifier of the Zone.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Current version of the Zone.</p>
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Date and time (UTC) the Zone was initially created.</p>
     * @return createdAt
     */
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    /**
     *  <p>Date and time (UTC) the Zone was last updated.</p>
     * @return lastModifiedAt
     */
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    
    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    
    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    /**
     *  <p>User-defined unique identifier of the Zone.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Name of the Zone.</p>
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>Description of the Zone.</p>
     * @return description
     */
    
    @Nullable
    public String getDescription(){
        return this.description;
    }
    
    /**
     *  <p>List of locations that belong to the Zone.</p>
     * @return locations
     */
    
    
    public java.util.List<com.commercetools.api.models.zone.Location> getLocations(){
        return this.locations;
    }

    /**
     * builds Zone with checking for non-null required values
     * @return Zone
     */
    public Zone build() {
        Objects.requireNonNull(id, Zone.class + ": id is missing");
        Objects.requireNonNull(version, Zone.class + ": version is missing");
        Objects.requireNonNull(createdAt, Zone.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Zone.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, Zone.class + ": name is missing");
        Objects.requireNonNull(locations, Zone.class + ": locations is missing");
        return new ZoneImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name, description, locations);
    }
    
    /**
     * builds Zone without checking for non-null required values
     * @return Zone
     */
    public Zone buildUnchecked() {
        return new ZoneImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name, description, locations);
    }

    /**
     * factory method for an instance of ZoneBuilder
     * @return builder 
     */
    public static ZoneBuilder of() {
        return new ZoneBuilder();
    }

    /**
     * create builder for Zone instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
