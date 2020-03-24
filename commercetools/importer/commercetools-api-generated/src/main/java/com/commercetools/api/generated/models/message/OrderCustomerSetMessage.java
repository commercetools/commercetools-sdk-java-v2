package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.customer.CustomerReference;
import com.commercetools.api.generated.models.customer_group.CustomerGroupReference;
import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.message.OrderCustomerSetMessageImpl;

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
@JsonDeserialize(as = OrderCustomerSetMessageImpl.class)
public interface OrderCustomerSetMessage extends Message {

   
   @Valid
   @JsonProperty("customer")
   public CustomerReference getCustomer();
   
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupReference getCustomerGroup();
   
   @Valid
   @JsonProperty("oldCustomer")
   public CustomerReference getOldCustomer();
   
   @Valid
   @JsonProperty("oldCustomerGroup")
   public CustomerGroupReference getOldCustomerGroup();

   public void setCustomer(final CustomerReference customer);
   
   public void setCustomerGroup(final CustomerGroupReference customerGroup);
   
   public void setOldCustomer(final CustomerReference oldCustomer);
   
   public void setOldCustomerGroup(final CustomerGroupReference oldCustomerGroup);
   
   public static OrderCustomerSetMessageImpl of(){
      return new OrderCustomerSetMessageImpl();
   }
   

   public static OrderCustomerSetMessageImpl of(final OrderCustomerSetMessage template) {
      OrderCustomerSetMessageImpl instance = new OrderCustomerSetMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setOldCustomerGroup(template.getOldCustomerGroup());
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setOldCustomer(template.getOldCustomer());
      instance.setCustomer(template.getCustomer());
      return instance;
   }

}