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
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * PaymentUpdateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentUpdateActionImpl implements PaymentUpdateAction, ModelBase {

    
    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    /**
     * create empty instance
     */
    public PaymentUpdateActionImpl() {
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        PaymentUpdateActionImpl that = (PaymentUpdateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .toHashCode();
    }

}
