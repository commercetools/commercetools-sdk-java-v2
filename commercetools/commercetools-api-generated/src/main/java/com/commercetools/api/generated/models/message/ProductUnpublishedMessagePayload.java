package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.ProductUnpublishedMessagePayloadImpl;

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
@JsonDeserialize(as = ProductUnpublishedMessagePayloadImpl.class)
public interface ProductUnpublishedMessagePayload extends MessagePayload {


   
   public static ProductUnpublishedMessagePayloadImpl of(){
      return new ProductUnpublishedMessagePayloadImpl();
   }
   

   public static ProductUnpublishedMessagePayloadImpl of(final ProductUnpublishedMessagePayload template) {
      ProductUnpublishedMessagePayloadImpl instance = new ProductUnpublishedMessagePayloadImpl();
      return instance;
   }

}