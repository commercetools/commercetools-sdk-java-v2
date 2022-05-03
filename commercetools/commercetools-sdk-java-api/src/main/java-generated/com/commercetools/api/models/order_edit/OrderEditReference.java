
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:OrderEdit">OrderEdit</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderEditReferenceImpl.class)
public interface OrderEditReference extends Reference, com.commercetools.api.models.Identifiable<OrderEdit> {

    String ORDER_EDIT = "order-edit";

    /**
    *  <p>Contains the representation of the expanded OrderEdit. Only present in responses to requests with <a href="/../api/general-concepts#reference-expansion">Reference Expansion</a> for OrderEdits.</p>
    */
    @Valid
    @JsonProperty("obj")
    public OrderEdit getObj();

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:OrderEdit">OrderEdit</a>.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final OrderEdit obj);

    public void setId(final String id);

    public static OrderEditReference of() {
        return new OrderEditReferenceImpl();
    }

    public static OrderEditReference of(final OrderEditReference template) {
        OrderEditReferenceImpl instance = new OrderEditReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static OrderEditReferenceBuilder builder() {
        return OrderEditReferenceBuilder.of();
    }

    public static OrderEditReferenceBuilder builder(final OrderEditReference template) {
        return OrderEditReferenceBuilder.of(template);
    }

    default <T> T withOrderEditReference(Function<OrderEditReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditReference>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditReference>";
            }
        };
    }
}
