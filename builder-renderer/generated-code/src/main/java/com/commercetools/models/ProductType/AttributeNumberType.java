package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeType;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeNumberTypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AttributeNumberTypeImpl.class)
public interface AttributeNumberType extends AttributeType {


   
   public static AttributeNumberTypeImpl of(){
      return new AttributeNumberTypeImpl();
   }
   

   public static AttributeNumberTypeImpl of(final AttributeNumberType template) {
      AttributeNumberTypeImpl instance = new AttributeNumberTypeImpl();
      return instance;
   }

}