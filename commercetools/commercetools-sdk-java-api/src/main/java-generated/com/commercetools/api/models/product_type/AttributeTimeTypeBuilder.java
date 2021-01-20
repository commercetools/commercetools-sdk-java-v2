
package com.commercetools.api.models.product_type;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.product_type.AttributeTimeType;
import com.commercetools.api.models.product_type.AttributeType;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeTimeTypeBuilder {

    public AttributeTimeType build() {
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
