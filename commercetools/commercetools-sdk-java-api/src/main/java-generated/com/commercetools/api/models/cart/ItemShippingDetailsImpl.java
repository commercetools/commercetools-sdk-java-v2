package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ItemShippingTarget;
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
 * ItemShippingDetails
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ItemShippingDetailsImpl implements ItemShippingDetails, ModelBase {

    
    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets;
    
    
    private Boolean valid;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ItemShippingDetailsImpl(@JsonProperty("targets") final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets, @JsonProperty("valid") final Boolean valid) {
        this.targets = targets;
        this.valid = valid;
    }
    /**
     * create empty instance
     */
    public ItemShippingDetailsImpl() {
    }

    /**
     *  <p>Holds information on the quantity of Line Items or Custom Line Items and the address it is shipped.</p>
     */
    
    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargets(){
        return this.targets;
    }
    
    /**
     *  <ul>
     *   <li><code>true</code> if the quantity of Line Items or Custom Line Items is equal to the sum of sub-quantities defined in <code>targets</code>.</li>
     *   <li><code>false</code> if the quantity of Line Items or Custom Line Items is not equal to the sum of sub-quantities defined in <code>targets</code>. Ordering a Cart when the value is <code>false</code> returns an InvalidItemShippingDetails error.</li>
     *  </ul>
     */
    
    public Boolean getValid(){
        return this.valid;
    }

    
    public void setTargets(final com.commercetools.api.models.cart.ItemShippingTarget ...targets){
       this.targets = new ArrayList<>(Arrays.asList(targets));
    }
    
    
    public void setTargets(final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets){
       this.targets = targets;
    }
    
    
    public void setValid(final Boolean valid){
        this.valid = valid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ItemShippingDetailsImpl that = (ItemShippingDetailsImpl) o;
    
        return new EqualsBuilder()
                .append(targets, that.targets)
                .append(valid, that.valid)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(targets)
            .append(valid)
            .toHashCode();
    }

}
