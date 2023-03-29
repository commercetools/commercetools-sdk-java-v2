
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     *  <p>Unique identifier of the OrderEdit.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>The current version of the OrderEdit.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the OrderEdit.</p>
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
     *  <p>The actions to apply to the Order. Cannot be updated after the edit has been applied.</p>
     * @return stagedActions
     */
    @NotNull
    @Valid
    @JsonProperty("stagedActions")
    public List<StagedOrderUpdateAction> getStagedActions();

    /**
     *
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Contains a preview of the changes in case of unapplied edit. For applied edits, it contains the summary of the changes.</p>
     * @return result
     */
    @NotNull
    @Valid
    @JsonProperty("result")
    public OrderEditResult getResult();

    /**
     *  <p>This field can be used to add textual information regarding the edit.</p>
     * @return comment
     */

    @JsonProperty("comment")
    public String getComment();

    /**
     *  <p>Unique identifier of the OrderEdit.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>The current version of the OrderEdit.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     * set createdAt
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     * set lastModifiedAt
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique identifier of the OrderEdit.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The order to be updated with this edit.</p>
     * @param resource value to be set
     */

    public void setResource(final OrderReference resource);

    /**
     *  <p>The actions to apply to the Order. Cannot be updated after the edit has been applied.</p>
     * @param stagedActions values to be set
     */

    @JsonIgnore
    public void setStagedActions(final StagedOrderUpdateAction... stagedActions);

    /**
     *  <p>The actions to apply to the Order. Cannot be updated after the edit has been applied.</p>
     * @param stagedActions values to be set
     */

    public void setStagedActions(final List<StagedOrderUpdateAction> stagedActions);

    /**
     * set custom
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Contains a preview of the changes in case of unapplied edit. For applied edits, it contains the summary of the changes.</p>
     * @param result value to be set
     */

    public void setResult(final OrderEditResult result);

    /**
     *  <p>This field can be used to add textual information regarding the edit.</p>
     * @param comment value to be set
     */

    public void setComment(final String comment);

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
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setResource(template.getResource());
        instance.setStagedActions(template.getStagedActions());
        instance.setCustom(template.getCustom());
        instance.setResult(template.getResult());
        instance.setComment(template.getComment());
        return instance;
    }

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
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
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
                .map(com.commercetools.api.models.type.CustomFields::deepCopy)
                .orElse(null));
        instance.setResult(Optional.ofNullable(template.getResult())
                .map(com.commercetools.api.models.order_edit.OrderEditResult::deepCopy)
                .orElse(null));
        instance.setComment(template.getComment());
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
