
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditDraft orderEditDraft = OrderEditDraft.builder()
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditDraftImpl.class)
public interface OrderEditDraft extends com.commercetools.api.models.CustomizableDraft<OrderEditDraft>,
        com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<OrderEditDraft> {

    /**
     *  <p>User-defined unique identifier for the OrderEdit.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The order to be updated with this edit.</p>
     * @return resource
     */
    @NotNull
    @Valid
    @JsonProperty("resource")
    public OrderReference getResource();

    /**
     *  <p>The actions to apply to <code>resource</code>.</p>
     * @return stagedActions
     */
    @Valid
    @JsonProperty("stagedActions")
    public List<StagedOrderUpdateAction> getStagedActions();

    /**
     *  <p>The custom fields.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>This field can be used to add additional textual information regarding the edit.</p>
     * @return comment
     */

    @JsonProperty("comment")
    public String getComment();

    /**
     *  <p>When set to <code>true</code> the edit is applied on the Order without persisting it.</p>
     * @return dryRun
     */

    @JsonProperty("dryRun")
    public Boolean getDryRun();

    /**
     *  <p>User-defined unique identifier for the OrderEdit.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The order to be updated with this edit.</p>
     * @param resource value to be set
     */

    public void setResource(final OrderReference resource);

    /**
     *  <p>The actions to apply to <code>resource</code>.</p>
     * @param stagedActions values to be set
     */

    @JsonIgnore
    public void setStagedActions(final StagedOrderUpdateAction... stagedActions);

    /**
     *  <p>The actions to apply to <code>resource</code>.</p>
     * @param stagedActions values to be set
     */

    public void setStagedActions(final List<StagedOrderUpdateAction> stagedActions);

    /**
     *  <p>The custom fields.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>This field can be used to add additional textual information regarding the edit.</p>
     * @param comment value to be set
     */

    public void setComment(final String comment);

    /**
     *  <p>When set to <code>true</code> the edit is applied on the Order without persisting it.</p>
     * @param dryRun value to be set
     */

    public void setDryRun(final Boolean dryRun);

    /**
     * factory method
     * @return instance of OrderEditDraft
     */
    public static OrderEditDraft of() {
        return new OrderEditDraftImpl();
    }

    /**
     * factory method to create a shallow copy OrderEditDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditDraft of(final OrderEditDraft template) {
        OrderEditDraftImpl instance = new OrderEditDraftImpl();
        instance.setKey(template.getKey());
        instance.setResource(template.getResource());
        instance.setStagedActions(template.getStagedActions());
        instance.setCustom(template.getCustom());
        instance.setComment(template.getComment());
        instance.setDryRun(template.getDryRun());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderEditDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditDraft deepCopy(@Nullable final OrderEditDraft template) {
        if (template == null) {
            return null;
        }
        OrderEditDraftImpl instance = new OrderEditDraftImpl();
        instance.setKey(template.getKey());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.order.OrderReference::deepCopy)
                .orElse(null));
        instance.setStagedActions(Optional.ofNullable(template.getStagedActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.StagedOrderUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFieldsDraft::deepCopy)
                .orElse(null));
        instance.setComment(template.getComment());
        instance.setDryRun(template.getDryRun());
        return instance;
    }

    /**
     * builder factory method for OrderEditDraft
     * @return builder
     */
    public static OrderEditDraftBuilder builder() {
        return OrderEditDraftBuilder.of();
    }

    /**
     * create builder for OrderEditDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditDraftBuilder builder(final OrderEditDraft template) {
        return OrderEditDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditDraft(Function<OrderEditDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditDraft>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditDraft>";
            }
        };
    }
}
