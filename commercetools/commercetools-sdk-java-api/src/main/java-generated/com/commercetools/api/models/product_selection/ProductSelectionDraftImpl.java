package com.commercetools.api.models.product_selection;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_selection.ProductSelectionMode;
import com.commercetools.api.models.product_selection.ProductSelectionTypeEnum;
import com.commercetools.api.models.type.CustomFieldsDraft;
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
 * ProductSelectionDraft
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSelectionDraftImpl implements ProductSelectionDraft, ModelBase {

    
    private String key;
    
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    
    private com.commercetools.api.models.type.CustomFieldsDraft custom;
    
    @Deprecated
    private com.commercetools.api.models.product_selection.ProductSelectionTypeEnum type;
    
    
    private com.commercetools.api.models.product_selection.ProductSelectionMode mode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionDraftImpl(@JsonProperty("key") final String key, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("type") final com.commercetools.api.models.product_selection.ProductSelectionTypeEnum type, @JsonProperty("mode") final com.commercetools.api.models.product_selection.ProductSelectionMode mode) {
        this.key = key;
        this.name = name;
        this.custom = custom;
        this.type = type;
        this.mode = mode;
    }
    /**
     * create empty instance
     */
    public ProductSelectionDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the ProductSelection.</p>
     */
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Name of the ProductSelection. Not checked for uniqueness, but distinct names are recommended.</p>
     */
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
     *  <p>Custom Fields of this ProductSelection.</p>
     */
    
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }
    
    /**
     *  <p>Type of the Product Selection.</p>
     */
    @Deprecated
    public com.commercetools.api.models.product_selection.ProductSelectionTypeEnum getType(){
        return this.type;
    }
    
    /**
     *  <p>Mode of the Product Selection.</p>
     */
    
    public com.commercetools.api.models.product_selection.ProductSelectionMode getMode(){
        return this.mode;
    }

    
    public void setKey(final String key){
        this.key = key;
    }
    
    
    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }
    
    
    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
        this.custom = custom;
    }
    
    @Deprecated
    public void setType(final com.commercetools.api.models.product_selection.ProductSelectionTypeEnum type){
        this.type = type;
    }
    
    
    public void setMode(final com.commercetools.api.models.product_selection.ProductSelectionMode mode){
        this.mode = mode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductSelectionDraftImpl that = (ProductSelectionDraftImpl) o;
    
        return new EqualsBuilder()
                .append(key, that.key)
                .append(name, that.name)
                .append(custom, that.custom)
                .append(type, that.type)
                .append(mode, that.mode)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(key)
            .append(name)
            .append(custom)
            .append(type)
            .append(mode)
            .toHashCode();
    }

}
