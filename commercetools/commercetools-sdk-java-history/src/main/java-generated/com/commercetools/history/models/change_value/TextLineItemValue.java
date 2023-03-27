
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TextLineItemValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TextLineItemValue textLineItemValue = TextLineItemValue.builder()
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TextLineItemValueImpl.class)
public interface TextLineItemValue {

    /**
     *
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * set name
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of TextLineItemValue
     */
    public static TextLineItemValue of() {
        return new TextLineItemValueImpl();
    }

    /**
     * factory method to copy an instance of TextLineItemValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static TextLineItemValue of(final TextLineItemValue template) {
        TextLineItemValueImpl instance = new TextLineItemValueImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for TextLineItemValue
     * @return builder
     */
    public static TextLineItemValueBuilder builder() {
        return TextLineItemValueBuilder.of();
    }

    /**
     * create builder for TextLineItemValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TextLineItemValueBuilder builder(final TextLineItemValue template) {
        return TextLineItemValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTextLineItemValue(Function<TextLineItemValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TextLineItemValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TextLineItemValue>() {
            @Override
            public String toString() {
                return "TypeReference<TextLineItemValue>";
            }
        };
    }
}
