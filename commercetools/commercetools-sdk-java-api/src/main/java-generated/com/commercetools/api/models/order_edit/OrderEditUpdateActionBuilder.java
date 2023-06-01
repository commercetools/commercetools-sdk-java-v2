package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditAddStagedActionAction;
import com.commercetools.api.models.order_edit.OrderEditSetCommentAction;
import com.commercetools.api.models.order_edit.OrderEditSetCustomFieldAction;
import com.commercetools.api.models.order_edit.OrderEditSetCustomTypeAction;
import com.commercetools.api.models.order_edit.OrderEditSetKeyAction;
import com.commercetools.api.models.order_edit.OrderEditSetStagedActionsAction;
import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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

    /**
     * factory method for an instance of OrderEditUpdateActionBuilder
     * @return builder 
     */
    public static OrderEditUpdateActionBuilder of() {
        return new OrderEditUpdateActionBuilder();
    }

}
