package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributeType;
import com.commercetools.api.generated.models.product_type.ProductTypeReference;
import com.commercetools.api.generated.models.product_type.AttributeNestedTypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

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
   
   public static AttributeNestedTypeImpl of(){
      return new AttributeNestedTypeImpl();
   }
   

   public static AttributeNestedTypeImpl of(final AttributeNestedType template) {
      AttributeNestedTypeImpl instance = new AttributeNestedTypeImpl();
      instance.setTypeReference(template.getTypeReference());
      return instance;
   }

}