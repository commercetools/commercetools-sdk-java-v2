package com.commercetools.api.models.message;

import com.commercetools.api.models.business_unit.Associate;
import com.commercetools.api.models.message.MessagePayload;
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
 *  <p>Generated after a successful Add Associate update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitAssociateAddedMessagePayloadImpl implements BusinessUnitAssociateAddedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.business_unit.Associate associate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitAssociateAddedMessagePayloadImpl(@JsonProperty("associate") final com.commercetools.api.models.business_unit.Associate associate) {
        this.associate = associate;
        this.type =  BUSINESS_UNIT_ASSOCIATE_ADDED;
    }
    /**
     * create empty instance
     */
    public BusinessUnitAssociateAddedMessagePayloadImpl() {
        this.type =  BUSINESS_UNIT_ASSOCIATE_ADDED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>The Associate that was added to the Business Unit.</p>
     */
    
    public com.commercetools.api.models.business_unit.Associate getAssociate(){
        return this.associate;
    }

    
    public void setAssociate(final com.commercetools.api.models.business_unit.Associate associate){
        this.associate = associate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        BusinessUnitAssociateAddedMessagePayloadImpl that = (BusinessUnitAssociateAddedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(associate, that.associate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(associate)
            .toHashCode();
    }

}
