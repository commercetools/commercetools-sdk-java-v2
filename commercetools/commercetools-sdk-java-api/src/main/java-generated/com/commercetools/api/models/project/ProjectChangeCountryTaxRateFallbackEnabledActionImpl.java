package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
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
public final class ProjectChangeCountryTaxRateFallbackEnabledActionImpl implements ProjectChangeCountryTaxRateFallbackEnabledAction {

    private String action;
    
    private Boolean countryTaxRateFallbackEnabled;

    @JsonCreator
    ProjectChangeCountryTaxRateFallbackEnabledActionImpl(@JsonProperty("countryTaxRateFallbackEnabled") final Boolean countryTaxRateFallbackEnabled) {
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
        this.action = "changeCountryTaxRateFallbackEnabled";
    }
    public ProjectChangeCountryTaxRateFallbackEnabledActionImpl() {
        this.action = "changeCountryTaxRateFallbackEnabled";
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>default value is <code>false</code></p>
    */
    public Boolean getCountryTaxRateFallbackEnabled(){
        return this.countryTaxRateFallbackEnabled;
    }

    public void setCountryTaxRateFallbackEnabled(final Boolean countryTaxRateFallbackEnabled){
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProjectChangeCountryTaxRateFallbackEnabledActionImpl that = (ProjectChangeCountryTaxRateFallbackEnabledActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(countryTaxRateFallbackEnabled, that.countryTaxRateFallbackEnabled)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(countryTaxRateFallbackEnabled)
            .toHashCode();
    }

}
