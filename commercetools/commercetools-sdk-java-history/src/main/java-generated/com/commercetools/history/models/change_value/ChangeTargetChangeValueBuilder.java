
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ChangeTargetChangeValueBuilder {

    public com.commercetools.history.models.change_value.ChangeTargetCustomLineItemsChangeValueBuilder customLineItemsBuilder() {
        return com.commercetools.history.models.change_value.ChangeTargetCustomLineItemsChangeValueBuilder.of();
    }

    public com.commercetools.history.models.change_value.ChangeTargetLineItemsChangeValueBuilder lineItemsBuilder() {
        return com.commercetools.history.models.change_value.ChangeTargetLineItemsChangeValueBuilder.of();
    }

    public com.commercetools.history.models.change_value.ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder multiBuyCustomLineItemsBuilder() {
        return com.commercetools.history.models.change_value.ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder.of();
    }

    public com.commercetools.history.models.change_value.ChangeTargetMultiBuyLineItemsChangeValueBuilder multiBuyLineItemsBuilder() {
        return com.commercetools.history.models.change_value.ChangeTargetMultiBuyLineItemsChangeValueBuilder.of();
    }

    public com.commercetools.history.models.change_value.ChangeTargetShippingChangeValueBuilder shippingBuilder() {
        return com.commercetools.history.models.change_value.ChangeTargetShippingChangeValueBuilder.of();
    }

    public static ChangeTargetChangeValueBuilder of() {
        return new ChangeTargetChangeValueBuilder();
    }
}
