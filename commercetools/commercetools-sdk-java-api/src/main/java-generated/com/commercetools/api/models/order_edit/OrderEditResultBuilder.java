package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditApplied;
import com.commercetools.api.models.order_edit.OrderEditNotProcessed;
import com.commercetools.api.models.order_edit.OrderEditPreviewFailure;
import com.commercetools.api.models.order_edit.OrderEditPreviewSuccess;
import com.commercetools.api.models.order_edit.OrderEditResult;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditResultBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderEditResultBuilder {

    public com.commercetools.api.models.order_edit.OrderEditAppliedBuilder appliedBuilder() {
       return com.commercetools.api.models.order_edit.OrderEditAppliedBuilder.of();
    }
    public com.commercetools.api.models.order_edit.OrderEditNotProcessedBuilder notProcessedBuilder() {
       return com.commercetools.api.models.order_edit.OrderEditNotProcessedBuilder.of();
    }
    public com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder previewFailureBuilder() {
       return com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder.of();
    }
    public com.commercetools.api.models.order_edit.OrderEditPreviewSuccessBuilder previewSuccessBuilder() {
       return com.commercetools.api.models.order_edit.OrderEditPreviewSuccessBuilder.of();
    }

    /**
     * factory method for an instance of OrderEditResultBuilder
     * @return builder 
     */
    public static OrderEditResultBuilder of() {
        return new OrderEditResultBuilder();
    }

}
