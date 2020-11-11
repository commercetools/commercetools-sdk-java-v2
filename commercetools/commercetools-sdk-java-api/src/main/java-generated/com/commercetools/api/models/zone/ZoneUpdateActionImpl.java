package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.ZoneAddLocationAction;
import com.commercetools.api.models.zone.ZoneChangeNameAction;
import com.commercetools.api.models.zone.ZoneRemoveLocationAction;
import com.commercetools.api.models.zone.ZoneSetDescriptionAction;
import com.commercetools.api.models.zone.ZoneSetKeyAction;
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
public final class ZoneUpdateActionImpl implements ZoneUpdateAction {

    private String action;

    @JsonCreator
    ZoneUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    public ZoneUpdateActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }


}
