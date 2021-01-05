package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.product_type.AttributeNestedTypeImpl;

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
@JsonDeserialize(as = AttributeNestedTypeImpl.class)
public interface AttributeNestedType extends AttributeType {

    
    @NotNull
    @Valid
    @JsonProperty("typeReference")
    public ProductTypeReference getTypeReference();

    public void setTypeReference(final ProductTypeReference typeReference);

    public static AttributeNestedType of(){
        return new AttributeNestedTypeImpl();
    }
    

    public static AttributeNestedType of(final AttributeNestedType template) {
        AttributeNestedTypeImpl instance = new AttributeNestedTypeImpl();
        instance.setTypeReference(template.getTypeReference());
        return instance;
    }

    public static AttributeNestedTypeBuilder builder(){
        return AttributeNestedTypeBuilder.of();
    }
    
    public static AttributeNestedTypeBuilder builder(final AttributeNestedType template){
        return AttributeNestedTypeBuilder.of(template);
    }
    

    default <T> T withAttributeNestedType(Function<AttributeNestedType, T> helper) {
        return helper.apply(this);
    }
}
