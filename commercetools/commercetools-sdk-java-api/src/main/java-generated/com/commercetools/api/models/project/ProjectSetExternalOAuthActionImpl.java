package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ExternalOAuth;
import com.commercetools.api.models.project.ProjectUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ProjectSetExternalOAuthAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProjectSetExternalOAuthActionImpl implements ProjectSetExternalOAuthAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.project.ExternalOAuth externalOAuth;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectSetExternalOAuthActionImpl(@JsonProperty("externalOAuth") final com.commercetools.api.models.project.ExternalOAuth externalOAuth) {
        this.externalOAuth = externalOAuth;
        this.action =  SET_EXTERNAL_O_AUTH;
    }
    /**
     * create empty instance
     */
    public ProjectSetExternalOAuthActionImpl() {
        this.action =  SET_EXTERNAL_O_AUTH;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    
    public com.commercetools.api.models.project.ExternalOAuth getExternalOAuth(){
        return this.externalOAuth;
    }

    
    public void setExternalOAuth(final com.commercetools.api.models.project.ExternalOAuth externalOAuth){
        this.externalOAuth = externalOAuth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProjectSetExternalOAuthActionImpl that = (ProjectSetExternalOAuthActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(externalOAuth, that.externalOAuth)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(externalOAuth)
            .toHashCode();
    }

}
