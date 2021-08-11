
package com.commercetools.importapi.models.producttypes;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeDateTypeBuilder implements Builder<AttributeDateType> {

    public AttributeDateType build() {
        return new AttributeDateTypeImpl();
    }

    /**
     * builds AttributeDateType without checking for non null required values
     */
    public AttributeDateType buildUnchecked() {
        return new AttributeDateTypeImpl();
    }

    public static AttributeDateTypeBuilder of() {
        return new AttributeDateTypeBuilder();
    }

    public static AttributeDateTypeBuilder of(final AttributeDateType template) {
        AttributeDateTypeBuilder builder = new AttributeDateTypeBuilder();
        return builder;
    }

}
