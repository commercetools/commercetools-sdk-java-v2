
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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

    public static MyPaymentUpdateActionBuilder of() {
        return new MyPaymentUpdateActionBuilder();
    }
}
