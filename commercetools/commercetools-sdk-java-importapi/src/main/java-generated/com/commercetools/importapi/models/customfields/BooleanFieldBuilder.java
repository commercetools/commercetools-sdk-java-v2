package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.BooleanField;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class BooleanFieldBuilder {

    
    private Boolean value;

    public BooleanFieldBuilder value( final Boolean value) {
        this.value = value;
        return this;
    }

    
    public Boolean getValue(){
        return this.value;
    }

    public BooleanField build() {
        return new BooleanFieldImpl(value);
    }

    public static BooleanFieldBuilder of() {
        return new BooleanFieldBuilder();
    }

    public static BooleanFieldBuilder of(final BooleanField template) {
        BooleanFieldBuilder builder = new BooleanFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
