package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountValueDraft;
import com.commercetools.api.models.product_discount.ProductDiscountValueExternalDraftImpl;

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
@JsonDeserialize(as = ProductDiscountValueExternalDraftImpl.class)
public interface ProductDiscountValueExternalDraft extends ProductDiscountValueDraft {



   public static ProductDiscountValueExternalDraftImpl of(){
      return new ProductDiscountValueExternalDraftImpl();
   }


   public static ProductDiscountValueExternalDraftImpl of(final ProductDiscountValueExternalDraft template) {
      ProductDiscountValueExternalDraftImpl instance = new ProductDiscountValueExternalDraftImpl();
      return instance;
   }

}
