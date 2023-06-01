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
 * ProductTypeChangeDescriptionAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeChangeDescriptionActionImpl implements ProductTypeChangeDescriptionAction, ModelBase {

    
    private String action;
    
    
    private String description;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTypeChangeDescriptionActionImpl(@JsonProperty("description") final String description) {
        this.description = description;
        this.action =  CHANGE_DESCRIPTION;
    }
    /**
     * create empty instance
     */
    public ProductTypeChangeDescriptionActionImpl() {
        this.action =  CHANGE_DESCRIPTION;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New value to set.</p>
     */
    
    public String getDescription(){
        return this.description;
    }

    
    public void setDescription(final String description){
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductTypeChangeDescriptionActionImpl that = (ProductTypeChangeDescriptionActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(description, that.description)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(description)
            .toHashCode();
    }

}
