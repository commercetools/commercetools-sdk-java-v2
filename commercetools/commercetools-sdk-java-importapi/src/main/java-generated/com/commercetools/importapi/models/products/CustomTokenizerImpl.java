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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomTokenizerImpl that = (CustomTokenizerImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(inputs, that.inputs)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(inputs)
            .toHashCode();
    }

}
