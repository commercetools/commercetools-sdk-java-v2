
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxCategoryKeyReferenceBuilder {

    private String key;

    public TaxCategoryKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public TaxCategoryKeyReference build() {
        return new TaxCategoryKeyReferenceImpl(key);
    }

    public static TaxCategoryKeyReferenceBuilder of() {
        return new TaxCategoryKeyReferenceBuilder();
    }

    public static TaxCategoryKeyReferenceBuilder of(final TaxCategoryKeyReference template) {
        TaxCategoryKeyReferenceBuilder builder = new TaxCategoryKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
