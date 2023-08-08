
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.message.MessagePayload;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The data is not persisted but is dynamically pulled by dry-running the update actions from <code>stagedActions</code> on the current version of the related Order, not from the Order version at the time the OrderEdit was created. Therefore, it cannot be queried.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditPreviewSuccess orderEditPreviewSuccess = OrderEditPreviewSuccess.builder()
 *             .preview(previewBuilder -> previewBuilder)
 *             .plusMessagePayloads(messagePayloadsBuilder -> messagePayloadsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditPreviewSuccessImpl.class)
public interface OrderEditPreviewSuccess extends OrderEditResult {

    /**
     * discriminator value for OrderEditPreviewSuccess
     */
    String PREVIEW_SUCCESS = "PreviewSuccess";

    /**
     *  <p>A preview of the edited Order as it will be after all <code>stagedActions</code> (incl. optional Order API Extensions) are applied.</p>
     * @return preview
     */
    @NotNull
    @Valid
    @JsonProperty("preview")
    public StagedOrder getPreview();

    /**
     *  <p>Messages that will be generated if the edit is applied.</p>
     * @return messagePayloads
     */
    @NotNull
    @Valid
    @JsonProperty("messagePayloads")
    public List<MessagePayload> getMessagePayloads();

    /**
     *  <p>A preview of the edited Order as it will be after all <code>stagedActions</code> (incl. optional Order API Extensions) are applied.</p>
     * @param preview value to be set
     */

    public void setPreview(final StagedOrder preview);

    /**
     *  <p>Messages that will be generated if the edit is applied.</p>
     * @param messagePayloads values to be set
     */

    @JsonIgnore
    public void setMessagePayloads(final MessagePayload... messagePayloads);

    /**
     *  <p>Messages that will be generated if the edit is applied.</p>
     * @param messagePayloads values to be set
     */

    public void setMessagePayloads(final List<MessagePayload> messagePayloads);

    /**
     * factory method
     * @return instance of OrderEditPreviewSuccess
     */
    public static OrderEditPreviewSuccess of() {
        return new OrderEditPreviewSuccessImpl();
    }

    /**
     * factory method to create a shallow copy OrderEditPreviewSuccess
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditPreviewSuccess of(final OrderEditPreviewSuccess template) {
        OrderEditPreviewSuccessImpl instance = new OrderEditPreviewSuccessImpl();
        instance.setPreview(template.getPreview());
        instance.setMessagePayloads(template.getMessagePayloads());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderEditPreviewSuccess
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditPreviewSuccess deepCopy(@Nullable final OrderEditPreviewSuccess template) {
        if (template == null) {
            return null;
        }
        OrderEditPreviewSuccessImpl instance = new OrderEditPreviewSuccessImpl();
        instance.setPreview(com.commercetools.api.models.order_edit.StagedOrder.deepCopy(template.getPreview()));
        instance.setMessagePayloads(Optional.ofNullable(template.getMessagePayloads())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.message.MessagePayload::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderEditPreviewSuccess
     * @return builder
     */
    public static OrderEditPreviewSuccessBuilder builder() {
        return OrderEditPreviewSuccessBuilder.of();
    }

    /**
     * create builder for OrderEditPreviewSuccess instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditPreviewSuccessBuilder builder(final OrderEditPreviewSuccess template) {
        return OrderEditPreviewSuccessBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditPreviewSuccess(Function<OrderEditPreviewSuccess, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditPreviewSuccess> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditPreviewSuccess>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditPreviewSuccess>";
            }
        };
    }
}
