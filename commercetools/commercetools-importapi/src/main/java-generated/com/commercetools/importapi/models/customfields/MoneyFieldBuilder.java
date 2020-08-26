package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.MoneyField;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MoneyFieldBuilder {

    
    private com.commercetools.importapi.models.common.TypedMoney value;

    public MoneyFieldBuilder value( final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    
    public com.commercetools.importapi.models.common.TypedMoney getValue(){
        return this.value;
    }

    public MoneyField build() {
        return new MoneyFieldImpl(value);
    }

    public static MoneyFieldBuilder of() {
        return new MoneyFieldBuilder();
    }

    public static MoneyFieldBuilder of(final MoneyField template) {
        MoneyFieldBuilder builder = new MoneyFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
