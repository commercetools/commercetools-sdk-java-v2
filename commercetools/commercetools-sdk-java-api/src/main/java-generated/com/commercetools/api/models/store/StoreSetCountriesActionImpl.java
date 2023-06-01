package com.commercetools.api.models.store;

import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store_country.StoreCountry;
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
 *  <p>This update action produces the StoreCountriesChanged Message.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StoreSetCountriesActionImpl implements StoreSetCountriesAction, ModelBase {

    
    private String action;
    
    
    private java.util.List<com.commercetools.api.models.store_country.StoreCountry> countries;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreSetCountriesActionImpl(@JsonProperty("countries") final java.util.List<com.commercetools.api.models.store_country.StoreCountry> countries) {
        this.countries = countries;
        this.action =  SET_COUNTRIES;
    }
    /**
     * create empty instance
     */
    public StoreSetCountriesActionImpl() {
        this.action =  SET_COUNTRIES;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New value to set.</p>
     */
    
    public java.util.List<com.commercetools.api.models.store_country.StoreCountry> getCountries(){
        return this.countries;
    }

    
    public void setCountries(final com.commercetools.api.models.store_country.StoreCountry ...countries){
       this.countries = new ArrayList<>(Arrays.asList(countries));
    }
    
    
    public void setCountries(final java.util.List<com.commercetools.api.models.store_country.StoreCountry> countries){
       this.countries = countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StoreSetCountriesActionImpl that = (StoreSetCountriesActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(countries, that.countries)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(countries)
            .toHashCode();
    }

}
