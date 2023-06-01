package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
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
 *  <p>This update action does not set any Cart field in particular, but it triggers several Cart updates to bring prices and discounts to the latest state. Those can become stale over time when no Cart updates have been performed for a while and prices on related Products have changed in the meanwhile.</p>
 *  <p>If the <code>priceMode</code> of the Product related to a Line Item is of <code>Embedded</code> ProductPriceMode, the updated <code>price</code> of that LineItem may not correspond to a Price in the <code>variant.prices</code> anymore.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCartRecalculateActionImpl implements MyCartRecalculateAction, ModelBase {

    
    private String action;
    
    
    private Boolean updateProductData;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCartRecalculateActionImpl(@JsonProperty("updateProductData") final Boolean updateProductData) {
        this.updateProductData = updateProductData;
        this.action =  RECALCULATE;
    }
    /**
     * create empty instance
     */
    public MyCartRecalculateActionImpl() {
        this.action =  RECALCULATE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <ul>
     *   <li>Leave empty or set to <code>false</code> to only update the Prices and TaxRates of the Line Items.</li>
     *   <li>Set to <code>true</code> to update the Line Items' product data (like <code>name</code>, <code>variant</code> and <code>productType</code>) also.</li>
     *  </ul>
     */
    
    public Boolean getUpdateProductData(){
        return this.updateProductData;
    }

    
    public void setUpdateProductData(final Boolean updateProductData){
        this.updateProductData = updateProductData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyCartRecalculateActionImpl that = (MyCartRecalculateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(updateProductData, that.updateProductData)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(updateProductData)
            .toHashCode();
    }

}
