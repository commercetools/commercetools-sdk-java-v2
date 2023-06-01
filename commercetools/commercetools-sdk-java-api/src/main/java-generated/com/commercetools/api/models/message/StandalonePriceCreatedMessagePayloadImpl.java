package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.standalone_price.StandalonePrice;
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
 *  <p>Generated after a successful Create StandalonePrice request.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StandalonePriceCreatedMessagePayloadImpl implements StandalonePriceCreatedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.standalone_price.StandalonePrice standalonePrice;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceCreatedMessagePayloadImpl(@JsonProperty("standalonePrice") final com.commercetools.api.models.standalone_price.StandalonePrice standalonePrice) {
        this.standalonePrice = standalonePrice;
        this.type =  STANDALONE_PRICE_CREATED;
    }
    /**
     * create empty instance
     */
    public StandalonePriceCreatedMessagePayloadImpl() {
        this.type =  STANDALONE_PRICE_CREATED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Standalone Price that was created.</p>
     */
    
    public com.commercetools.api.models.standalone_price.StandalonePrice getStandalonePrice(){
        return this.standalonePrice;
    }

    
    public void setStandalonePrice(final com.commercetools.api.models.standalone_price.StandalonePrice standalonePrice){
        this.standalonePrice = standalonePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StandalonePriceCreatedMessagePayloadImpl that = (StandalonePriceCreatedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(standalonePrice, that.standalonePrice)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(standalonePrice)
            .toHashCode();
    }

}
