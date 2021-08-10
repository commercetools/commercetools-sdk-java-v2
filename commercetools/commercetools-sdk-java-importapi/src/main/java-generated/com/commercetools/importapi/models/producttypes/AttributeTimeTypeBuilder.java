
package com.commercetools.importapi.models.producttypes;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeTimeTypeBuilder implements Builder<AttributeTimeType> {

    public AttributeTimeType build() {
        return new AttributeTimeTypeImpl();
    }

    /**
     * builds AttributeTimeType without checking for non null required values
     */
    public AttributeTimeType buildUnchecked() {
        return new AttributeTimeTypeImpl();
    }

    public static AttributeTimeTypeBuilder of() {
        return new AttributeTimeTypeBuilder();
    }

    public static AttributeTimeTypeBuilder of(final AttributeTimeType template) {
        AttributeTimeTypeBuilder builder = new AttributeTimeTypeBuilder();
        return builder;
    }

}
