
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Base polymorphic money type containing common fields for <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">Money</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
 *  <ul>
 *   <li>To set money in cent precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">Money</a>.</li>
 *   <li>To set money in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</li>
 *  </ul>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypedMoneyDraft typedMoneyDraft = TypedMoneyDraft.centPrecisionBuilder()
 *             currencyCode("{currencyCode}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = TypedMoneyDraftImpl.class, visible = true)
@JsonDeserialize(as = TypedMoneyDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TypedMoneyDraft extends Money {

    /**
     *  <p>Determines the type of money used.</p>
     * @return type
     */

    @JsonProperty("type")
    public MoneyType getType();

    /**
     *  <p>Number of fraction digits for a specified money.</p>
     * @return fractionDigits
     */

    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    /**
     *  <p>Amount in the smallest indivisible unit of a currency.</p>
     * @return centAmount
     */

    @JsonProperty("centAmount")
    public Long getCentAmount();

    /**
     *  <p>Number of fraction digits for a specified money.</p>
     * @param fractionDigits value to be set
     */

    public void setFractionDigits(final Integer fractionDigits);

    /**
     *  <p>Amount in the smallest indivisible unit of a currency.</p>
     * @param centAmount value to be set
     */

    public void setCentAmount(final Long centAmount);

    public TypedMoneyDraft copyDeep();

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

        if (!(template instanceof TypedMoneyDraftImpl)) {
            return template.copyDeep();
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
