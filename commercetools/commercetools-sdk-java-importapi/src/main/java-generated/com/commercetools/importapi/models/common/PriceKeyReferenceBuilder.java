
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PriceKeyReferenceBuilder implements Builder<PriceKeyReference> {

    private String key;

    public PriceKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public PriceKeyReference build() {
        Objects.requireNonNull(key, PriceKeyReference.class + ": key is missing");
        return new PriceKeyReferenceImpl(key);
    }

    /**
     * builds PriceKeyReference without checking for non null required values
     */
    public PriceKeyReference buildUnchecked() {
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
