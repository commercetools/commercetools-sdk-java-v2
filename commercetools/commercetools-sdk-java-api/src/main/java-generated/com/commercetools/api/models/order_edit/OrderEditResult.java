
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditResult
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditResult orderEditResult = OrderEditResult.appliedBuilder()
 *             appliedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             excerptBeforeEdit(excerptBeforeEditBuilder -> excerptBeforeEditBuilder)
 *             excerptAfterEdit(excerptAfterEditBuilder -> excerptAfterEditBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditAppliedImpl.class, name = OrderEditApplied.APPLIED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditNotProcessedImpl.class, name = OrderEditNotProcessed.NOT_PROCESSED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditPreviewFailureImpl.class, name = OrderEditPreviewFailure.PREVIEW_FAILURE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.order_edit.OrderEditPreviewSuccessImpl.class, name = OrderEditPreviewSuccess.PREVIEW_SUCCESS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = OrderEditResultImpl.class, visible = true)
@JsonDeserialize(as = OrderEditResultImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface OrderEditResult {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * builder for applied subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.OrderEditAppliedBuilder appliedBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditAppliedBuilder.of();
    }

    /**
     * builder for notProcessed subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.OrderEditNotProcessedBuilder notProcessedBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditNotProcessedBuilder.of();
    }

    /**
     * builder for previewFailure subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder previewFailureBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditPreviewFailureBuilder.of();
    }

    /**
     * builder for previewSuccess subtype
     * @return builder
     */
    public static com.commercetools.api.models.order_edit.OrderEditPreviewSuccessBuilder previewSuccessBuilder() {
        return com.commercetools.api.models.order_edit.OrderEditPreviewSuccessBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditResult(Function<OrderEditResult, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditResult>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditResult>";
            }
        };
    }
}
