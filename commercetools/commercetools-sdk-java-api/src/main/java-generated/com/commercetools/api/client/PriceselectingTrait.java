
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PriceselectingTrait
 * @param <T> type of extending interface
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface PriceselectingTrait<T extends PriceselectingTrait<T>> {
    List<String> getPriceCurrency();

    List<String> getPriceCountry();

    List<String> getPriceCustomerGroup();

    List<String> getPriceChannel();

    /**
     * set priceCurrency with the specificied value
     * @param priceCurrency value to be set
     * @param <TValue> value type
     * @return PriceselectingTrait
     */
    <TValue> PriceselectingTrait<T> withPriceCurrency(final TValue priceCurrency);

    /**
     * add additional priceCurrency query parameter
     * @param priceCurrency value to be added
     * @param <TValue> value type
     * @return PriceselectingTrait
     */
    <TValue> PriceselectingTrait<T> addPriceCurrency(final TValue priceCurrency);

    /**
     * set priceCountry with the specificied value
     * @param priceCountry value to be set
     * @param <TValue> value type
     * @return PriceselectingTrait
     */
    <TValue> PriceselectingTrait<T> withPriceCountry(final TValue priceCountry);

    /**
     * add additional priceCountry query parameter
     * @param priceCountry value to be added
     * @param <TValue> value type
     * @return PriceselectingTrait
     */
    <TValue> PriceselectingTrait<T> addPriceCountry(final TValue priceCountry);

    /**
     * set priceCustomerGroup with the specificied value
     * @param priceCustomerGroup value to be set
     * @param <TValue> value type
     * @return PriceselectingTrait
     */
    <TValue> PriceselectingTrait<T> withPriceCustomerGroup(final TValue priceCustomerGroup);

    /**
     * add additional priceCustomerGroup query parameter
     * @param priceCustomerGroup value to be added
     * @param <TValue> value type
     * @return PriceselectingTrait
     */
    <TValue> PriceselectingTrait<T> addPriceCustomerGroup(final TValue priceCustomerGroup);

    /**
     * set priceChannel with the specificied value
     * @param priceChannel value to be set
     * @param <TValue> value type
     * @return PriceselectingTrait
     */
    <TValue> PriceselectingTrait<T> withPriceChannel(final TValue priceChannel);

    /**
     * add additional priceChannel query parameter
     * @param priceChannel value to be added
     * @param <TValue> value type
     * @return PriceselectingTrait
     */
    <TValue> PriceselectingTrait<T> addPriceChannel(final TValue priceChannel);

    default PriceselectingTrait<T> asPriceselectingTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asPriceselectingTraitToBaseType() {
        return (T) this;
    }

}
