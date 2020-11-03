package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingImagesCount;
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
public final class MissingImagesProductLevelImpl implements MissingImagesProductLevel {

    private Long missingImages;
    
    private Long total;

    @JsonCreator
    MissingImagesProductLevelImpl(@JsonProperty("missingImages") final Long missingImages, @JsonProperty("total") final Long total) {
        this.missingImages = missingImages;
        this.total = total;
    }
    public MissingImagesProductLevelImpl() {
       
    }

    /**
    *  <p>Number of products missing images.</p>
    */
    public Long getMissingImages(){
        return this.missingImages;
    }
    
    /**
    *  <p>Number of products scanned.</p>
    */
    public Long getTotal(){
        return this.total;
    }

    public void setMissingImages(final Long missingImages){
        this.missingImages = missingImages;
    }
    
    public void setTotal(final Long total){
        this.total = total;
    }

}
