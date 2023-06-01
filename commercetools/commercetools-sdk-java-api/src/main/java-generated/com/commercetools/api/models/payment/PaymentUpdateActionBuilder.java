package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentAddInterfaceInteractionAction;
import com.commercetools.api.models.payment.PaymentAddTransactionAction;
import com.commercetools.api.models.payment.PaymentChangeAmountPlannedAction;
import com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdAction;
import com.commercetools.api.models.payment.PaymentChangeTransactionStateAction;
import com.commercetools.api.models.payment.PaymentChangeTransactionTimestampAction;
import com.commercetools.api.models.payment.PaymentSetAnonymousIdAction;
import com.commercetools.api.models.payment.PaymentSetCustomFieldAction;
import com.commercetools.api.models.payment.PaymentSetCustomTypeAction;
import com.commercetools.api.models.payment.PaymentSetCustomerAction;
import com.commercetools.api.models.payment.PaymentSetInterfaceIdAction;
import com.commercetools.api.models.payment.PaymentSetKeyAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoMethodAction;
import com.commercetools.api.models.payment.PaymentSetMethodInfoNameAction;
import com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeAction;
import com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextAction;
import com.commercetools.api.models.payment.PaymentSetTransactionCustomFieldAction;
import com.commercetools.api.models.payment.PaymentSetTransactionCustomTypeAction;
import com.commercetools.api.models.payment.PaymentTransitionStateAction;
import com.commercetools.api.models.payment.PaymentUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentUpdateActionBuilder {

    public com.commercetools.api.models.payment.PaymentAddInterfaceInteractionActionBuilder addInterfaceInteractionBuilder() {
       return com.commercetools.api.models.payment.PaymentAddInterfaceInteractionActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentAddTransactionActionBuilder addTransactionBuilder() {
       return com.commercetools.api.models.payment.PaymentAddTransactionActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentChangeAmountPlannedActionBuilder changeAmountPlannedBuilder() {
       return com.commercetools.api.models.payment.PaymentChangeAmountPlannedActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdActionBuilder changeTransactionInteractionIdBuilder() {
       return com.commercetools.api.models.payment.PaymentChangeTransactionInteractionIdActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentChangeTransactionStateActionBuilder changeTransactionStateBuilder() {
       return com.commercetools.api.models.payment.PaymentChangeTransactionStateActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentChangeTransactionTimestampActionBuilder changeTransactionTimestampBuilder() {
       return com.commercetools.api.models.payment.PaymentChangeTransactionTimestampActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentSetAnonymousIdActionBuilder setAnonymousIdBuilder() {
       return com.commercetools.api.models.payment.PaymentSetAnonymousIdActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.payment.PaymentSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.payment.PaymentSetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentSetCustomerActionBuilder setCustomerBuilder() {
       return com.commercetools.api.models.payment.PaymentSetCustomerActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentSetInterfaceIdActionBuilder setInterfaceIdBuilder() {
       return com.commercetools.api.models.payment.PaymentSetInterfaceIdActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentSetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.payment.PaymentSetKeyActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceActionBuilder setMethodInfoInterfaceBuilder() {
       return com.commercetools.api.models.payment.PaymentSetMethodInfoInterfaceActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentSetMethodInfoMethodActionBuilder setMethodInfoMethodBuilder() {
       return com.commercetools.api.models.payment.PaymentSetMethodInfoMethodActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentSetMethodInfoNameActionBuilder setMethodInfoNameBuilder() {
       return com.commercetools.api.models.payment.PaymentSetMethodInfoNameActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeActionBuilder setStatusInterfaceCodeBuilder() {
       return com.commercetools.api.models.payment.PaymentSetStatusInterfaceCodeActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextActionBuilder setStatusInterfaceTextBuilder() {
       return com.commercetools.api.models.payment.PaymentSetStatusInterfaceTextActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentSetTransactionCustomFieldActionBuilder setTransactionCustomFieldBuilder() {
       return com.commercetools.api.models.payment.PaymentSetTransactionCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentSetTransactionCustomTypeActionBuilder setTransactionCustomTypeBuilder() {
       return com.commercetools.api.models.payment.PaymentSetTransactionCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.payment.PaymentTransitionStateActionBuilder transitionStateBuilder() {
       return com.commercetools.api.models.payment.PaymentTransitionStateActionBuilder.of();
    }

    /**
     * factory method for an instance of PaymentUpdateActionBuilder
     * @return builder 
     */
    public static PaymentUpdateActionBuilder of() {
        return new PaymentUpdateActionBuilder();
    }

}
