package com.commercetools.api.models.zone;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.zone.Location;
import java.time.ZonedDateTime;
import com.commercetools.api.models.zone.ZoneImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * Zone
 *
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
@JsonDeserialize(as = ZoneImpl.class)
public interface Zone extends BaseResource, ZoneMixin, com.commercetools.api.models.DomainResource<Zone>, com.commercetools.api.models.Referencable<Zone>, com.commercetools.api.models.ResourceIdentifiable<Zone>, com.commercetools.api.models.WithKey {


    /**
     *  <p>Unique identifier of the Zone.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();
    /**
     *  <p>Current version of the Zone.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    /**
     *  <p>Date and time (UTC) the Zone was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();
    /**
     *  <p>Date and time (UTC) the Zone was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();
    /**
     *  <p>User-defined unique identifier of the Zone.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();
    /**
     *  <p>Name of the Zone.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
     *  <p>Description of the Zone.</p>
     * @return description
     */
    
    @JsonProperty("description")
    public String getDescription();
    /**
     *  <p>List of locations that belong to the Zone.</p>
     * @return locations
     */
    @NotNull
    @Valid
    @JsonProperty("locations")
    public List<Location> getLocations();

    /**
     *  <p>Unique identifier of the Zone.</p>
     * @param id value to be set
     */
    
    public void setId(final String id);
    
    
    /**
     *  <p>Current version of the Zone.</p>
     * @param version value to be set
     */
    
    public void setVersion(final Long version);
    
    
    /**
     *  <p>Date and time (UTC) the Zone was initially created.</p>
     * @param createdAt value to be set
     */
    
    public void setCreatedAt(final ZonedDateTime createdAt);
    
    
    /**
     *  <p>Date and time (UTC) the Zone was last updated.</p>
     * @param lastModifiedAt value to be set
     */
    
    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
    
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     */
    
    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
    
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     */
    
    public void setCreatedBy(final CreatedBy createdBy);
    
    
    /**
     *  <p>User-defined unique identifier of the Zone.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    
    
    /**
     *  <p>Name of the Zone.</p>
     * @param name value to be set
     */
    
    public void setName(final String name);
    
    
    /**
     *  <p>Description of the Zone.</p>
     * @param description value to be set
     */
    
    public void setDescription(final String description);
    
    
    /**
     *  <p>List of locations that belong to the Zone.</p>
     * @param locations values to be set
     */
    
    @JsonIgnore
    public void setLocations(final Location ...locations);
    /**
     *  <p>List of locations that belong to the Zone.</p>
     * @param locations values to be set
     */
    
    public void setLocations(final List<Location> locations);

    /**
     * factory method
     * @return instance of Zone
     */
    public static Zone of(){
        return new ZoneImpl();
    }
    

    /**
     * factory method to create a shallow copy Zone
     * @param template instance to be copied
     * @return copy instance
     */
    public static Zone of(final Zone template) {
        ZoneImpl instance = new ZoneImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setLocations(template.getLocations());
        return instance;
    }

    /**
     * factory method to create a deep copy of Zone
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Zone deepCopy(@Nullable final Zone template) {
        if (template == null) {
            return null;
        }
        ZoneImpl instance = new ZoneImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setLocations(Optional.ofNullable(template.getLocations())
                .map(t -> t.stream().map(com.commercetools.api.models.zone.Location::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for Zone
     * @return builder
     */
    public static ZoneBuilder builder() {
        return ZoneBuilder.of();
    }
    
    /**
     * create builder for Zone instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneBuilder builder(final Zone template) {
        return ZoneBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withZone(Function<Zone, T> helper) {
        return helper.apply(this);
    }
    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.ZONE;
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Zone> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Zone>() {
            @Override
            public String toString() {
                return "TypeReference<Zone>";
            }
        };
    }
}
