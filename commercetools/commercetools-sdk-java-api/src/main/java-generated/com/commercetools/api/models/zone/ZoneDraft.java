
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ZoneDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneDraft zoneDraft = ZoneDraft.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ZoneDraftImpl.class)
public interface ZoneDraft extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<ZoneDraft> {

    /**
     *  <p>User-defined unique identifier for the Zone.</p>
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
    @Valid
    @JsonProperty("locations")
    public List<Location> getLocations();

    /**
     *  <p>User-defined unique identifier for the Zone.</p>
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
    public void setLocations(final Location... locations);

    /**
     *  <p>List of locations that belong to the Zone.</p>
     * @param locations values to be set
     */

    public void setLocations(final List<Location> locations);

    /**
     * factory method
     * @return instance of ZoneDraft
     */
    public static ZoneDraft of() {
        return new ZoneDraftImpl();
    }

    /**
     * factory method to create a shallow copy ZoneDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ZoneDraft of(final ZoneDraft template) {
        ZoneDraftImpl instance = new ZoneDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setLocations(template.getLocations());
        return instance;
    }

    public ZoneDraft copyDeep();

    /**
     * factory method to create a deep copy of ZoneDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ZoneDraft deepCopy(@Nullable final ZoneDraft template) {
        if (template == null) {
            return null;
        }
        ZoneDraftImpl instance = new ZoneDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setLocations(Optional.ofNullable(template.getLocations())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.zone.Location::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ZoneDraft
     * @return builder
     */
    public static ZoneDraftBuilder builder() {
        return ZoneDraftBuilder.of();
    }

    /**
     * create builder for ZoneDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneDraftBuilder builder(final ZoneDraft template) {
        return ZoneDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withZoneDraft(Function<ZoneDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ZoneDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneDraft>";
            }
        };
    }
}
