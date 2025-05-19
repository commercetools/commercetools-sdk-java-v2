
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ChangeValueRelativeChangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeValueRelativeChangeValue changeValueRelativeChangeValue = ChangeValueRelativeChangeValue.builder()
 *             .permyriad(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("relative")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeValueRelativeChangeValueImpl.class)
public interface ChangeValueRelativeChangeValue extends ChangeValueChangeValue {

    /**
     * discriminator value for ChangeValueRelativeChangeValue
     */
    String RELATIVE = "relative";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, 1000 results in a 10% price reduction.</p>
     * @return permyriad
     */
    @NotNull
    @JsonProperty("permyriad")
    public Integer getPermyriad();

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, 1000 results in a 10% price reduction.</p>
     * @param permyriad value to be set
     */

    public void setPermyriad(final Integer permyriad);

    /**
     * factory method
     * @return instance of ChangeValueRelativeChangeValue
     */
    public static ChangeValueRelativeChangeValue of() {
        return new ChangeValueRelativeChangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ChangeValueRelativeChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeValueRelativeChangeValue of(final ChangeValueRelativeChangeValue template) {
        ChangeValueRelativeChangeValueImpl instance = new ChangeValueRelativeChangeValueImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    public ChangeValueRelativeChangeValue copyDeep();

    /**
     * factory method to create a deep copy of ChangeValueRelativeChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeValueRelativeChangeValue deepCopy(@Nullable final ChangeValueRelativeChangeValue template) {
        if (template == null) {
            return null;
        }
        ChangeValueRelativeChangeValueImpl instance = new ChangeValueRelativeChangeValueImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    /**
     * builder factory method for ChangeValueRelativeChangeValue
     * @return builder
     */
    public static ChangeValueRelativeChangeValueBuilder builder() {
        return ChangeValueRelativeChangeValueBuilder.of();
    }

    /**
     * create builder for ChangeValueRelativeChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeValueRelativeChangeValueBuilder builder(final ChangeValueRelativeChangeValue template) {
        return ChangeValueRelativeChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeValueRelativeChangeValue(Function<ChangeValueRelativeChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeValueRelativeChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeValueRelativeChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeValueRelativeChangeValue>";
            }
        };
    }
}
