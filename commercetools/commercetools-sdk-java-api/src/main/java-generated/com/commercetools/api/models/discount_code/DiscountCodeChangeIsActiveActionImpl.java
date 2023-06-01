package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
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
 * DiscountCodeChangeIsActiveAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountCodeChangeIsActiveActionImpl implements DiscountCodeChangeIsActiveAction, ModelBase {

    
    private String action;
    
    
    private Boolean isActive;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountCodeChangeIsActiveActionImpl(@JsonProperty("isActive") final Boolean isActive) {
        this.isActive = isActive;
        this.action =  CHANGE_IS_ACTIVE;
    }
    /**
     * create empty instance
     */
    public DiscountCodeChangeIsActiveActionImpl() {
        this.action =  CHANGE_IS_ACTIVE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New value to set. Set to <code>true</code> to activate the DiscountCode for all matching Discounts.</p>
     */
    
    public Boolean getIsActive(){
        return this.isActive;
    }

    
    public void setIsActive(final Boolean isActive){
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        DiscountCodeChangeIsActiveActionImpl that = (DiscountCodeChangeIsActiveActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(isActive, that.isActive)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(isActive)
            .toHashCode();
    }

}
