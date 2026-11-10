
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>The request body for a bulk update of Variants.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantBulkUpdate variantBulkUpdate = VariantBulkUpdate.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantBulkUpdateImpl.class)
public interface VariantBulkUpdate {

    /**
     *  <p>List of Variants to update. Each item must identify the Variant by <code>id</code> or <code>key</code>.</p>
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<VariantBulkUpdateItem> getItems();

    /**
     *  <p>The update action to apply to each Variant. Only <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantPublishAction" rel="nofollow">Publish</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantUnpublishAction" rel="nofollow">Unpublish</a> actions are supported. An empty array results in a no-op: all items are returned as successful with no changes applied.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<VariantUpdateAction> getActions();

    /**
     *  <p>List of Variants to update. Each item must identify the Variant by <code>id</code> or <code>key</code>.</p>
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final VariantBulkUpdateItem... items);

    /**
     *  <p>List of Variants to update. Each item must identify the Variant by <code>id</code> or <code>key</code>.</p>
     * @param items values to be set
     */

    public void setItems(final List<VariantBulkUpdateItem> items);

    /**
     *  <p>The update action to apply to each Variant. Only <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantPublishAction" rel="nofollow">Publish</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantUnpublishAction" rel="nofollow">Unpublish</a> actions are supported. An empty array results in a no-op: all items are returned as successful with no changes applied.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final VariantUpdateAction... actions);

    /**
     *  <p>The update action to apply to each Variant. Only <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantPublishAction" rel="nofollow">Publish</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantUnpublishAction" rel="nofollow">Unpublish</a> actions are supported. An empty array results in a no-op: all items are returned as successful with no changes applied.</p>
     * @param actions values to be set
     */

    public void setActions(final List<VariantUpdateAction> actions);

    /**
     * factory method
     * @return instance of VariantBulkUpdate
     */
    public static VariantBulkUpdate of() {
        return new VariantBulkUpdateImpl();
    }

    /**
     * factory method to create a shallow copy VariantBulkUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantBulkUpdate of(final VariantBulkUpdate template) {
        VariantBulkUpdateImpl instance = new VariantBulkUpdateImpl();
        instance.setItems(template.getItems());
        instance.setActions(template.getActions());
        return instance;
    }

    public VariantBulkUpdate copyDeep();

    /**
     * factory method to create a deep copy of VariantBulkUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantBulkUpdate deepCopy(@Nullable final VariantBulkUpdate template) {
        if (template == null) {
            return null;
        }
        VariantBulkUpdateImpl instance = new VariantBulkUpdateImpl();
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.variant.VariantBulkUpdateItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.variant.VariantUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for VariantBulkUpdate
     * @return builder
     */
    public static VariantBulkUpdateBuilder builder() {
        return VariantBulkUpdateBuilder.of();
    }

    /**
     * create builder for VariantBulkUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantBulkUpdateBuilder builder(final VariantBulkUpdate template) {
        return VariantBulkUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantBulkUpdate(Function<VariantBulkUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantBulkUpdate> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantBulkUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<VariantBulkUpdate>";
            }
        };
    }
}
