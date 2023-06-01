package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import java.time.ZonedDateTime;
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
 *  <p>Generated after a successful Set Valid To update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedQuoteValidToSetMessagePayloadImpl implements StagedQuoteValidToSetMessagePayload, ModelBase {

    
    private String type;
    
    
    private java.time.ZonedDateTime validTo;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedQuoteValidToSetMessagePayloadImpl(@JsonProperty("validTo") final java.time.ZonedDateTime validTo) {
        this.validTo = validTo;
        this.type =  STAGED_QUOTE_VALID_TO_SET;
    }
    /**
     * create empty instance
     */
    public StagedQuoteValidToSetMessagePayloadImpl() {
        this.type =  STAGED_QUOTE_VALID_TO_SET;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Expiration date for the Staged Quote after the Set Valid To update action.</p>
     */
    
    public java.time.ZonedDateTime getValidTo(){
        return this.validTo;
    }

    
    public void setValidTo(final java.time.ZonedDateTime validTo){
        this.validTo = validTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedQuoteValidToSetMessagePayloadImpl that = (StagedQuoteValidToSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(validTo, that.validTo)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(validTo)
            .toHashCode();
    }

}
