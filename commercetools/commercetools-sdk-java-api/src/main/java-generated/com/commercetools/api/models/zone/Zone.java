
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
public interface Zone extends BaseResource, com.commercetools.api.models.DomainResource<Zone> {

    /**
    *  <p>The unique ID of the zone.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>The current version of the zone.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
    *  <p>User-specific unique identifier for a zone.
    *  Must be unique across a project.
    *  The field can be reset using the Set Key UpdateAction.</p>
    */

    @JsonProperty("key")
    public String getKey();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("description")
    public String getDescription();

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
}
