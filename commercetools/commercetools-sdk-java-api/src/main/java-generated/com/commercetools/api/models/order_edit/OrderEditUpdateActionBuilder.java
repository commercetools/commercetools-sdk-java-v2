
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderEditUpdateActionBuilder {

    public com.commercetools.api.models.order_edit.OrderEditAddStagedActionActionBuilder addStagedActionBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditAddStagedActionActionBuilder.of();
    }

    public com.commercetools.api.models.order_edit.OrderEditSetCommentActionBuilder setCommentBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditSetCommentActionBuilder.of();
    }

    public com.commercetools.api.models.order_edit.OrderEditSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditSetCustomFieldActionBuilder.of();
    }

    public com.commercetools.api.models.order_edit.OrderEditSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditSetCustomTypeActionBuilder.of();
    }

    public com.commercetools.api.models.order_edit.OrderEditSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditSetKeyActionBuilder.of();
    }

    public com.commercetools.api.models.order_edit.OrderEditSetStagedActionsActionBuilder setStagedActionsBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditSetStagedActionsActionBuilder.of();
    }

    public static OrderEditUpdateActionBuilder of() {
        return new OrderEditUpdateActionBuilder();
    }
}
