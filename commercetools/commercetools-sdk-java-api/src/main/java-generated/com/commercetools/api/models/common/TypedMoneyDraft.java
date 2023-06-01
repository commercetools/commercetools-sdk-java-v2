package com.commercetools.api.models.common;

import com.commercetools.api.models.common.CentPrecisionMoneyDraft;
import com.commercetools.api.models.common.HighPrecisionMoneyDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.MoneyType;


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
 * TypedMoneyDraft
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypedMoneyDraft typedMoneyDraft = TypedMoneyDraft.centPrecisionBuilder()
 *             centAmount(0.3)
 *             currencyCode("{currencyCode}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.common.CentPrecisionMoneyDraftImpl.class, name = CentPrecisionMoneyDraft.CENT_PRECISION),
   @JsonSubTypes.Type(value = com.commercetools.api.models.common.HighPrecisionMoneyDraftImpl.class, name = HighPrecisionMoneyDraft.HIGH_PRECISION)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    defaultImpl = TypedMoneyDraftImpl.class,
    visible = true
)
@JsonDeserialize(as = TypedMoneyDraftImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface TypedMoneyDraft extends Money {


    /**
     *
     * @return type
     */
    
    @JsonProperty("type")
    public MoneyType getType();
    /**
     *  <p>Must be equal to the default number of fraction digits for the specified currency.</p>
     * @return fractionDigits
     */
    
    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    /**
     *  <p>Must be equal to the default number of fraction digits for the specified currency.</p>
     * @param fractionDigits value to be set
     */
    
    public void setFractionDigits(final Integer fractionDigits);
    



    /**
     * factory method to create a deep copy of TypedMoneyDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypedMoneyDraft deepCopy(@Nullable final TypedMoneyDraft template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.common.CentPrecisionMoneyDraft) {
            return com.commercetools.api.models.common.CentPrecisionMoneyDraft.deepCopy((com.commercetools.api.models.common.CentPrecisionMoneyDraft)template);
        }
        if (template instanceof com.commercetools.api.models.common.HighPrecisionMoneyDraft) {
            return com.commercetools.api.models.common.HighPrecisionMoneyDraft.deepCopy((com.commercetools.api.models.common.HighPrecisionMoneyDraft)template);
        }
        TypedMoneyDraftImpl instance = new TypedMoneyDraftImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        return instance;
    }


    /**
     * builder for centPrecision subtype
     * @return builder
     */
    public static com.commercetools.api.models.common.CentPrecisionMoneyDraftBuilder centPrecisionBuilder() {
       return com.commercetools.api.models.common.CentPrecisionMoneyDraftBuilder.of();
    }
    /**
     * builder for highPrecision subtype
     * @return builder
     */
    public static com.commercetools.api.models.common.HighPrecisionMoneyDraftBuilder highPrecisionBuilder() {
       return com.commercetools.api.models.common.HighPrecisionMoneyDraftBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypedMoneyDraft(Function<TypedMoneyDraft, T> helper) {
        return helper.apply(this);
    }
    @Override
    default javax.money.MonetaryOperator createMoneyOperator() {
        return MoneyUtil::draftOf;
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypedMoneyDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypedMoneyDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TypedMoneyDraft>";
            }
        };
    }
}
