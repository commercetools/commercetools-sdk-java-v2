package com.commercetools.ml.models.image_search_config;

import com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus;
import com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChangeStatusUpdateActionImpl implements ChangeStatusUpdateAction {

    private String action;
    
    private com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status;

    @JsonCreator
    ChangeStatusUpdateActionImpl(@JsonProperty("status") final com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status) {
        this.status = status;
        this.action = "changeStatus";
    }
    public ChangeStatusUpdateActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus getStatus(){
        return this.status;
    }

    public void setStatus(final com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status){
        this.status = status;
    }

}
