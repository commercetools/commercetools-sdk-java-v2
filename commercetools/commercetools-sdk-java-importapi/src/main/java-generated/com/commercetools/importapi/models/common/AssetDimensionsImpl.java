package com.commercetools.importapi.models.common;


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
public final class AssetDimensionsImpl implements AssetDimensions {

    private Double w;
    
    private Double h;

    @JsonCreator
    AssetDimensionsImpl(@JsonProperty("w") final Double w, @JsonProperty("h") final Double h) {
        this.w = w;
        this.h = h;
    }
    public AssetDimensionsImpl() {
       
    }

    
    public Double getW(){
        return this.w;
    }
    
    
    public Double getH(){
        return this.h;
    }

    public void setW(final Double w){
        this.w = w;
    }
    
    public void setH(final Double h){
        this.h = h;
    }

}
