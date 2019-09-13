package com.commercetools.models.me;

import com.commercetools.models.me.MyCartUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.me.MyCartRecalculateActionImpl;

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
@JsonDeserialize(as = MyCartRecalculateActionImpl.class)
public interface MyCartRecalculateAction extends MyCartUpdateAction {

   
   
   @JsonProperty("updateProductData")
   public Boolean getUpdateProductData();

   public void setUpdateProductData(final Boolean updateProductData);
   
   public static MyCartRecalculateActionImpl of(){
      return new MyCartRecalculateActionImpl();
   }
   

   public static MyCartRecalculateActionImpl of(final MyCartRecalculateAction template) {
      MyCartRecalculateActionImpl instance = new MyCartRecalculateActionImpl();
      instance.setUpdateProductData(template.getUpdateProductData());
      return instance;
   }

}