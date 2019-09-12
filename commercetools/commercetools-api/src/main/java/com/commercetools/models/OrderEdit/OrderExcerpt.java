package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.TaxedPrice;
import com.commercetools.models.Common.Money;
import java.lang.Integer;
import com.commercetools.models.OrderEdit.OrderExcerptImpl;

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
@JsonDeserialize(as = OrderExcerptImpl.class)
public interface OrderExcerpt  {

   
   @NotNull
   @Valid
   @JsonProperty("totalPrice")
   public Money getTotalPrice();
   
   @Valid
   @JsonProperty("taxedPrice")
   public TaxedPrice getTaxedPrice();
   
   @NotNull
   @JsonProperty("version")
   public Integer getVersion();

   public void setTotalPrice(final Money totalPrice);
   
   public void setTaxedPrice(final TaxedPrice taxedPrice);
   
   public void setVersion(final Integer version);
   
   public static OrderExcerptImpl of(){
      return new OrderExcerptImpl();
   }
   

   public static OrderExcerptImpl of(final OrderExcerpt template) {
      OrderExcerptImpl instance = new OrderExcerptImpl();
      instance.setTotalPrice(template.getTotalPrice());
      instance.setTaxedPrice(template.getTaxedPrice());
      instance.setVersion(template.getVersion());
      return instance;
   }

}