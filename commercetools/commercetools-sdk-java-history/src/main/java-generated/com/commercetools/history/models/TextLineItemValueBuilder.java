
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TextLineItemValueBuilder {

    private String id;

    private com.commercetools.history.models.LocalizedString name;

    public TextLineItemValueBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public TextLineItemValueBuilder name(final com.commercetools.history.models.LocalizedString name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.LocalizedString getName() {
        return this.name;
    }

    public TextLineItemValue build() {
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
