package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributeType;
import com.commercetools.api.generated.models.product_type.AttributeTextTypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = AttributeTextTypeImpl.class)
public interface AttributeTextType extends AttributeType {


   
   public static AttributeTextTypeImpl of(){
      return new AttributeTextTypeImpl();
   }
   

   public static AttributeTextTypeImpl of(final AttributeTextType template) {
      AttributeTextTypeImpl instance = new AttributeTextTypeImpl();
      return instance;
   }

}