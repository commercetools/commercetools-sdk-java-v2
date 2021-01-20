
package com.commercetools.importapi.models.producttypes;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.producttypes.AttributeLocalizableTextType;
import com.commercetools.importapi.models.producttypes.AttributeType;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeLocalizableTextTypeBuilder {

    public AttributeLocalizableTextType build() {
        return new AttributeLocalizableTextTypeImpl();
    }

    public static AttributeLocalizableTextTypeBuilder of() {
        return new AttributeLocalizableTextTypeBuilder();
    }

    public static AttributeLocalizableTextTypeBuilder of(final AttributeLocalizableTextType template) {
        AttributeLocalizableTextTypeBuilder builder = new AttributeLocalizableTextTypeBuilder();
        return builder;
    }

}
