package com.commercetools.ml.models.image_search_config;

import com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction;
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
public final class ImageSearchConfigRequestImpl implements ImageSearchConfigRequest {

    private java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> actions;

    @JsonCreator
    ImageSearchConfigRequestImpl(@JsonProperty("actions") final java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> actions) {
        this.actions = actions;
    }
    public ImageSearchConfigRequestImpl() {
       
    }

    /**
    *  <p>The list of update actions to be performed on the project.</p>
    */
    public java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> getActions(){
        return this.actions;
    }

    public void setActions(final com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction ...actions){
       this.actions = new ArrayList<>(Arrays.asList(actions));
    }
    
    public void setActions(final java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> actions){
       this.actions = actions;
    }

}
