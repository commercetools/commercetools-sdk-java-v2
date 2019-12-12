package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.FieldType;
import com.commercetools.api.generated.models.type.CustomFieldLocalizedStringTypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = CustomFieldLocalizedStringTypeImpl.class)
public interface CustomFieldLocalizedStringType extends FieldType {


   
   public static CustomFieldLocalizedStringTypeImpl of(){
      return new CustomFieldLocalizedStringTypeImpl();
   }
   

   public static CustomFieldLocalizedStringTypeImpl of(final CustomFieldLocalizedStringType template) {
      CustomFieldLocalizedStringTypeImpl instance = new CustomFieldLocalizedStringTypeImpl();
      return instance;
   }

}