
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * LocalizedLabel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizedLabel localizedLabel = LocalizedLabel.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("LocalizedLabel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LocalizedLabelImpl.class)
public interface LocalizedLabel extends Label {

    /**
     * discriminator value for LocalizedLabel
     */
    String LOCALIZED_LABEL = "LocalizedLabel";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Changed value.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public LocalizedString getValue();

    /**
     *  <p>Changed value.</p>
     * @param value value to be set
     */

    public void setValue(final LocalizedString value);

    /**
     * factory method
     * @return instance of LocalizedLabel
     */
    public static LocalizedLabel of() {
        return new LocalizedLabelImpl();
    }

    /**
     * factory method to create a shallow copy LocalizedLabel
     * @param template instance to be copied
     * @return copy instance
     */
    public static LocalizedLabel of(final LocalizedLabel template) {
        LocalizedLabelImpl instance = new LocalizedLabelImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public LocalizedLabel copyDeep();

    /**
     * factory method to create a deep copy of LocalizedLabel
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LocalizedLabel deepCopy(@Nullable final LocalizedLabel template) {
        if (template == null) {
            return null;
        }
        LocalizedLabelImpl instance = new LocalizedLabelImpl();
        instance.setValue(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getValue()));
        return instance;
    }

    /**
     * builder factory method for LocalizedLabel
     * @return builder
     */
    public static LocalizedLabelBuilder builder() {
        return LocalizedLabelBuilder.of();
    }

    /**
     * create builder for LocalizedLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizedLabelBuilder builder(final LocalizedLabel template) {
        return LocalizedLabelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLocalizedLabel(Function<LocalizedLabel, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LocalizedLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizedLabel>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizedLabel>";
            }
        };
    }
}
