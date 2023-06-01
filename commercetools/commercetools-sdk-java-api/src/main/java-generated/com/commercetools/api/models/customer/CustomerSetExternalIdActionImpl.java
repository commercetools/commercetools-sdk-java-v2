package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
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
 * CustomerSetExternalIdAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerSetExternalIdActionImpl implements CustomerSetExternalIdAction, ModelBase {

    
    private String action;
    
    
    private String externalId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSetExternalIdActionImpl(@JsonProperty("externalId") final String externalId) {
        this.externalId = externalId;
        this.action =  SET_EXTERNAL_ID;
    }
    /**
     * create empty instance
     */
    public CustomerSetExternalIdActionImpl() {
        this.action =  SET_EXTERNAL_ID;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */
    
    public String getExternalId(){
        return this.externalId;
    }

    
    public void setExternalId(final String externalId){
        this.externalId = externalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerSetExternalIdActionImpl that = (CustomerSetExternalIdActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(externalId, that.externalId)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(externalId)
            .toHashCode();
    }

}
