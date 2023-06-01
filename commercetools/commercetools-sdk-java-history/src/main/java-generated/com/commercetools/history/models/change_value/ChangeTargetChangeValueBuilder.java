package com.commercetools.history.models.change_value;

import com.commercetools.history.models.change_value.ChangeTargetCustomLineItemsChangeValue;
import com.commercetools.history.models.change_value.ChangeTargetLineItemsChangeValue;
import com.commercetools.history.models.change_value.ChangeTargetMultiBuyCustomLineItemsChangeValue;
import com.commercetools.history.models.change_value.ChangeTargetMultiBuyLineItemsChangeValue;
import com.commercetools.history.models.change_value.ChangeTargetShippingChangeValue;
import com.commercetools.history.models.change_value.ChangeTargetChangeValue;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTargetChangeValueBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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

    /**
     * factory method for an instance of ChangeTargetChangeValueBuilder
     * @return builder 
     */
    public static ChangeTargetChangeValueBuilder of() {
        return new ChangeTargetChangeValueBuilder();
    }

}
