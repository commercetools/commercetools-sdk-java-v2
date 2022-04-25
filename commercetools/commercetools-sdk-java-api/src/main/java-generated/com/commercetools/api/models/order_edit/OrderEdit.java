
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderEditImpl.class)
public interface OrderEdit extends BaseResource, com.commercetools.api.models.DomainResource<OrderEdit>,
        com.commercetools.api.models.Referencable<OrderEdit>,
        com.commercetools.api.models.ResourceIdentifiable<OrderEdit>,
        com.commercetools.api.models.Customizable<OrderEdit> {

    /**
    *  <p>The unique ID of the OrderEdit.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>The current version of the OrderEdit.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
    *  <p>Unique identifier for this edit.</p>
    */

    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>The order to be updated with this edit.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("resource")
    public OrderReference getResource();

    /**
    *  <p>The actions to apply to the Order.
    *  Cannot be updated after the edit has been applied.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("stagedActions")
    public List<StagedOrderUpdateAction> getStagedActions();

    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
    *  <p>Contains a preview of the changes in case of unapplied edit.
    *  For applied edits, it contains the summary of the changes.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("result")
    public OrderEditResult getResult();

    /**
    *  <p>This field can be used to add textual information regarding the edit.</p>
    */

    @JsonProperty("comment")
    public String getComment();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setKey(final String key);

    public void setResource(final OrderReference resource);

    @JsonIgnore
    public void setStagedActions(final StagedOrderUpdateAction... stagedActions);

    public void setStagedActions(final List<StagedOrderUpdateAction> stagedActions);

    public void setCustom(final CustomFields custom);

    public void setResult(final OrderEditResult result);

    public void setComment(final String comment);

    public static OrderEdit of() {
        return new OrderEditImpl();
    }

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

    public static OrderEditBuilder builder() {
        return OrderEditBuilder.of();
    }

    public static OrderEditBuilder builder(final OrderEdit template) {
        return OrderEditBuilder.of(template);
    }

    default <T> T withOrderEdit(Function<OrderEdit, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.ResourceIdentifier toResourceIdentifier() {
        return com.commercetools.api.models.order_edit.OrderEditResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.order_edit.OrderEditReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderEdit> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEdit>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEdit>";
            }
        };
    }
}
