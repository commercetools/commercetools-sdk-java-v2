package com.commercetools.api.models.product_type;

import com.commercetools.api.models.common.LocalizedString;
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
 * ProductTypeChangeLabelAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeChangeLabelActionImpl implements ProductTypeChangeLabelAction, ModelBase {

    
    private String action;
    
    
    private String attributeName;
    
    
    private com.commercetools.api.models.common.LocalizedString label;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTypeChangeLabelActionImpl(@JsonProperty("attributeName") final String attributeName, @JsonProperty("label") final com.commercetools.api.models.common.LocalizedString label) {
        this.attributeName = attributeName;
        this.label = label;
        this.action =  CHANGE_LABEL;
    }
    /**
     * create empty instance
     */
    public ProductTypeChangeLabelActionImpl() {
        this.action =  CHANGE_LABEL;
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
     *  <p>New value to set. Must not be empty.</p>
     */
    
    public com.commercetools.api.models.common.LocalizedString getLabel(){
        return this.label;
    }

    
    public void setAttributeName(final String attributeName){
        this.attributeName = attributeName;
    }
    
    
    public void setLabel(final com.commercetools.api.models.common.LocalizedString label){
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductTypeChangeLabelActionImpl that = (ProductTypeChangeLabelActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(label, that.label)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(attributeName)
            .append(label)
            .toHashCode();
    }

}
