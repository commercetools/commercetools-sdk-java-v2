package com.commercetools.models.OrderEdit;

import java.lang.Integer;
import com.commercetools.models.OrderEdit.OrderEditApplyImpl;

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
@JsonDeserialize(as = OrderEditApplyImpl.class)
public interface OrderEditApply  {

   
   @NotNull
   @JsonProperty("editVersion")
   public Integer getEditVersion();
   
   @NotNull
   @JsonProperty("resourceVersion")
   public Integer getResourceVersion();

   public void setEditVersion(final Integer editVersion);
   
   public void setResourceVersion(final Integer resourceVersion);
   
   public static OrderEditApplyImpl of(){
      return new OrderEditApplyImpl();
   }
   

   public static OrderEditApplyImpl of(final OrderEditApply template) {
      OrderEditApplyImpl instance = new OrderEditApplyImpl();
      instance.setResourceVersion(template.getResourceVersion());
      instance.setEditVersion(template.getEditVersion());
      return instance;
   }

}