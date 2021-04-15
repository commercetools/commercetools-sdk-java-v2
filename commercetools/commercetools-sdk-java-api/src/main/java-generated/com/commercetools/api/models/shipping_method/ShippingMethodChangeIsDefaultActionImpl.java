package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingMethodChangeIsDefaultActionImpl implements ShippingMethodChangeIsDefaultAction {

    
    private String action;
    
    
    private Boolean isDefault;

    @JsonCreator
    ShippingMethodChangeIsDefaultActionImpl(@JsonProperty("isDefault") final Boolean isDefault) {
        this.isDefault = isDefault;
        this.action =  CHANGE_IS_DEFAULT;
    }
    public ShippingMethodChangeIsDefaultActionImpl() {
        this.action =  CHANGE_IS_DEFAULT;
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>Only one ShippingMethod in a project can be default.</p>
    */
    public Boolean getIsDefault(){
        return this.isDefault;
    }

    
    public void setIsDefault(final Boolean isDefault){
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShippingMethodChangeIsDefaultActionImpl that = (ShippingMethodChangeIsDefaultActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(isDefault, that.isDefault)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(isDefault)
            .toHashCode();
    }

}
