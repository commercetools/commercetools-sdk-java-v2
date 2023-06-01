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
 * InventoryQuantityValue
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InventoryQuantityValueImpl implements InventoryQuantityValue, ModelBase {

    
    private Integer quantityOnStock;
    
    
    private Integer availableQuantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryQuantityValueImpl(@JsonProperty("quantityOnStock") final Integer quantityOnStock, @JsonProperty("availableQuantity") final Integer availableQuantity) {
        this.quantityOnStock = quantityOnStock;
        this.availableQuantity = availableQuantity;
    }
    /**
     * create empty instance
     */
    public InventoryQuantityValueImpl() {
    }

    /**
     *
     */
    
    public Integer getQuantityOnStock(){
        return this.quantityOnStock;
    }
    
    /**
     *
     */
    
    public Integer getAvailableQuantity(){
        return this.availableQuantity;
    }

    
    public void setQuantityOnStock(final Integer quantityOnStock){
        this.quantityOnStock = quantityOnStock;
    }
    
    
    public void setAvailableQuantity(final Integer availableQuantity){
        this.availableQuantity = availableQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        InventoryQuantityValueImpl that = (InventoryQuantityValueImpl) o;
    
        return new EqualsBuilder()
                .append(quantityOnStock, that.quantityOnStock)
                .append(availableQuantity, that.availableQuantity)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(quantityOnStock)
            .append(availableQuantity)
            .toHashCode();
    }

}
