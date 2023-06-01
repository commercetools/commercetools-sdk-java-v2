package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.common.Money;
import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.MoneySetFieldImpl;

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
 *  <p>A field with a money set value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MoneySetField moneySetField = MoneySetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = MoneySetFieldImpl.class)
public interface MoneySetField extends CustomField {

    /**
     * discriminator value for MoneySetField
     */
    String MONEY_SET = "MoneySet";

    /**
     *
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public List<Money> getValue();

    /**
     * set value
     * @param value values to be set
     */
    
    @JsonIgnore
    public void setValue(final Money ...value);
    /**
     * set value
     * @param value values to be set
     */
    
    public void setValue(final List<Money> value);

    /**
     * factory method
     * @return instance of MoneySetField
     */
    public static MoneySetField of(){
        return new MoneySetFieldImpl();
    }
    

    /**
     * factory method to create a shallow copy MoneySetField
     * @param template instance to be copied
     * @return copy instance
     */
    public static MoneySetField of(final MoneySetField template) {
        MoneySetFieldImpl instance = new MoneySetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of MoneySetField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MoneySetField deepCopy(@Nullable final MoneySetField template) {
        if (template == null) {
            return null;
        }
        MoneySetFieldImpl instance = new MoneySetFieldImpl();
        instance.setValue(Optional.ofNullable(template.getValue())
                .map(t -> t.stream().map(com.commercetools.importapi.models.common.Money::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MoneySetField
     * @return builder
     */
    public static MoneySetFieldBuilder builder() {
        return MoneySetFieldBuilder.of();
    }
    
    /**
     * create builder for MoneySetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoneySetFieldBuilder builder(final MoneySetField template) {
        return MoneySetFieldBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMoneySetField(Function<MoneySetField, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MoneySetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MoneySetField>() {
            @Override
            public String toString() {
                return "TypeReference<MoneySetField>";
            }
        };
    }
}
