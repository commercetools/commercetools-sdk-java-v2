package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderUpdateImpl;

import com.fasterxml.jackson.annotation.*;
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
@JsonDeserialize(as = OrderUpdateImpl.class)
public interface OrderUpdate  {


   @NotNull
   @JsonProperty("version")
   public Long getVersion();

   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<OrderUpdateAction> getActions();

   public void setVersion(final Long version);

   public void setActions(final List<OrderUpdateAction> actions);

   public static OrderUpdateImpl of(){
      return new OrderUpdateImpl();
   }


   public static OrderUpdateImpl of(final OrderUpdate template) {
      OrderUpdateImpl instance = new OrderUpdateImpl();
      instance.setActions(template.getActions());
      instance.setVersion(template.getVersion());
      return instance;
   }

}
