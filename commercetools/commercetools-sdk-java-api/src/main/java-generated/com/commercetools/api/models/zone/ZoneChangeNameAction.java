package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.ZoneUpdateAction;
import com.commercetools.api.models.zone.ZoneChangeNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ZoneChangeNameActionImpl.class)
public interface ZoneChangeNameAction extends ZoneUpdateAction {

    
    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static ZoneChangeNameAction of(){
        return new ZoneChangeNameActionImpl();
    }
    

    public static ZoneChangeNameAction of(final ZoneChangeNameAction template) {
        ZoneChangeNameActionImpl instance = new ZoneChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static ZoneChangeNameActionBuilder builder(){
        return ZoneChangeNameActionBuilder.of();
    }
    
    public static ZoneChangeNameActionBuilder builder(final ZoneChangeNameAction template){
        return ZoneChangeNameActionBuilder.of(template);
    }
    

    default <T> T withZoneChangeNameAction(Function<ZoneChangeNameAction, T> helper) {
        return helper.apply(this);
    }
}
