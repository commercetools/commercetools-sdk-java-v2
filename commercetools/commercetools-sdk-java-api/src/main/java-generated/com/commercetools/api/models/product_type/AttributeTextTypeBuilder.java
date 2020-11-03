package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.AttributeTextType;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeTextTypeBuilder {




    public AttributeTextType build() {
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
