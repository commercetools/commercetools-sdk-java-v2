package com.commercetools.sdk;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.standalone_price.StandalonePrice;
import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.DiscountedPrice;
import com.commercetools.importapi.models.common.PriceTier;
import com.commercetools.importapi.models.standalone_prices.StandalonePriceImport;

import java.util.List;

import static com.commercetools.sdk.CommonImportUtil.getImportApiCustom;
import static com.commercetools.sdk.CommonImportUtil.importApiTypedMoney;
import static com.commercetools.sdk.ProductUtil.toProductDiscountKeyReference;

public class StandalonePriceUtil {
    public static StandalonePriceImport toStandalonePriceImport(StandalonePrice price) {
        return StandalonePriceImport.builder()
                .key(price.getKey()) // required field
                .sku(price.getSku()) // required field
                .value(v -> importApiTypedMoney(price.getValue(), v)) // required field
                .country(price.getCountry())
                .customerGroup(CustomerUtil.toCustomerGroupKeyReference(price.getCustomerGroup()))
                .channel(toImportApiChannelKeyReference(price.getChannel()))
                .validFrom(price.getValidFrom())
                .validUntil(price.getValidUntil())
                .tiers(toImportApiPriceTiers(price.getTiers()))
                .discounted(toImportApiDiscountedPrice(price.getDiscounted()))
                .custom(getImportApiCustom(price.getCustom()))
                .active(price.getActive())
                .build();
    }

    private static DiscountedPrice toImportApiDiscountedPrice(
            com.commercetools.api.models.common.DiscountedPrice discounted) {
        return DiscountedPrice.builder().value(v -> importApiTypedMoney(discounted.getValue(), v))
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

    private static ChannelKeyReference toImportApiChannelKeyReference(ChannelReference channel) {
        if (channel == null) {
            return null;
        }
        return ChannelKeyReference.builder().key(channel.getId()).build();
    }
}
