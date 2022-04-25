
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
@JsonDeserialize(as = ZoneAddLocationActionImpl.class)
public interface ZoneAddLocationAction extends ZoneUpdateAction {

    String ADD_LOCATION = "addLocation";

    /**
    *  <p>Location to be added to the Zone.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("location")
    public Location getLocation();

    public void setLocation(final Location location);

    public static ZoneAddLocationAction of() {
        return new ZoneAddLocationActionImpl();
    }

    public static ZoneAddLocationAction of(final ZoneAddLocationAction template) {
        ZoneAddLocationActionImpl instance = new ZoneAddLocationActionImpl();
        instance.setLocation(template.getLocation());
        return instance;
    }

    public static ZoneAddLocationActionBuilder builder() {
        return ZoneAddLocationActionBuilder.of();
    }

    public static ZoneAddLocationActionBuilder builder(final ZoneAddLocationAction template) {
        return ZoneAddLocationActionBuilder.of(template);
    }

    default <T> T withZoneAddLocationAction(Function<ZoneAddLocationAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ZoneAddLocationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneAddLocationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneAddLocationAction>";
            }
        };
    }
}
