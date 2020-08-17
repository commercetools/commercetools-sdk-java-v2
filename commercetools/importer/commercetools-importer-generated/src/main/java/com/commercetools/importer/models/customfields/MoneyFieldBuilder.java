package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.common.Money;
import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.MoneyField;
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

    
    private com.commercetools.importer.models.common.Money value;

    public MoneyFieldBuilder value( final com.commercetools.importer.models.common.Money value) {
        this.value = value;
        return this;
    }

    
    public com.commercetools.importer.models.common.Money getValue(){
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
