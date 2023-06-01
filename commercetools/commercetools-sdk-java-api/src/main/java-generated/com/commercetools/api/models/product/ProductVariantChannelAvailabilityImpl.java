package com.commercetools.api.models.product;


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
 * ProductVariantChannelAvailability
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductVariantChannelAvailabilityImpl implements ProductVariantChannelAvailability, ModelBase {

    
    private Boolean isOnStock;
    
    
    private Long restockableInDays;
    
    
    private Long availableQuantity;
    
    
    private String id;
    
    
    private Long version;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantChannelAvailabilityImpl(@JsonProperty("isOnStock") final Boolean isOnStock, @JsonProperty("restockableInDays") final Long restockableInDays, @JsonProperty("availableQuantity") final Long availableQuantity, @JsonProperty("id") final String id, @JsonProperty("version") final Long version) {
        this.isOnStock = isOnStock;
        this.restockableInDays = restockableInDays;
        this.availableQuantity = availableQuantity;
        this.id = id;
        this.version = version;
    }
    /**
     * create empty instance
     */
    public ProductVariantChannelAvailabilityImpl() {
    }

    /**
     *  <p>Indicates whether a Product Variant is in stock in a specified Channel.</p>
     */
    
    public Boolean getIsOnStock(){
        return this.isOnStock;
    }
    
    /**
     *  <p>Number of days to restock a Product Variant once it is out of stock in a specified Channel.</p>
     */
    
    public Long getRestockableInDays(){
        return this.restockableInDays;
    }
    
    /**
     *  <p>Number of items of this Product Variant that are in stock in a specified Channel.</p>
     */
    
    public Long getAvailableQuantity(){
        return this.availableQuantity;
    }
    
    /**
     *  <p>Unique identifier of the InventoryEntry.</p>
     */
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Current version of the InventoryEntry.</p>
     */
    
    public Long getVersion(){
        return this.version;
    }

    
    public void setIsOnStock(final Boolean isOnStock){
        this.isOnStock = isOnStock;
    }
    
    
    public void setRestockableInDays(final Long restockableInDays){
        this.restockableInDays = restockableInDays;
    }
    
    
    public void setAvailableQuantity(final Long availableQuantity){
        this.availableQuantity = availableQuantity;
    }
    
    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setVersion(final Long version){
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductVariantChannelAvailabilityImpl that = (ProductVariantChannelAvailabilityImpl) o;
    
        return new EqualsBuilder()
                .append(isOnStock, that.isOnStock)
                .append(restockableInDays, that.restockableInDays)
                .append(availableQuantity, that.availableQuantity)
                .append(id, that.id)
                .append(version, that.version)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(isOnStock)
            .append(restockableInDays)
            .append(availableQuantity)
            .append(id)
            .append(version)
            .toHashCode();
    }

}
