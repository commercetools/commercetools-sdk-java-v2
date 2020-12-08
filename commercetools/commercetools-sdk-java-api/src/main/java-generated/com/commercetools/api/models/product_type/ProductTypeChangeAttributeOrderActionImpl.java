package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeDefinition;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeChangeAttributeOrderActionImpl implements ProductTypeChangeAttributeOrderAction {

    private String action;
    
    private java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> attributes;

    @JsonCreator
    ProductTypeChangeAttributeOrderActionImpl(@JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> attributes) {
        this.attributes = attributes;
        this.action = "changeAttributeOrder";
    }
    public ProductTypeChangeAttributeOrderActionImpl() {
        this.action = "changeAttributeOrder";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> getAttributes(){
        return this.attributes;
    }

    public void setAttributes(final com.commercetools.api.models.product_type.AttributeDefinition ...attributes){
       this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }
    
    public void setAttributes(final java.util.List<com.commercetools.api.models.product_type.AttributeDefinition> attributes){
       this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductTypeChangeAttributeOrderActionImpl that = (ProductTypeChangeAttributeOrderActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(attributes, that.attributes)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(attributes)
            .toHashCode();
    }

}
