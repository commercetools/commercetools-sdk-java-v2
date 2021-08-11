
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyPaymentSetMethodInfoInterfaceActionBuilder
        implements Builder<MyPaymentSetMethodInfoInterfaceAction> {

    private String _interface;

    public MyPaymentSetMethodInfoInterfaceActionBuilder _interface(final String _interface) {
        this._interface = _interface;
        return this;
    }

    public String getInterface() {
        return this._interface;
    }

    public MyPaymentSetMethodInfoInterfaceAction build() {
        Objects.requireNonNull(_interface, MyPaymentSetMethodInfoInterfaceAction.class + ": interface is missing");
        return new MyPaymentSetMethodInfoInterfaceActionImpl(_interface);
    }

    /**
     * builds MyPaymentSetMethodInfoInterfaceAction without checking for non null required values
     */
    public MyPaymentSetMethodInfoInterfaceAction buildUnchecked() {
        return new MyPaymentSetMethodInfoInterfaceActionImpl(_interface);
    }

    public static MyPaymentSetMethodInfoInterfaceActionBuilder of() {
        return new MyPaymentSetMethodInfoInterfaceActionBuilder();
    }

    public static MyPaymentSetMethodInfoInterfaceActionBuilder of(
            final MyPaymentSetMethodInfoInterfaceAction template) {
        MyPaymentSetMethodInfoInterfaceActionBuilder builder = new MyPaymentSetMethodInfoInterfaceActionBuilder();
        builder._interface = template.getInterface();
        return builder;
    }

}
