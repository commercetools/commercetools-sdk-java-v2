package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentAddInterfaceInteractionAction;
import com.commercetools.api.models.payment.PaymentAddTransactionAction;
import com.commercetools.api.models.payment.PaymentChangeAmountPlannedAction;
import com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdAction;
import com.commercetools.api.models.payment.PaymentChangeTransactionStateAction;
import com.commercetools.api.models.payment.PaymentChangeTransactionTimestampAction;
import com.commercetools.api.models.payment.PaymentSetAmountPaidAction;
import com.commercetools.api.models.payment.PaymentSetAmountRefundedAction;
import com.commercetools.api.models.payment.PaymentSetAnonymousIdAction;
import com.commercetools.api.models.payment.PaymentSetAuthorizationAction;
import com.commercetools.api.models.payment.PaymentSetCustomFieldAction;
import com.commercetools.api.models.payment.PaymentSetCustomTypeAction;
import com.commercetools.api.models.payment.PaymentSetCustomerAction;
import com.commercetools.api.models.payment.PaymentSetExternalIdAction;
import com.commercetools.api.models.payment.PaymentSetInterfaceIdAction;
import com.commercetools.api.models.payment.PaymentSetKeyAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoMethodAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoNameAction;
import com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeAction;
import com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextAction;
import com.commercetools.api.models.payment.PaymentTransitionStateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
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
