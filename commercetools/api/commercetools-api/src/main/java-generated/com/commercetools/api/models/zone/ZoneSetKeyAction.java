package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.ZoneUpdateAction;
import com.commercetools.api.models.zone.ZoneSetKeyActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ZoneSetKeyActionImpl.class)
public interface ZoneSetKeyAction extends ZoneUpdateAction {

    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ZoneSetKeyActionImpl of(){
        return new ZoneSetKeyActionImpl();
    }
    

    public static ZoneSetKeyActionImpl of(final ZoneSetKeyAction template) {
        ZoneSetKeyActionImpl instance = new ZoneSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

}
