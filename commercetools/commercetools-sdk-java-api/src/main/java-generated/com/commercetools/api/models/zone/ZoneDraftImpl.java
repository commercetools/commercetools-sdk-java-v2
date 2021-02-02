
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ZoneDraftImpl implements ZoneDraft {

    private String key;

    private String name;

    private String description;

    private java.util.List<com.commercetools.api.models.zone.Location> locations;

    @JsonCreator
    ZoneDraftImpl(@JsonProperty("key") final String key, @JsonProperty("name") final String name,
            @JsonProperty("description") final String description,
            @JsonProperty("locations") final java.util.List<com.commercetools.api.models.zone.Location> locations) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.locations = locations;
    }

    public ZoneDraftImpl() {
    }

    /**
    *  <p>User-specific unique identifier for a zone.
    *  Must be unique across a project.
    *  The field can be reset using the Set Key UpdateAction.</p>
    */
    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public java.util.List<com.commercetools.api.models.zone.Location> getLocations() {
        return this.locations;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setLocations(final com.commercetools.api.models.zone.Location... locations) {
        this.locations = new ArrayList<>(Arrays.asList(locations));
    }

    public void setLocations(final java.util.List<com.commercetools.api.models.zone.Location> locations) {
        this.locations = locations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ZoneDraftImpl that = (ZoneDraftImpl) o;

        return new EqualsBuilder().append(key, that.key).append(name, that.name).append(description,
            that.description).append(locations, that.locations).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(name).append(description).append(locations).toHashCode();
    }

}
