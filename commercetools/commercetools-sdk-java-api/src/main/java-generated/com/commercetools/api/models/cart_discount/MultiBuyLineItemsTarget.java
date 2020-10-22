package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.models.cart_discount.SelectionMode;
import com.commercetools.api.models.cart_discount.MultiBuyLineItemsTargetImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MultiBuyLineItemsTargetImpl.class)
public interface MultiBuyLineItemsTarget extends CartDiscountTarget {

    /**
    *  <p>A valid line item target predicate. The discount will be applied to line items that are matched by the predicate.</p>
    */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();
    /**
    *  <p>Quantity of line items that need to be present in order to trigger an application of this discount.</p>
    */
    @NotNull
    @JsonProperty("triggerQuantity")
    public Integer getTriggerQuantity();
    /**
    *  <p>Quantity of line items that are discounted per application of this discount.</p>
    */
    @NotNull
    @JsonProperty("discountedQuantity")
    public Integer getDiscountedQuantity();
    /**
    *  <p>Maximum number of applications of this discount.</p>
    */
    
    @JsonProperty("maxOccurrence")
    public Integer getMaxOccurrence();
    
    @NotNull
    @JsonProperty("selectionMode")
    public SelectionMode getSelectionMode();

    public void setPredicate(final String predicate);
    
    public void setTriggerQuantity(final Integer triggerQuantity);
    
    public void setDiscountedQuantity(final Integer discountedQuantity);
    
    public void setMaxOccurrence(final Integer maxOccurrence);
    
    public void setSelectionMode(final SelectionMode selectionMode);

    public static MultiBuyLineItemsTargetImpl of(){
        return new MultiBuyLineItemsTargetImpl();
    }
    

    public static MultiBuyLineItemsTargetImpl of(final MultiBuyLineItemsTarget template) {
        MultiBuyLineItemsTargetImpl instance = new MultiBuyLineItemsTargetImpl();
        instance.setPredicate(template.getPredicate());
        instance.setTriggerQuantity(template.getTriggerQuantity());
        instance.setDiscountedQuantity(template.getDiscountedQuantity());
        instance.setMaxOccurrence(template.getMaxOccurrence());
        instance.setSelectionMode(template.getSelectionMode());
        return instance;
    }

    default <T extends Accessor<MultiBuyLineItemsTarget>> T withMultiBuyLineItemsTarget(Function<MultiBuyLineItemsTarget, T> helper) {
        return helper.apply(this);
    }
}
