
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
 * ZoneRemoveLocationAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneRemoveLocationAction zoneRemoveLocationAction = ZoneRemoveLocationAction.builder()
 *             .location(locationBuilder -> locationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ZoneRemoveLocationActionImpl.class)
public interface ZoneRemoveLocationAction extends ZoneUpdateAction {

    /**
     * discriminator value for ZoneRemoveLocationAction
     */
    String REMOVE_LOCATION = "removeLocation";

    /**
     *  <p>Location to be removed from the Zone.</p>
     * @return location
     */
    @NotNull
    @Valid
    @JsonProperty("location")
    public Location getLocation();

    /**
     *  <p>Location to be removed from the Zone.</p>
     * @param location value to be set
     */

    public void setLocation(final Location location);

    /**
     * factory method
     * @return instance of ZoneRemoveLocationAction
     */
    public static ZoneRemoveLocationAction of() {
        return new ZoneRemoveLocationActionImpl();
    }

    /**
     * factory method to create a shallow copy ZoneRemoveLocationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ZoneRemoveLocationAction of(final ZoneRemoveLocationAction template) {
        ZoneRemoveLocationActionImpl instance = new ZoneRemoveLocationActionImpl();
        instance.setLocation(template.getLocation());
        return instance;
    }

    /**
     * factory method to create a deep copy of ZoneRemoveLocationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ZoneRemoveLocationAction deepCopy(@Nullable final ZoneRemoveLocationAction template) {
        if (template == null) {
            return null;
        }
        ZoneRemoveLocationActionImpl instance = new ZoneRemoveLocationActionImpl();
        instance.setLocation(com.commercetools.api.models.zone.Location.deepCopy(template.getLocation()));
        return instance;
    }

    /**
     * builder factory method for ZoneRemoveLocationAction
     * @return builder
     */
    public static ZoneRemoveLocationActionBuilder builder() {
        return ZoneRemoveLocationActionBuilder.of();
    }

    /**
     * create builder for ZoneRemoveLocationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneRemoveLocationActionBuilder builder(final ZoneRemoveLocationAction template) {
        return ZoneRemoveLocationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withZoneRemoveLocationAction(Function<ZoneRemoveLocationAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ZoneRemoveLocationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneRemoveLocationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneRemoveLocationAction>";
            }
        };
    }
}
