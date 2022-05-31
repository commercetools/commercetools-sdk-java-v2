
package com.commercetools.api.models.common;

import java.util.Arrays;
import java.util.function.Function;

import javax.money.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
 *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Money money = Money.builder()
 *             .centAmount(0.3)
 *             .currencyCode("{currencyCode}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MoneyImpl.class)
public interface Money extends com.commercetools.api.models.common.MonetaryAmountConvertable, MonetaryAmount {

    /**
     *  <p>Amount in the smallest indivisible unit of a currency, such as:</p>
     *  <ul>
     *   <li>Cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as <code>500</code>).</li>
     *   <li>The value in the major unit for currencies without minor units, like JPY (5 JPY is specified as <code>5</code>).</li>
     *  </ul>
     */
    @NotNull
    @JsonProperty("centAmount")
    public Long getCentAmount();

    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     */
    @NotNull
    @JsonProperty("currencyCode")
    public String getCurrencyCode();

    public void setCentAmount(final Long centAmount);

    public void setCurrencyCode(final String currencyCode);

    public static Money of() {
        return new MoneyImpl();
    }

    public static Money of(final Money template) {
        MoneyImpl instance = new MoneyImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        return instance;
    }

    public static MoneyBuilder builder() {
        return MoneyBuilder.of();
    }

    public static MoneyBuilder builder(final Money template) {
        return MoneyBuilder.of(template);
    }

    default <T> T withMoney(Function<Money, T> helper) {
        return helper.apply(this);
    }

    public default TypedMoneyDraft toDraft() {
        if (this instanceof TypedMoneyDraft) {
            return (TypedMoneyDraft) this;
        }
        return TypedMoneyDraft.centPrecisionBuilder()
                .centAmount(this.getCentAmount())
                .currencyCode(this.getCurrencyCode())
                .build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Money> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Money>() {
            @Override
            public String toString() {
                return "TypeReference<Money>";
            }
        };
    }

    default MonetaryOperator createMoneyOperator() {
        return MoneyUtil::of;
    }

    @Override
    default MonetaryContext getContext() {
        return toMonetaryAmount().getContext();
    }

    @Override
    default MonetaryAmountFactory<? extends MonetaryAmount> getFactory() {
        return toMonetaryAmount().getFactory();
    }

    @Override
    default boolean isGreaterThan(MonetaryAmount amount) {
        return toMonetaryAmount().isGreaterThan(amount);
    }

    @Override
    default boolean isGreaterThanOrEqualTo(MonetaryAmount amount) {
        return toMonetaryAmount().isGreaterThanOrEqualTo(amount);
    }

    @Override
    default boolean isLessThan(MonetaryAmount amount) {
        return toMonetaryAmount().isLessThan(amount);
    }

    @Override
    default boolean isLessThanOrEqualTo(MonetaryAmount amount) {
        return toMonetaryAmount().isLessThanOrEqualTo(amount);
    }

    @Override
    default boolean isEqualTo(MonetaryAmount amount) {
        return toMonetaryAmount().isEqualTo(amount);
    }

    @Override
    default int signum() {
        return toMonetaryAmount().signum();
    }

    @Override
    default MonetaryAmount add(MonetaryAmount augend) {
        return createMoneyOperator().apply(toMonetaryAmount().add(augend));
    }

    @Override
    default MonetaryAmount subtract(MonetaryAmount subtrahend) {
        return createMoneyOperator().apply(toMonetaryAmount().subtract(subtrahend));
    }

    @Override
    default MonetaryAmount multiply(long multiplicand) {
        return createMoneyOperator().apply(toMonetaryAmount().multiply(multiplicand));
    }

    @Override
    default MonetaryAmount multiply(double multiplicand) {
        return createMoneyOperator().apply(toMonetaryAmount().multiply(multiplicand));
    }

    @Override
    default MonetaryAmount multiply(Number multiplicand) {
        return createMoneyOperator().apply(toMonetaryAmount().multiply(multiplicand));
    }

    @Override
    default MonetaryAmount divide(long divisor) {
        return createMoneyOperator().apply(toMonetaryAmount().divide(divisor));
    }

    @Override
    default MonetaryAmount divide(double divisor) {
        return createMoneyOperator().apply(toMonetaryAmount().divide(divisor));
    }

    @Override
    default MonetaryAmount divide(Number divisor) {
        return createMoneyOperator().apply(toMonetaryAmount().divide(divisor));
    }

    @Override
    default MonetaryAmount remainder(long divisor) {
        return createMoneyOperator().apply(toMonetaryAmount().remainder(divisor));
    }

    @Override
    default MonetaryAmount remainder(double divisor) {
        return createMoneyOperator().apply(toMonetaryAmount().remainder(divisor));
    }

    @Override
    default MonetaryAmount remainder(Number divisor) {
        return createMoneyOperator().apply(toMonetaryAmount().remainder(divisor));
    }

    @Override
    default MonetaryAmount[] divideAndRemainder(long divisor) {
        return Arrays.stream(toMonetaryAmount().divideAndRemainder(divisor))
                .map(amount -> createMoneyOperator().apply(amount))
                .toArray(MonetaryAmount[]::new);
    }

    @Override
    default MonetaryAmount[] divideAndRemainder(double divisor) {
        return Arrays.stream(toMonetaryAmount().divideAndRemainder(divisor))
                .map(amount -> createMoneyOperator().apply(amount))
                .toArray(MonetaryAmount[]::new);
    }

    @Override
    default MonetaryAmount[] divideAndRemainder(Number divisor) {
        return (MonetaryAmount[]) Arrays.stream(toMonetaryAmount().divideAndRemainder(divisor))
                .map(amount -> createMoneyOperator().apply(amount))
                .toArray(MonetaryAmount[]::new);
    }

    @Override
    default MonetaryAmount divideToIntegralValue(long divisor) {
        return createMoneyOperator().apply(toMonetaryAmount().divideToIntegralValue(divisor));
    }

    @Override
    default MonetaryAmount divideToIntegralValue(double divisor) {
        return createMoneyOperator().apply(toMonetaryAmount().divideToIntegralValue(divisor));
    }

    @Override
    default MonetaryAmount divideToIntegralValue(Number divisor) {
        return createMoneyOperator().apply(toMonetaryAmount().divideToIntegralValue(divisor));
    }

    @Override
    default MonetaryAmount scaleByPowerOfTen(int power) {
        return createMoneyOperator().apply(toMonetaryAmount().scaleByPowerOfTen(power));
    }

    @Override
    default MonetaryAmount abs() {
        return createMoneyOperator().apply(toMonetaryAmount().abs());
    }

    @Override
    default MonetaryAmount negate() {
        return createMoneyOperator().apply(toMonetaryAmount().negate());
    }

    @Override
    default MonetaryAmount plus() {
        return createMoneyOperator().apply(toMonetaryAmount().plus());
    }

    @Override
    default MonetaryAmount stripTrailingZeros() {
        return createMoneyOperator().apply(toMonetaryAmount().stripTrailingZeros());
    }

    @Override
    default int compareTo(MonetaryAmount o) {
        return toMonetaryAmount().compareTo(o);
    }

    @Override
    default CurrencyUnit getCurrency() {
        return toMonetaryAmount().getCurrency();
    }

    @Override
    default NumberValue getNumber() {
        return toMonetaryAmount().getNumber();
    }

    @Override
    default <R> R query(MonetaryQuery<R> query) {
        return toMonetaryAmount().query(query);
    }

    @Override
    default MonetaryAmount with(MonetaryOperator operator) {
        return toMonetaryAmount().with(operator);
    }
}
