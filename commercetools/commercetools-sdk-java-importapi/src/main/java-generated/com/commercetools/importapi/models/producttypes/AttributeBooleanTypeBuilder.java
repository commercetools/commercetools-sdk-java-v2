
package com.commercetools.importapi.models.producttypes;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeBooleanTypeBuilder implements Builder<AttributeBooleanType> {

    public AttributeBooleanType build() {
        return new AttributeBooleanTypeImpl();
    }

    /**
     * builds AttributeBooleanType without checking for non null required values
     */
    public AttributeBooleanType buildUnchecked() {
        return new AttributeBooleanTypeImpl();
    }

    public static AttributeBooleanTypeBuilder of() {
        return new AttributeBooleanTypeBuilder();
    }

    public static AttributeBooleanTypeBuilder of(final AttributeBooleanType template) {
        AttributeBooleanTypeBuilder builder = new AttributeBooleanTypeBuilder();
        return builder;
    }

}
