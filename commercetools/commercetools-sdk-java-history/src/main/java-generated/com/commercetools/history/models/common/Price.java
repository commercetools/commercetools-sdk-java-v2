
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Price
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Price price = Price.builder()
 *             .id("{id}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PriceImpl.class)
public interface Price {

    /**
     *
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * set value
     * @param value value to be set
     */

    public void setValue(final Money value);

    /**
     * factory method
     * @return instance of Price
     */
    public static Price of() {
        return new PriceImpl();
    }

    /**
     * factory method to copy an instance of Price
     * @param template instance to be copied
     * @return copy instance
     */
    public static Price of(final Price template) {
        PriceImpl instance = new PriceImpl();
        instance.setId(template.getId());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for Price
     * @return builder
     */
    public static PriceBuilder builder() {
        return PriceBuilder.of();
    }

    /**
     * create builder for Price instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceBuilder builder(final Price template) {
        return PriceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPrice(Function<Price, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Price> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Price>() {
            @Override
            public String toString() {
                return "TypeReference<Price>";
            }
        };
    }
}
