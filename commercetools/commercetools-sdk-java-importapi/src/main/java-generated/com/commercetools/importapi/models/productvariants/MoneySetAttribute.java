
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>This type represents an attribute whose value is a set of money objects.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MoneySetAttribute moneySetAttribute = MoneySetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("money-set")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MoneySetAttributeImpl.class)
public interface MoneySetAttribute extends Attribute {

    /**
     * discriminator value for MoneySetAttribute
     */
    String MONEY_SET = "money-set";

    /**
     *  <p>A set of money values in cent precision format.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public List<TypedMoney> getValue();

    /**
     *  <p>A set of money values in cent precision format.</p>
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final TypedMoney... value);

    /**
     *  <p>A set of money values in cent precision format.</p>
     * @param value values to be set
     */

    public void setValue(final List<TypedMoney> value);

    /**
     * factory method
     * @return instance of MoneySetAttribute
     */
    public static MoneySetAttribute of() {
        return new MoneySetAttributeImpl();
    }

    /**
     * factory method to create a shallow copy MoneySetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static MoneySetAttribute of(final MoneySetAttribute template) {
        MoneySetAttributeImpl instance = new MoneySetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public MoneySetAttribute copyDeep();

    /**
     * factory method to create a deep copy of MoneySetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MoneySetAttribute deepCopy(@Nullable final MoneySetAttribute template) {
        if (template == null) {
            return null;
        }
        MoneySetAttributeImpl instance = new MoneySetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(Optional.ofNullable(template.getValue())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.TypedMoney::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MoneySetAttribute
     * @return builder
     */
    public static MoneySetAttributeBuilder builder() {
        return MoneySetAttributeBuilder.of();
    }

    /**
     * create builder for MoneySetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoneySetAttributeBuilder builder(final MoneySetAttribute template) {
        return MoneySetAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMoneySetAttribute(Function<MoneySetAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MoneySetAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MoneySetAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<MoneySetAttribute>";
            }
        };
    }
}
