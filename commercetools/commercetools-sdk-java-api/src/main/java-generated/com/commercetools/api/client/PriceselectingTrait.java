
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface PriceselectingTrait<T> {
    List<String> getPriceCurrency();

    List<String> getPriceCountry();

    List<String> getPriceCustomerGroup();

    List<String> getPriceChannel();

    List<String> getLocaleProjection();

    List<String> getStoreProjection();

    T withPriceCurrency(final String priceCurrency);

    T withPriceCountry(final String priceCountry);

    T withPriceCustomerGroup(final String priceCustomerGroup);

    T withPriceChannel(final String priceChannel);

    T withLocaleProjection(final String localeProjection);

    T withStoreProjection(final String storeProjection);
}
