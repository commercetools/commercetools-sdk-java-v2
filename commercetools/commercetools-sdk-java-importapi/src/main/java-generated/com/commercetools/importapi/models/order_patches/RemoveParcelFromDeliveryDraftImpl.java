package com.commercetools.importapi.models.order_patches;


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
 * RemoveParcelFromDeliveryDraft
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class RemoveParcelFromDeliveryDraftImpl implements RemoveParcelFromDeliveryDraft, ModelBase {

    
    private String parcelId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RemoveParcelFromDeliveryDraftImpl(@JsonProperty("parcelId") final String parcelId) {
        this.parcelId = parcelId;
    }
    /**
     * create empty instance
     */
    public RemoveParcelFromDeliveryDraftImpl() {
    }

    /**
     *
     */
    
    public String getParcelId(){
        return this.parcelId;
    }

    
    public void setParcelId(final String parcelId){
        this.parcelId = parcelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        RemoveParcelFromDeliveryDraftImpl that = (RemoveParcelFromDeliveryDraftImpl) o;
    
        return new EqualsBuilder()
                .append(parcelId, that.parcelId)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(parcelId)
            .toHashCode();
    }

}
