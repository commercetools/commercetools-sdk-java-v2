
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderEditDraftImpl.class)
public interface OrderEditDraft extends com.commercetools.api.models.CustomizableDraft<OrderEditDraft> {

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
    *  <p>The actions to apply to <code>resource</code>.</p>
    */
    @Valid
    @JsonProperty("stagedActions")
    public List<StagedOrderUpdateAction> getStagedActions();

    /**
    *  <p>The custom fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
    *  <p>This field can be used to add additional textual information regarding the edit.</p>
    */

    @JsonProperty("comment")
    public String getComment();

    /**
    *  <p>When set to <code>true</code> the edit is applied on the Order without persisting it.</p>
    */

    @JsonProperty("dryRun")
    public Boolean getDryRun();

    public void setKey(final String key);

    public void setResource(final OrderReference resource);

    @JsonIgnore
    public void setStagedActions(final StagedOrderUpdateAction... stagedActions);

    public void setStagedActions(final List<StagedOrderUpdateAction> stagedActions);

    public void setCustom(final CustomFieldsDraft custom);

    public void setComment(final String comment);

    public void setDryRun(final Boolean dryRun);

    public static OrderEditDraft of() {
        return new OrderEditDraftImpl();
    }

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

    public static OrderEditDraftBuilder builder() {
        return OrderEditDraftBuilder.of();
    }

    public static OrderEditDraftBuilder builder(final OrderEditDraft template) {
        return OrderEditDraftBuilder.of(template);
    }

    default <T> T withOrderEditDraft(Function<OrderEditDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditDraft>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditDraft>";
            }
        };
    }
}
