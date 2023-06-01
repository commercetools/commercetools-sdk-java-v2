package com.commercetools.history.models.label;

import com.commercetools.history.models.label.Label;
import com.commercetools.history.models.label.StringLabelImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StringLabelImpl.class)
public interface StringLabel extends Label {

    /**
     * discriminator value for StringLabel
     */
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

    /**
     * set value
     * @param value value to be set
     */
    
    public void setValue(final String value);
    

    /**
     * factory method
     * @return instance of StringLabel
     */
    public static StringLabel of(){
        return new StringLabelImpl();
    }
    

    /**
     * factory method to create a shallow copy StringLabel
     * @param template instance to be copied
     * @return copy instance
     */
    public static StringLabel of(final StringLabel template) {
        StringLabelImpl instance = new StringLabelImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of StringLabel
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StringLabel deepCopy(@Nullable final StringLabel template) {
        if (template == null) {
            return null;
        }
        StringLabelImpl instance = new StringLabelImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for StringLabel
     * @return builder
     */
    public static StringLabelBuilder builder() {
        return StringLabelBuilder.of();
    }
    
    /**
     * create builder for StringLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StringLabelBuilder builder(final StringLabel template) {
        return StringLabelBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStringLabel(Function<StringLabel, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StringLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StringLabel>() {
            @Override
            public String toString() {
                return "TypeReference<StringLabel>";
            }
        };
    }
}
