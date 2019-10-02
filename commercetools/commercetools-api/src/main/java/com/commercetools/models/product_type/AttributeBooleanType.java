package com.commercetools.models.product_type;

import com.commercetools.models.product_type.AttributeType;
import com.commercetools.models.product_type.AttributeBooleanTypeImpl;

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
@JsonDeserialize(as = AttributeBooleanTypeImpl.class)
public interface AttributeBooleanType extends AttributeType {


   
   public static AttributeBooleanTypeImpl of(){
      return new AttributeBooleanTypeImpl();
   }
   

   public static AttributeBooleanTypeImpl of(final AttributeBooleanType template) {
      AttributeBooleanTypeImpl instance = new AttributeBooleanTypeImpl();
      return instance;
   }

}