
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Base polymorphic read-only Money type which is stored in cent precision or high precision. The actual type is determined by the <code>type</code> field.</p>
*/
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.common.CentPrecisionMoneyImpl.class, name = CentPrecisionMoney.CENT_PRECISION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.common.HighPrecisionMoneyImpl.class, name = HighPrecisionMoney.HIGH_PRECISION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = TypedMoneyImpl.class, visible = true)
@JsonDeserialize(as = TypedMoneyImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface TypedMoney extends Money {

    /**
    *  <p>The platform supports two different types of Money, one for amounts in cent precision and another one for sub-cent amounts up to 12 fraction digits.</p>
    */
    @NotNull
    @JsonProperty("type")
    public MoneyType getType();

    /**
    *  <p>number of digits after the decimal separator</p>
    *  <ul>
    *  <li>equal to the default number of fraction digits for a currency in <a href="ctp:api:type:CentPrecisionMoney">CentPrecisionMoney</a>.</li>
    *  <li>greater than the default number of fraction digits for a currency in <a href="ctp:api:type:HighPrecisionMoney">HighPrecisionMoney</a>.</li>
    *  </ul>
    */
    @NotNull
    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    public void setFractionDigits(final Integer fractionDigits);

    public static com.commercetools.api.models.common.CentPrecisionMoneyBuilder centPrecisionBuilder() {
        return com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of();
    }

    public static com.commercetools.api.models.common.HighPrecisionMoneyBuilder highPrecisionBuilder() {
        return com.commercetools.api.models.common.HighPrecisionMoneyBuilder.of();
    }

    default <T> T withTypedMoney(Function<TypedMoney, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypedMoney> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypedMoney>() {
            @Override
            public String toString() {
                return "TypeReference<TypedMoney>";
            }
        };
    }
}
