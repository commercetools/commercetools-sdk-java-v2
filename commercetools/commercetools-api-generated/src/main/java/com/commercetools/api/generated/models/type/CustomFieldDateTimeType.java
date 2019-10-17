package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.FieldType;
import com.commercetools.api.generated.models.type.CustomFieldDateTimeTypeImpl;

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
@JsonDeserialize(as = CustomFieldDateTimeTypeImpl.class)
public interface CustomFieldDateTimeType extends FieldType {


   
   public static CustomFieldDateTimeTypeImpl of(){
      return new CustomFieldDateTimeTypeImpl();
   }
   

   public static CustomFieldDateTimeTypeImpl of(final CustomFieldDateTimeType template) {
      CustomFieldDateTimeTypeImpl instance = new CustomFieldDateTimeTypeImpl();
      return instance;
   }

}