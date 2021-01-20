
package com.commercetools.api.models.product_type;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.product_type.AttributeMoneyType;
import com.commercetools.api.models.product_type.AttributeType;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeMoneyTypeBuilder {

    public AttributeMoneyType build() {
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
