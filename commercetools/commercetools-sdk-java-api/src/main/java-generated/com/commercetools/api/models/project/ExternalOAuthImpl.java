package com.commercetools.api.models.project;


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
public final class ExternalOAuthImpl implements ExternalOAuth {

    private String url;
    
    private String authorizationHeader;

    @JsonCreator
    ExternalOAuthImpl(@JsonProperty("url") final String url, @JsonProperty("authorizationHeader") final String authorizationHeader) {
        this.url = url;
        this.authorizationHeader = authorizationHeader;
    }
    public ExternalOAuthImpl() {
    }

    
    public String getUrl(){
        return this.url;
    }
    
    
    public String getAuthorizationHeader(){
        return this.authorizationHeader;
    }

    public void setUrl(final String url){
        this.url = url;
    }
    
    public void setAuthorizationHeader(final String authorizationHeader){
        this.authorizationHeader = authorizationHeader;
    }

}
