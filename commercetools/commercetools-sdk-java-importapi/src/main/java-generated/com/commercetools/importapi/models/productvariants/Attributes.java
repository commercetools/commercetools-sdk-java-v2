
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributesImpl.class)
public interface Attributes {

    /**
    *  <p>The name of the attribute is given by the key and shouldn't be set on the attribute itself.
    *  And since this property will be represented as a map, we can set individual attributes to null
    *  to delete them (which follows JSON Merge Patch semantics).</p>
    */
    @NotNull
    @JsonAnyGetter
    public Map<String, Attribute> values();

    @JsonAnySetter
    public void setValue(String key, Attribute value);

    public static Attributes of() {
        return new AttributesImpl();
    }

    public static Attributes of(final Attributes template) {
        AttributesImpl instance = new AttributesImpl();
        return instance;
    }

    public static AttributesBuilder builder() {
        return AttributesBuilder.of();
    }

    public static AttributesBuilder builder(final Attributes template) {
        return AttributesBuilder.of(template);
    }

    default <T> T withAttributes(Function<Attributes, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Attributes> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Attributes>() {
            @Override
            public String toString() {
                return "TypeReference<Attributes>";
            }
        };
    }
}
