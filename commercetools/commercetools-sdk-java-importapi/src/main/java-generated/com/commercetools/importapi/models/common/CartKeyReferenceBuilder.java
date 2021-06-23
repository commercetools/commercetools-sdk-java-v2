
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartKeyReferenceBuilder {

    private String key;

    public CartKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public CartKeyReference build() {
        return new CartKeyReferenceImpl(key);
    }

    public static CartKeyReferenceBuilder of() {
        return new CartKeyReferenceBuilder();
    }

    public static CartKeyReferenceBuilder of(final CartKeyReference template) {
        CartKeyReferenceBuilder builder = new CartKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
