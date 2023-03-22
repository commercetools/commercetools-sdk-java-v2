
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StringLabel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StringLabel stringLabel = StringLabel.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StringLabelImpl.class)
public interface StringLabel extends Label {

    String STRING_LABEL = "StringLabel";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public String getValue();

    public void setValue(final String value);

    public static StringLabel of() {
        return new StringLabelImpl();
    }

    public static StringLabel of(final StringLabel template) {
        StringLabelImpl instance = new StringLabelImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static StringLabelBuilder builder() {
        return StringLabelBuilder.of();
    }

    public static StringLabelBuilder builder(final StringLabel template) {
        return StringLabelBuilder.of(template);
    }

    default <T> T withStringLabel(Function<StringLabel, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StringLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StringLabel>() {
            @Override
            public String toString() {
                return "TypeReference<StringLabel>";
            }
        };
    }
}
