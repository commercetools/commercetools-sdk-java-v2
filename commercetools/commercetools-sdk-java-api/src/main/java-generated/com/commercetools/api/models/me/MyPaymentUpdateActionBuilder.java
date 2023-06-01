package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyPaymentAddTransactionAction;
import com.commercetools.api.models.me.MyPaymentChangeAmountPlannedAction;
import com.commercetools.api.models.me.MyPaymentSetCustomFieldAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoInterfaceAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoMethodAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoNameAction;
import com.commercetools.api.models.me.MyPaymentSetTransactionCustomFieldAction;
import com.commercetools.api.models.me.MyPaymentUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyPaymentUpdateActionBuilder {

    public com.commercetools.api.models.me.MyPaymentAddTransactionActionBuilder addTransactionBuilder() {
       return com.commercetools.api.models.me.MyPaymentAddTransactionActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyPaymentChangeAmountPlannedActionBuilder changeAmountPlannedBuilder() {
       return com.commercetools.api.models.me.MyPaymentChangeAmountPlannedActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyPaymentSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.me.MyPaymentSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyPaymentSetMethodInfoInterfaceActionBuilder setMethodInfoInterfaceBuilder() {
       return com.commercetools.api.models.me.MyPaymentSetMethodInfoInterfaceActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyPaymentSetMethodInfoMethodActionBuilder setMethodInfoMethodBuilder() {
       return com.commercetools.api.models.me.MyPaymentSetMethodInfoMethodActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyPaymentSetMethodInfoNameActionBuilder setMethodInfoNameBuilder() {
       return com.commercetools.api.models.me.MyPaymentSetMethodInfoNameActionBuilder.of();
    }
    public com.commercetools.api.models.me.MyPaymentSetTransactionCustomFieldActionBuilder setTransactionCustomFieldBuilder() {
       return com.commercetools.api.models.me.MyPaymentSetTransactionCustomFieldActionBuilder.of();
    }

    /**
     * factory method for an instance of MyPaymentUpdateActionBuilder
     * @return builder 
     */
    public static MyPaymentUpdateActionBuilder of() {
        return new MyPaymentUpdateActionBuilder();
    }

}
