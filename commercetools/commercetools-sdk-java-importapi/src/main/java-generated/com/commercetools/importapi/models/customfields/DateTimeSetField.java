package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import java.time.ZonedDateTime;
import com.commercetools.importapi.models.customfields.DateTimeSetFieldImpl;

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
 *  <p>A field with a date time set value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DateTimeSetField dateTimeSetField = DateTimeSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = DateTimeSetFieldImpl.class)
public interface DateTimeSetField extends CustomField {

    /**
     * discriminator value for DateTimeSetField
     */
    String DATE_TIME_SET = "DateTimeSet";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public List<ZonedDateTime> getValue();

    /**
     * set value
     * @param value values to be set
     */
    
    @JsonIgnore
    public void setValue(final ZonedDateTime ...value);
    /**
     * set value
     * @param value values to be set
     */
    
    public void setValue(final List<ZonedDateTime> value);

    /**
     * factory method
     * @return instance of DateTimeSetField
     */
    public static DateTimeSetField of(){
        return new DateTimeSetFieldImpl();
    }
    

    /**
     * factory method to create a shallow copy DateTimeSetField
     * @param template instance to be copied
     * @return copy instance
     */
    public static DateTimeSetField of(final DateTimeSetField template) {
        DateTimeSetFieldImpl instance = new DateTimeSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of DateTimeSetField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DateTimeSetField deepCopy(@Nullable final DateTimeSetField template) {
        if (template == null) {
            return null;
        }
        DateTimeSetFieldImpl instance = new DateTimeSetFieldImpl();
        instance.setValue(Optional.ofNullable(template.getValue())
                .map(ArrayList::new)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for DateTimeSetField
     * @return builder
     */
    public static DateTimeSetFieldBuilder builder() {
        return DateTimeSetFieldBuilder.of();
    }
    
    /**
     * create builder for DateTimeSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DateTimeSetFieldBuilder builder(final DateTimeSetField template) {
        return DateTimeSetFieldBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDateTimeSetField(Function<DateTimeSetField, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DateTimeSetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DateTimeSetField>() {
            @Override
            public String toString() {
                return "TypeReference<DateTimeSetField>";
            }
        };
    }
}
