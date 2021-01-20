
package com.commercetools.api.models.order_edit;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.OrderEditAddStagedActionAction;
import com.commercetools.api.models.order_edit.OrderEditUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditAddStagedActionActionBuilder {

    private com.commercetools.api.models.order.StagedOrderUpdateAction stagedAction;

    public OrderEditAddStagedActionActionBuilder stagedAction(
            final com.commercetools.api.models.order.StagedOrderUpdateAction stagedAction) {
        this.stagedAction = stagedAction;
        return this;
    }

    public com.commercetools.api.models.order.StagedOrderUpdateAction getStagedAction() {
        return this.stagedAction;
    }

    public OrderEditAddStagedActionAction build() {
        return new OrderEditAddStagedActionActionImpl(stagedAction);
    }

    public static OrderEditAddStagedActionActionBuilder of() {
        return new OrderEditAddStagedActionActionBuilder();
    }

    public static OrderEditAddStagedActionActionBuilder of(final OrderEditAddStagedActionAction template) {
        OrderEditAddStagedActionActionBuilder builder = new OrderEditAddStagedActionActionBuilder();
        builder.stagedAction = template.getStagedAction();
        return builder;
    }

}
