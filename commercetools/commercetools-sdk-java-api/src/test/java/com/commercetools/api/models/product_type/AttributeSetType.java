package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeSetTypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AttributeSetTypeImpl.class)
public interface AttributeSetType extends AttributeType {

    String SET = "set";

    
    @NotNull
    @Valid
    @JsonProperty("elementType")
    public AttributeType getElementType();

    
    public void setElementType(final AttributeType elementType);
    

    public static AttributeSetType of(){
        return new AttributeSetTypeImpl();
    }
    

    public static AttributeSetType of(final AttributeSetType template) {
        AttributeSetTypeImpl instance = new AttributeSetTypeImpl();
        instance.setElementType(template.getElementType());
        return instance;
    }

    public static AttributeSetTypeBuilder builder(){
        return AttributeSetTypeBuilder.of();
    }
    
    public static AttributeSetTypeBuilder builder(final AttributeSetType template){
        return AttributeSetTypeBuilder.of(template);
    }
    

    default <T> T withAttributeSetType(Function<AttributeSetType, T> helper) {
        return helper.apply(this);
    }
}
