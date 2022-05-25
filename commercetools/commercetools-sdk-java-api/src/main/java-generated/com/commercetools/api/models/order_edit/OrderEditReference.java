
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
 *  <p>Reference to a OrderEdit.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditReference orderEditReference = OrderEditReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditReferenceImpl.class)
public interface OrderEditReference extends Reference, com.commercetools.api.models.Identifiable<OrderEdit> {

    String ORDER_EDIT = "order-edit";

    /**
     *  <p>Contains the representation of the expanded OrderEdit. Only present in responses to requests with Reference Expansion for OrderEdits.</p>
     */
    @Valid
    @JsonProperty("obj")
    public OrderEdit getObj();

    /**
     *  <p>Unique identifier of the referenced OrderEdit.</p>
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
