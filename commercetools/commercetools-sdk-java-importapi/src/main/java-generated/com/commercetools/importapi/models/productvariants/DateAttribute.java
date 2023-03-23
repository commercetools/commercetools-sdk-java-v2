
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This type represents an attribute whose value is a date.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DateAttribute dateAttribute = DateAttribute.builder()
 *             .value(LocalDate.parse("2022-01-01"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DateAttributeImpl.class)
public interface DateAttribute extends Attribute {

    String DATE = "date";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public LocalDate getValue();

    public void setValue(final LocalDate value);

    public static DateAttribute of() {
        return new DateAttributeImpl();
    }

    public static DateAttribute of(final DateAttribute template) {
        DateAttributeImpl instance = new DateAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static DateAttributeBuilder builder() {
        return DateAttributeBuilder.of();
    }

    public static DateAttributeBuilder builder(final DateAttribute template) {
        return DateAttributeBuilder.of(template);
    }

    default <T> T withDateAttribute(Function<DateAttribute, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DateAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DateAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<DateAttribute>";
            }
        };
    }
}
