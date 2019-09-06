package com.commercetools.models.Type;

import com.commercetools.models.Type.FieldType;
import java.lang.String;
import com.commercetools.models.Type.CustomFieldTimeTypeImpl;

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
@JsonDeserialize(as = CustomFieldTimeTypeImpl.class)
public interface CustomFieldTimeType extends FieldType {


   
   public static CustomFieldTimeTypeImpl of(){
      return new CustomFieldTimeTypeImpl();
   }
   

   public static CustomFieldTimeTypeImpl of(final CustomFieldTimeType template) {
      CustomFieldTimeTypeImpl instance = new CustomFieldTimeTypeImpl();
      return instance;
   }

}