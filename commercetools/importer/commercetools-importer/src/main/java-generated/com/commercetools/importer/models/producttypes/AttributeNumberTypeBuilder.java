package com.commercetools.importer.models.producttypes;

import com.commercetools.importer.models.producttypes.AttributeType;
import com.commercetools.importer.models.producttypes.AttributeNumberType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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
