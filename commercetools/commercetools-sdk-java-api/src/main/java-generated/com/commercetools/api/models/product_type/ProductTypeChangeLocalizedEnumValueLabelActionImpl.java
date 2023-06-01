package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
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
 *  <p>Updates the label of a single enum <code>value</code> in an AttributeLocalizedEnumType AttributeDefinition, or AttributeSetType of AttributeLocalizedEnumType AttributeDefinition.</p>
 *  <p>All Products will be updated to the new label in an eventually consistent way.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeChangeLocalizedEnumValueLabelActionImpl implements ProductTypeChangeLocalizedEnumValueLabelAction, ModelBase {

    
    private String action;
    
    
    private String attributeName;
    
    
    private com.commercetools.api.models.product_type.AttributeLocalizedEnumValue newValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTypeChangeLocalizedEnumValueLabelActionImpl(@JsonProperty("attributeName") final String attributeName, @JsonProperty("newValue") final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue newValue) {
        this.attributeName = attributeName;
        this.newValue = newValue;
        this.action =  CHANGE_LOCALIZED_ENUM_VALUE_LABEL;
    }
    /**
     * create empty instance
     */
    public ProductTypeChangeLocalizedEnumValueLabelActionImpl() {
        this.action =  CHANGE_LOCALIZED_ENUM_VALUE_LABEL;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */
    
    public String getAttributeName(){
        return this.attributeName;
    }
    
    /**
     *  <p>New value to set. Must be different from the existing value.</p>
     */
    
    public com.commercetools.api.models.product_type.AttributeLocalizedEnumValue getNewValue(){
        return this.newValue;
    }

    
    public void setAttributeName(final String attributeName){
        this.attributeName = attributeName;
    }
    
    
    public void setNewValue(final com.commercetools.api.models.product_type.AttributeLocalizedEnumValue newValue){
        this.newValue = newValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductTypeChangeLocalizedEnumValueLabelActionImpl that = (ProductTypeChangeLocalizedEnumValueLabelActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(newValue, that.newValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(attributeName)
            .append(newValue)
            .toHashCode();
    }

}
