
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeChangeInputHintActionBuilder {

    private String fieldName;

    private com.commercetools.api.models.type.TypeTextInputHint inputHint;

    public TypeChangeInputHintActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public TypeChangeInputHintActionBuilder inputHint(
            final com.commercetools.api.models.type.TypeTextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public com.commercetools.api.models.type.TypeTextInputHint getInputHint() {
        return this.inputHint;
    }

    public TypeChangeInputHintAction build() {
        return new TypeChangeInputHintActionImpl(fieldName, inputHint);
    }

    public static TypeChangeInputHintActionBuilder of() {
        return new TypeChangeInputHintActionBuilder();
    }

    public static TypeChangeInputHintActionBuilder of(final TypeChangeInputHintAction template) {
        TypeChangeInputHintActionBuilder builder = new TypeChangeInputHintActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.inputHint = template.getInputHint();
        return builder;
    }

}
