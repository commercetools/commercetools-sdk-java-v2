
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneAddLocationAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneAddLocationAction zoneAddLocationAction = ZoneAddLocationAction.builder()
 *             .location(locationBuilder -> locationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ZoneAddLocationActionImpl.class)
public interface ZoneAddLocationAction extends ZoneUpdateAction {

    /**
     * discriminator value for ZoneAddLocationAction
     */
    String ADD_LOCATION = "addLocation";

    /**
     *  <p>Location to be added to the Zone.</p>
     * @return location
     */
    @NotNull
    @Valid
    @JsonProperty("location")
    public Location getLocation();

    /**
     *  <p>Location to be added to the Zone.</p>
     * @param location value to be set
     */

    public void setLocation(final Location location);

    /**
     * factory method
     * @return instance of ZoneAddLocationAction
     */
    public static ZoneAddLocationAction of() {
        return new ZoneAddLocationActionImpl();
    }

    /**
     * factory method to create a shallow copy ZoneAddLocationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ZoneAddLocationAction of(final ZoneAddLocationAction template) {
        ZoneAddLocationActionImpl instance = new ZoneAddLocationActionImpl();
        instance.setLocation(template.getLocation());
        return instance;
    }

    /**
     * factory method to create a deep copy of ZoneAddLocationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ZoneAddLocationAction deepCopy(@Nullable final ZoneAddLocationAction template) {
        if (template == null) {
            return null;
        }
        ZoneAddLocationActionImpl instance = new ZoneAddLocationActionImpl();
        instance.setLocation(Optional.ofNullable(template.getLocation())
                .map(com.commercetools.api.models.zone.Location::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ZoneAddLocationAction
     * @return builder
     */
    public static ZoneAddLocationActionBuilder builder() {
        return ZoneAddLocationActionBuilder.of();
    }

    /**
     * create builder for ZoneAddLocationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneAddLocationActionBuilder builder(final ZoneAddLocationAction template) {
        return ZoneAddLocationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withZoneAddLocationAction(Function<ZoneAddLocationAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ZoneAddLocationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneAddLocationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneAddLocationAction>";
            }
        };
    }
}
