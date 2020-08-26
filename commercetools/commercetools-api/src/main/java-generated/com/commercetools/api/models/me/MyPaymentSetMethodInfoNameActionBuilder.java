package com.commercetools.api.models.me;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.me.MyPaymentUpdateAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyPaymentSetMethodInfoNameActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    public MyPaymentSetMethodInfoNameActionBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }

    public MyPaymentSetMethodInfoNameAction build() {
        return new MyPaymentSetMethodInfoNameActionImpl(name);
    }

    public static MyPaymentSetMethodInfoNameActionBuilder of() {
        return new MyPaymentSetMethodInfoNameActionBuilder();
    }

    public static MyPaymentSetMethodInfoNameActionBuilder of(final MyPaymentSetMethodInfoNameAction template) {
        MyPaymentSetMethodInfoNameActionBuilder builder = new MyPaymentSetMethodInfoNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
