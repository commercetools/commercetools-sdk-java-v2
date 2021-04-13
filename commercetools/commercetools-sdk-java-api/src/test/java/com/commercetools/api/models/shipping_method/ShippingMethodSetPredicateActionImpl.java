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
public final class ShippingMethodSetPredicateActionImpl implements ShippingMethodSetPredicateAction {

    
    private String action;
    
    
    private String predicate;

    @JsonCreator
    ShippingMethodSetPredicateActionImpl(@JsonProperty("predicate") final String predicate) {
        this.predicate = predicate;
        this.action =  SET_PREDICATE;
    }
    public ShippingMethodSetPredicateActionImpl() {
        this.action =  SET_PREDICATE;
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>A valid Cart predicate.
    *  If <code>predicate</code> is absent or <code>null</code>, it is removed if it exists.</p>
    */
    public String getPredicate(){
        return this.predicate;
    }

    
    public void setPredicate(final String predicate){
        this.predicate = predicate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShippingMethodSetPredicateActionImpl that = (ShippingMethodSetPredicateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(predicate, that.predicate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(predicate)
            .toHashCode();
    }

}
