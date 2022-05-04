
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:OrderEdit">OrderEdit</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderEditResourceIdentifierImpl.class)
public interface OrderEditResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<OrderEdit> {

    String ORDER_EDIT = "order-edit";

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:OrderEdit">OrderEdit</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("id")
    public String getId();

    /**
    *  <p>User-defined unique identifier of the referenced <a href="ctp:api:type:OrderEdit">OrderEdit</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static OrderEditResourceIdentifier of() {
        return new OrderEditResourceIdentifierImpl();
    }

    public static OrderEditResourceIdentifier of(final OrderEditResourceIdentifier template) {
        OrderEditResourceIdentifierImpl instance = new OrderEditResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static OrderEditResourceIdentifierBuilder builder() {
        return OrderEditResourceIdentifierBuilder.of();
    }

    public static OrderEditResourceIdentifierBuilder builder(final OrderEditResourceIdentifier template) {
        return OrderEditResourceIdentifierBuilder.of(template);
    }

    default <T> T withOrderEditResourceIdentifier(Function<OrderEditResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditResourceIdentifier>";
            }
        };
    }
}
