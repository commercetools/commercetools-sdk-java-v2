
package com.commercetools.api.models.standalone_price;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceUpdateActionBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceUpdateActionBuilder {

    public com.commercetools.api.models.standalone_price.StandalonePriceApplyStagedChangesActionBuilder applyStagedChangesBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceApplyStagedChangesActionBuilder.of();
    }

    public com.commercetools.api.models.standalone_price.StandalonePriceChangeActiveActionBuilder changeActiveBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceChangeActiveActionBuilder.of();
    }

    public com.commercetools.api.models.standalone_price.StandalonePriceChangeValueActionBuilder changeValueBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceChangeValueActionBuilder.of();
    }

    public com.commercetools.api.models.standalone_price.StandalonePriceSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetCustomFieldActionBuilder.of();
    }

    public com.commercetools.api.models.standalone_price.StandalonePriceSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetCustomTypeActionBuilder.of();
    }

    public com.commercetools.api.models.standalone_price.StandalonePriceSetDiscountedPriceActionBuilder setDiscountedPriceBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetDiscountedPriceActionBuilder.of();
    }

    public com.commercetools.api.models.standalone_price.StandalonePriceSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.standalone_price.StandalonePriceSetKeyActionBuilder.of();
    }

    /**
     * factory method for an instance of StandalonePriceUpdateActionBuilder
     * @return builder
     */
    public static StandalonePriceUpdateActionBuilder of() {
        return new StandalonePriceUpdateActionBuilder();
    }

}
