package com.commercetools.api.models.project;

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
 * ProjectChangeCurrenciesAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProjectChangeCurrenciesActionImpl implements ProjectChangeCurrenciesAction, ModelBase {

    
    private String action;
    
    
    private java.util.List<String> currencies;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectChangeCurrenciesActionImpl(@JsonProperty("currencies") final java.util.List<String> currencies) {
        this.currencies = currencies;
        this.action =  CHANGE_CURRENCIES;
    }
    /**
     * create empty instance
     */
    public ProjectChangeCurrenciesActionImpl() {
        this.action =  CHANGE_CURRENCIES;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New value to set. Must not be empty.</p>
     */
    
    public java.util.List<String> getCurrencies(){
        return this.currencies;
    }

    
    public void setCurrencies(final String ...currencies){
       this.currencies = new ArrayList<>(Arrays.asList(currencies));
    }
    
    
    public void setCurrencies(final java.util.List<String> currencies){
       this.currencies = currencies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProjectChangeCurrenciesActionImpl that = (ProjectChangeCurrenciesActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(currencies, that.currencies)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(currencies)
            .toHashCode();
    }

}
