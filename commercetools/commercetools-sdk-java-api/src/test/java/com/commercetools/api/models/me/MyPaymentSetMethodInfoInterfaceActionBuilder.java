package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyPaymentUpdateAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoInterfaceAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyPaymentSetMethodInfoInterfaceActionBuilder {

    
    
    private String _interface;

    
    public MyPaymentSetMethodInfoInterfaceActionBuilder _interface( final String _interface) {
        this._interface = _interface;
        return this;
    }

    
    
    public String getInterface(){
        return this._interface;
    }

    public MyPaymentSetMethodInfoInterfaceAction build() {
        return new MyPaymentSetMethodInfoInterfaceActionImpl(_interface);
    }

    public static MyPaymentSetMethodInfoInterfaceActionBuilder of() {
        return new MyPaymentSetMethodInfoInterfaceActionBuilder();
    }

    public static MyPaymentSetMethodInfoInterfaceActionBuilder of(final MyPaymentSetMethodInfoInterfaceAction template) {
        MyPaymentSetMethodInfoInterfaceActionBuilder builder = new MyPaymentSetMethodInfoInterfaceActionBuilder();
        builder._interface = template.getInterface();
        return builder;
    }

}
