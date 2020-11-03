package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ShippingRateInputType;
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
public final class ProjectSetShippingRateInputTypeActionImpl implements ProjectSetShippingRateInputTypeAction {

    private String action;
    
    private com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType;

    @JsonCreator
    ProjectSetShippingRateInputTypeActionImpl(@JsonProperty("shippingRateInputType") final com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType) {
        this.shippingRateInputType = shippingRateInputType;
        this.action = "setShippingRateInputType";
    }
    public ProjectSetShippingRateInputTypeActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If not set, removes existing shippingRateInputType.</p>
    */
    public com.commercetools.api.models.project.ShippingRateInputType getShippingRateInputType(){
        return this.shippingRateInputType;
    }

    public void setShippingRateInputType(final com.commercetools.api.models.project.ShippingRateInputType shippingRateInputType){
        this.shippingRateInputType = shippingRateInputType;
    }

}
