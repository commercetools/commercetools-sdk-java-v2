package com.commercetools.api.models.api_client;


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
public final class ApiClientDraftImpl implements ApiClientDraft {

    private String name;
    
    private String scope;
    
    private Long deleteDaysAfterCreation;

    @JsonCreator
    ApiClientDraftImpl(@JsonProperty("name") final String name, @JsonProperty("scope") final String scope, @JsonProperty("deleteDaysAfterCreation") final Long deleteDaysAfterCreation) {
        this.name = name;
        this.scope = scope;
        this.deleteDaysAfterCreation = deleteDaysAfterCreation;
    }
    public ApiClientDraftImpl() {
       
    }

    
    public String getName(){
        return this.name;
    }
    
    
    public String getScope(){
        return this.scope;
    }
    
    /**
    *  <p>If set, the client will be deleted after the specified amount of days.</p>
    */
    public Long getDeleteDaysAfterCreation(){
        return this.deleteDaysAfterCreation;
    }

    public void setName(final String name){
        this.name = name;
    }
    
    public void setScope(final String scope){
        this.scope = scope;
    }
    
    public void setDeleteDaysAfterCreation(final Long deleteDaysAfterCreation){
        this.deleteDaysAfterCreation = deleteDaysAfterCreation;
    }

}
