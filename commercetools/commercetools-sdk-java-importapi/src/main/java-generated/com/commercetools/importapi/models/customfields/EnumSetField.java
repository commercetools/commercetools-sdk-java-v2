
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A field with an enum set value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumSetField enumSetField = EnumSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = EnumSetFieldImpl.class)
public interface EnumSetField extends CustomField {

    String ENUM_SET = "EnumSet";

    /**
     *
     */
    @NotNull
    @JsonProperty("value")
    public List<String> getValue();

    @JsonIgnore
    public void setValue(final String... value);

    public void setValue(final List<String> value);

    public static EnumSetField of() {
        return new EnumSetFieldImpl();
    }

    public static EnumSetField of(final EnumSetField template) {
        EnumSetFieldImpl instance = new EnumSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static EnumSetFieldBuilder builder() {
        return EnumSetFieldBuilder.of();
    }

    public static EnumSetFieldBuilder builder(final EnumSetField template) {
        return EnumSetFieldBuilder.of(template);
    }

    default <T> T withEnumSetField(Function<EnumSetField, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<EnumSetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EnumSetField>() {
            @Override
            public String toString() {
                return "TypeReference<EnumSetField>";
            }
        };
    }
}
