package com.commercetools.importapi.models.products;

import com.commercetools.importapi.models.products.SuggestTokenizer;
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
public final class CustomTokenizerImpl implements CustomTokenizer {

    private String type;
    
    private java.util.List<String> inputs;

    @JsonCreator
    CustomTokenizerImpl(@JsonProperty("inputs") final java.util.List<String> inputs) {
        this.inputs = inputs;
        this.type = "custom";
    }
    public CustomTokenizerImpl() {
        this.type = "custom";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public java.util.List<String> getInputs(){
        return this.inputs;
    }

    public void setInputs(final String ...inputs){
       this.inputs = new ArrayList<>(Arrays.asList(inputs));
    }
    
    public void setInputs(final java.util.List<String> inputs){
       this.inputs = inputs;
    }

}
