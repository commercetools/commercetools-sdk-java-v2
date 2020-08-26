package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.LocalizedStringSetField;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LocalizedStringSetFieldBuilder {

    
    private java.util.List<com.commercetools.importapi.models.common.LocalizedString> value;

    public LocalizedStringSetFieldBuilder value( final java.util.List<com.commercetools.importapi.models.common.LocalizedString> value) {
        this.value = value;
        return this;
    }

    
    public java.util.List<com.commercetools.importapi.models.common.LocalizedString> getValue(){
        return this.value;
    }

    public LocalizedStringSetField build() {
        return new LocalizedStringSetFieldImpl(value);
    }

    public static LocalizedStringSetFieldBuilder of() {
        return new LocalizedStringSetFieldBuilder();
    }

    public static LocalizedStringSetFieldBuilder of(final LocalizedStringSetField template) {
        LocalizedStringSetFieldBuilder builder = new LocalizedStringSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
