package com.commercetools.api.models.message;

import com.commercetools.api.models.business_unit.BusinessUnitStatus;
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
 *  <p>Generated after a successful Change Status update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitStatusChangedMessagePayloadImpl implements BusinessUnitStatusChangedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.business_unit.BusinessUnitStatus active;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitStatusChangedMessagePayloadImpl(@JsonProperty("active") final com.commercetools.api.models.business_unit.BusinessUnitStatus active) {
        this.active = active;
        this.type =  BUSINESS_UNIT_STATUS_CHANGED;
    }
    /**
     * create empty instance
     */
    public BusinessUnitStatusChangedMessagePayloadImpl() {
        this.type =  BUSINESS_UNIT_STATUS_CHANGED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Updated status of the Business Unit.</p>
     */
    
    public com.commercetools.api.models.business_unit.BusinessUnitStatus getActive(){
        return this.active;
    }

    
    public void setActive(final com.commercetools.api.models.business_unit.BusinessUnitStatus active){
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        BusinessUnitStatusChangedMessagePayloadImpl that = (BusinessUnitStatusChangedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(active, that.active)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(active)
            .toHashCode();
    }

}
