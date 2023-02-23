
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
        @JsonSubTypes.Type(value = com.commercetools.api.models.common.HighPrecisionMoneyDraftImpl.class, name = HighPrecisionMoneyDraft.HIGH_PRECISION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = TypedMoneyDraftImpl.class, visible = true)
@JsonDeserialize(as = TypedMoneyDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TypedMoneyDraft extends Money {

    /**
     *
     */

    @JsonProperty("type")
    public MoneyType getType();

    /**
     *  <p>Must be equal to the default number of fraction digits for the specified currency.</p>
     */

    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    public void setFractionDigits(final Integer fractionDigits);

    public static com.commercetools.api.models.common.CentPrecisionMoneyDraftBuilder centPrecisionBuilder() {
        return com.commercetools.api.models.common.CentPrecisionMoneyDraftBuilder.of();
    }

    public static com.commercetools.api.models.common.HighPrecisionMoneyDraftBuilder highPrecisionBuilder() {
        return com.commercetools.api.models.common.HighPrecisionMoneyDraftBuilder.of();
    }

    default <T> T withTypedMoneyDraft(Function<TypedMoneyDraft, T> helper) {
        return helper.apply(this);
    }

    @Override
    default javax.money.MonetaryOperator createMoneyOperator() {
        return MoneyUtil::draftOf;
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypedMoneyDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypedMoneyDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TypedMoneyDraft>";
            }
        };
    }
}
