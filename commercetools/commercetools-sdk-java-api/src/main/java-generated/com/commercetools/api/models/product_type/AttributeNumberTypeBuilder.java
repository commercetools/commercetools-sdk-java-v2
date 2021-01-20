
package com.commercetools.api.models.product_type;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.product_type.AttributeNumberType;
import com.commercetools.api.models.product_type.AttributeType;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeNumberTypeBuilder {

    public AttributeNumberType build() {
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
