package com.commercetools.api.models.message;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.OrderCustomerGroupSetMessageImpl;

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
@JsonDeserialize(as = OrderCustomerGroupSetMessageImpl.class)
public interface OrderCustomerGroupSetMessage extends Message {

   
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupReference getCustomerGroup();
   
   @Valid
   @JsonProperty("oldCustomerGroup")
   public CustomerGroupReference getOldCustomerGroup();

   public void setCustomerGroup(final CustomerGroupReference customerGroup);
   
   public void setOldCustomerGroup(final CustomerGroupReference oldCustomerGroup);
   
   public static OrderCustomerGroupSetMessageImpl of(){
      return new OrderCustomerGroupSetMessageImpl();
   }
   

   public static OrderCustomerGroupSetMessageImpl of(final OrderCustomerGroupSetMessage template) {
      OrderCustomerGroupSetMessageImpl instance = new OrderCustomerGroupSetMessageImpl();
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setOldCustomerGroup(template.getOldCustomerGroup());
      return instance;
   }

}
