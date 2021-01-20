
package com.commercetools.importapi.models.common;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.PriceKeyReference;
import com.commercetools.importapi.models.common.ReferenceType;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PriceKeyReferenceBuilder {

    private String key;

    public PriceKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public PriceKeyReference build() {
        return new PriceKeyReferenceImpl(key);
    }

    public static PriceKeyReferenceBuilder of() {
        return new PriceKeyReferenceBuilder();
    }

    public static PriceKeyReferenceBuilder of(final PriceKeyReference template) {
        PriceKeyReferenceBuilder builder = new PriceKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
