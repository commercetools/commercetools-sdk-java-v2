
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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

    public static OrderEditResultBuilder of() {
        return new OrderEditResultBuilder();
    }
}
