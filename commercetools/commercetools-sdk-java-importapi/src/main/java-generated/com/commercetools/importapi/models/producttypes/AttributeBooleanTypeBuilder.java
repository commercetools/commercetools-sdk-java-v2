
package com.commercetools.importapi.models.producttypes;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.producttypes.AttributeBooleanType;
import com.commercetools.importapi.models.producttypes.AttributeType;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeBooleanTypeBuilder {

    public AttributeBooleanType build() {
        return new AttributeBooleanTypeImpl();
    }

    public static AttributeBooleanTypeBuilder of() {
        return new AttributeBooleanTypeBuilder();
    }

    public static AttributeBooleanTypeBuilder of(final AttributeBooleanType template) {
        AttributeBooleanTypeBuilder builder = new AttributeBooleanTypeBuilder();
        return builder;
    }

}
