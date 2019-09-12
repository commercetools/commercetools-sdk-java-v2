package com.commercetools.models.Type;

import com.commercetools.models.Type.TypeTextInputHint;
import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeChangeInputHintActionImpl;

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
@JsonDeserialize(as = TypeChangeInputHintActionImpl.class)
public interface TypeChangeInputHintAction extends TypeUpdateAction {

   
   @NotNull
   @JsonProperty("fieldName")
   public String getFieldName();
   
   @NotNull
   @JsonProperty("inputHint")
   public TypeTextInputHint getInputHint();

   public void setFieldName(final String fieldName);
   
   public void setInputHint(final TypeTextInputHint inputHint);
   
   public static TypeChangeInputHintActionImpl of(){
      return new TypeChangeInputHintActionImpl();
   }
   

   public static TypeChangeInputHintActionImpl of(final TypeChangeInputHintAction template) {
      TypeChangeInputHintActionImpl instance = new TypeChangeInputHintActionImpl();
      instance.setFieldName(template.getFieldName());
      instance.setInputHint(template.getInputHint());
      return instance;
   }

}