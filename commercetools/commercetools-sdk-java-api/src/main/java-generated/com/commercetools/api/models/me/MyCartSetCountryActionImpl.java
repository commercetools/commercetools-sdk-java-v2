package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
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
 *  <p>Setting the country can lead to changes in the LineItem prices.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCartSetCountryActionImpl implements MyCartSetCountryAction, ModelBase {

    
    private String action;
    
    
    private String country;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCartSetCountryActionImpl(@JsonProperty("country") final String country) {
        this.country = country;
        this.action =  SET_COUNTRY;
    }
    /**
     * create empty instance
     */
    public MyCartSetCountryActionImpl() {
        this.action =  SET_COUNTRY;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     *  <p>If the Cart is bound to a <code>store</code>, the provided value must be included in the Store's <code>countries</code>. Otherwise a CountryNotConfiguredInStore error is returned.</p>
     */
    
    public String getCountry(){
        return this.country;
    }

    
    public void setCountry(final String country){
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyCartSetCountryActionImpl that = (MyCartSetCountryActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(country, that.country)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(country)
            .toHashCode();
    }

}
