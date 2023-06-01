package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.TextInputHint;
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
 *  <p>Updates the <code>inputHint</code> of an AttributeDefinition.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeChangeInputHintActionImpl implements ProductTypeChangeInputHintAction, ModelBase {

    
    private String action;
    
    
    private String attributeName;
    
    
    private com.commercetools.api.models.product_type.TextInputHint newValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTypeChangeInputHintActionImpl(@JsonProperty("attributeName") final String attributeName, @JsonProperty("newValue") final com.commercetools.api.models.product_type.TextInputHint newValue) {
        this.attributeName = attributeName;
        this.newValue = newValue;
        this.action =  CHANGE_INPUT_HINT;
    }
    /**
     * create empty instance
     */
    public ProductTypeChangeInputHintActionImpl() {
        this.action =  CHANGE_INPUT_HINT;
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
     *  <p><code>SingleLine</code> or <code>MultiLine</code></p>
     */
    
    public com.commercetools.api.models.product_type.TextInputHint getNewValue(){
        return this.newValue;
    }

    
    public void setAttributeName(final String attributeName){
        this.attributeName = attributeName;
    }
    
    
    public void setNewValue(final com.commercetools.api.models.product_type.TextInputHint newValue){
        this.newValue = newValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductTypeChangeInputHintActionImpl that = (ProductTypeChangeInputHintActionImpl) o;
    
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
