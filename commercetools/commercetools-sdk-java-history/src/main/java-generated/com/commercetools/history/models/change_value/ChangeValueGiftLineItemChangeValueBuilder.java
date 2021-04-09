
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeValueGiftLineItemChangeValueBuilder {

    private com.commercetools.history.models.common.Reference product;

    private Integer variantId;

    private com.commercetools.history.models.common.Reference supplyChannel;

    private com.commercetools.history.models.common.Reference distributionChannel;

    public ChangeValueGiftLineItemChangeValueBuilder product(
            final com.commercetools.history.models.common.Reference product) {
        this.product = product;
        return this;
    }

    public ChangeValueGiftLineItemChangeValueBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    public ChangeValueGiftLineItemChangeValueBuilder supplyChannel(
            final com.commercetools.history.models.common.Reference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public ChangeValueGiftLineItemChangeValueBuilder distributionChannel(
            final com.commercetools.history.models.common.Reference distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public com.commercetools.history.models.common.Reference getProduct() {
        return this.product;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    public com.commercetools.history.models.common.Reference getSupplyChannel() {
        return this.supplyChannel;
    }

    public com.commercetools.history.models.common.Reference getDistributionChannel() {
        return this.distributionChannel;
    }

    public ChangeValueGiftLineItemChangeValue build() {
        return new ChangeValueGiftLineItemChangeValueImpl(product, variantId, supplyChannel, distributionChannel);
    }

    public static ChangeValueGiftLineItemChangeValueBuilder of() {
        return new ChangeValueGiftLineItemChangeValueBuilder();
    }

    public static ChangeValueGiftLineItemChangeValueBuilder of(final ChangeValueGiftLineItemChangeValue template) {
        ChangeValueGiftLineItemChangeValueBuilder builder = new ChangeValueGiftLineItemChangeValueBuilder();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
