package com.commercetools.history.models.label;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.label.Label;
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
 * ProductLabel
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductLabelImpl implements ProductLabel, ModelBase {

    
    private String type;
    
    
    private com.commercetools.history.models.common.LocalizedString slug;
    
    
    private com.commercetools.history.models.common.LocalizedString name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductLabelImpl(@JsonProperty("slug") final com.commercetools.history.models.common.LocalizedString slug, @JsonProperty("name") final com.commercetools.history.models.common.LocalizedString name) {
        this.slug = slug;
        this.name = name;
        this.type =  PRODUCT_LABEL;
    }
    /**
     * create empty instance
     */
    public ProductLabelImpl() {
        this.type =  PRODUCT_LABEL;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.LocalizedString getSlug(){
        return this.slug;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.LocalizedString getName(){
        return this.name;
    }

    
    public void setSlug(final com.commercetools.history.models.common.LocalizedString slug){
        this.slug = slug;
    }
    
    
    public void setName(final com.commercetools.history.models.common.LocalizedString name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductLabelImpl that = (ProductLabelImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(slug, that.slug)
                .append(name, that.name)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(slug)
            .append(name)
            .toHashCode();
    }

}
