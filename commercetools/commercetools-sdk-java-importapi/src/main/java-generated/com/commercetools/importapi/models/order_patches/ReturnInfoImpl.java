package com.commercetools.importapi.models.order_patches;

import com.commercetools.importapi.models.order_patches.ReturnItemDraft;
import java.time.ZonedDateTime;
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
 * ReturnInfo
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReturnInfoImpl implements ReturnInfo, ModelBase {

    
    private java.util.List<com.commercetools.importapi.models.order_patches.ReturnItemDraft> items;
    
    
    private String returnTrackingId;
    
    
    private java.time.ZonedDateTime returnDate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReturnInfoImpl(@JsonProperty("items") final java.util.List<com.commercetools.importapi.models.order_patches.ReturnItemDraft> items, @JsonProperty("returnTrackingId") final String returnTrackingId, @JsonProperty("returnDate") final java.time.ZonedDateTime returnDate) {
        this.items = items;
        this.returnTrackingId = returnTrackingId;
        this.returnDate = returnDate;
    }
    /**
     * create empty instance
     */
    public ReturnInfoImpl() {
    }

    /**
     *
     */
    
    public java.util.List<com.commercetools.importapi.models.order_patches.ReturnItemDraft> getItems(){
        return this.items;
    }
    
    /**
     *  <p>Maps to <code>ReturnInfo.returnTrackingId</code></p>
     */
    
    public String getReturnTrackingId(){
        return this.returnTrackingId;
    }
    
    /**
     *  <p>Maps to <code>ReturnInfo.returnDate</code></p>
     */
    
    public java.time.ZonedDateTime getReturnDate(){
        return this.returnDate;
    }

    
    public void setItems(final com.commercetools.importapi.models.order_patches.ReturnItemDraft ...items){
       this.items = new ArrayList<>(Arrays.asList(items));
    }
    
    
    public void setItems(final java.util.List<com.commercetools.importapi.models.order_patches.ReturnItemDraft> items){
       this.items = items;
    }
    
    
    public void setReturnTrackingId(final String returnTrackingId){
        this.returnTrackingId = returnTrackingId;
    }
    
    
    public void setReturnDate(final java.time.ZonedDateTime returnDate){
        this.returnDate = returnDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ReturnInfoImpl that = (ReturnInfoImpl) o;
    
        return new EqualsBuilder()
                .append(items, that.items)
                .append(returnTrackingId, that.returnTrackingId)
                .append(returnDate, that.returnDate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(items)
            .append(returnTrackingId)
            .append(returnDate)
            .toHashCode();
    }

}
