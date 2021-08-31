
package com.commercetools.importapi.models.producttypes;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeMoneyTypeBuilder implements Builder<AttributeMoneyType> {

    public AttributeMoneyType build() {
        return new AttributeMoneyTypeImpl();
    }

    /**
     * builds AttributeMoneyType without checking for non null required values
     */
    public AttributeMoneyType buildUnchecked() {
        return new AttributeMoneyTypeImpl();
    }

    public static AttributeMoneyTypeBuilder of() {
        return new AttributeMoneyTypeBuilder();
    }

    public static AttributeMoneyTypeBuilder of(final AttributeMoneyType template) {
        AttributeMoneyTypeBuilder builder = new AttributeMoneyTypeBuilder();
        return builder;
    }

}
