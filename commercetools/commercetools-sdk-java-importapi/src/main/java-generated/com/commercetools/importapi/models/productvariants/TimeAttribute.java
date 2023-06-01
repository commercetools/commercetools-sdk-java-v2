package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import java.time.LocalTime;
import com.commercetools.importapi.models.productvariants.TimeAttributeImpl;

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
 *  <p>This type represents an attribute whose value is a time.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TimeAttribute timeAttribute = TimeAttribute.builder()
 *             .value(LocalTime.parse("12:00:00.301"))
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = TimeAttributeImpl.class)
public interface TimeAttribute extends Attribute {

    /**
     * discriminator value for TimeAttribute
     */
    String TIME = "time";

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
     * @return instance of TimeAttribute
     */
    public static TimeAttribute of(){
        return new TimeAttributeImpl();
    }
    

    /**
     * factory method to create a shallow copy TimeAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static TimeAttribute of(final TimeAttribute template) {
        TimeAttributeImpl instance = new TimeAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of TimeAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TimeAttribute deepCopy(@Nullable final TimeAttribute template) {
        if (template == null) {
            return null;
        }
        TimeAttributeImpl instance = new TimeAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for TimeAttribute
     * @return builder
     */
    public static TimeAttributeBuilder builder() {
        return TimeAttributeBuilder.of();
    }
    
    /**
     * create builder for TimeAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TimeAttributeBuilder builder(final TimeAttribute template) {
        return TimeAttributeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTimeAttribute(Function<TimeAttribute, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TimeAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TimeAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<TimeAttribute>";
            }
        };
    }
}
