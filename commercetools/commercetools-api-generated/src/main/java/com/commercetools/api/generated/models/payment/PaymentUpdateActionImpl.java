package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.payment.PaymentAddInterfaceInteractionAction;
import com.commercetools.api.generated.models.payment.PaymentAddTransactionAction;
import com.commercetools.api.generated.models.payment.PaymentChangeAmountPlannedAction;
import com.commercetools.api.generated.models.payment.PaymentChangeTransactionInteractionIdAction;
import com.commercetools.api.generated.models.payment.PaymentChangeTransactionStateAction;
import com.commercetools.api.generated.models.payment.PaymentChangeTransactionTimestampAction;
import com.commercetools.api.generated.models.payment.PaymentSetAmountPaidAction;
import com.commercetools.api.generated.models.payment.PaymentSetAmountRefundedAction;
import com.commercetools.api.generated.models.payment.PaymentSetAnonymousIdAction;
import com.commercetools.api.generated.models.payment.PaymentSetAuthorizationAction;
import com.commercetools.api.generated.models.payment.PaymentSetCustomFieldAction;
import com.commercetools.api.generated.models.payment.PaymentSetCustomTypeAction;
import com.commercetools.api.generated.models.payment.PaymentSetCustomerAction;
import com.commercetools.api.generated.models.payment.PaymentSetExternalIdAction;
import com.commercetools.api.generated.models.payment.PaymentSetInterfaceIdAction;
import com.commercetools.api.generated.models.payment.PaymentSetKeyAction;
import com.commercetools.api.generated.models.payment.PaymentSetMethodInfoInterfaceAction;
import com.commercetools.api.generated.models.payment.PaymentSetMethodInfoMethodAction;
import com.commercetools.api.generated.models.payment.PaymentSetMethodInfoNameAction;
import com.commercetools.api.generated.models.payment.PaymentSetStatusInterfaceCodeAction;
import com.commercetools.api.generated.models.payment.PaymentSetStatusInterfaceTextAction;
import com.commercetools.api.generated.models.payment.PaymentTransitionStateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentUpdateActionImpl implements PaymentUpdateAction {

   private String action;

   @JsonCreator
   PaymentUpdateActionImpl() {
      this.action = "null";
   }
   
   
   
   public String getAction(){
      return this.action;
   }


}