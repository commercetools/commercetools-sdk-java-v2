
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TextLineItemValueBuilder implements Builder<TextLineItemValue> {

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    public TextLineItemValueBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public TextLineItemValueBuilder name(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public TextLineItemValueBuilder name(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    public TextLineItemValue build() {
        Objects.requireNonNull(id, TextLineItemValue.class + ": id is missing");
        Objects.requireNonNull(name, TextLineItemValue.class + ": name is missing");
        return new TextLineItemValueImpl(id, name);
    }

    /**
     * builds TextLineItemValue without checking for non null required values
     */
    public TextLineItemValue buildUnchecked() {
        return new TextLineItemValueImpl(id, name);
    }

    public static TextLineItemValueBuilder of() {
        return new TextLineItemValueBuilder();
    }

    public static TextLineItemValueBuilder of(final TextLineItemValue template) {
        TextLineItemValueBuilder builder = new TextLineItemValueBuilder();
        builder.id = template.getId();
        builder.name = template.getName();
        return builder;
    }

}
