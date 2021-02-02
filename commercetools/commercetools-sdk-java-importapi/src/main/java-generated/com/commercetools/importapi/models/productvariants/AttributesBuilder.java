
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributesBuilder {

    private Map<String, com.commercetools.importapi.models.productvariants.Attribute> values;

    public AttributesBuilder values(
            final Map<String, com.commercetools.importapi.models.productvariants.Attribute> values) {
        this.values = values;
        return this;
    }

    public AttributesBuilder addValue(final String key,
            final com.commercetools.importapi.models.productvariants.Attribute value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public Map<String, com.commercetools.importapi.models.productvariants.Attribute> getValues() {
        return this.values;
    }

    public Attributes build() {
        return new AttributesImpl(values);
    }

    public static AttributesBuilder of() {
        return new AttributesBuilder();
    }

    public static AttributesBuilder of(final Attributes template) {
        AttributesBuilder builder = new AttributesBuilder();
        builder.values = template.values();
        return builder;
    }

}
