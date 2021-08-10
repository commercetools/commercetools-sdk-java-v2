
package com.commercetools.importapi.models.producttypes;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeNumberTypeBuilder implements Builder<AttributeNumberType> {

    public AttributeNumberType build() {
        return new AttributeNumberTypeImpl();
    }

    /**
     * builds AttributeNumberType without checking for non null required values
     */
    public AttributeNumberType buildUnchecked() {
        return new AttributeNumberTypeImpl();
    }

    public static AttributeNumberTypeBuilder of() {
        return new AttributeNumberTypeBuilder();
    }

    public static AttributeNumberTypeBuilder of(final AttributeNumberType template) {
        AttributeNumberTypeBuilder builder = new AttributeNumberTypeBuilder();
        return builder;
    }

}
