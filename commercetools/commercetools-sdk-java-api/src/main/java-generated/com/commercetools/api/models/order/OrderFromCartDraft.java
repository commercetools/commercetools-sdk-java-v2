package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.order.ShipmentState;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.order.OrderFromCartDraftImpl;

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
@JsonDeserialize(as = OrderFromCartDraftImpl.class)
public interface OrderFromCartDraft  {

    /**
    *  <p>The unique id of the cart from which an order is created.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();
    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    /**
    *  <p>String that uniquely identifies an order.
    *  It can be used to create more human-readable (in contrast to ID) identifier for the order.
    *  It should be unique across a project.
    *  Once it's set it cannot be changed.
    *  For easier use on Get, Update and Delete actions we suggest assigning order numbers that match the regular expression <code>[a-z0-9_\-]{2,36}</code>.</p>
    */
    
    @JsonProperty("orderNumber")
    public String getOrderNumber();
    
    
    @JsonProperty("paymentState")
    public PaymentState getPaymentState();
    
    
    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();
    /**
    *  <p>Order will be created with <code>Open</code> status by default.</p>
    */
    
    @JsonProperty("orderState")
    public OrderState getOrderState();
    
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    public void setId(final String id);
    
    public void setVersion(final Long version);
    
    public void setOrderNumber(final String orderNumber);
    
    public void setPaymentState(final PaymentState paymentState);
    
    public void setShipmentState(final ShipmentState shipmentState);
    
    public void setOrderState(final OrderState orderState);
    
    public void setState(final StateResourceIdentifier state);

    public static OrderFromCartDraftImpl of(){
        return new OrderFromCartDraftImpl();
    }
    

    public static OrderFromCartDraftImpl of(final OrderFromCartDraft template) {
        OrderFromCartDraftImpl instance = new OrderFromCartDraftImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setOrderNumber(template.getOrderNumber());
        instance.setPaymentState(template.getPaymentState());
        instance.setShipmentState(template.getShipmentState());
        instance.setOrderState(template.getOrderState());
        instance.setState(template.getState());
        return instance;
    }

    default <T extends Accessor<OrderFromCartDraft>> T withOrderFromCartDraft(Function<OrderFromCartDraft, T> helper) {
        return helper.apply(this);
    }
}
