package com.commercetools.ml.models.image_search_config;

import com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus;
import com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction;
import com.commercetools.ml.models.image_search_config.ChangeStatusUpdateActionImpl;

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
@JsonDeserialize(as = ChangeStatusUpdateActionImpl.class)
public interface ChangeStatusUpdateAction extends ImageSearchConfigUpdateAction {

    
    @NotNull
    @JsonProperty("status")
    public ImageSearchConfigStatus getStatus();

    public void setStatus(final ImageSearchConfigStatus status);

    public static ChangeStatusUpdateAction of(){
        return new ChangeStatusUpdateActionImpl();
    }
    

    public static ChangeStatusUpdateAction of(final ChangeStatusUpdateAction template) {
        ChangeStatusUpdateActionImpl instance = new ChangeStatusUpdateActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    public static ChangeStatusUpdateActionBuilder builder(){
        return ChangeStatusUpdateActionBuilder.of();
    }
    
    public static ChangeStatusUpdateActionBuilder builder(final ChangeStatusUpdateAction template){
        return ChangeStatusUpdateActionBuilder.of(template);
    }
    

    default <T> T withChangeStatusUpdateAction(Function<ChangeStatusUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
