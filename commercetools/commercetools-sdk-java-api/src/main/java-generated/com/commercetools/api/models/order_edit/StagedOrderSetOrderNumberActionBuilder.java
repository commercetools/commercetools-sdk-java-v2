
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetOrderNumberActionBuilder {

    @Nullable
    private String orderNumber;

    public StagedOrderSetOrderNumberActionBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    @Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }

    public StagedOrderSetOrderNumberAction build() {
        return new StagedOrderSetOrderNumberActionImpl(orderNumber);
    }

    public static StagedOrderSetOrderNumberActionBuilder of() {
        return new StagedOrderSetOrderNumberActionBuilder();
    }

    public static StagedOrderSetOrderNumberActionBuilder of(final StagedOrderSetOrderNumberAction template) {
        StagedOrderSetOrderNumberActionBuilder builder = new StagedOrderSetOrderNumberActionBuilder();
        builder.orderNumber = template.getOrderNumber();
        return builder;
    }

}
