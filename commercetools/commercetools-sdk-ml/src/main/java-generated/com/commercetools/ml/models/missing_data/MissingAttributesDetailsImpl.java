package com.commercetools.ml.models.missing_data;


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
public final class MissingAttributesDetailsImpl implements MissingAttributesDetails {

    private Integer total;
    
    private Integer missingAttributeNames;
    
    private Integer missingAttributeValues;

    @JsonCreator
    MissingAttributesDetailsImpl(@JsonProperty("total") final Integer total, @JsonProperty("missingAttributeNames") final Integer missingAttributeNames, @JsonProperty("missingAttributeValues") final Integer missingAttributeValues) {
        this.total = total;
        this.missingAttributeNames = missingAttributeNames;
        this.missingAttributeValues = missingAttributeValues;
    }
    public MissingAttributesDetailsImpl() {
       
    }

    /**
    *  <p>Number of products scanned.</p>
    */
    public Integer getTotal(){
        return this.total;
    }
    
    /**
    *  <p>Number of products missing attribute names.</p>
    */
    public Integer getMissingAttributeNames(){
        return this.missingAttributeNames;
    }
    
    /**
    *  <p>Number of products missing attribute values.</p>
    */
    public Integer getMissingAttributeValues(){
        return this.missingAttributeValues;
    }

    public void setTotal(final Integer total){
        this.total = total;
    }
    
    public void setMissingAttributeNames(final Integer missingAttributeNames){
        this.missingAttributeNames = missingAttributeNames;
    }
    
    public void setMissingAttributeValues(final Integer missingAttributeValues){
        this.missingAttributeValues = missingAttributeValues;
    }

}
