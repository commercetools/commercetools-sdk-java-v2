
package com.commercetools.api.models.zone;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ZoneImpl.class)
public interface Zone extends BaseResource, com.commercetools.api.models.DomainResource<Zone>,
        com.commercetools.api.models.Referencable<Zone>, com.commercetools.api.models.ResourceIdentifiable<Zone> {

    /**
    *  <p>Platform-generated unique identifier of the Zone.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>Current version of the Zone.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>Date and time (UTC) the Zone was initially created.</p>
    */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
    *  <p>Date and time (UTC) the Zone was last updated.</p>
    */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
    *  <p>User-defined unique identifier of the Zone.</p>
    */

    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>Name of the Zone.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>Description of the Zone.</p>
    */

    @JsonProperty("description")
    public String getDescription();

    /**
    *  <p>List of locations that belong to the Zone.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("locations")
    public List<Location> getLocations();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setKey(final String key);

    public void setName(final String name);

    public void setDescription(final String description);

    @JsonIgnore
    public void setLocations(final Location... locations);

    public void setLocations(final List<Location> locations);

    public static Zone of() {
        return new ZoneImpl();
    }

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

    public static ZoneBuilder builder() {
        return ZoneBuilder.of();
    }

    public static ZoneBuilder builder(final Zone template) {
        return ZoneBuilder.of(template);
    }

    default <T> T withZone(Function<Zone, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.ResourceIdentifier toResourceIdentifier() {
        return com.commercetools.api.models.zone.ZoneResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.zone.ZoneReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Zone> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Zone>() {
            @Override
            public String toString() {
                return "TypeReference<Zone>";
            }
        };
    }
}
