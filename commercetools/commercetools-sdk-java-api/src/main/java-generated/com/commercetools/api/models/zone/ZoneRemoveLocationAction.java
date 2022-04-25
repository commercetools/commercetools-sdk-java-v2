
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
@JsonDeserialize(as = ZoneRemoveLocationActionImpl.class)
public interface ZoneRemoveLocationAction extends ZoneUpdateAction {

    String REMOVE_LOCATION = "removeLocation";

    /**
    *  <p>Location to be removed from the Zone.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("location")
    public Location getLocation();

    public void setLocation(final Location location);

    public static ZoneRemoveLocationAction of() {
        return new ZoneRemoveLocationActionImpl();
    }

    public static ZoneRemoveLocationAction of(final ZoneRemoveLocationAction template) {
        ZoneRemoveLocationActionImpl instance = new ZoneRemoveLocationActionImpl();
        instance.setLocation(template.getLocation());
        return instance;
    }

    public static ZoneRemoveLocationActionBuilder builder() {
        return ZoneRemoveLocationActionBuilder.of();
    }

    public static ZoneRemoveLocationActionBuilder builder(final ZoneRemoveLocationAction template) {
        return ZoneRemoveLocationActionBuilder.of(template);
    }

    default <T> T withZoneRemoveLocationAction(Function<ZoneRemoveLocationAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ZoneRemoveLocationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneRemoveLocationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneRemoveLocationAction>";
            }
        };
    }
}
