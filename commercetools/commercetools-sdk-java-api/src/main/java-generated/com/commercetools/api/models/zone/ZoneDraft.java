
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ZoneDraftImpl.class)
public interface ZoneDraft {

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

    @Valid
    @JsonProperty("locations")
    public List<Location> getLocations();

    public void setKey(final String key);

    public void setName(final String name);

    public void setDescription(final String description);

    @JsonIgnore
    public void setLocations(final Location... locations);

    public void setLocations(final List<Location> locations);

    public static ZoneDraft of() {
        return new ZoneDraftImpl();
    }

    public static ZoneDraft of(final ZoneDraft template) {
        ZoneDraftImpl instance = new ZoneDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setLocations(template.getLocations());
        return instance;
    }

    public static ZoneDraftBuilder builder() {
        return ZoneDraftBuilder.of();
    }

    public static ZoneDraftBuilder builder(final ZoneDraft template) {
        return ZoneDraftBuilder.of(template);
    }

    default <T> T withZoneDraft(Function<ZoneDraft, T> helper) {
        return helper.apply(this);
    }
}
