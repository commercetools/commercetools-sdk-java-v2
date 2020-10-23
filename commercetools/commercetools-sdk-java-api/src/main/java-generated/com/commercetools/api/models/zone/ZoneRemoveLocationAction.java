package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.Location;
import com.commercetools.api.models.zone.ZoneUpdateAction;
import com.commercetools.api.models.zone.ZoneRemoveLocationActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ZoneRemoveLocationActionImpl.class)
public interface ZoneRemoveLocationAction extends ZoneUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("location")
    public Location getLocation();

    public void setLocation(final Location location);

    public static ZoneRemoveLocationActionImpl of(){
        return new ZoneRemoveLocationActionImpl();
    }
    

    public static ZoneRemoveLocationActionImpl of(final ZoneRemoveLocationAction template) {
        ZoneRemoveLocationActionImpl instance = new ZoneRemoveLocationActionImpl();
        instance.setLocation(template.getLocation());
        return instance;
    }

    default <T> T withZoneRemoveLocationAction(Function<ZoneRemoveLocationAction, T> helper) {
        return helper.apply(this);
    }
}
