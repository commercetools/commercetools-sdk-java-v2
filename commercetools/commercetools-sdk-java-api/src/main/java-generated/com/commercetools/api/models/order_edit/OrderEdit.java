
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * OrderEdit
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEdit orderEdit = OrderEdit.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .plusStagedActions(stagedActionsBuilder -> stagedActionsBuilder)
 *             .result(resultBuilder -> resultBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditImpl.class)
public interface OrderEdit extends BaseResource, OrderEditMixin, com.commercetools.api.models.DomainResource<OrderEdit>,
        com.commercetools.api.models.Referencable<OrderEdit>,
        com.commercetools.api.models.ResourceIdentifiable<OrderEdit>,
        com.commercetools.api.models.Customizable<OrderEdit>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the Order Edit.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Order Edit.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>User-defined unique identifier of the Order Edit.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Order updated with this edit.</p>
     * @return resource
     */
    @NotNull
    @Valid
    @JsonProperty("resource")
    public OrderReference getResource();

    /**
     *  <p>Update actions applied to the Order referenced by <code>resource</code>.</p>
     * @return stagedActions
     */
    @NotNull
    @Valid
    @JsonProperty("stagedActions")
    public List<StagedOrderUpdateAction> getStagedActions();

    /**
     *  <p>For applied edits, it's a summary of the changes on the Order. For unapplied edits, it's a preview of the changes.</p>
     * @return result
     */
    @NotNull
    @Valid
    @JsonProperty("result")
    public OrderEditResult getResult();

    /**
     *  <p>User-defined information regarding the Order Edit.</p>
     * @return comment
     */

    @JsonProperty("comment")
    public String getComment();

    /**
     *  <p>Custom Fields of the Order Edit.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Date and time (UTC) the Order Edit was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Order Edit was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the OrderEdit.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the OrderEdit.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Unique identifier of the Order Edit.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Order Edit.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>User-defined unique identifier of the Order Edit.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Order updated with this edit.</p>
     * @param resource value to be set
     */

    public void setResource(final OrderReference resource);

    /**
     *  <p>Update actions applied to the Order referenced by <code>resource</code>.</p>
     * @param stagedActions values to be set
     */

    @JsonIgnore
    public void setStagedActions(final StagedOrderUpdateAction... stagedActions);

    /**
     *  <p>Update actions applied to the Order referenced by <code>resource</code>.</p>
     * @param stagedActions values to be set
     */

    public void setStagedActions(final List<StagedOrderUpdateAction> stagedActions);

    /**
     *  <p>For applied edits, it's a summary of the changes on the Order. For unapplied edits, it's a preview of the changes.</p>
     * @param result value to be set
     */

    public void setResult(final OrderEditResult result);

    /**
     *  <p>User-defined information regarding the Order Edit.</p>
     * @param comment value to be set
     */

    public void setComment(final String comment);

    /**
     *  <p>Custom Fields of the Order Edit.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Date and time (UTC) the Order Edit was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Order Edit was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the OrderEdit.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the OrderEdit.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     * factory method
     * @return instance of OrderEdit
     */
    public static OrderEdit of() {
        return new OrderEditImpl();
    }

    /**
     * factory method to create a shallow copy OrderEdit
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEdit of(final OrderEdit template) {
        OrderEditImpl instance = new OrderEditImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setResource(template.getResource());
        instance.setStagedActions(template.getStagedActions());
        instance.setResult(template.getResult());
        instance.setComment(template.getComment());
        instance.setCustom(template.getCustom());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        return instance;
    }

    public OrderEdit copyDeep();

    /**
     * factory method to create a deep copy of OrderEdit
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEdit deepCopy(@Nullable final OrderEdit template) {
        if (template == null) {
            return null;
        }
        OrderEditImpl instance = new OrderEditImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setResource(com.commercetools.api.models.order.OrderReference.deepCopy(template.getResource()));
        instance.setStagedActions(Optional.ofNullable(template.getStagedActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.StagedOrderUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setResult(com.commercetools.api.models.order_edit.OrderEditResult.deepCopy(template.getResult()));
        instance.setComment(template.getComment());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        return instance;
    }

    /**
     * builder factory method for OrderEdit
     * @return builder
     */
    public static OrderEditBuilder builder() {
        return OrderEditBuilder.of();
    }

    /**
     * create builder for OrderEdit instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditBuilder builder(final OrderEdit template) {
        return OrderEditBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEdit(Function<OrderEdit, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.ORDER_EDIT;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEdit> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEdit>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEdit>";
            }
        };
    }
}
