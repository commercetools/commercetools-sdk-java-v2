package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.Location;
import com.commercetools.api.models.zone.ZoneUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ZoneRemoveLocationActionImpl implements ZoneRemoveLocationAction {

    private String action;
    
    private com.commercetools.api.models.zone.Location location;

    @JsonCreator
    ZoneRemoveLocationActionImpl(@JsonProperty("location") final com.commercetools.api.models.zone.Location location) {
        this.location = location;
        this.action = "removeLocation";
    }
    public ZoneRemoveLocationActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.zone.Location getLocation(){
        return this.location;
    }

    public void setLocation(final com.commercetools.api.models.zone.Location location){
        this.location = location;
    }

}
