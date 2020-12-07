package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetExternalIdActionImpl implements CustomerSetExternalIdAction {

    private String action;
    
    private String externalId;

    @JsonCreator
    CustomerSetExternalIdActionImpl(@JsonProperty("externalId") final String externalId) {
        this.externalId = externalId;
        this.action = "setExternalId";
    }
    public CustomerSetExternalIdActionImpl() {
        this.action = "setExternalId";
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If not defined, the external ID is unset.</p>
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
