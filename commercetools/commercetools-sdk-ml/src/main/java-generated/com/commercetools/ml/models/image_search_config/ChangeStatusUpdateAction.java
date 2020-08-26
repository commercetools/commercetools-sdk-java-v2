package com.commercetools.ml.models.image_search_config;

import com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus;
import com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction;
import com.commercetools.ml.models.image_search_config.ChangeStatusUpdateActionImpl;

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
@JsonDeserialize(as = ChangeStatusUpdateActionImpl.class)
public interface ChangeStatusUpdateAction extends ImageSearchConfigUpdateAction {

    
    @NotNull
    @JsonProperty("status")
    public ImageSearchConfigStatus getStatus();

    public void setStatus(final ImageSearchConfigStatus status);

    public static ChangeStatusUpdateActionImpl of(){
        return new ChangeStatusUpdateActionImpl();
    }
    

    public static ChangeStatusUpdateActionImpl of(final ChangeStatusUpdateAction template) {
        ChangeStatusUpdateActionImpl instance = new ChangeStatusUpdateActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

}
