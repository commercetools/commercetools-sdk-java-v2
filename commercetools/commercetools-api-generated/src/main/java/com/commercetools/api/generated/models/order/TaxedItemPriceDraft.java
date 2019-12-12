package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.order.TaxedItemPriceDraftImpl;

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
@JsonDeserialize(as = TaxedItemPriceDraftImpl.class)
public interface TaxedItemPriceDraft  {

   
   @NotNull
   @Valid
   @JsonProperty("totalNet")
   public Money getTotalNet();
   
   @NotNull
   @Valid
   @JsonProperty("totalGross")
   public Money getTotalGross();

   public void setTotalNet(final Money totalNet);
   
   public void setTotalGross(final Money totalGross);
   
   public static TaxedItemPriceDraftImpl of(){
      return new TaxedItemPriceDraftImpl();
   }
   

   public static TaxedItemPriceDraftImpl of(final TaxedItemPriceDraft template) {
      TaxedItemPriceDraftImpl instance = new TaxedItemPriceDraftImpl();
      instance.setTotalGross(template.getTotalGross());
      instance.setTotalNet(template.getTotalNet());
      return instance;
   }

}