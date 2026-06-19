
package com.commercetools.sdk;

import static com.commercetools.sdk.CommonImportUtil.importApiTypedMoney;
import static com.commercetools.sdk.ProductUtil.toProductDiscountKeyReference;

import java.util.List;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.standalone_price.StandalonePrice;
import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.DiscountedPrice;
import com.commercetools.importapi.models.common.PriceTier;
import com.commercetools.importapi.models.standalone_prices.StandalonePriceImport;

public class StandalonePriceUtil {
    private final KeyResolverService keyResolverService;
    private final CommonImportUtil util;

    public StandalonePriceUtil() {
        keyResolverService = new ExpandObjResolverService();
        util = new CommonImportUtil(keyResolverService);
    }

    public StandalonePriceUtil(final KeyResolverService resolverService) {
        keyResolverService = resolverService;
        util = new CommonImportUtil(keyResolverService);
    }

    public StandalonePriceImport toStandalonePriceImport(StandalonePrice price) {
        return StandalonePriceImport.builder()
                .key(price.getKey()) // required field
                .sku(price.getSku()) // required field
                .value(v -> importApiTypedMoney(price.getValue(), v)) // required field
                .country(price.getCountry())
                .customerGroup((new CustomerUtil(keyResolverService)).toCustomerGroupKeyReference(price.getCustomerGroup()))
                .channel(toImportApiChannelKeyReference(price.getChannel()))
                .validFrom(price.getValidFrom())
                .validUntil(price.getValidUntil())
                .tiers(toImportApiPriceTiers(price.getTiers()))
                .discounted(toImportApiDiscountedPrice(price.getDiscounted()))
                .custom(util.getImportApiCustom(price.getCustom()))
                .active(price.getActive())
                .build();
    }

    private static DiscountedPrice toImportApiDiscountedPrice(
            com.commercetools.api.models.common.DiscountedPrice discounted) {
        if (discounted == null) {
            return null;
        }
        return DiscountedPrice.builder()
                .value(v -> importApiTypedMoney(discounted.getValue(), v))
                .discount(toProductDiscountKeyReference(discounted.getDiscount()))
                .build();
    }

    private static List<PriceTier> toImportApiPriceTiers(List<com.commercetools.api.models.common.PriceTier> tiers) {
        if (tiers == null) {
            return null;
        }
        return tiers.stream().map(StandalonePriceUtil::toImportApiPriceTier).toList();
    }

    private static PriceTier toImportApiPriceTier(com.commercetools.api.models.common.PriceTier tier) {
        return PriceTier.builder()
                .minimumQuantity(tier.getMinimumQuantity())
                .value(v -> importApiTypedMoney(tier.getValue(), v))
                .build();
    }

    private ChannelKeyReference toImportApiChannelKeyReference(ChannelReference channel) {
        if (channel == null) {
            return null;
        }
        return ChannelKeyReference.builder().key(keyResolverService.resolveKey(channel)).build();
    }
}
