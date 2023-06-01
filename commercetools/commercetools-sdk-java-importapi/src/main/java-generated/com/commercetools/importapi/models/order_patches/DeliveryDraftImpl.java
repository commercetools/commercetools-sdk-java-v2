package com.commercetools.importapi.models.order_patches;

import com.commercetools.importapi.models.common.Address;
import com.commercetools.importapi.models.order_patches.DeliveryParcelDraft;
import com.commercetools.importapi.models.orders.DeliveryItem;
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
 * DeliveryDraft
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DeliveryDraftImpl implements DeliveryDraft, ModelBase {

    
    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;
    
    
    private com.commercetools.importapi.models.common.Address address;
    
    
    private java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> parcels;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryDraftImpl(@JsonProperty("items") final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items, @JsonProperty("address") final com.commercetools.importapi.models.common.Address address, @JsonProperty("parcels") final java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> parcels) {
        this.items = items;
        this.address = address;
        this.parcels = parcels;
    }
    /**
     * create empty instance
     */
    public DeliveryDraftImpl() {
    }

    /**
     *
     */
    
    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems(){
        return this.items;
    }
    
    /**
     *
     */
    
    public com.commercetools.importapi.models.common.Address getAddress(){
        return this.address;
    }
    
    /**
     *
     */
    
    public java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> getParcels(){
        return this.parcels;
    }

    
    public void setItems(final com.commercetools.importapi.models.orders.DeliveryItem ...items){
       this.items = new ArrayList<>(Arrays.asList(items));
    }
    
    
    public void setItems(final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items){
       this.items = items;
    }
    
    
    public void setAddress(final com.commercetools.importapi.models.common.Address address){
        this.address = address;
    }
    
    
    public void setParcels(final com.commercetools.importapi.models.order_patches.DeliveryParcelDraft ...parcels){
       this.parcels = new ArrayList<>(Arrays.asList(parcels));
    }
    
    
    public void setParcels(final java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> parcels){
       this.parcels = parcels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        DeliveryDraftImpl that = (DeliveryDraftImpl) o;
    
        return new EqualsBuilder()
                .append(items, that.items)
                .append(address, that.address)
                .append(parcels, that.parcels)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(items)
            .append(address)
            .append(parcels)
            .toHashCode();
    }

}
