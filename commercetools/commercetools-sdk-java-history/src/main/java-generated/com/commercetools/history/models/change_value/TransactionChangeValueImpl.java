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
 * TransactionChangeValue
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TransactionChangeValueImpl implements TransactionChangeValue, ModelBase {

    
    private String id;
    
    
    private String interactionId;
    
    
    private String timestamp;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TransactionChangeValueImpl(@JsonProperty("id") final String id, @JsonProperty("interactionId") final String interactionId, @JsonProperty("timestamp") final String timestamp) {
        this.id = id;
        this.interactionId = interactionId;
        this.timestamp = timestamp;
    }
    /**
     * create empty instance
     */
    public TransactionChangeValueImpl() {
    }

    /**
     *
     */
    
    public String getId(){
        return this.id;
    }
    
    /**
     *
     */
    
    public String getInteractionId(){
        return this.interactionId;
    }
    
    /**
     *
     */
    
    public String getTimestamp(){
        return this.timestamp;
    }

    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setInteractionId(final String interactionId){
        this.interactionId = interactionId;
    }
    
    
    public void setTimestamp(final String timestamp){
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        TransactionChangeValueImpl that = (TransactionChangeValueImpl) o;
    
        return new EqualsBuilder()
                .append(id, that.id)
                .append(interactionId, that.interactionId)
                .append(timestamp, that.timestamp)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(id)
            .append(interactionId)
            .append(timestamp)
            .toHashCode();
    }

}
