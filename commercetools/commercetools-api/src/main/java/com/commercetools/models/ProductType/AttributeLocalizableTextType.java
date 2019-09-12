package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeType;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeLocalizableTextTypeImpl;

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
@JsonDeserialize(as = AttributeLocalizableTextTypeImpl.class)
public interface AttributeLocalizableTextType extends AttributeType {


   
   public static AttributeLocalizableTextTypeImpl of(){
      return new AttributeLocalizableTextTypeImpl();
   }
   

   public static AttributeLocalizableTextTypeImpl of(final AttributeLocalizableTextType template) {
      AttributeLocalizableTextTypeImpl instance = new AttributeLocalizableTextTypeImpl();
      return instance;
   }

}