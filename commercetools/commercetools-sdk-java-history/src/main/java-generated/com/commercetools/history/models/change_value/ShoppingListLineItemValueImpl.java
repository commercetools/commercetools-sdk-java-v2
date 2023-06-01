package com.commercetools.history.models.change_value;

import com.commercetools.history.models.common.LocalizedString;
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
 * ShoppingListLineItemValue
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShoppingListLineItemValueImpl implements ShoppingListLineItemValue, ModelBase {

    
    private String id;
    
    
    private com.commercetools.history.models.common.LocalizedString name;
    
    
    private Integer variantId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListLineItemValueImpl(@JsonProperty("id") final String id, @JsonProperty("name") final com.commercetools.history.models.common.LocalizedString name, @JsonProperty("variantId") final Integer variantId) {
        this.id = id;
        this.name = name;
        this.variantId = variantId;
    }
    /**
     * create empty instance
     */
    public ShoppingListLineItemValueImpl() {
    }

    /**
     *
     */
    
    public String getId(){
        return this.id;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
     *
     */
    
    public Integer getVariantId(){
        return this.variantId;
    }

    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setName(final com.commercetools.history.models.common.LocalizedString name){
        this.name = name;
    }
    
    
    public void setVariantId(final Integer variantId){
        this.variantId = variantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShoppingListLineItemValueImpl that = (ShoppingListLineItemValueImpl) o;
    
        return new EqualsBuilder()
                .append(id, that.id)
                .append(name, that.name)
                .append(variantId, that.variantId)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(id)
            .append(name)
            .append(variantId)
            .toHashCode();
    }

}
