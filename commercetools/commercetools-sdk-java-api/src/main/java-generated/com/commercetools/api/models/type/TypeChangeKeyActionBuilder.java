
package com.commercetools.api.models.type;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.TypeChangeKeyAction;
import com.commercetools.api.models.type.TypeUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeChangeKeyActionBuilder {

    private String key;

    public TypeChangeKeyActionBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public TypeChangeKeyAction build() {
        return new TypeChangeKeyActionImpl(key);
    }

    public static TypeChangeKeyActionBuilder of() {
        return new TypeChangeKeyActionBuilder();
    }

    public static TypeChangeKeyActionBuilder of(final TypeChangeKeyAction template) {
        TypeChangeKeyActionBuilder builder = new TypeChangeKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
