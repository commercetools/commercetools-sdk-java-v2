package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.common.ResourceIdentifier;
import com.commercetools.api.generated.models.order.OrderResourceIdentifierImpl;

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
@JsonDeserialize(as = OrderResourceIdentifierImpl.class)
public interface OrderResourceIdentifier extends ResourceIdentifier {


   
   public static OrderResourceIdentifierImpl of(){
      return new OrderResourceIdentifierImpl();
   }
   

   public static OrderResourceIdentifierImpl of(final OrderResourceIdentifier template) {
      OrderResourceIdentifierImpl instance = new OrderResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}