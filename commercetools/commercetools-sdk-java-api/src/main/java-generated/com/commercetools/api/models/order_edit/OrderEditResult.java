
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditAppliedImpl.class, name = OrderEditApplied.APPLIED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditNotProcessedImpl.class, name = OrderEditNotProcessed.NOT_PROCESSED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditPreviewFailureImpl.class, name = OrderEditPreviewFailure.PREVIEW_FAILURE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditPreviewSuccessImpl.class, name = OrderEditPreviewSuccess.PREVIEW_SUCCESS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = OrderEditResultImpl.class, visible = true)
@JsonDeserialize(as = OrderEditResultImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface OrderEditResult {

    @NotNull
    @JsonProperty("type")
    public String getType();

    public static com.commercetools.api.models.order_edit.OrderEditAppliedBuilder appliedBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditAppliedBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.OrderEditNotProcessedBuilder notProcessedBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditNotProcessedBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder previewFailureBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder.of();
    }

    public static com.commercetools.api.models.order_edit.OrderEditPreviewSuccessBuilder previewSuccessBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditPreviewSuccessBuilder.of();
    }

    default <T> T withOrderEditResult(Function<OrderEditResult, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditResult>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditResult>";
            }
        };
    }
}
