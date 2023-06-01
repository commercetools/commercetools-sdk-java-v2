package com.commercetools.history.models.change_value;


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
 *  <p>Shape of the value for <code>setValidFromAndUntil</code> action</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ValidFromAndUntilValueImpl implements ValidFromAndUntilValue, ModelBase {

    
    private String validFrom;
    
    
    private String validUntil;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ValidFromAndUntilValueImpl(@JsonProperty("validFrom") final String validFrom, @JsonProperty("validUntil") final String validUntil) {
        this.validFrom = validFrom;
        this.validUntil = validUntil;
    }
    /**
     * create empty instance
     */
    public ValidFromAndUntilValueImpl() {
    }

    /**
     *
     */
    
    public String getValidFrom(){
        return this.validFrom;
    }
    
    /**
     *
     */
    
    public String getValidUntil(){
        return this.validUntil;
    }

    
    public void setValidFrom(final String validFrom){
        this.validFrom = validFrom;
    }
    
    
    public void setValidUntil(final String validUntil){
        this.validUntil = validUntil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ValidFromAndUntilValueImpl that = (ValidFromAndUntilValueImpl) o;
    
        return new EqualsBuilder()
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(validFrom)
            .append(validUntil)
            .toHashCode();
    }

}
