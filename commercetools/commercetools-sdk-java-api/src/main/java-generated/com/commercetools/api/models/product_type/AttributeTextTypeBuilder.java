
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeTextTypeBuilder implements Builder<AttributeTextType> {

    public AttributeTextType build() {
        return new AttributeTextTypeImpl();
    }

    /**
     * builds AttributeTextType without checking for non null required values
     */
    public AttributeTextType buildUnchecked() {
        return new AttributeTextTypeImpl();
    }

    public static AttributeTextTypeBuilder of() {
        return new AttributeTextTypeBuilder();
    }

    public static AttributeTextTypeBuilder of(final AttributeTextType template) {
        AttributeTextTypeBuilder builder = new AttributeTextTypeBuilder();
        return builder;
    }

}
