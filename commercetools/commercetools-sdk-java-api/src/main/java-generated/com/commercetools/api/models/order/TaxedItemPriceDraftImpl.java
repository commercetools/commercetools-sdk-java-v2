package com.commercetools.api.models.order;

import com.commercetools.api.models.common.Money;
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
 * TaxedItemPriceDraft
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TaxedItemPriceDraftImpl implements TaxedItemPriceDraft, ModelBase {

    
    private com.commercetools.api.models.common.Money totalNet;
    
    
    private com.commercetools.api.models.common.Money totalGross;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TaxedItemPriceDraftImpl(@JsonProperty("totalNet") final com.commercetools.api.models.common.Money totalNet, @JsonProperty("totalGross") final com.commercetools.api.models.common.Money totalGross) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
    }
    /**
     * create empty instance
     */
    public TaxedItemPriceDraftImpl() {
    }

    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     */
    
    public com.commercetools.api.models.common.Money getTotalNet(){
        return this.totalNet;
    }
    
    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     */
    
    public com.commercetools.api.models.common.Money getTotalGross(){
        return this.totalGross;
    }

    
    public void setTotalNet(final com.commercetools.api.models.common.Money totalNet){
        this.totalNet = totalNet;
    }
    
    
    public void setTotalGross(final com.commercetools.api.models.common.Money totalGross){
        this.totalGross = totalGross;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        TaxedItemPriceDraftImpl that = (TaxedItemPriceDraftImpl) o;
    
        return new EqualsBuilder()
                .append(totalNet, that.totalNet)
                .append(totalGross, that.totalGross)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(totalNet)
            .append(totalGross)
            .toHashCode();
    }

}
