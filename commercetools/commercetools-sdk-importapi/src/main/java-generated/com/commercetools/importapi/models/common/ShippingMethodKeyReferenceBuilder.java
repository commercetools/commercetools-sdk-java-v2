package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.ShippingMethodKeyReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingMethodKeyReferenceBuilder {


    private String key;

    public ShippingMethodKeyReferenceBuilder key( final String key) {
        this.key = key;
        return this;
    }


    public String getKey(){
        return this.key;
    }

    public ShippingMethodKeyReference build() {
        return new ShippingMethodKeyReferenceImpl(key);
    }

    public static ShippingMethodKeyReferenceBuilder of() {
        return new ShippingMethodKeyReferenceBuilder();
    }

    public static ShippingMethodKeyReferenceBuilder of(final ShippingMethodKeyReference template) {
        ShippingMethodKeyReferenceBuilder builder = new ShippingMethodKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
