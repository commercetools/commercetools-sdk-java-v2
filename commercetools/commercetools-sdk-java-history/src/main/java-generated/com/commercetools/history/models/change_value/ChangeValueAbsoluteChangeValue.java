
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Shape of the value for cart discounts absolute value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeValueAbsoluteChangeValue changeValueAbsoluteChangeValue = ChangeValueAbsoluteChangeValue.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeValueAbsoluteChangeValueImpl.class)
public interface ChangeValueAbsoluteChangeValue extends ChangeValueChangeValue {

    /**
     * discriminator value for ChangeValueAbsoluteChangeValue
     */
    String ABSOLUTE = "absolute";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<Money> getMoney();

    /**
     * set money
     * @param money values to be set
     */

    @JsonIgnore
    public void setMoney(final Money... money);

    /**
     * set money
     * @param money values to be set
     */

    public void setMoney(final List<Money> money);

    /**
     * factory method
     * @return instance of ChangeValueAbsoluteChangeValue
     */
    public static ChangeValueAbsoluteChangeValue of() {
        return new ChangeValueAbsoluteChangeValueImpl();
    }

    /**
     * factory method to create a shallow copy ChangeValueAbsoluteChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeValueAbsoluteChangeValue of(final ChangeValueAbsoluteChangeValue template) {
        ChangeValueAbsoluteChangeValueImpl instance = new ChangeValueAbsoluteChangeValueImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeValueAbsoluteChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeValueAbsoluteChangeValue deepCopy(@Nullable final ChangeValueAbsoluteChangeValue template) {
        if (template == null) {
            return null;
        }
        ChangeValueAbsoluteChangeValueImpl instance = new ChangeValueAbsoluteChangeValueImpl();
        instance.setMoney(Optional.ofNullable(template.getMoney())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.Money::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChangeValueAbsoluteChangeValue
     * @return builder
     */
    public static ChangeValueAbsoluteChangeValueBuilder builder() {
        return ChangeValueAbsoluteChangeValueBuilder.of();
    }

    /**
     * create builder for ChangeValueAbsoluteChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeValueAbsoluteChangeValueBuilder builder(final ChangeValueAbsoluteChangeValue template) {
        return ChangeValueAbsoluteChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeValueAbsoluteChangeValue(Function<ChangeValueAbsoluteChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeValueAbsoluteChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeValueAbsoluteChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeValueAbsoluteChangeValue>";
            }
        };
    }
}
