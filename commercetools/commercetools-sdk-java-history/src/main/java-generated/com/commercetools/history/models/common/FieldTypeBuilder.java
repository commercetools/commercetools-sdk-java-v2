
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class FieldTypeBuilder implements Builder<FieldType> {

    private String name;

    public FieldTypeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public FieldType build() {
        Objects.requireNonNull(name, FieldType.class + ": name is missing");
        return new FieldTypeImpl(name);
    }

    /**
     * builds FieldType without checking for non null required values
     */
    public FieldType buildUnchecked() {
        return new FieldTypeImpl(name);
    }

    public static FieldTypeBuilder of() {
        return new FieldTypeBuilder();
    }

    public static FieldTypeBuilder of(final FieldType template) {
        FieldTypeBuilder builder = new FieldTypeBuilder();
        builder.name = template.getName();
        return builder;
    }

}
