
package com.commercetools.importapi.models.orders;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomLineItemTaxedPriceBuilder {

    private com.commercetools.importapi.models.common.TypedMoney totalNet;

    private com.commercetools.importapi.models.common.TypedMoney totalGross;

    public CustomLineItemTaxedPriceBuilder totalNet(
            final com.commercetools.importapi.models.common.TypedMoney totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    public CustomLineItemTaxedPriceBuilder totalGross(
            final com.commercetools.importapi.models.common.TypedMoney totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    public com.commercetools.importapi.models.common.TypedMoney getTotalNet() {
        return this.totalNet;
    }

    public com.commercetools.importapi.models.common.TypedMoney getTotalGross() {
        return this.totalGross;
    }

    public CustomLineItemTaxedPrice build() {
        return new CustomLineItemTaxedPriceImpl(totalNet, totalGross);
    }

    public static CustomLineItemTaxedPriceBuilder of() {
        return new CustomLineItemTaxedPriceBuilder();
    }

    public static CustomLineItemTaxedPriceBuilder of(final CustomLineItemTaxedPrice template) {
        CustomLineItemTaxedPriceBuilder builder = new CustomLineItemTaxedPriceBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        return builder;
    }

}
