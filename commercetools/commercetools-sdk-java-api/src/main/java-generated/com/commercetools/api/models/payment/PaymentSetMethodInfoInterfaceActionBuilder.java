
package com.commercetools.api.models.payment;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentSetMethodInfoInterfaceActionBuilder {

    private String _interface;

    public PaymentSetMethodInfoInterfaceActionBuilder _interface(final String _interface) {
        this._interface = _interface;
        return this;
    }

    public String getInterface() {
        return this._interface;
    }

    public PaymentSetMethodInfoInterfaceAction build() {
        return new PaymentSetMethodInfoInterfaceActionImpl(_interface);
    }

    public static PaymentSetMethodInfoInterfaceActionBuilder of() {
        return new PaymentSetMethodInfoInterfaceActionBuilder();
    }

    public static PaymentSetMethodInfoInterfaceActionBuilder of(final PaymentSetMethodInfoInterfaceAction template) {
        PaymentSetMethodInfoInterfaceActionBuilder builder = new PaymentSetMethodInfoInterfaceActionBuilder();
        builder._interface = template.getInterface();
        return builder;
    }

}
