package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.ZoneUpdateAction;
import com.commercetools.api.models.zone.ZoneSetKeyActionImpl;

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
@JsonDeserialize(as = ZoneSetKeyActionImpl.class)
public interface ZoneSetKeyAction extends ZoneUpdateAction {

    String SET_KEY = "setKey";

    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    
    @JsonProperty("key")
    public String getKey();

    
    public void setKey(final String key);
    

    public static ZoneSetKeyAction of(){
        return new ZoneSetKeyActionImpl();
    }
    

    public static ZoneSetKeyAction of(final ZoneSetKeyAction template) {
        ZoneSetKeyActionImpl instance = new ZoneSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ZoneSetKeyActionBuilder builder(){
        return ZoneSetKeyActionBuilder.of();
    }
    
    public static ZoneSetKeyActionBuilder builder(final ZoneSetKeyAction template){
        return ZoneSetKeyActionBuilder.of(template);
    }
    

    default <T> T withZoneSetKeyAction(Function<ZoneSetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
