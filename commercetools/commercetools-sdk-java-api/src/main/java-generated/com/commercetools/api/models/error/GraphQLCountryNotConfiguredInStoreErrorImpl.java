package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
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
 *  <p>Returned when a Cart or an Order in a Store references a country that is not included in the countries configured for the Store.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create Cart in Store request and Set Country update action on Carts.</li>
 *   <li>Create Cart in Store request and Set Country update action on My Carts.</li>
 *   <li>Create Order in Store from Cart requests on Orders.</li>
 *   <li>Create Order from Cart in a Store requests on My Orders.</li>
 *   <li>Create Order from Quote requests on Orders.</li>
 *   <li>Create Order from Quote requests on My Orders.</li>
 *   <li>Create Order by Import request on Order Import.</li>
 *   <li>Set Country on Order Edits.</li>
 *  </ul>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLCountryNotConfiguredInStoreErrorImpl implements GraphQLCountryNotConfiguredInStoreError, ModelBase {

    
    private String code;
    
    
    private Map<String, java.lang.Object> values;
    
    
    private java.util.List<String> storeCountries;
    
    
    private String country;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLCountryNotConfiguredInStoreErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values, @JsonProperty("storeCountries") final java.util.List<String> storeCountries, @JsonProperty("country") final String country) {
        this.values = values;
        this.storeCountries = storeCountries;
        this.country = country;
        this.code =  COUNTRY_NOT_CONFIGURED_IN_STORE;
    }
    /**
     * create empty instance
     */
    public GraphQLCountryNotConfiguredInStoreErrorImpl() {
        this.code =  COUNTRY_NOT_CONFIGURED_IN_STORE;
    }

    /**
     *
     */
    
    public String getCode(){
        return this.code;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     */
    
    public Map<String,java.lang.Object> values() {
        return values;
    }
    
    /**
     *  <p>Countries configured for the Store.</p>
     */
    
    public java.util.List<String> getStoreCountries(){
        return this.storeCountries;
    }
    
    /**
     *  <p>The country that is not configured for the Store but referenced on the Cart or Order.</p>
     */
    
    public String getCountry(){
        return this.country;
    }

    
    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }
    
    
    public void setStoreCountries(final String ...storeCountries){
       this.storeCountries = new ArrayList<>(Arrays.asList(storeCountries));
    }
    
    
    public void setStoreCountries(final java.util.List<String> storeCountries){
       this.storeCountries = storeCountries;
    }
    
    
    public void setCountry(final String country){
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GraphQLCountryNotConfiguredInStoreErrorImpl that = (GraphQLCountryNotConfiguredInStoreErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(values, that.values)
                .append(storeCountries, that.storeCountries)
                .append(country, that.country)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(values)
            .append(storeCountries)
            .append(country)
            .toHashCode();
    }

}
