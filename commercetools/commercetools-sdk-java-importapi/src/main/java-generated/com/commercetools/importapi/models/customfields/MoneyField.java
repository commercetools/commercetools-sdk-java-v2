
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>A field with a money value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MoneyField moneyField = MoneyField.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Money")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MoneyFieldImpl.class)
public interface MoneyField extends CustomField {

    /**
     * discriminator value for MoneyField
     */
    String MONEY = "Money";

    /**
     *
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     * set value
     * @param value value to be set
     */

    public void setValue(final TypedMoney value);

    /**
     * factory method
     * @return instance of MoneyField
     */
    public static MoneyField of() {
        return new MoneyFieldImpl();
    }

    /**
     * factory method to create a shallow copy MoneyField
     * @param template instance to be copied
     * @return copy instance
     */
    public static MoneyField of(final MoneyField template) {
        MoneyFieldImpl instance = new MoneyFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public MoneyField copyDeep();

    /**
     * factory method to create a deep copy of MoneyField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MoneyField deepCopy(@Nullable final MoneyField template) {
        if (template == null) {
            return null;
        }
        MoneyFieldImpl instance = new MoneyFieldImpl();
        instance.setValue(com.commercetools.importapi.models.common.TypedMoney.deepCopy(template.getValue()));
        return instance;
    }

    /**
     * builder factory method for MoneyField
     * @return builder
     */
    public static MoneyFieldBuilder builder() {
        return MoneyFieldBuilder.of();
    }

    /**
     * create builder for MoneyField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoneyFieldBuilder builder(final MoneyField template) {
        return MoneyFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMoneyField(Function<MoneyField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MoneyField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MoneyField>() {
            @Override
            public String toString() {
                return "TypeReference<MoneyField>";
            }
        };
    }
}
