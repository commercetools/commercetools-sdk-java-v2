package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.ReferenceSetField;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReferenceSetFieldBuilder {


    private java.util.List<com.commercetools.importapi.models.common.KeyReference> value;

    public ReferenceSetFieldBuilder value( final java.util.List<com.commercetools.importapi.models.common.KeyReference> value) {
        this.value = value;
        return this;
    }


    public java.util.List<com.commercetools.importapi.models.common.KeyReference> getValue(){
        return this.value;
    }

    public ReferenceSetField build() {
        return new ReferenceSetFieldImpl(value);
    }

    public static ReferenceSetFieldBuilder of() {
        return new ReferenceSetFieldBuilder();
    }

    public static ReferenceSetFieldBuilder of(final ReferenceSetField template) {
        ReferenceSetFieldBuilder builder = new ReferenceSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
