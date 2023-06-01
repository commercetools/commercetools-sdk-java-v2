package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import java.time.LocalTime;
import com.commercetools.importapi.models.customfields.TimeFieldImpl;

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
 *  <p>A field with a time value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TimeField timeField = TimeField.builder()
 *             .value(LocalTime.parse("12:00:00.301"))
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = TimeFieldImpl.class)
public interface TimeField extends CustomField {

    /**
     * discriminator value for TimeField
     */
    String TIME = "Time";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public LocalTime getValue();

    /**
     * set value
     * @param value value to be set
     */
    
    public void setValue(final LocalTime value);
    

    /**
     * factory method
     * @return instance of TimeField
     */
    public static TimeField of(){
        return new TimeFieldImpl();
    }
    

    /**
     * factory method to create a shallow copy TimeField
     * @param template instance to be copied
     * @return copy instance
     */
    public static TimeField of(final TimeField template) {
        TimeFieldImpl instance = new TimeFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of TimeField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TimeField deepCopy(@Nullable final TimeField template) {
        if (template == null) {
            return null;
        }
        TimeFieldImpl instance = new TimeFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for TimeField
     * @return builder
     */
    public static TimeFieldBuilder builder() {
        return TimeFieldBuilder.of();
    }
    
    /**
     * create builder for TimeField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TimeFieldBuilder builder(final TimeField template) {
        return TimeFieldBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTimeField(Function<TimeField, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TimeField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TimeField>() {
            @Override
            public String toString() {
                return "TypeReference<TimeField>";
            }
        };
    }
}
