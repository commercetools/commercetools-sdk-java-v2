package com.commercetools.api.models.customer;


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
 * CustomerCreateEmailToken
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerCreateEmailTokenImpl implements CustomerCreateEmailToken, ModelBase {

    
    private String id;
    
    
    private Long version;
    
    
    private Long ttlMinutes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerCreateEmailTokenImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("ttlMinutes") final Long ttlMinutes) {
        this.id = id;
        this.version = version;
        this.ttlMinutes = ttlMinutes;
    }
    /**
     * create empty instance
     */
    public CustomerCreateEmailTokenImpl() {
    }

    /**
     *  <p>Unique identifier of the Customer.</p>
     */
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Expected version of the Customer.</p>
     */
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Validity period of the generated token in minutes.</p>
     */
    
    public Long getTtlMinutes(){
        return this.ttlMinutes;
    }

    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    
    public void setTtlMinutes(final Long ttlMinutes){
        this.ttlMinutes = ttlMinutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerCreateEmailTokenImpl that = (CustomerCreateEmailTokenImpl) o;
    
        return new EqualsBuilder()
                .append(id, that.id)
                .append(version, that.version)
                .append(ttlMinutes, that.ttlMinutes)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(id)
            .append(version)
            .append(ttlMinutes)
            .toHashCode();
    }

}
