package com.commercetools.history.models.common;


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
 * Variant
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class VariantImpl implements Variant, ModelBase {

    
    private Integer id;
    
    
    private String sku;
    
    
    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantImpl(@JsonProperty("id") final Integer id, @JsonProperty("sku") final String sku, @JsonProperty("key") final String key) {
        this.id = id;
        this.sku = sku;
        this.key = key;
    }
    /**
     * create empty instance
     */
    public VariantImpl() {
    }

    /**
     *
     */
    
    public Integer getId(){
        return this.id;
    }
    
    /**
     *
     */
    
    public String getSku(){
        return this.sku;
    }
    
    /**
     *
     */
    
    public String getKey(){
        return this.key;
    }

    
    public void setId(final Integer id){
        this.id = id;
    }
    
    
    public void setSku(final String sku){
        this.sku = sku;
    }
    
    
    public void setKey(final String key){
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        VariantImpl that = (VariantImpl) o;
    
        return new EqualsBuilder()
                .append(id, that.id)
                .append(sku, that.sku)
                .append(key, that.key)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(id)
            .append(sku)
            .append(key)
            .toHashCode();
    }

}
