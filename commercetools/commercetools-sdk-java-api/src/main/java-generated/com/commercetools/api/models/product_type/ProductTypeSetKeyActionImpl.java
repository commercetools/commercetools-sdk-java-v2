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
 * ProductTypeSetKeyAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeSetKeyActionImpl implements ProductTypeSetKeyAction, ModelBase {

    
    private String action;
    
    
    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTypeSetKeyActionImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.action =  SET_KEY;
    }
    /**
     * create empty instance
     */
    public ProductTypeSetKeyActionImpl() {
        this.action =  SET_KEY;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    
    public String getKey(){
        return this.key;
    }

    
    public void setKey(final String key){
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductTypeSetKeyActionImpl that = (ProductTypeSetKeyActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(key, that.key)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(key)
            .toHashCode();
    }

}
