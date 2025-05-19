
package com.commercetools.importapi.models.productvariants;

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
 *  <p>This type represents an attribute whose value is a money object.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MoneyAttribute moneyAttribute = MoneyAttribute.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("money")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MoneyAttributeImpl.class)
public interface MoneyAttribute extends Attribute {

    /**
     * discriminator value for MoneyAttribute
     */
    String MONEY = "money";

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
     * @return instance of MoneyAttribute
     */
    public static MoneyAttribute of() {
        return new MoneyAttributeImpl();
    }

    /**
     * factory method to create a shallow copy MoneyAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static MoneyAttribute of(final MoneyAttribute template) {
        MoneyAttributeImpl instance = new MoneyAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public MoneyAttribute copyDeep();

    /**
     * factory method to create a deep copy of MoneyAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MoneyAttribute deepCopy(@Nullable final MoneyAttribute template) {
        if (template == null) {
            return null;
        }
        MoneyAttributeImpl instance = new MoneyAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(com.commercetools.importapi.models.common.TypedMoney.deepCopy(template.getValue()));
        return instance;
    }

    /**
     * builder factory method for MoneyAttribute
     * @return builder
     */
    public static MoneyAttributeBuilder builder() {
        return MoneyAttributeBuilder.of();
    }

    /**
     * create builder for MoneyAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoneyAttributeBuilder builder(final MoneyAttribute template) {
        return MoneyAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMoneyAttribute(Function<MoneyAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MoneyAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MoneyAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<MoneyAttribute>";
            }
        };
    }
}
