
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A plain enum value must be unique within the enum, otherwise a DuplicateEnumValues error will be returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributePlainEnumValue attributePlainEnumValue = AttributePlainEnumValue.builder()
 *             .key("{key}")
 *             .label("{label}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributePlainEnumValueImpl.class)
public interface AttributePlainEnumValue {

    /**
     *  <p>Key of the value used as a programmatic identifier, for example in facets &amp; filters.</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Descriptive label of the value.</p>
     */
    @NotNull
    @JsonProperty("label")
    public String getLabel();

    public void setKey(final String key);

    public void setLabel(final String label);

    public static AttributePlainEnumValue of() {
        return new AttributePlainEnumValueImpl();
    }

    public static AttributePlainEnumValue of(final AttributePlainEnumValue template) {
        AttributePlainEnumValueImpl instance = new AttributePlainEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static AttributePlainEnumValueBuilder builder() {
        return AttributePlainEnumValueBuilder.of();
    }

    public static AttributePlainEnumValueBuilder builder(final AttributePlainEnumValue template) {
        return AttributePlainEnumValueBuilder.of(template);
    }

    default <T> T withAttributePlainEnumValue(Function<AttributePlainEnumValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributePlainEnumValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributePlainEnumValue>() {
            @Override
            public String toString() {
                return "TypeReference<AttributePlainEnumValue>";
            }
        };
    }
}
