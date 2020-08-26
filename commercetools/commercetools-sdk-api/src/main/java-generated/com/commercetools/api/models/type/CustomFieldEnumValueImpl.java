package com.commercetools.api.models.type;


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
public final class CustomFieldEnumValueImpl implements CustomFieldEnumValue {

    private String key;
    
    private String label;

    @JsonCreator
    CustomFieldEnumValueImpl(@JsonProperty("key") final String key, @JsonProperty("label") final String label) {
        this.key = key;
        this.label = label;
    }
    public CustomFieldEnumValueImpl() {
       
    }

    
    public String getKey(){
        return this.key;
    }
    
    
    public String getLabel(){
        return this.label;
    }

    public void setKey(final String key){
        this.key = key;
    }
    
    public void setLabel(final String label){
        this.label = label;
    }

}
