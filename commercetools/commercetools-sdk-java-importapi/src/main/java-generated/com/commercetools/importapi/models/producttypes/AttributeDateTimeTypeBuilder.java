
package com.commercetools.importapi.models.producttypes;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeDateTimeTypeBuilder implements Builder<AttributeDateTimeType> {

    public AttributeDateTimeType build() {
        return new AttributeDateTimeTypeImpl();
    }

    /**
     * builds AttributeDateTimeType without checking for non null required values
     */
    public AttributeDateTimeType buildUnchecked() {
        return new AttributeDateTimeTypeImpl();
    }

    public static AttributeDateTimeTypeBuilder of() {
        return new AttributeDateTimeTypeBuilder();
    }

    public static AttributeDateTimeTypeBuilder of(final AttributeDateTimeType template) {
        AttributeDateTimeTypeBuilder builder = new AttributeDateTimeTypeBuilder();
        return builder;
    }

}
