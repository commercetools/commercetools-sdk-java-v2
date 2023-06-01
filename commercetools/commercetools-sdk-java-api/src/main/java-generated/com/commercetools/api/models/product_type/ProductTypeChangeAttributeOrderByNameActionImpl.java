package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
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
 * ProductTypeChangeAttributeOrderByNameAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeChangeAttributeOrderByNameActionImpl implements ProductTypeChangeAttributeOrderByNameAction, ModelBase {

    
    private String action;
    
    
    private java.util.List<String> attributeNames;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTypeChangeAttributeOrderByNameActionImpl(@JsonProperty("attributeNames") final java.util.List<String> attributeNames) {
        this.attributeNames = attributeNames;
        this.action =  CHANGE_ATTRIBUTE_ORDER_BY_NAME;
    }
    /**
     * create empty instance
     */
    public ProductTypeChangeAttributeOrderByNameActionImpl() {
        this.action =  CHANGE_ATTRIBUTE_ORDER_BY_NAME;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Names of Attributes to reorder. This array must include all Attributes currently present on a ProductType in a different order.</p>
     */
    
    public java.util.List<String> getAttributeNames(){
        return this.attributeNames;
    }

    
    public void setAttributeNames(final String ...attributeNames){
       this.attributeNames = new ArrayList<>(Arrays.asList(attributeNames));
    }
    
    
    public void setAttributeNames(final java.util.List<String> attributeNames){
       this.attributeNames = attributeNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductTypeChangeAttributeOrderByNameActionImpl that = (ProductTypeChangeAttributeOrderByNameActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(attributeNames, that.attributeNames)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(attributeNames)
            .toHashCode();
    }

}
