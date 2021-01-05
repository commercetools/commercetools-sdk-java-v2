package com.commercetools.api.models.common;


import com.commercetools.api.models.common.UpdateActionImpl;

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
@JsonDeserialize(as = UpdateActionImpl.class)
public interface UpdateAction extends com.commercetools.api.models.ResourceUpdateAction<UpdateAction> {

    
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public void setAction(final String action);

    public static UpdateAction of(){
        return new UpdateActionImpl();
    }
    

    public static UpdateAction of(final UpdateAction template) {
        UpdateActionImpl instance = new UpdateActionImpl();
        instance.setAction(template.getAction());
        return instance;
    }

    public static UpdateActionBuilder builder(){
        return UpdateActionBuilder.of();
    }
    
    public static UpdateActionBuilder builder(final UpdateAction template){
        return UpdateActionBuilder.of(template);
    }
    

    default <T> T withUpdateAction(Function<UpdateAction, T> helper) {
        return helper.apply(this);
    }
}
